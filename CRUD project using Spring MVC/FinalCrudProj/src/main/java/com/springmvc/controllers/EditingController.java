package com.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.springmvc.dao.ProductDao;
import com.springmvc.entities.Product;


@Controller
public class EditingController {
	
	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/editingProduct/{prodId}")
	public String editingProduct(@PathVariable("prodId")int pid,Model mdl)
	{
		Product mySingleProduct = productDao.getSingleProduct(pid);
		mdl.addAttribute("product", mySingleProduct);
		mdl.addAttribute("title", "Editing");
		return "editing_Product_Page";
	}
	
	@RequestMapping(path = "/editHandler", method=RequestMethod.POST)
	public RedirectView editingProduct(@ModelAttribute Product product,HttpServletRequest request)
	{
		productDao.updateProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		
		return redirectView;
		
	}
	
	

}
