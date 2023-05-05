

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
* Description : This will contain the member info for the program,
* 				which will include member names, member ID's as well
* 				as phone numbers and email addresses and locker numbers.
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified. I have not given other fellow student(s) access
* to my program.
***************************************************************
*/

public class MemberInfo {
	
	
	private String name; 
	  private int id; 
	  private int lockerNumber; 
	  private String email; 
	  private String phone; 
	  
	  
	public MemberInfo(String name, int id, int lockerNumber, String email, String phone) {
		super();
		this.name = name;
		this.id = id;
		this.lockerNumber = lockerNumber;
		this.email = email;
		this.phone = phone;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getLockerNumber() {
		return lockerNumber;
	}


	public void setLockerNumber(int lockerNumber) {
		this.lockerNumber = lockerNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "MemberInfo [name=" + name + ", id=" + id + ", lockerNumber=" + lockerNumber + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	  
	  
	  
	  
}


	
