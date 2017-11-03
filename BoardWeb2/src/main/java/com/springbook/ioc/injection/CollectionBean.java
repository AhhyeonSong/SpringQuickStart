package com.springbook.ioc.injection;

import java.util.Map;

import org.springframework.stereotype.Controller;

public class CollectionBean {
//	private List<String> addressList;
	private Map<String, Controller> mappings;
	
	public void setAddressList(Map<String, Controller> mappings) {
		this.mappings=mappings;
	}
	

}
