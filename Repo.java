package oopp;


import java.util.List;

public interface Repo {
    List<User> getAllUsers();
    String createUser(User user);
    void removeUser(List<User> users);
}