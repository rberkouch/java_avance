package fr.intiformation.spring.aop.api.controller;

import java.util.List;

import fr.intiformation.spring.aop.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.intiformation.spring.aop.api.model.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;


	@PostMapping("/save")
	public List<Product> saveProducts(@RequestBody List<Product> products) {

		List<Product> pList = service.addProduct(products);

		return pList;
	}

	@GetMapping("/findProducts")
	public List<Product> getProducts() {
		
		List<Product> products = service.findAllProducts();
	
		return products;
	}

}
