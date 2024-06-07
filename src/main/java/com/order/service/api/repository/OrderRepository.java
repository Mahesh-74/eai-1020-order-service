package com.order.service.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.service.api.entity.Order;



public interface OrderRepository extends JpaRepository<Order, Integer>{

}
