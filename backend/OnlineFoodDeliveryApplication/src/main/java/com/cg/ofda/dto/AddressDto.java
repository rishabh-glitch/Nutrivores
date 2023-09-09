package com.cg.ofda.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address_table")

public class AddressDto {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="Address_Id")
		private long addressid;
		@Column(name="Building_Name")
		private String buildingName;
		@Column(name="Street_No")
		private String streetNo;
		@Column(name="Area")
		private String area;
		@Column(name="City")
		private String city;
		@Column(name="State")
		private String state;
		@Column(name="Country")
		private String country;
		@Column(name="Pincode")
		private String pincode;
		

		public AddressDto() {
			// TODO Auto-generated constructor stub
		}


		public long getAddressid() {
			return addressid;
		}


		public void setAddressid(long addressid) {
			this.addressid = addressid;
		}


		public String getBuildingName() {
			return buildingName;
		}


		public void setBuildingName(String buildingName) {
			this.buildingName = buildingName;
		}


		public String getStreetNo() {
			return streetNo;
		}


		public void setStreetNo(String streetNo) {
			this.streetNo = streetNo;
		}


		public String getArea() {
			return area;
		}


		public void setArea(String area) {
			this.area = area;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public String getCountry() {
			return country;
		}


		public void setCountry(String country) {
			this.country = country;
		}


		public String getPincode() {
			return pincode;
		}


		public void setPincode(String pincode) {
			this.pincode = pincode;
		}


		public AddressDto(long addressid, String buildingName, String streetNo, String area, String city, String state,
				String country, String pincode) {
			super();
			this.addressid = addressid;
			this.buildingName = buildingName;
			this.streetNo = streetNo;
			this.area = area;
			this.city = city;
			this.state = state;
			this.country = country;
			this.pincode = pincode;
		}


		@Override
		public String toString() {
			return "AddressDto [addressid=" + addressid + ", buildingName=" + buildingName + ", streetNo=" + streetNo
					+ ", area=" + area + ", city=" + city + ", state=" + state + ", country=" + country + ", pincode="
					+ pincode + "]";
		}



		
}

