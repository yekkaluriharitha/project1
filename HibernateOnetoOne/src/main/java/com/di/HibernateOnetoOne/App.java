package com.di.HibernateOnetoOne;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner sc=new Scanner(System.in);
    	System.out.println("Enter employee number:");
    	int empno=Integer.parseInt(sc.nextLine());
    	System.out.println("Enter employee name:");
    	String empname=sc.nextLine();
    	System.out.println("Enter employee salary:");
    	int salary = Integer.parseInt(sc.nextLine());
    	
    	System.out.println("Enter employee password:");
    	String password=sc.nextLine();
    	System.out.println("Enter employee email:");
    	String email=sc.nextLine();
        
        Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating session factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	    //creating transaction object  
	    Transaction transaction=session.beginTransaction();
	    
	    EmpAccount account=new EmpAccount(empno, password, email); 
		 EmpMaster emp=new EmpMaster(empno, empname, salary, account);
		 session.persist(emp);
			transaction.commit();
			session.close();
		System.out.println("Done");
	

	      
	

    }
}
