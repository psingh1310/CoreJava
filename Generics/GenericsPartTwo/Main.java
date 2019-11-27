package com.prashant;

public class Main {

    public static void main(String[] args) {
     FootballPlayer joe = new FootballPlayer("Joe");
     BaseballPlayer pat = new BaseballPlayer("Pat");
     SoccerPlayer backham = new SoccerPlayer("Backham");

     Team<FootballPlayer> adelaideCrows = new Team<>("AdelaideCrows");
     adelaideCrows.addPlayer(joe);  //we only know able to add FootballPalyer to the adelaideCrows
//     adelaideCrows.addPlayer(pat);
//     adelaideCrows.addPlayer(backham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");  //But we are not doing any validation here
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(backham);

        Team<FootballPlayer> malborne = new Team<>("Melborne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        malborne.addPlayer(banks);

        Team<FootballPlayer> hawthron = new Team<>("Hawthron");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");


        hawthron.matchResult(fremantle,1,0);
        hawthron.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(fremantle,2,1);
       // adelaideCrows.matchResult(baseballTeam,1,1);

        System.out.println("Ranking");
        System.out.println(adelaideCrows.getName() + " : " + adelaideCrows.ranking());
        System.out.println(malborne.getName() + " : " + malborne.ranking());
        System.out.println(hawthron.getName() + " : " + hawthron.ranking());
        System.out.println(fremantle.getName() + " : " + fremantle.ranking());

        System.out.println(adelaideCrows.compareTo(malborne));
        System.out.println(adelaideCrows.compareTo(hawthron));

        System.out.println(hawthron.compareTo(adelaideCrows));
    }
}
