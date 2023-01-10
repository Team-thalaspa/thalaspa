package fr.eni.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.bo.User;

public interface DaoUser extends JpaRepository<User, Long> {

}
