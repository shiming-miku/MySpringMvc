//package org.web.test;
//
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//import org.junit.Before;
//import org.junit.Test;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//public class TestController {
//	    @Autowired
//	    private WebApplicationContext webApplicationContext;
//	    private MockMvc mockMvc;
//	    @Before
//	    public void init(){
//	        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//	    }
//	    @Test
//	    public void printBeans(){
//	        String[] beans=webApplicationContext.getBeanDefinitionNames();
//	        for (String bean : beans) {
//	            System.out.println(bean);
//	        }
//	    }
////	    /*测试以普通请求参数发送的请求*/
////	    @Test
////	    public void testSave() throws Exception {
////	        mockMvc.perform((post("/spring/post.do").param("abc", "def")))
////            .andExpect(status().isOk()).andDo(print());
////	    }
//}
