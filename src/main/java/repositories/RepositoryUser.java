package repositories;

import entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser extends JpaRepository<User, Long> {
   String nombre = "Marta";
   String apellido = "Diego";
   String perro = "Baloo";
   String perro2 = "Pitah";
   String perro3= "Simba";


   String hola = "Soy un lindo gatito";


   String cambio = "Nuevooo cambio mehaces un push porfa";

}