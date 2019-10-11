package br.com.crcarvalho.crud.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import br.com.crcarvalho.crud.SpringtddComMockMvcApplicationTests;
import br.com.crcarvalho.crud.entity.Log;

public class LogControllerTest extends SpringtddComMockMvcApplicationTests {
	
	@Test
	public void getAllUsers() throws Exception {
		List<Log> logList = new ArrayList<>();
		logList.add(new Log(1L, "erro servidor", "pc01"));
		logList.add(new Log(2L, "acesso negado", "nt01"));
		
		when(logService.findAll()).thenReturn(logList);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/logs")
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", Matchers.hasSize(2)))
		.andDo(print());
	}
	
}
