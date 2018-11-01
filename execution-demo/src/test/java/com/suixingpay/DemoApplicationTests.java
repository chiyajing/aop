package com.suixingpay;

import com.suixingpay.bean.Product;
import com.suixingpay.log.LogService;
import com.suixingpay.service.ProductService;
import com.suixingpay.service.sub.SubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	ProductService productService;

	@Autowired
	SubService subService;

	@Autowired
	LogService logService;

	@Test
	public void test() {
		System.out.println("###begin test###");

		System.out.print("###匹配包：");
		subService.demo();

		System.out.println();
		System.out.print("###匹配对象：");
		logService.log();

		System.out.println();
		System.out.print("###匹配参数：");
		productService.findByTwoArgs(1L,"hello");
//		productService.findById(1L);
//		productService.getName();
		System.out.println();
		System.out.print("###匹配注解：");
		logService.annoArg(new Product());

		try {
			productService.exDemo();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		productService.log();

	}

}
