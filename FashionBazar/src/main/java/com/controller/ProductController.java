package com.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecomm.Model.Category;
import com.ecomm.Model.Product;
import com.ecomm.dao.CategoryDAO;
import com.ecomm.dao.ProductDAO;

@Controller
public class ProductController {

	@Autowired
	ProductDAO productDAO;

	@Autowired
	CategoryDAO categoryDAO;

	@RequestMapping("/product")
	public String showProduct(Model m)
	{
		Product product=new Product();
		m.addAttribute("product",product);

		List<Product> productList=productDAO.listProducts();
		m.addAttribute("productList",productList);

		List<Category> categoryList=categoryDAO.listCategories();
		m.addAttribute("categoryList", categoryList);

		return "Product";
	}



	@RequestMapping(value="InsertProduct",method=RequestMethod.POST)
	public String InsertProduct(@ModelAttribute("p")Product p,Model m,HttpServletRequest request)
	{
		int categoryId=Integer.parseInt(request.getParameter("categoryId"));
		Category c=categoryDAO.getCategory(categoryId);
		p.setCategory(c);
		
		productDAO.addProduct(p);

		/*Product product=new Product();
		m.addAttribute("product",product);*/

		List<Product> productList=productDAO.listProducts();
		m.addAttribute("productList",productList);

		List<Category> categoryList=categoryDAO.listCategories();
		m.addAttribute("categoryList", categoryList);

		return "Product";
	}

	@RequestMapping(value="deleteProduct{productId}")   
	public String deleteProduct(@PathVariable("productId")int productId,Model m)
	{
		Product product=productDAO.getProduct(productId);
		productDAO.deleteProduct(product);

		List<Product> productList=productDAO.listProducts();
		m.addAttribute("productList", productList);


		List<Category> categoryList=categoryDAO.listCategories();    //To have options of category list 
		m.addAttribute("categoryList", categoryList);

		return "Product";
	}


	@RequestMapping(value="editProduct{productId}")
	public String editProduct(@PathVariable("productId")int productId,Model m)
	{
		Product product=productDAO.getProduct(productId);
		m.addAttribute("product",product);


		List<Category> categoryList=categoryDAO.listCategories();
		m.addAttribute("categoryList", categoryList);

		return "UpdateProduct";
	}

	@RequestMapping(value="UpdateProduct",method=RequestMethod.POST)
	public String UpdateProduct(@ModelAttribute("p")Product p,Model m)
	{
		productDAO.updateProduct(p);


		List<Product> productList=productDAO.listProducts();
		m.addAttribute("productList", productList);

		List<Category> categoryList=categoryDAO.listCategories();
		m.addAttribute("categoryList", categoryList);


		return "Product";
	}

	@RequestMapping(value="productByCategory{categoryId}")
	public ModelAndView selectProductByCategory(@PathVariable("categoryId")int categoryId) {
		
		ModelAndView m=new ModelAndView("index");
		
		List<Product> plist=productDAO.getProductListCategorywise(categoryId);
		m.addObject("productList",plist);
		
		List<Category> categoryList=categoryDAO.listCategories();
		m.addObject("categoryList", categoryList);
		
		return m;
	}	

}