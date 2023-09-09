package com.cg.ofda.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Category_Table")
public class CategoryDto {
	
	
		@Id
		@Column(name="Cartegory_Id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long catId;
		@Column(name="Category_Name",length = 20)
		private String categoryName;
		
		public CategoryDto() {
			super();
		}
		
		
		public long getCatId() {
			return catId;
		}


		public void setCatId(long catId) {
			this.catId = catId;
		}


		public String getCategoryName() {
			return categoryName;
		}


		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}


		public CategoryDto(long catId, String categoryName) {
			super();
			this.catId = catId;
			this.categoryName = categoryName;
		}


		@Override
		public String toString() {
			return "Category [catId=" + catId + ", categoryName=" + categoryName + "]";
		}


}
