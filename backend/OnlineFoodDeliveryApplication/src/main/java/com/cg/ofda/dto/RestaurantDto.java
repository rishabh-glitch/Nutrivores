package com.cg.ofda.dto;

import java.util.ArrayList;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Restaurant_Table")
public class RestaurantDto {
		@Id
		@Column(name="Restaurant_Id" ,length =5)
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long restaurantId;
	
		
		@Column(name = "Restaurant_name", length = 20)
		private String restaurantName;
		
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name = "Address_id")
		private AddressDto address;
		
		@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
		@JoinTable(name = "restaurant_items", joinColumns = @JoinColumn(name = "restaurant_id") , inverseJoinColumns =  @JoinColumn(name = "item_id") )
		private List<ItemDto> item = new ArrayList<ItemDto>();

		@Column(name="Manager_Name")
		private String managerName;
		
		@Column(name="Contact_Number")
		private String contactNumber;
		
		@Column(name="Email")
		private String email;
		
		@Column(name="Password")
		private String passsword;

		public RestaurantDto() {
			super();
		}
		
		public RestaurantDto(long restaurantId, String restaurantName, AddressDto address, List<ItemDto> item,
				String managerName, String contactNumber) {
			super();
			this.restaurantId = restaurantId;
			this.restaurantName = restaurantName;
			this.address = address;
			this.item = item;
			this.managerName = managerName;
			this.contactNumber = contactNumber;
		}
		
		public RestaurantDto(long restaurantId, String restaurantName, AddressDto address, String managerName,
				String contactNumber) {
			super();
			this.restaurantId = restaurantId;
			this.restaurantName = restaurantName;
			this.address = address;
			this.managerName = managerName;
			this.contactNumber = contactNumber;
		}

		public long getRestaurantId() {
			return restaurantId;
		}
		public void setRestaurantId(long restaurantId) {
			this.restaurantId = restaurantId;
		}
		public String getRestaurantName() {
			return restaurantName;
		}
		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}
		public AddressDto getAddress() {
			return address;
		}
		public void setAddress(AddressDto address) {
			this.address = address;
		}
		public List<ItemDto> getItem() {
			return item;
		}
		public void setItem(List<ItemDto> item) {
			this.item = item;
		}
		public String getManagerName() {
			return managerName;
		}
		public void setManagerName(String managerName) {
			this.managerName = managerName;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		@Override
		public String toString() {
			return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", address="
					+ address + ", Item=" + item + ", managerName=" + managerName + ", contactNumber=" + contactNumber
					+ "]";
		}


}
