package entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Type entity. @author MyEclipse Persistence Tools
 */

public class Type implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Set houses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Type() {
	}

	/** minimal constructor */
	public Type(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	/** full constructor */
	public Type(Long id, String name, Set houses) {
		this.id = id;
		this.name = name;
		this.houses = houses;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getHouses() {
		return this.houses;
	}

	public void setHouses(Set houses) {
		this.houses = houses;
	}

}