package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecomm.Model.Category;
import com.ecomm.Model.Product;
import com.ecomm.dao.CategoryDAO;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;

	@RequestMapping("categoryPage")
	public String showCategoryPage(Model m)
	{
		List<Category> categoryList=categoryDAO.listCategories();
		m.addAttribute("categoryList" ,categoryList);        //Taking list from database and display on server

		return "Category";
	}

	

	@RequestMapping(value="InsertCategory",method=RequestMethod.POST)
	  public String insertCategory(@RequestParam("categoryName") String categoryName,@RequestParam("categoryDesc")String categoryDesc,Model m)
	  {
	  Category category=new Category();
	  category.setCategoryName(categoryName);
	  category.setCategoryDesc(categoryDesc);
	  
	  categoryDAO.addCategory(category);       //Data insert in database 
	  
	  List<Category> categoryList=categoryDAO.listCategories();
		m.addAttribute("categoryList" ,categoryList);       
		
	  return "Category";
        }
	
	@RequestMapping(value="editCategory{categoryId}")
	public String editCategory(@PathVariable("categoryId")int categoryId,Model m)
	{
		Category category=categoryDAO.getCategory(categoryId);
		m.addAttribute("category",category);
		
		return "UpdateCategory";
	}
	
	
	@RequestMapping(value="deleteCategory{categoryId}")
	public ModelAndView deleteCategory(@PathVariable("categoryId")int categoryId)
	{
		ModelAndView m=new ModelAndView("redirect:categoryPage");
		try {                     
		Category c=categoryDAO.getCategory(categoryId);
		System.out.println(categoryDAO.deleteCategory(c));
		
		
	/*List<Category> categoryList=categoryDAO.listCategories();
		m.addObject("categoryList",categoryList);
	*/
		}catch (Exception e) {
			e.printStackTrace();
		}
		return m;
	}
	
	@RequestMapping(value="UpdateCategory",method=RequestMethod.POST)
	public String UpdateCategory(@ModelAttribute("category")Category category,Model m)
	{
		
		categoryDAO.updateCategory(category);
		
		List<Category> categoryList=categoryDAO.listCategories();
		m.addAttribute("categoryList",categoryList);
		
		return "Category";
		
		
	}
}
	
	
	
	 



