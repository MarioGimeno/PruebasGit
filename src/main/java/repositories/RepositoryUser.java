package repositories;

import entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser extends JpaRepository<User, Long> {
   String nombre = "Marta";
   String apellido = "Diego";
}