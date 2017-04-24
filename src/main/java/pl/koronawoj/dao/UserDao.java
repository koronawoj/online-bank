package pl.koronawoj.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pl.koronawoj.domain.User;

public interface UserDao extends CrudRepository<User, Long> {
	User findByUsername(String username);
    User findByEmail(String email);
    List<User> findAll();
}
