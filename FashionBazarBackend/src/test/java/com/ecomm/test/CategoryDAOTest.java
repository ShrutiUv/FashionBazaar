/*package com.ecomm.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.Model.Category;
import com.ecomm.dao.CategoryDAO;

public class CategoryDAOTest 
{
	
	static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");     //Bean initialization 
	}
	@Ignore
	@Test
	public void addCategoryTest()          //need to add factory.addAnnotatedClass() in DBConfig
	{
		Category category=new Category();
		category.setCategoryName("PeterEngland-FormalShirt");
		category.setCategoryDesc("FormalShirt with  neck and red colour of PeterEngland Brands");
		
		assertTrue("Problem in Adding Category",categoryDAO.addCategory(category));
	}
	@Ignore
	@Test
	public void deleteCategoryTest()
	{
		Category category=categoryDAO.getCategory(3);
		assertTrue("Problem in Deleting Category",categoryDAO.deleteCategory(category));
	}
	@Ignore
	@Test
	public void updateCategoryTest()
	{
		Category category=categoryDAO.getCategory(2);
		category.setCategoryName("VanHusen-Shirt");
		assertTrue("Problem in Updating Category",categoryDAO.updateCategory(category));
	}
	
	@Ignore
	@Test
	public void listCategoryTest()
	{
		List<Category> categoryList=categoryDAO.listCategories();
		assertTrue("Problem in Listing Categories",categoryList.size()>0);
		
		for(Category category:categoryList)
		{
			System.out.println(category.getCategoryId()+":::");
			System.out.println(category.getCategoryName()+":::");
			System.out.println(category.getCategoryDesc()+":::");
		}
	}

}


	


*/