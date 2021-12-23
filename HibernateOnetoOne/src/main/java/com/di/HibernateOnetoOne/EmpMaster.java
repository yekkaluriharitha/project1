package com.di.HibernateOnetoOne;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import org.hibernate.annotations.Entity;



@Entity
@Table(name="empmast")

public class EmpMaster {
	@Id
	@PrimaryKeyJoinColumn  
	private Integer empno;
	private String empname;
	private int salary;
	
	@OneToOne(fetch=FetchType.LAZY, targetEntity=EmpAccount.class,cascade=CascadeType.ALL)  
	@JoinColumn(name = "empno", referencedColumnName="empno")  
	private EmpAccount account;
	
	public EmpMaster(Integer empno, String empname, int salary) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.salary = salary;
	}
	
	public EmpMaster(Integer empno, String empname, int salary, EmpAccount account) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.salary = salary;
		this.account = account;
	}

	public EmpMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

		
	

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public EmpAccount getAccount() {
		return account;
	}

	public void setAccount(EmpAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "EmpMaster [empno=" + empno + ", empname=" + empname + ", salary=" + salary + "]";
	}

	
	

}
