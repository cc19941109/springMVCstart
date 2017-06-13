package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.servlet.MockMvc;

import com.chen.web.HomeController;

public class HomeControllerTest {

  @Test
  public void testHomePage() throws Exception {
	HomeController controller = new HomeController();
    //搭建 mockmvc
	MockMvc mockMvc = standaloneSetup(controller).build();
	//对 "/" 执行GRT请求，预期得到home
    mockMvc.perform(get("/homepage")) .andExpect(view().name("home"));
  }
  
  @Test
  public void test(){
	  HomeController homeController = new HomeController();
	  assertEquals("home", homeController.home());
  }

}
