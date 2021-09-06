package com;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



/*
* It is just a helper class which should be replaced by database implementation.
* It is not very well written class, it is just used for demonstration.
*/
public class ProductService {



	static HashMap<Integer, Product> productMap = getproductMap(); //map list



	public ProductService() {
		super();



		if (productMap == null) {
			productMap = new HashMap<Integer, Product>();
			// Creating some objects of Person while initializing
			Product indiaProduct = new Product(1, "mobile", "samsung","galaxy");
			Product chinaProduct = new Product(2, "tablet", "apple", "ipad");
			Product nepalProduct = new Product(3, "tv", "sony", "xperia");
			Product bhutanProduct = new Product(4, "laptop", "lenovo", "thinkpad");



			//adding map list of collections in java
			productMap.put(1, indiaProduct);
			productMap.put(4, chinaProduct);
			productMap.put(3, nepalProduct);
			productMap.put(2, bhutanProduct);
		}
	}



	public List<Product> getAllProductlist() {
		List<Product> productlist = new ArrayList<Product>(productMap.values());
		return productlist;
	}



	public Product getProduct(int id) {
		Product Product = productMap.get(id);
		return Product;
	}
	// add product
	public Product addProduct(Product product) {
		product.setid(getMaxRollno()+ 1);

		// key , value
		productMap.put(product.getid(), product); ///logic class
		return product;
	}
	//update
	public Product updateProduct(Product product) {
		if (product.getid() <= 0)
			return null;
		productMap.put(product.getid(), product);
		return product;



	}
//delete



	public Product deleteProduct(int id) {
		return productMap.remove(id);
	}



	public static HashMap<Integer, Product> getproductMap() {
		return productMap;
	}


	// Utility method to get max id
	public static int getMaxRollno() {
		int max = 0;
		for (int id : productMap.keySet()) {
			if (max <= id)
				max = id;



		}
		return max;
	}
}