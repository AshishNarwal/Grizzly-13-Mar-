package com.cts.grizzly.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.grizzly.bean.Product;


@Repository("productDAO")
@Transactional(propagation=Propagation.SUPPORTS)
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory ;
	
	@Transactional
	public String addProduct(Product product) {
	
		Session session = null;
		
		try{
			session = sessionFactory.getCurrentSession();
			session.save(product);
			return "success";
		} catch(Exception e){
			
			e.printStackTrace();
			return "fail";
		} finally{
			
		}
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<Product>();
		Session session=null;
		
		session=sessionFactory.getCurrentSession();
		String stringQuery="from product p";
		Query query=session.createQuery(stringQuery);
		list=query.getResultList();
		
		return list;
	}

	public Product findProduct(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteProduct(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> filterProducts(String query) {
		// TODO Auto-generated method stub
		return null;
	}

}
