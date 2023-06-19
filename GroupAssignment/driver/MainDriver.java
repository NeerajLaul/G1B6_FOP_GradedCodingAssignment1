package com.group.driver;

import java.util.Scanner;

import com.group.department.AdminDepartment;
import com.group.department.HrDepartment;
import com.group.department.SuperDepartment;
import com.group.department.TechDepartment;

public class MainDriver extends SuperDepartment{
	
	public static void main(String[] args) {
		
		AdminDepartment AdminDep=new AdminDepartment();
		HrDepartment HrDep=new HrDepartment();
		TechDepartment TechDep=new TechDepartment();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Your Department");
		System.out.println("1. Admin Department");
		System.out.println("2. HR Department");
		System.out.println("3. Tech Department");
		
		int choice=sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("Wecome to " +AdminDep.departmentName());
			System.out.println("Today's Work is to " +AdminDep.getTodaysWork());
			System.out.println("Today's Work Deadline is to " +AdminDep.getWorkDeadline());
			System.out.println(AdminDep.isTodayAHoliday());
			break;
			
		case 2:
			System.out.println("Welcome to " +HrDep.departmentName());
			System.out.println("Today's Work is to " +HrDep.getTodaysWork());
			System.out.println("Today's Work Deadline is to " +HrDep.getWorkDeadline());
			System.out.println("Today's Activity is " + HrDep.doActivity());
			System.out.println(HrDep.isTodayAHoliday());
			break;
			
		case 3:
			System.out.println("Welcome to " +TechDep.departmentName());
			System.out.println("Today's Work is to " +TechDep.getTodaysWork());
			System.out.println("Today's Work Deadline is to " +TechDep.getWorkDeadline());
			System.out.println("Module Use is " +TechDep.getTechStackInformation());
			System.out.println(TechDep.isTodayAHoliday());
			break;
			
		default:
			System.out.println("Please Enter A Valid Choice");
		
		}
		sc.close();
	}

}
