package com.example.finallivescore.Tennis;

import java.util.Calendar;

public class TennisMatch {
    Player[] Players = new Player[2];
    Calendar MatchTime = null;

    public Player[] getPlayers() {
        return Players;
    }

    public void setPlayers(Player[] players) {
        Players = players;
    }

    public Calendar getMatchTime() {
        return MatchTime;
    }

    public void setMatchTime(Calendar matchTime) {
        MatchTime = matchTime;
    }
}
