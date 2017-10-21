package pl.com.tg.test.repository;

import org.springframework.stereotype.Repository;
import pl.com.tg.test.model.User;

@Repository
public interface IUserRepositoryCustom {
    User findOneEagerly(Long id);
    User findOne(Long id);
}
