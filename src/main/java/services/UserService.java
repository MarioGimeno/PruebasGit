package services;

import Entities.User;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import repositories.RepositoryUser;

import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private RepositoryUser repositoryUser;

    // Obtener todos los usuarios
    public String getAllUsers() {
        return "Retornando desde getAllUsers";
    }

    // Obtener un usuario por ID
    public Optional<User> getUserById(Long id) {
        return repositoryUser.findById(id);
    }

    // Crear un nuevo usuario
    public User createUser(User user) {
        return repositoryUser.save(user);
    }

    // Actualizar un usuario existente
    public User updateUser(Long id, User userDetails) {
        return repositoryUser.findById(id).map(user -> {
            user.setName(userDetails.getName());
            user.setEmail(userDetails.getEmail());
            return repositoryUser.save(user);
        }).orElseThrow(() -> new RuntimeException("User not found with id " + id));
    }

    // Eliminar un usuario
    public void deleteUser(Long id) {
        if (repositoryUser.existsById(id)) {
            repositoryUser.deleteById(id);
        } else {
            throw new RuntimeException("User not found with id " + id);
        }
    }
}
