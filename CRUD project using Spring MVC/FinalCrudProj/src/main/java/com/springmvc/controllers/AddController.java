package com.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.springmvc.dao.ProductDao;
import com.springmvc.entities.Product;


 
@Controller
public class AddController {

	// creating object of productDao to call its methods
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/addingProduct")
	public String addProd(Model mdl) {
		mdl.addAttribute("title", "Add New Product");
		return "adding_product_page";
	}

	@RequestMapping(path = "/addingProductDetails", method = RequestMethod.POST)
	public RedirectView addingProduct(@ModelAttribute Product prod, HttpServletRequest request) {
		this.productDao.createProduct(prod);
		RedirectView redirect = new RedirectView();
		redirect.setUrl(request.getContextPath() + "/");
		return redirect;
	}
	
	


}


