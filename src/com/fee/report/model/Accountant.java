/**
 * 
 */
package com.fee.report.model;

/**
 * @author sv
 *
 */
public class Accountant {
	
	private String name;
	private String password;
	private String emailID;
	private Long contactNo;
	
	public Accountant() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param password
	 * @param emailID
	 * @param contactNo
	 */
	public Accountant(String name, String password, String emailID, Long contactNo) {
		super();
		this.name = name;
		this.password = password;
		this.emailID = emailID;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
		return "Accountant [name=" + name + ", password=" + password + ", emailID=" + emailID + ", contactNo="
				+ contactNo + "]";
	}
	
}
