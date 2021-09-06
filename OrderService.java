package com;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class OrderService {



	static HashMap<Integer, Order> orderMap = getorderMap(); //map list



	public OrderService() {
		super();



		if (orderMap == null) {
			orderMap = new HashMap<Integer, Order>();
			// Creating some objects of Person while initializing
			Order indiaOrder = new Order(1, "mobile", "two","delivered");
			Order chinaOrder = new Order(2, "tablet", "one", "dispatch");
			Order nepalOrder = new Order(3, "tv", "one", "shipped");
			Order bhutanOrder = new Order(4, "laptop", "five", "out for delivery");



			//adding map list of collections in java
			orderMap.put(1, indiaOrder);
			orderMap.put(4, chinaOrder);
			orderMap.put(3, nepalOrder);
			orderMap.put(2, bhutanOrder);
		}
	}



	public List<Order> getAllOrderlist() {
		List<Order> orderlist = new ArrayList<Order>(orderMap.values());
		return orderlist;
	}



	public Order getOrder(int id) {
		Order Order = orderMap.get(id);
		return Order;
	}
	// add oredr
	public Order addOrder(Order order) {
		order.setid(getMaxRollno()+ 1);

		// key , value
		orderMap.put(order.getid(), order); ///logic class
		return order;
	}
	//update
	public Order updateOrder(Order order) {
		if (order.getid() <= 0)
			return null;
		orderMap.put(order.getid(), order);
		return order;



	}
//delete



	public Order deleteOrder(int id) {
		return orderMap.remove(id);
	}



	public static HashMap<Integer, Order> getorderMap() {
		return orderMap;
	}


	// Utility method to get max id
	public static int getMaxRollno() {
		int max = 0;
		for (int id : orderMap.keySet()) {
			if (max <= id)
				max = id;



		}
		return max;
	}
}