package com.di.HibernateOnetoOne;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@Entity
@Table(name="empaccount")

public class EmpAccount {
	@Id
	private Integer empno;
	private String password;
	private String email;
	
	public EmpAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmpAccount(Integer empno, String password, String email) {
		super();
		this.empno = empno;
		this.password = password;
		this.email = email;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "EmpAccount [empno=" + empno + ", password=" + password + ", email=" + email + "]";
	}


}
