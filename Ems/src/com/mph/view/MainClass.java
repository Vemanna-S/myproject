package com.mph.view;

import java.io.IOException;
import java.lang.*;
import java.util.Scanner;

import com.mph.controller.Employeecontroller;
import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeInterface;
import com.mph.exception.UserNotFoundException;
import com.mph.model.Employee;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hi All");
		Scanner sc = new Scanner(System.in);
		String un, pw;
		boolean bul=true;
		for(int j=0;j<3;j++) {
		System.out.println("Enter Username");
		un = sc.next();
		System.out.println("Enter password");
		pw = sc.next();
		if (un.equals("Vems") && pw.equals("1234")) {
    		bul=true;
    		break;}
    	else {bul=false;
    	      System.out.println("Incorrect details enter ur correct details");    }
    	}
        
    	
		try {
			   if (bul) {
				System.out.println("Welcome ");

				EmployeeInterface ec = new EmployeeController();
				String c = null;
				do {
					System.out.println("Enter your Choice :");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					System.out.println("3. Sort Employee byName");
					System.out.println("4. Serialize Employee");
					System.out.println("5. De-Serialize Employee");
					int choice = sc.nextInt();

					switch (choice) {
					case 1: {
						ec.addEmployee();
						break;
					}
					case 2: {
						ec.viewEmployee();
						break;
					}
					case 3: {
						ec.sortEmployeeByName();
						break;
					}
					case 4: {
						ec.serializeEmp();
						break;
					}
					
					case 5: {
						ec.deserializeEmp();
						break;
					}
					default: {
						System.out.println("Choose the right choice !!!");
					}
					}

					System.out.println("Do you want to continue? Y or y");
					c = sc.next();

				} while (c.equals("y") || c.equals("Y"));
				System.out.println("Exited from application.");
				System.exit(0);
			} 
			
			else {
				throw new UserNotFoundException();
			}
		}
		
		catch (UserNotFoundException unfe) {
			
			unfe.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("From Finally");
		}
		System.out.println("Main Ended");

	}
}