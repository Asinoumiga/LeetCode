package com.tello.designpattern.prototype04;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        SoccerField soccerField = new SoccerField();
        soccerField.setName("Camp Nop");
        soccerField.setSeats(10000);
        soccerField.setArea(99999);
        List<FootballPlayer> players = new ArrayList<>();
        FootballPlayer a = new FootballPlayer();
        a.setName("Messi");
        a.setPosition("Attacker");
        FootballPlayer b = new FootballPlayer();
        b.setName("Alaba");
        b.setPosition("Defender");
        players.add(a);
        players.add(b);

        FootballTeam team1 = new FootballTeam();
        team1.setName("Chinese");
        team1.setHost("GuoPig");
        team1.setFootballPlayers(players);
        team1.setSoccerField(soccerField);

        FootballTeam team2 = (FootballTeam) team1.clone();
        FootballPlayer c = team2.getFootballPlayers().get(1);
        c.setName("ZhengZhi");
        c.setPosition("Mid");

        System.out.println(team1);
        System.out.println(team2);
    }
}
