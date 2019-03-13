package com.cts.grizzly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.grizzly.bean.Product;
import com.cts.grizzly.dao.ProductDAO;


@Service("productService")
@Transactional(propagation=Propagation.SUPPORTS)
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO productDAO;

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.addProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProduct(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> filterProducts(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
