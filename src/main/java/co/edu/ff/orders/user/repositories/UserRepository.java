package co.edu.ff.orders.user.repositories;

import co.edu.ff.orders.user.domain.Password;
import co.edu.ff.orders.user.domain.UserCreated;
import co.edu.ff.orders.user.domain.Username;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    UserCreated createOne(Username username, Password password);

    UserCreated findById(Long id);
}
