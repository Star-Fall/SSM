/**
 * 
 */
package com.starfall.ssm.test.emps;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @name: MokcMvcTest
 * @description: 测试SpringMVC的请求
 * @author: StarFall
 * @data: 2019年2月15日下午8:10:31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:applicationContext-servlet.xml" })
public class MokcMvcTest {

	/**
	 * 传入Springmvc的ioc
	 */
	@Autowired
	private WebApplicationContext wac;
	/**
	 * 虚拟mvc请求，获取到处理结果。
	 */
	private MockMvc mockMvc;

	private Logger logger = Logger.getLogger(MokcMvcTest.class);

	@Before
	public void initMokcMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void testAllEmp() throws Exception {
		// 模拟请求拿到返回值
		MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.get("/emps/get_all_emps")
						.accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
				.andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
		MockHttpServletResponse response = result.getResponse();
		String contentAsString = response.getContentAsString();
		logger.debug(contentAsString);
	}

	@Test
	public void testEmpPage() throws Exception {
		// 模拟请求拿到返回值
		MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.get("/emps/get_emps_page").param("pageNum", "2")
						.accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
				.andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();
		MockHttpServletResponse response = result.getResponse();
		String contentAsString = response.getContentAsString();
		logger.debug(contentAsString);
	}
}
