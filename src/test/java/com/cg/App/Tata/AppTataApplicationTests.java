package com.cg.App.Tata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.App.Tata.Ctrl.AccountController;
import com.cg.App.Tata.Module.Account;
import com.cg.App.Tata.Service.IAccountServiceImpl;


@SpringBootTest
class AppTataApplicationTests {
    @MockBean
	private  IAccountServiceImpl account;
	
	@Test
	void contextLoads() {
	}
}
