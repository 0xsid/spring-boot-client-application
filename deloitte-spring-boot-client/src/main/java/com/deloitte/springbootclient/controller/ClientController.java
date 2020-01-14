package com.deloitte.springbootclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.deloitte.springbootclient.model.Product;



@Controller
public class ClientController{

	
	RestTemplate rt;
	
	@PostMapping("/addProduct")
	public String addProduct(@ModelAttribute Product product,Model m) {
		 rt = new RestTemplate();
		
		ResponseEntity<Product> entity = rt.postForEntity("http://localhost:8888/products", product, Product.class);
		
		m.addAttribute("entity",entity);
		return "show.jsp";
	}
	
	@GetMapping("/searchProduct")
	public String getProductById(@RequestParam("txtpid") int id, Model m) {
		rt = new RestTemplate();
		ResponseEntity<Product> entity = rt.getForEntity("http://localhost:8888/products/"+id,Product.class);
	m.addAttribute("entity", entity);
	return "showProduct.jsp";
	
	}
}
