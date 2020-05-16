/**
 * 
 */
package com.fee.report.model;

/**
 * @author sv
 *
 */
public class Student {
	
	private String name;
	private String emailID;
	private String course;
	private Integer fee;
	private Integer paid;
	private Integer due;
	private String address;
	private String city;
	private String state;
	private String country;
	private Long contactNo;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param emailID
	 * @param course
	 * @param fee
	 * @param paid
	 * @param due
	 * @param address
	 * @param city
	 * @param state
	 * @param country
	 * @param contactNo
	 */
	public Student(String name, String emailID, String course, Integer fee, Integer paid, Integer due, String address,
			String city, String state, String country, Long contactNo) {
		super();
		this.name = name;
		this.emailID = emailID;
		this.course = course;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.contactNo = contactNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the emailID
	 */
	public String getEmailID() {
		return emailID;
	}

	/**
	 * @param emailID the emailID to set
	 */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}

	/**
	 * @return the fee
	 */
	public Integer getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	public void setFee(Integer fee) {
		this.fee = fee;
	}

	/**
	 * @return the paid
	 */
	public Integer getPaid() {
		return paid;
	}

	/**
	 * @param paid the paid to set
	 */
	public void setPaid(Integer paid) {
		this.paid = paid;
	}

	/**
	 * @return the due
	 */
	public Integer getDue() {
		return due;
	}

	/**
	 * @param due the due to set
	 */
	public void setDue(Integer due) {
		this.due = due;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the contactNo
	 */
	public Long getContactNo() {
		return contactNo;
	}

	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", emailID=" + emailID + ", course=" + course
				+ ", fee=" + fee + ", paid=" + paid + ", due=" + due + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", contactNo=" + contactNo + "]";
	}

}
