/*
	package com.ecomm.test;

	import static org.junit.Assert.assertTrue;

	import java.util.List;

	import org.junit.Test;
	import org.junit.BeforeClass;
	import org.junit.Ignore;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.Model.Supplier;
import com.ecomm.dao.SupplierDAO;
	

	public class SupplierDAOTest 
	{
		
		static SupplierDAO supplierDAO;
		
		@BeforeClass
		public static void executeFirst()
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.ecomm");
			context.refresh();
			
			supplierDAO=(SupplierDAO)context.getBean("supplierDAO");     //Bean initialization 
		}
		@Ignore
		@Test
		public void addSupplierTest()          //need to add factory.addAnnotatedClass() in DBConfig
		{
			Supplier supplier=new Supplier();
			supplier.setSupplierName("John");
			supplier.setSupplierAdd("Vashi");
			
			assertTrue("Problem in Adding Supplier",supplierDAO.addSupplier(supplier));
		}
		@Ignore
		@Test
		public void deleteSupplierTest()
		{
			Supplier supplier=supplierDAO.getSupplier(4);
			assertTrue("Problem in Deleting Supplier",supplierDAO.deleteSupplier(supplier));
		}
		@Ignore
		@Test
		public void updateSupplierTest()
		{
			Supplier supplier=supplierDAO.getSupplier(2);
			supplier.setSupplierName("Harry");
			assertTrue("Problem in Updating Supplier",supplierDAO.updateSupplier(supplier));
		}
		
		@Ignore
		@Test
		public void listSupplierTest()
		{
			List<Supplier> supplierList=supplierDAO.listSuppliers();
			assertTrue("Problem in Listing Categories",supplierList.size()>0);
			for(Supplier supplier:supplierList)
			{
				System.out.println(supplier.getSupplierId()+":::");
				System.out.println(supplier.getSupplierName()+":::");
				System.out.println(supplier.getSupplierAdd()+":::");
			}
		}

	}

	
		




*/