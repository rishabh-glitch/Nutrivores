package com.cg.ofda.dto;
import java.util.ArrayList;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Item_Table")
public class ItemDto {
	@Id
	@Column(name ="Item_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long itemId;
	
	@Column(name = "Item_Name", length = 10)
	private String itemName;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "cat_Id")
	private CategoryDto category;
	
	@Column(name="quantity", length = 5)
	private int quantity;
	
	@Column(name="cost", length = 5)
	private double cost;
	
//	@JsonIgnore
	@ManyToMany(mappedBy = "item")
	List<RestaurantDto> restaurants = new ArrayList<RestaurantDto>();
		
		public ItemDto(long itemId, String itemName, CategoryDto category, int quantity, double cost,
				List<RestaurantDto> restuarants) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.category = category;
			this.quantity = quantity;
			this.cost = cost;
			this.restaurants = restuarants;
		}
		
		
		public ItemDto(long itemId, String itemName, CategoryDto category, int quantity, double cost) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.category = category;
			this.quantity = quantity;
			this.cost = cost;
		}
		public ItemDto(long itemId, String itemName, CategoryDto category, double cost) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.category = category;
			this.cost = cost;
		}


		public ItemDto() {
			super();
		}

		public long getItemId() {
			return itemId;
		}

		public List<RestaurantDto> getRestaurants() {
			return restaurants;
		}

		

		public void setItemId(long itemId) {
			this.itemId = itemId;
		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public CategoryDto getCategory() {
			return category;
		}

		public void setCategory(CategoryDto category) {
			this.category = category;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}


		public void setRestuarants(List<RestaurantDto> restuarants) {
			this.restaurants = restuarants;
		}

		@Override
		public String toString() {
			return "ItemDto [ItemId=" + itemId + ", ItemName=" + itemName + ", category=" + category + ", quantity="
					+ quantity + ", cost=" + cost + ", restaurants=" + restaurants
					+ "]";
		}

}
