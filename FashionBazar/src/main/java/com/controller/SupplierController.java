package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecomm.Model.Supplier;
import com.ecomm.dao.SupplierDAO;


@Controller
public class SupplierController {
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping(value="/supplier")
	public String showSupplierPage(Model m)
	{
		List<Supplier> supplierList=supplierDAO.listSuppliers();
		m.addAttribute("supplierList" ,supplierList);        

		return "Supplier";
	}
	
	@RequestMapping(value="AddSupplier",method=RequestMethod.POST)
	public String AddSupplier(@ModelAttribute("s")Supplier s,Model m)
	{
		supplierDAO.addSupplier(s);
		Supplier supplier=new Supplier();
		m.addAttribute("supplier",supplier);
		
		List<Supplier> supplierList=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",supplierList);
		
		return "Supplier";
	}
	
	@RequestMapping(value="deleteSupplier{supplierId}")   
	public String deleteProduct(@PathVariable("supplierId")int supplierId,Model m)
	{
		Supplier supplier=supplierDAO.getSupplier(supplierId);
		supplierDAO.deleteSupplier(supplier);
		
		List<Supplier> supplierList=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",supplierList);
		
		return "Supplier";
	}
	
	@RequestMapping(value="editSupplier{supplierId}")
	public String editProduct(@PathVariable("supplierId")int supplierId,Model m)
	{
		Supplier supplier=supplierDAO.getSupplier(supplierId);
		m.addAttribute("supplier",supplier);
		
		
		List<Supplier> supplierList=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",supplierList);
		
		return "UpdateSupplier";
	}
	@RequestMapping(value="UpdateSupplier",method=RequestMethod.POST)
	public String UpdateSupplier(@ModelAttribute("s")Supplier s,Model m)
	{
		supplierDAO.updateSupplier(s);
		
		
		List<Supplier> supplierList=supplierDAO.listSuppliers();
		m.addAttribute("supplierList",supplierList);
		
		return "Supplier";
	}
	
}
