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
public class restorder {

	OrderService orderService = new OrderService();

 // Get callusing spring based web service

	@GetMapping("/order")
	public String sayHello() {

		return "hello your order is placed";
	}

	// retrive Product info USing @GET MEthod
	@GetMapping("/orderinfo")
	public Order getDummyOrder() {

		Order s = new Order();// creating java object
		s.setid(105);
		s.setProductOrderName("mobile");
		s.setOrderQuantity("two");
		s.setOrderStatus("delivered");
		return s;
	}
// retrive the Product information by id
	@GetMapping("/orderid/{id}")
	public Order getDummyOrderById(@PathVariable("id") Integer id) {

		Order s = new Order();// creating java object

		s.setid(id);
		s.setProductOrderName("mobile");
		s.setOrderQuantity("two");
		s.setOrderStatus("delivered");
		return s;
	}


 // add the person information POst

	@PostMapping(value = "/insertorderdetails")
	public Order insertDummyOrder(@RequestBody Order order) {
		return orderService.addOrder(order); //calling the service
	}

	//update person info
	@PutMapping("/orderupdate")
	public Order updateorderInfo(@RequestBody Order order) {
		return orderService.updateOrder(order);
	
	}
	//get list
	@GetMapping("/getorderlist")
	public List<Order> getDummyOrderList() {
		List<Order> listOfOrder = orderService.getAllOrderlist();
		return listOfOrder;
	}
	
	//delete
	
	@DeleteMapping("/delete/{id}")
	public List<Order> deleteOrderByRollno(@PathVariable Integer id) {
	new OrderService().deleteOrder(id);
	return new OrderService().getAllOrderlist();
	}
}