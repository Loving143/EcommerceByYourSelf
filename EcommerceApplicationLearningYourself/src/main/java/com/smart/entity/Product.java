package com.smart.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private Integer productId;
	private String productName;
	private String productDescription;
	private Double productDiscountedPrice;
	private Double productActualPrice;
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="product_images",
	joinColumns= { @JoinColumn(name="product_id")},
	inverseJoinColumns=
{
		@JoinColumn(name="image_id")
})
	private Set<Image>Images;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Double getProductDiscountedPrice() {
		return productDiscountedPrice;
	}
	public void setProductDiscountedPrice(Double productDiscountedPrice) {
		this.productDiscountedPrice = productDiscountedPrice;
	}
	public Double getProductActualPrice() {
		return productActualPrice;
	}
	public void setProductActualPrice(Double productActualPrice) {
		this.productActualPrice = productActualPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productDiscountedPrice=" + productDiscountedPrice + ", productActualPrice="
				+ productActualPrice + "]";
	}
	public Product(Integer productId, String productName, String productDescription, Double productDiscountedPrice,
			Double productActualPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productDiscountedPrice = productDiscountedPrice;
		this.productActualPrice = productActualPrice;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Set<Image> getImages() {
		return Images;
	}
	public void setImages(Set<Image> images) {
		Images = images;
	} 
	
	
	
	
	
	
	

}
