package pl.com.tg.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import pl.com.tg.test.model.User;
import pl.com.tg.test.repository.IUserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class JpaTests {
    @Autowired
    private TestEntityManager em;
    @Autowired
    private IUserRepository userRepository;

    @Test
    public void testUserRepository() {
        User user = new User("TestName", "TestPass");
//        System.out.println("Saving entity");
        userRepository.save(user);
//        em.persist(user);
//        System.out.println("Entity saved");
//        userRepository.testParam();
//        em.flush();
//        System.out.println("Now flushed");
    }
}
