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
import br.com.crcarvalho.crud.entity.User;

public class UserControllerTest extends SpringtddComMockMvcApplicationTests {
	
	@Test
	public void getAllUsers() throws Exception {
		List<User> userList = new ArrayList<>();
		userList.add(new User(1L, "email@email.com", "123456", "email"));
		userList.add(new User(2L, "email2@email.com", "abcdef", "email2"));
		
		when(userService.findAll()).thenReturn(userList);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/users")
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(jsonPath("$", Matchers.hasSize(2)))
		.andDo(print());
	}
	
}
