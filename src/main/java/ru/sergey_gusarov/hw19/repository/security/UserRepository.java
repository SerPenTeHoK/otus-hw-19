package ru.sergey_gusarov.hw19.repository.security;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.sergey_gusarov.hw19.domain.security.LibUser;


public interface UserRepository extends MongoRepository<LibUser, String> {
    public LibUser findUserByUserName(String userName);
}
