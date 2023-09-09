package com.cg.ofda.dto;

import java.time.LocalDate;

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
@Table(name="Bill_Table")
public class BillDto {
	@Id
	@Column(name="Bill_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long billId;
	
	@Column(name="Bill_Date", length = 10)
	private LocalDate billDate;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "order_Id")
	private OrderDetailsDto order;
	
	@Column(name="Total_Items")
	private int totalItems;
	
	@Column(name="TotalCost", length = 8)
	private double totalCost;
		


		public BillDto() {
			super();
		}



		public long getBillId() {
			return billId;
		}



		public void setBillId(long billId) {
			this.billId = billId;
		}



		public LocalDate getBillDate() {
			return billDate;
		}



		public void setBillDate(LocalDate billDate) {
			this.billDate = billDate;
		}



		public OrderDetailsDto getOrder() {
			return order;
		}



		public void setOrder(OrderDetailsDto order) {
			this.order = order;
		}



		public int getTotalItems() {
			return totalItems;
		}



		public void setTotalItems(int totalItems) {
			this.totalItems = totalItems;
		}



		public double getTotalCost() {
			return totalCost;
		}



		public void setTotalCost(double totalCost) {
			this.totalCost = totalCost;
		}



		public BillDto(long billId, LocalDate billDate, OrderDetailsDto order, int totalItems, double totalCost) {
			super();
			this.billId = billId;
			this.billDate = billDate;
			this.order = order;
			this.totalItems = totalItems;
			this.totalCost = totalCost;
		}
		

				


}

