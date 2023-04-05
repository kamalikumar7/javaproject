package com.Tns.orderservice;


import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderServicesRepository extends JpaRepository<Order,Integer>
{

}
