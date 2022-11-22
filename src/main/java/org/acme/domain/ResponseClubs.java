package org.acme.domain;

import java.util.List;

public class ResponseClubs {
    private List<Club> clubs;
    private Competition competition;

    public ResponseClubs() {
    }

    public ResponseClubs(List<Club> clubs, Competition competition) {
        this.clubs = clubs;
        this.competition = competition;
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public Competition getCompetition() {
        return competition;
    }

}
