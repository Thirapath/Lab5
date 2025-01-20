package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber implements Serializable {

	@JsonProperty("number")
	private String number;
	
	public PhoneNumber() {
		
	}
	
	public PhoneNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
