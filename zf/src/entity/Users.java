package entity;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields
	private Long id;
	private String name;
	private String password;
	private String telephone;
	private String username;
	private String isadmin;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String name, String password, String telephone,
			String username, String isadmin) {
		this.name = name;
		this.password = password;
		this.telephone = telephone;
		this.username = username;
		this.isadmin = isadmin;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIsadmin() {
		return this.isadmin;
	}

	public void setIsadmin(String isadmin) {
		this.isadmin = isadmin;
	}

}