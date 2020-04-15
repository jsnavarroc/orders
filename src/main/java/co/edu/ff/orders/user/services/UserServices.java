package co.edu.ff.orders.user.services;

import co.edu.ff.orders.user.domain.Password;
import co.edu.ff.orders.user.domain.UserCreated;
import co.edu.ff.orders.user.domain.Username;
import co.edu.ff.orders.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    private final UserRepository repository;

    @Autowired
    public UserServices(@Qualifier("in-memory") UserRepository repository) {
        this.repository = repository;
    }

    public UserCreated createUser(Username username, Password password) {
        return repository.createOne(username, password);
    }

    public UserCreated findById(Long id) {
        return repository.findById(id);
    }
}
