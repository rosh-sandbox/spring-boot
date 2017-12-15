package com.boot.demo;

import com.boot.demo.controller.HomeController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void testApplication() {
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(result, "Spring boot, reporting for duty!");
	}

}
