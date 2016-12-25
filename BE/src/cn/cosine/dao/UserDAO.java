package cn.cosine.dao;

import java.sql.SQLException;
import java.util.List;

import cn.cosine.models.User;

public interface UserDAO {
    List<User> findAll() throws Exception;
    List<User> findById(String id) throws SQLException;
    List<User> findByName(String name) throws SQLException;
    boolean insertUser(User user) throws SQLException;
    boolean updateUser(User user) throws SQLException;
    boolean deleteUser(User user) throws SQLException;
}
