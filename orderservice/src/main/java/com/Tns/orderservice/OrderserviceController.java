package com.Tns.orderservice;

import java.util.List;


import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class OrderserviceController {

	@Autowired
	private Orderservices a;  
	
	@GetMapping(("/OrderServices"))
	public List<Order>list()
    { 
	return a.listAll();
	}
    @GetMapping("/OrderServices/(od_id)")
	public ResponseEntity<Order>get(@PathVariable Integer od_id)
	{
	  try
		  {
			  Order od=a.get(od_id);
			  return new ResponseEntity<Order>(od,HttpStatus.OK);
		  }
		  catch(NoResultException e)
		  { 
	
			  return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
		  }
	  }
	  @PostMapping("/OrderServices")
	  public void add(@RequestBody Order odr)
	  {
		  a.save(odr);
	  }
	  @PutMapping("/OrderServices/(od_id")
      public ResponseEntity<?> update(@RequestBody Order odr,@PathVariable Integer od_id)
      {
    	  Order existorder=a.get(od_id);
    	  a.save(odr);
    	  return new ResponseEntity<>(HttpStatus.OK);
      }
      @DeleteMapping("/OrderServices/(od_id)")
      public void delete(@PathVariable Integer od_id)
      {
    	  a.delete(od_id);
      }      
      
}

