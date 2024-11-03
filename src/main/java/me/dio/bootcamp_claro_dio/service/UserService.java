package me.dio.bootcamp_claro_dio.service;

import me.dio.bootcamp_claro_dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
