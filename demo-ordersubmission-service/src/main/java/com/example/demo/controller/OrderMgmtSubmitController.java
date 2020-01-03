package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.OrderProductsInfo;
import com.example.demo.api.OrderProductsResponseInfo;
import com.example.demo.delegate.OrderMgmtSubmitDelegate;
import com.example.demo.exception.DemoException;

@RestController
@RequestMapping("v1")
public class OrderMgmtSubmitController {
	
	@Autowired
	private OrderMgmtSubmitDelegate orderMgmtSubmitDelegate;

	@PostMapping("/ordermgmt/order")
	public OrderProductsResponseInfo submitOrder(@RequestBody OrderProductsInfo orderProductsInfo) throws DemoException {
		return orderMgmtSubmitDelegate.submitOrder(orderProductsInfo);
	}

	
}
