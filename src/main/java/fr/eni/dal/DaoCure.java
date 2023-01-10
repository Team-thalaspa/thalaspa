package fr.eni.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.bo.Cure;


public interface DaoCure extends JpaRepository<Cure, Long> {

}
