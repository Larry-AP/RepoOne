
/***************************************************************
* Name : Program Name
* Author: Larry Paucar
* Created : Apr 20, 2023
* Course: CIS 152 - Data Structure
* Version: 1.0
* OS: Windows XX
* IDE: eclipse 
* Copyright : This is my own original work 
* based on specifications issued by our instructor
* Description : This is the main class for the wine locker application. This class
* 				implements the use of a linked list as well as a queue for the data 
* 				structures. In this class I have methods to add a member to a wait
* 				list if no wine lockers are available, a method to assign a locker to 
* 				a member, a method to remove a member off of the wait list, and other methods
* 				to display information. My project is however unfinished as I did not implement
* 				the insertion sort that I wanted to implement and I also don't have a interface 
* 				included.
* 
* 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified. I have not given other fellow student(s) access
* to my program.
***************************************************************
*/


import java.util.LinkedList;
import java.util.Queue;

public class LockerApplicationClass {

	
	private LinkedList<MemberInfo> members; 
	  private Queue<MemberInfo> waitlist; 
	  private WineLockerClass[] lockers; 
	  
	  
	  public LockerApplicationClass(int numLockers, int lockerCapacity) {
	    members = new LinkedList<>(); 
	    waitlist = new LinkedList<>();
	    lockers = new WineLockerClass[numLockers]; 
	    for (int i = 0; i < numLockers; i++) {
	      lockers[i] = new WineLockerClass(i + 1, lockerCapacity); 
	    }
	  }
	  
	  
	  public void addToWaitlist(MemberInfo member) {
	    waitlist.add(member); 
	    System.out.println("Added " + member + " to the waitlist.");
	  }
	  
	  
	  public void assignWineLocker(MemberInfo member) {
	    boolean found = false; 
	    for (int i = 0; i < lockers.length; i++) {
	      if (lockers[i].isAvailable()) { 
	        lockers[i].setAvailable(false); 
	        member.setLockerNumber(lockers[i].getNumber()); 
	        members.add(member); 
	        System.out.println("Assigned " + member + " to " + lockers[i] + ".");
	        found = true; 
	        break; 
	      }
	    }
	    
	    if (!found) { 
	      System.out.println("No wine locker available. Added " + member + " to the waitlist.");
	      addToWaitlist(member); 
	    }
	  }
	  
	  
	  public void removeMember(MemberInfo member) {
	    boolean removed = members.remove(member); 
	    if (removed) { 
	      int lockerNumber = member.getLockerNumber(); 
	      lockers[lockerNumber - 1].setAvailable(true); 
	      System.out.println("Removed " + member + " from " + lockers[lockerNumber - 1] + ".");
	      if (!waitlist.isEmpty()) { 
	        MemberInfo next = waitlist.poll(); 
	        assignWineLocker(next); 
	      }
	    } else { 
	      System.out.println("Member not found.");
	    }
	  }
	  
	  
	  public MemberInfo searchMember(String nameOrId) {
	    for (MemberInfo member : members) { 
	      if (member.getName().equals(nameOrId) || Integer.toString(member.getId()).equals(nameOrId)) { // if the name or ID matches
	        return member; 
	      }
	    }
	    return null;
	  }
	  
	  public void displayMembers() {
	    System.out.println("Members who have wine lockers:");
	    for (MemberInfo member : members) { 
	      System.out.println(member); 
	    }
	  }
	  
	 
	  public void displayWaitlist() {
	    System.out.println("Members who are in the waitlist:");
	    for (MemberInfo member : waitlist) { 
	      System.out.println(member); 
	    }
	  }
	  
	  public void displayLockers() {
	    System.out.println("Wine lockers:");
	    for (WineLockerClass locker : lockers) { 
	      System.out.println(locker); 
	    }
	  }
	  
	}
