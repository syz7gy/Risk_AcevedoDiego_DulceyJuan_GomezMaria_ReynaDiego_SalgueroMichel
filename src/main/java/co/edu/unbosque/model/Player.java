package co.edu.unbosque.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class Player {
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)Long id;
	@Column(unique = true)
	private String username;
	private String password;
	private String age;
	private String troopColor;
	private String country;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(Long id, String username, String password, String age, String troopColor, String country) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.troopColor = troopColor;
		this.country = country;
	}

	public Player(String username, String password, String age, String troopColor, String country) {
		this.username = username;
		this.password = password;
		this.age = age;
		this.troopColor = troopColor;
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTroopColor() {
		return troopColor;
	}

	public void setTroopColor(String troopColor) {
		this.troopColor = troopColor;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
