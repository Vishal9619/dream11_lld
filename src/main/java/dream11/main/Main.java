package main.java.dream11.main;

import main.java.dream11.player.models.Player;
import main.java.dream11.player.services.PlayerService;
import main.java.dream11.team.models.Team;
import main.java.dream11.team.services.TeamService;
import main.java.dream11.tournament.models.Tournament;
import main.java.dream11.tournament.services.TournamentService;
import main.java.dream11.user.services.UserService;
import main.java.models.playerType.PlayerType;
import main.java.storage.StorageService;
import main.java.storage.StorageServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String args[])
    {
        StorageService storageService = new StorageServiceImpl();
        TournamentService tournamentService = new TournamentService(storageService);
        TeamService teamService = new TeamService(storageService);
        PlayerService playerService = new PlayerService(storageService);
        UserService userService = new UserService(storageService);





        Tournament tournament = new Tournament( "IPL");
        Player p1 = new Player("Sachin", 9, PlayerType.CAPTAIN);
        Player p2 = new Player("Virat", 8, PlayerType.VICE_CAPTION);
        Player p3 = new Player("KL Rahul", 8, PlayerType.TEAM_PLAYER);
        Player p4 = new Player("Shikhar Dhawan", 7, PlayerType.TEAM_PLAYER);
        Player p5 = new Player("Rohit Sharma", 8, PlayerType.TEAM_PLAYER);
        Player p6 = new Player("Dhoni", 7, PlayerType.TEAM_PLAYER);
        Player p7 = new Player("Boomrah", 7, PlayerType.TEAM_PLAYER);
        Player p8 = new Player("Hardik Pandya", 6, PlayerType.TEAM_PLAYER);
        Player p9 = new Player("Ishant Sharma", 5, PlayerType.TEAM_PLAYER);
        Player p10 = new Player("Vishal Gupta", 4, PlayerType.TEAM_PLAYER);


        Team team = new Team("KKR", tournament.getId(), 0, new ArrayList<Player>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10)));
        teamService.createTeam(team);



        tournamentService.createTournament(tournament);


    }

}
