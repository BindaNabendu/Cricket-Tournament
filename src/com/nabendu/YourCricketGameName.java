package com.nabendu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class YourCricketGameName {
    public static Map<String,Team> allTeam = new HashMap<>();
    public String gameName;
    public YourCricketGameName(String gameName){
        this.gameName = gameName;
    }

    public void addTeam(String teamName, Coach coachName, int numberOfPlayer, int record, int captainId){
        Team team = new Team(teamName,coachName,numberOfPlayer,record,captainId);
        allTeam.put(team.teamName,team);
    }
    public void removeTeam(String teamName){
        allTeam.remove(teamName.toUpperCase());
    }
}
