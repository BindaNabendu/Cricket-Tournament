package com.nabendu;

public class BplMatch {
    public Team team1;
    public Team team2;
    ScoreBoard scoreBoard;
    public String location;


    public BplMatch(String firstTeamName,String SecondTeamName, String location){
        team1 = YourCricketGameName.allTeam.get(firstTeamName.toUpperCase());
        team2 = YourCricketGameName.allTeam.get(SecondTeamName.toUpperCase());
        this.location = location;
        scoreBoard = new ScoreBoard();

    }
    //Here AnyOne can modify depend on his demand.


}
