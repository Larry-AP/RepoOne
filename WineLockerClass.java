
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
* Description : This class will contain the information 
* 				for wine lockers such as the capacity and 
* 				info on whether they are available or not.
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified. I have not given other fellow student(s) access
* to my program.
***************************************************************
*/

public class WineLockerClass {

	
	 private int number; 
	  private int capacity; 
	  private boolean available;
	  
	  
	public WineLockerClass(int number, int capacity) {
		super();
		this.number = number;
		this.capacity = capacity;
		this.available = true;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	@Override
	public String toString() {
		return "WineLockerClass [number=" + number + ", capacity=" + capacity + ", available=" + available + "]";
	} 
	  
	
	
}
	
	

