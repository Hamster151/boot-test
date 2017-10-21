package pl.com.tg.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import pl.com.tg.test.service.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class TestApplicationTests {
	@Autowired
	private IUserService userService;

	@Test
	public void testUserRepository() {
		String paramValue = userService.testParam();
		Assert.assertEquals("Param value is not equal", paramValue, "myValueTestParam");
	}

}
