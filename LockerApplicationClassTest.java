
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
* Description : This is the test class for my locker application
* 				class. 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified. I have not given other fellow student(s) access
* to my program.
***************************************************************
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class LockerApplicationClassTest extends LockerApplicationClass {

	@Before
	  public void setUp() {
	    // create a new wine locker system with 10 lockers and 20 bottles capacity each
	    LockerApplicationClass = new LockerApplicationClass(10, 20);
	    
	    // create some members
	    MemberInfo Jeff = new MemberInfo("Jeff", 1213, "jeffb22@gmail.com", "555-567-097");
	    MemberInfo Robert = new MemberInfo("Robert", 1214, "robertcali@outloook.com", "555-254-5783");
	    MemberInfo Melissa = new MemberInfo("Melissa", 1215, "melissasantos@gmail,com", "544-367-4212");
	    MemberInfo Kylie = new MemberInfo("Kylie", 1216, "kylie@outlook.com", "343-510-0045");
	    MemberInfo Sierra = new MemberInfo("Sierra", 1217, "sierralp@gmail.com", "454-191-2930");
	    MemberInfo Link = new MemberInfo("Link", 1218, "lincoln78@gmail.com", "555-241-6749");
	    
	    system.assignWineLocker(Link);
	    system.assignWineLocker(Sierra));
	    system.assignWineLocker(Jeff);
	    
	    system.addToWaitlist(Robert);
	    system.addToWaitlist(Kylie);
	    
	  }
	  
	  @Test
	  public void testSearchMemberByName() {
	    // search for a member who has a wine locker by name
	    MemberInfo result1 = system.searchMember("Link");
	    
	    // assert that the result is not null and has the correct name and locker number
	    assertNotNull(result1);
	    assertEquals("Link", result1.getName());
	    assertEquals(1, result1.getLockerNumber());
	    
	    // search for a member who is in the waitlist by name
	    MemberInfo result2 = system.searchMember("Kylie");
	    
	    // assert that the result is not null and has the correct name and locker number
	    assertNotNull(result2);
	    assertEquals("Kylie", result2.getName());
	    assertEquals(-1, result2.getLockerNumber());
	    
	    // search for a member who does not exist by name
	    MemberInfo result3 = system.searchMember("Vanessa");
	    
	 
	}

}
