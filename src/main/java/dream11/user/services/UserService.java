package main.java.dream11.user.services;

import main.java.dream11.team.models.Team;
import main.java.dream11.user.models.User;
import main.java.storage.StorageService;

public class UserService {
    public UserService(StorageService storageService) {
        this.storageService = storageService;
    }

    StorageService storageService;


    public void createUser(User user)
    {

    }

    public void showUserTeamScore(User user, Team team)
    {

    }

    public void createTeam(User user, Team team)
    {

    }
}
