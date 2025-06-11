package com.rhydo.dreamshops.service.user;

import com.rhydo.dreamshops.model.User;
import com.rhydo.dreamshops.request.CreateUserRequest;
import com.rhydo.dreamshops.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
}
