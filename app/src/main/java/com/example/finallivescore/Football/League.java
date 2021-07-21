package com.example.finallivescore.Football;

import java.util.ArrayList;
import java.util.List;

public class League {
    int  Id = 0;
    String League = "";
    String Competition = "";
    List<FootballMatch> Matches = new ArrayList<FootballMatch>();

    public int getId() {
        return Id;
    }

    public String getLeague() {
        return League;
    }

    public void setLeague(String league) {
        League = league;
    }

    public String getCompetition() {
        return Competition;
    }

    public void setCompetition(String competition) {
        Competition = competition;
    }

    public List<FootballMatch> getMatches() {
        return Matches;
    }

    public void setMatches(List<FootballMatch> matches) {
        Matches = matches;
    }
}
