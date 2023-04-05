package com.Tns.orderservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class Orderservices {
	
	@Autowired
	
	private OrderServicesRepository repo;
	public List<Order> listAll()
	{
		return repo.findAll();
	}
    public Order get(Integer ad_id)
    { 
	    return repo.findById(ad_id).get();
    }
    public void delete(Integer ad_id)
    {
	    repo.deleteById(ad_id);
    }
    public void save(Order odr)
    { 
	   repo.save(odr);
    }	

}
