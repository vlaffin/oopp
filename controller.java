package oopp;

import HW5.Model.Repo;
import HW5.Model.User;

import java.util.List;

public class Controller {
    private final Repo repo;

    public Controller(Repo repo) {
        this.repo = repo;
    }

    public void saveUser(User user) {
        repo.createUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repo.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }
        throw new Exception("* User does not exists. ");
    }

    public void deleteUser(String userId) throws Exception {
        List<User> users = repo.getAllUsers();
        User deletedUser = null;
        for (User user : users) {
            if (user.getId().equals(userId)) {
                deletedUser = user;
            }
        }
        users.remove(deletedUser);
        repo.removeUser(users);
    }
}