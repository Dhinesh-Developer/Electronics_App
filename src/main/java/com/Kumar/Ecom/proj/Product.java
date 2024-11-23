package com.Kumar.Ecom.proj;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Product {
	public Product(int id, String name, String desc, String brand, BigDecimal price, String category, Date releaseDate,
			boolean available, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.brand = brand;
		this.price = price;
		this.category = category;
		this.releaseDate = releaseDate;
		this.available = available;
		this.quantity = quantity;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", desc=" + desc + ", brand=" + brand + ", price=" + price
				+ ", category=" + category + ", releaseDate=" + releaseDate + ", available=" + available + ", quantity="
				+ quantity + ", imageName=" + imageName + ", imageType=" + imageType + ", imageDate="
				+ Arrays.toString(imageDate) + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for auto generating id;
	private int id;
	private String name;
	private String desc;
	private String brand;
//	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private BigDecimal price;
	private String category;
	private Date releaseDate;
	private boolean available;
	private int quantity;
	
	private String imageName;
	private String imageType;
	
	@Lob
	private byte[] imageDate;

	public String getImageType() {
		return null;
	}
	public Product(int id, String name, String desc, String brand, BigDecimal price, String category, Date releaseDate,
			boolean available, int quantity, String imageName, String imageType, byte[] imageDate) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.brand = brand;
		this.price = price;
		this.category = category;
		this.releaseDate = releaseDate;
		this.available = available;
		this.quantity = quantity;
		this.imageName = imageName;
		this.imageType = imageType;
		this.imageDate = imageDate;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public byte[] getImageDate() {
		return imageDate;
	}
	public void setImageDate(byte[] imageFile) {
		this.imageDate = imageFile;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	
	
}
