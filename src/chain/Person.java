package chain;

import java.util.UUID;

public class Person {
	
	private String FirstName;
	private String LastName;
	private UUID PersonId  ;
	
	public Person(){
		
	}
	
	public Person(String FirstName, String LastName, UUID PersonId){
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.PersonId = PersonId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public UUID getPersonId() {
		return PersonId;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setPersonId(UUID personId) {
		PersonId = UUID.randomUUID();
		
	}
	
	

}
