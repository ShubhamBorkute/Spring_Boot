package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IPurchaseOrderService;

@Component
public class BootMailRunner implements CommandLineRunner {

	@Autowired
	private IPurchaseOrderService service;

	@Override
	public void run(String... args) throws Exception {
		String msg = service.purchase(new String[] { "Laptop", "Ram", "HDD", "Mouse" },
				new double[] { 20000.00, 1600.50, 3350.22, 500.0, }, new String[] { "shubhamborkute.dev@gmail.com" });
		System.out.println(msg);
	}

}
