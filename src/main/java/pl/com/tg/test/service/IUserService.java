package pl.com.tg.test.service;

import pl.com.tg.test.model.User;

public interface IUserService {
    User getUserById(Long id);
    Long addUser(User u);
    String testParam();
}