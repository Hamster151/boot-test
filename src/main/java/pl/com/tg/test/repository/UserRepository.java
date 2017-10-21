package pl.com.tg.test.repository;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.com.tg.test.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepository implements IUserRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public User findOneEagerly(Long id) {
        User user = em.getReference(User.class, id);
        System.out.println("User initialized = " + Hibernate.isInitialized(user));
        Hibernate.initialize(user);
        System.out.println("User initialized = " + Hibernate.isInitialized(user));
        User user2 = em.getReference(User.class, 2L);
        System.out.println("User2 initialized = " + Hibernate.isInitialized(user2));
        System.out.println("User2 name = " + user2.getName());
        System.out.println("User2 initialized = " + Hibernate.isInitialized(user2));
        return user;
    }

    @Override
    public User findOne(Long id) {
        User user = em.getReference(User.class, id);
        return user;
    }

}
