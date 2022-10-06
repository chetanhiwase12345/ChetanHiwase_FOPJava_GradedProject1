package com.departmentinf.department.driver;
import com.departmentinf.departments.model.AdminDepartment;
import com.departmentinf.departments.model.HrDepartment;
import com.departmentinf.departments.model.TechDepartment;
public class Driver {
	public static void main(String[] args)
	{
		AdminDepartment ad = new AdminDepartment();
		System.out.println("Welcome to " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println();
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}
}