package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Programa {

	public static void main(String[] args) {
	
		  SellerDao sellerDao = DaoFactory.CreateSellerDao();
		System.out.println("=== TEST 1: seller findbyId====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
        
		System.out.println("\n=== TEST 2:  findbyDepartment====");
		
		Department department = new Department (2,null);
		List <Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println (obj);
		}
	System.out.println("\n=== TEST 3:  findbyAll====");

		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println (obj);
		}
		System.out.println("\n=== TEST 4 :  seller insert====");

		Seller newSeller = new Seller(null,"Greg", "greg@gamail.com",new Date(),4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println ("Inseted! New id =" + newSeller.getId());
	}

}
