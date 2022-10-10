package com.tello.designpattern.prototype04;

import java.util.ArrayList;
import java.util.List;

public class FootballTeam implements Cloneable{
    private String name;
    private String host;
    private List<FootballPlayer> footballPlayers;
    private SoccerField soccerField;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public List<FootballPlayer> getFootballPlayers() {
        return footballPlayers;
    }

    public void setFootballPlayers(List<FootballPlayer> footballPlayers) {
        this.footballPlayers = footballPlayers;
    }

    public SoccerField getSoccerField() {
        return soccerField;
    }

    public void setSoccerField(SoccerField soccerField) {
        this.soccerField = soccerField;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        FootballTeam footballTeam = (FootballTeam) super.clone();
        if(footballPlayers!=null){
            List<FootballPlayer> list = new ArrayList<>();
            for (int i = 0; i < footballPlayers.size(); i++) {
                list.add((FootballPlayer) footballPlayers.get(i).clone());
            }
            footballTeam.setFootballPlayers(list);
        }
        if(soccerField!=null){
            footballTeam.setSoccerField((SoccerField) soccerField.clone());
        }
        return footballTeam;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", host='" + host + '\'' +
                ", footballPlayers=" + footballPlayers +
                ", soccerField=" + soccerField +
                '}';
    }
}
