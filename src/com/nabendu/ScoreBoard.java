package com.nabendu;

public class ScoreBoard {
    private int battingScoreTeam1;
    private int ballingScoreTeam1;
    private int battingScoreTeam2;
    private int ballingScoreTeam2;
    public String winnerTeam;
    public ScoreBoard(){
        battingScoreTeam1 =0;
        ballingScoreTeam1 =0;

        battingScoreTeam2 =0;
        ballingScoreTeam2 =0;
    }
    public void addScore(int team1or2,int batting1Balling0,int score){
        if (team1or2==1){
            if(batting1Balling0==1){
                battingScoreTeam1 +=score;
            }else {
                ballingScoreTeam1 += score;
            }
        }else {
            if(batting1Balling0 == 1){
                battingScoreTeam2 +=score;
            }else {
                ballingScoreTeam2 +=score;
            }
        }
    }
    public int closeBoard(){
        if ((battingScoreTeam1+ballingScoreTeam1) > (battingScoreTeam2+ballingScoreTeam2)){
            return 1;
        }else if((battingScoreTeam1+ballingScoreTeam1) < (battingScoreTeam2+ballingScoreTeam2)){
            return 2;
        }else {
            return 0;
        }
    }
}
