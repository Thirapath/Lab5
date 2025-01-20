package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer implements Serializable {
	@JsonProperty("name")
	public String name;
	private List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
	
	public Customer() {
		phoneNumbers = new ArrayList<PhoneNumber>();
	}
	
	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	
}
