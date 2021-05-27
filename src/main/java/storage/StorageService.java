package main.java.storage;

import main.java.dream11.player.models.Player;
import main.java.dream11.team.models.Team;
import main.java.dream11.tournament.models.Tournament;
import main.java.dream11.user.models.User;

public interface StorageService {

    public boolean addTournament(Tournament tournament);
    public boolean addTeam(Team team);
    public boolean addUser(User user);
    public boolean addPlayer(Player player);

}
