package com;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restproduct {

	ProductService productService = new ProductService();

 // Get callusing spring based web service

	@GetMapping("/product")
	public String sayHello() {

		return "hello welcome to products";
	}

	// retrive Product info USing @GET MEthod
	@GetMapping("/productinfo")
	public Product getDummyProduct() {

		Product s = new Product();// creating java object
		s.setid(105);
		s.setProductName("mobile");
		s.setProductCompany("samsung");
		s.setProductModel("galaxy");
		return s;
	}
// retrive the Product information by id
	@GetMapping("/productid/{id}")
	public Product getDummyProductById(@PathVariable("id") Integer id) {

		Product s = new Product();// creating java object

		s.setid(id);
		s.setProductName("mobile");
		s.setProductCompany("samsumg");
		s.setProductModel("galaxy");
		return s;
	}


 // add the person information POst

	@PostMapping(value = "/insertProductdetails")
	public Product insertDummyProduct(@RequestBody Product product) {
		return productService.addProduct(product); //calling the service
	}

	//update person info
	@PutMapping("/productupdate")
	public Product updateproductInfo(@RequestBody Product product) {
		return productService.updateProduct(product);
	
	}
	//get list
	@GetMapping("/getproductlist")
	public List<Product> getDummyProductList() {
		List<Product> listOfProduct = productService.getAllProductlist();
		return listOfProduct;
	}
	
	//delete
	
	@DeleteMapping("/delete/{id}")
	public List<Product> deleteProductByRollno(@PathVariable Integer id) {
	new ProductService().deleteProduct(id);
	return new ProductService().getAllProductlist();
	}
}