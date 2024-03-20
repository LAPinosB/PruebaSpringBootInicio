package com.ecumayferrr.primary;

import org.springframework.stereotype.Service;

@Service
public class CustomerBServiceImpl implements CustomerService{

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "Hello from customer B";
	}

}
