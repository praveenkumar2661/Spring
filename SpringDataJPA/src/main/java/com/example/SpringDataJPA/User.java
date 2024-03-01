package com.example.SpringDataJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class User 
{
	@Id
	String mail;
	String password;
	@Override
	public String toString() {
		return "User [mail=" + mail + ", password=" + password + "]";
	}
}
