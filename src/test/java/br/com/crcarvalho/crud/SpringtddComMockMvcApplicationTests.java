package br.com.crcarvalho.crud;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import br.com.crcarvalho.crud.controller.LogController;
import br.com.crcarvalho.crud.controller.UserController;
import br.com.crcarvalho.crud.service.LogService;
import br.com.crcarvalho.crud.service.UserService;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = {UserController.class, LogController.class})
public abstract class SpringtddComMockMvcApplicationTests {
	
	@Autowired
	protected MockMvc mockMvc;
	
	@MockBean
	protected LogService logService;
	
	@MockBean
	protected UserService userService;
	
}
