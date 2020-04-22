package oops;

public class ScrumTeam extends Employee {
	
 String ceremonies;
   void attendMeeting() {
	 System.out.println("Scrum Team attend"+ ceremonies);
 }
 }
    class ProductOwner extends ScrumTeam{
            void prioritizeBacklopg() {
		    System.out.println("po prioritize product owner");
	}	
	class ScrumMaster extends ScrumTeam{
		    void navigateTeam() {
			System.out.println("Scrum master facilitate scrum team");
		}
	}   
	class Developer extends ScrumTeam{
		    void coding() {
			System.out.println("developers write codes");
		  }
	  } 
	   
    class Tester extends ScrumTeam{
		     void tester() {
			 System.out.println("Tester finds the bug");
		   }
	   }
	   
    }
	   
	   
	   

