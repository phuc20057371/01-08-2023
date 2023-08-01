package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User{
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private long id;
	@Column( name = "user_email")
	private String userEmail;
	@Column( name = "user_name")
	private String userName;
	@Column( name = "user_password")
	private String userPassword;
	public User() {
		
	}
}