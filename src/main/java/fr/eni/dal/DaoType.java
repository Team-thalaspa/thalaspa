package fr.eni.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.bo.Type;

public interface DaoType extends JpaRepository<Type, Long> {

}
