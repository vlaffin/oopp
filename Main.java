package oopp;

import HW5.Controller.Controller;
import HW5.Model.FileOperation;
import HW5.Model.FileOperationImp;
import HW5.Model.Repo;
import HW5.Model.RepoFile;
import HW5.View.UserView;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImp("Users.txt");
        Repo repo = new RepoFile(fileOperation);
        Controller controller = new Controller(repo);
        UserView view = new UserView(controller);
        view.start();
    }
}