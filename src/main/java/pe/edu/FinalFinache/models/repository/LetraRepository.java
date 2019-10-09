package pe.edu.FinalFinache.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.FinalFinache.models.entity.Letra;

@Repository
public interface LetraRepository extends JpaRepository<Letra, Integer>{

}
