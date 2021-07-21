package com.example.finallivescore.Basketball;

import java.util.ArrayList;
import java.util.List;

public class League {
    int  Id = 0;
    String League = "";
    String Competition = "";
    List<BasketballMatch> Matches = new ArrayList<>();

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public List<BasketballMatch> getMatches() {
        return Matches;
    }

    public void setMatches(List<BasketballMatch> matches) {
        Matches = matches;
    }
}
