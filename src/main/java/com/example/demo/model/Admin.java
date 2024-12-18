package com.example.demo.model;
import java.io.File;
import java.util.Arrays;

import org.springframework.data.annotation.Transient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

	@Entity
	@Table(name="job_admin")
	public class Admin {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	   private String fullName;
       private String email;
       private String mobile;
       private String password;

       @Lob
       private byte[] cv;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Long id, String fullName, String email, String mobile, String password, byte[] cv) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.cv = cv;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getCv() {
		return cv;
	}

	public void setCv(byte[] cv) {
		this.cv = cv;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", fullName=" + fullName + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", cv=" + Arrays.toString(cv) + "]";
	}
      
	}
	

		