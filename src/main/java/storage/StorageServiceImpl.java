package main.java.storage;

import main.java.dream11.player.models.Player;
import main.java.dream11.team.models.Team;
import main.java.dream11.tournament.models.Tournament;
import main.java.dream11.user.models.User;

import java.util.HashMap;
import java.util.Map;


public class StorageServiceImpl implements StorageService{

    Map<String, Tournament> tournaments;
    Map<String, Player> players;
    Map<String, User> users;
    Map<String, Team> teams;

    public StorageServiceImpl() {
        this.tournaments = new HashMap<>();
        this.players = new HashMap<>();
        this.users = new HashMap<>();
        this.teams = new HashMap<>();
    }

    @Override
    public boolean addTournament(Tournament tournament)
    {
        if(tournament != null){
            if(tournaments.containsKey(tournament.getId())){
                System.out.println(tournament.getTournamentName() + " already registered");
                return false;
            }
            tournaments.put(tournament.getId(), tournament);
            System.out.println(tournament.getTournamentName() + " sucessfully registered");
            return true;
        }
        System.out.println("Invalid buyer");
        return false;
    }

    @Override
    public boolean addTeam(Team team)
    {

    }

    @Override
    public boolean addPlayer(Player player)
    {

    }

    @Override
    public boolean addUser(User user)
    {

    }

}
