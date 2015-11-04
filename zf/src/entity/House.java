package entity;

import java.util.Date;

/**
 * House entity. @author MyEclipse Persistence Tools
 */

public class House implements java.io.Serializable {

	// Fields

	private Long id;
	private Type type;
	private Street street;
	private Long userId;
	private String title;
	private String description;
	private Long price;
	private Date pubdate;
	private Long floorage;
	private String contact;

	// Constructors

	/** default constructor */
	public House() {
	}

	/** minimal constructor */
	public House(Long id) {
		this.id = id;
	}

	/** full constructor */
	public House(Long id, Type type, Street street, Long userId, String title,
			String description, Long price, Date pubdate, Long floorage,
			String contact) {
		this.id = id;
		this.type = type;
		this.street = street;
		this.userId = userId;
		this.title = title;
		this.description = description;
		this.price = price;
		this.pubdate = pubdate;
		this.floorage = floorage;
		this.contact = contact;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Street getStreet() {
		return this.street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Date getPubdate() {
		return this.pubdate;
	}

	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}

	public Long getFloorage() {
		return this.floorage;
	}

	public void setFloorage(Long floorage) {
		this.floorage = floorage;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}