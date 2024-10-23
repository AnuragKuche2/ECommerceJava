package com.javaProject.dreamshops.service.user;

import com.javaProject.dreamshops.dto.UserDto;
import com.javaProject.dreamshops.model.User;
import com.javaProject.dreamshops.request.CreateUserRequest;
import com.javaProject.dreamshops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}