package application;


import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Programa2 {

	public static void main(String[] args) {
	    
	    DepartmentDao departmentDao = DaoFactory.CreateDepartmentDao();
		
		System.out.println("=== TEST 1: seller findbyId====");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: findAll====");
		List<Department> list  = departmentDao.findAll();
		
		for(Department d :list) {
			
			System.out.println(d);
		}
		
		
	}

}
