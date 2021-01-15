package com.nabendu;

import java.util.*;

public class Team {
    public String teamName;
    public Coach coachName;
    private int numberOfPlayer;
    public int record;
    public Player Captain;
    public Player[] allPlayers;
    private Scanner playerInputer = new Scanner(System.in);

    public Team(String teamName, Coach coachName, int numberOfPlayer, int record, int captainId) {
        this.teamName = teamName.toUpperCase();
        this.coachName = coachName;
        this.numberOfPlayer = numberOfPlayer;
        allPlayers = new Player[numberOfPlayer];

        for(int i=0;i<numberOfPlayer;i++){
            System.out.println("Enter number "+(i+1)+" player Name:");
            String name = playerInputer.nextLine();
            System.out.println("Address: ");
            String address = playerInputer.nextLine();
            System.out.println("number:");
            int number = playerInputer.nextInt();
            System.out.println("Position");
            String position = playerInputer.nextLine();
            allPlayers[i] = new Player(name,number,position,address);
        }
        this.record = record;
        setCaptain(captainId);
        this.allPlayers = allPlayers;
    }
    private int setCaptain(int id){
        for(Player p : allPlayers){
            if(p.number==id){
                Captain = p;
                return 1;
            }
        }
        return 0;
    }
}
