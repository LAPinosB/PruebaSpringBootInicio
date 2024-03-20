package com.ecumayferrr.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CustomerAServiceImpl implements CustomerService{

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "Hello from customer A";
	}

}
