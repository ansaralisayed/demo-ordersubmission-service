package com.example.demo.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.api.OrderProductsInfo;
import com.example.demo.api.OrderProductsResponseInfo;

@Service
public class OrderMgmtSubmitDelegate {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${order.submit.service.url}")
	private String ORDER_SUBMIT_SVC_URL;
	
	
	public OrderProductsResponseInfo submitOrder(OrderProductsInfo orderProductsInfo) {
		ResponseEntity<OrderProductsResponseInfo> response = restTemplate.postForEntity(ORDER_SUBMIT_SVC_URL, orderProductsInfo, OrderProductsResponseInfo.class);
		return response.getBody();
	}

}
