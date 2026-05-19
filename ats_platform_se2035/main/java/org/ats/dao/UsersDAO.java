package org.ats.dao;

import org.ats.entities.Users;

import java.util.List;

public interface UsersDAO {
    List<Users> findAll();

    Users createUsers(Users users);

}
