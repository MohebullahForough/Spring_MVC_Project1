package com.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.springmvc.dao.ProductDao;

@Controller
public class DeleteController {
	
	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/deletingProduct/{prodId}")
	public RedirectView deleteProduct(@PathVariable("prodId") int pId,HttpServletRequest request)
	{
		productDao.deleteProduct(pId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
		
	}

}
