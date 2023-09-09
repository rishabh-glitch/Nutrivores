package com.cg.ofda.dto;


import java.time.LocalDateTime;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "OrderDetails")
public class OrderDetailsDto {
		@Id
		@Column(name = "Order_ID")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long orderId;
	 
		LocalDateTime orderDate;
		@Column( name = "Order_Status",length = 20)
		private String orderStatus;
		
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name = "cart_Id")
		private FoodCartDto cart;

		public OrderDetailsDto() {
			super();

		}

		public OrderDetailsDto(long orderId, LocalDateTime localDateTime,FoodCartDto cart, String orderStatus) {
			super();
			this.orderId = orderId;
			this.orderDate = localDateTime;
			this.orderStatus = orderStatus;
			this.cart = cart;
		}

		public long getOrderId() {
			return orderId;
		}

		public void setOrderId(long orderId) {
			this.orderId = orderId;
		}

		public LocalDateTime getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(LocalDateTime orderDate) {
			this.orderDate = orderDate;
		}

		public FoodCartDto getCart() {
			return cart;
		}

		public void setCart(FoodCartDto cart) {
			this.cart = cart;
		}

		public String getOrderStatus() {
			return orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		@Override
		public String toString() {
			return "OrderDetails [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus
					+ ", cart=" + cart + "]";
		}



}

