package com.rms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.model.Orders;
import com.rms.repository.OrdersRepository;
import java.util.List;
@Service
public class OrdersService {
	@Autowired
	private  OrdersRepository ordersRepository;
	private Integer ordersId;
	
		public Orders createOrders(Orders orders) {
			return ordersRepository.save(orders);
		}
		
		public List<Orders> getAllOrders() {
			return ordersRepository.findAll();
		}
		
		public Orders getOrdersDetailsById(int orderId) {
			return ordersRepository.getById(ordersId);
		}
		
		public void deleteOrdersDetailsById(int orderId) {
			return ordersRepository.deleteById(ordersId);
		}
		
		public Orders updateOrders(Orders orders ) {
			return ordersRepository.save(orders);
		}
		
		
}
