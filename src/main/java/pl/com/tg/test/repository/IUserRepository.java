package pl.com.tg.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.com.tg.test.model.User;

public interface IUserRepository extends JpaRepository<User, Long>{
}
