package pl.com.tg.test.service;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.com.tg.test.model.User;
import pl.com.tg.test.repository.IUserRepository;

@Service
public class UserService implements IUserService {
    @Value("${myValueParam}")
    private String testParam;

    @Autowired
    private IUserRepository userRepository;

    @Override
    @Transactional
    public User getUserById(Long id) {
        User user = userRepository.findOne(id);
        System.out.println("User initialized = " + Hibernate.isInitialized(user));
        return user;
    }

    public Long addUser(User u){
        Long id = userRepository.save(u).getId();
        return id;
    }

    @Override
    public String testParam() {
        return testParam;
    }
}
