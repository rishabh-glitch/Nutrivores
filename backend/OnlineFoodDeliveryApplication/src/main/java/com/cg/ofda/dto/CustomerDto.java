package com.cg.ofda.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="Customer_Table")

public class CustomerDto {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Customer_Id")
	private long customerId;
	
	@Column(name="First_Name", length = 20)
	private String firstName;
	
	@Column(name="Last_Name",length = 20)
	private String lastName;
	
	@Column(name="Age",length = 3)
	private int age;
	
	@Column(name="Gender",length = 10)
	private String gender;
	
	@Column(name="Mobile_No",length = 12)
	private String mobileNumber;
	
	@Column(name="Email",length = 30)
	private String email;
	
	@Size(min=2,message="min 5 chars in pass")
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Address_Id")
	private AddressDto address;
			
			public CustomerDto() {
				
			}

			public long getCustomerId() {
				return customerId;
			}

			public void setCustomerId(long customerId) {
				this.customerId = customerId;
			}

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public String getGender() {
				return gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public String getMobileNumber() {
				return mobileNumber;
			}

			public void setMobileNumber(String mobileNumber) {
				this.mobileNumber = mobileNumber;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public AddressDto getAddress() {
				return address;
			}

			public void setAddress(AddressDto address) {
				this.address = address;
			}

			public CustomerDto(long customerId, String firstName, String lastName, int age, String gender,
					String mobileNumber, String email, @Size(min = 2, message = "min 5 chars in pass") String password,
					AddressDto address) {
				super();
				this.customerId = customerId;
				this.firstName = firstName;
				this.lastName = lastName;
				this.age = age;
				this.gender = gender;
				this.mobileNumber = mobileNumber;
				this.email = email;
				this.password = password;
				this.address = address;
			}

			@Override
			public String toString() {
				return "CustomerDto [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
						+ ", age=" + age + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", email=" + email
						+ ", password=" + password + ", address=" + address + "]";
			}


}

