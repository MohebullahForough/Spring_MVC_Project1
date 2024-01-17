package com.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.dao.ProductDao;
import com.springmvc.entities.Product;


@Controller
public class HomeController {

	@Autowired
	ProductDao productDao;
	

	@RequestMapping("/")
	public String homePage(Model mdl) {
		List<Product> prods = productDao.getAllProducts();
		mdl.addAttribute("products", prods);
		mdl.addAttribute("title", "Home");
		return "index";
	}

	

}
