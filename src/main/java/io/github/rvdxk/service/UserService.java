package io.github.rvdxk.service;

import io.github.rvdxk.dto.UserDto;
import io.github.rvdxk.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
