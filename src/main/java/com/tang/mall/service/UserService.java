package com.tang.mall.service;

import com.tang.mall.exception.MallException;
import com.tang.mall.model.pojo.User;

/**
 * 描述：     UserService
 */
public interface UserService {

    User getUser();

    void register(String userName, String password) throws MallException;

    User login(String userName, String password) throws MallException;

    void updateInformation(User user) throws MallException;

    boolean checkAdminRole(User user);
}
