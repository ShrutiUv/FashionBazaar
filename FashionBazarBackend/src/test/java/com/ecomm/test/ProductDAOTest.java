/*package com.ecomm.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.Model.Category;
import com.ecomm.Model.Product;
import com.ecomm.dao.ProductDAO;

public class ProductDAOTest {
	
		
		 static ProductDAO productDAO;
		  
			@BeforeClass
			public static void executeFirst()
			{
				AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
				context.scan("com.ecomm");
				context.refresh();
				
				productDAO=(ProductDAO)context.getBean("productDAO");     //Bean initialization 
			}
			
			@Ignore
			@Test
			public void addProductTest()          //need to add factory.addAnnotatedClass() in DBConfig
			{
				Product product=new Product();                                             
				product.setProductName("Van Heusen Sport Men's");
				product.setProductDesc("Slim Fit Casual Shirt");
				product.setStock(2);
				product.setPrice(1200);
				
				product.setSupplierId(4);
				product.setCategoryId(4);
				
				assertTrue("Problem in Adding Product",productDAO.addProduct(product));
			
			}
			@Ignore
			@Test
			public void deleteProductTest()
			{
				Product product=productDAO.getProduct(6);
				assertTrue("Problem in Deleting Product",productDAO.deleteProduct(product));
			}
			
			@Ignore
			@Test
			public void updateProductTest()
			{
				Product product=productDAO.getProduct(5);
				product.setCategoryId(5);
				assertTrue("Problem in Updating Product",productDAO.updateProduct(product));
			}
			
			@Ignore
			@Test
			public void listProductTest()
			{
				List<Product> productList=productDAO.listProducts();
				
				
				for(Product product:productList)
				{
					System.out.println(product.getProductId()+":::");
					System.out.println(product.getProductName()+":::");
					System.out.println(product.getProductDesc()+":::");
					System.out.println(product.getStock()+":::");
					System.out.println(product.getPrice()+":::");
					System.out.println(product.getCategoryId()+":::");
					System.out.println(product.getSupplierId()+":::");
				}
				
				assertTrue("Problem in Listing Products",productList.size()>0);
			}
			@Ignore
			@Test
			 public  void getProductListCategorywiseTest()
			 {
			List<Product> productList=productDAO.getProductListCategorywise(2);
			
			for(Product product:productList)
			{
				System.out.println(product.getProductId()+":::");
				System.out.println(product.getProductName()+":::");
				System.out.println(product.getProductDesc()+":::");
				System.out.println(product.getStock()+":::");
				System.out.println(product.getPrice()+":::");
				System.out.println(product.getCategoryId()+":::");
				System.out.println(product.getSupplierId()+":::");
			}
			
			assertTrue("Problem in Listing ProductsCategorywise",productList.size()>0);
				
				
				
			}
				
				
			 }
			
			

			
			
			
			
			
			
			
			

			
			







		



*/