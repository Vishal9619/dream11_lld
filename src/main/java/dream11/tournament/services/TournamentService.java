package main.java.dream11.tournament.services;

import main.java.dream11.tournament.models.Tournament;
import main.java.storage.StorageService;
import java.util.Scanner;

public class TournamentService {

    //public List<Player>
    StorageService storageService;

    public TournamentService(StorageService storageService) {
        this.storageService = storageService;
    }

    public void createTournament(Tournament tournament)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Tournament details");

        String tournamentName = sc.next();
        tournament.setTournamentName(tournamentName);

        storageService.addTournament(tournament);

    }

    public void play()
    {

    }

    public void showTournamentScore(Tournament tournament)
    {

    }
}
