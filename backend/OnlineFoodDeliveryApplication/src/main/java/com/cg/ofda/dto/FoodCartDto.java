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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="FoodCart_Table")
public class FoodCartDto {
	@Id
	@Column(name="Cart_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cartId;
	
	@OneToOne
	@JoinColumn(name="Customer_Id")
	private CustomerDto customer;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "foodCart_items", joinColumns = { @JoinColumn(name = "cartId") }, inverseJoinColumns = { @JoinColumn(name = "item_id") })
	private List<ItemDto> items = new ArrayList<ItemDto>();
		
		public FoodCartDto(long cartId, CustomerDto customer, List<ItemDto> itemList) {
			super();
			this.cartId = cartId;
			this.customer = customer;
			this.items = itemList;
		}
		
		
		public FoodCartDto(long cartId, CustomerDto customer) {
			super();
			this.cartId = cartId;
			this.customer = customer;
		}


		public FoodCartDto() {
			super();
		}

		public long getCartId() {
			return cartId;
		}

		public void setCartId(long cartId) {
			this.cartId = cartId;
		}

		public CustomerDto getCustomer() {
			return customer;
		}

		public void setCustomer(CustomerDto customer) {
			this.customer = customer;
		}

		public List<ItemDto> getItemList() {
			return items;
		}

		public void setItemList(List<ItemDto> itemList) {
			this.items = itemList;
		}

		@Override
		public String toString() {
			return "FoodCart [cartId=" + cartId + ", customer=" + customer + ", itemList=" + items + "]";
		}


		public Object thenReturn(FoodCartDto fc1) {
			// TODO Auto-generated method stub
			return null;
		}



}
