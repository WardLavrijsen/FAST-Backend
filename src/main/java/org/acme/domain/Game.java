package org.acme.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(generator = "INCREMENT")
    private Integer id;

    private Integer leagueId;

    private Integer homeid;
    private String homename;
    private String homelogo;

    private Integer awayid;
    private String awayname;
    private String awaylogo;

    private String date;

    public Game() {
    }

    public Game(Integer leagueId, Integer homeId, String homeName, String homeLogo, Integer awayId,
            String awayName, String awayLogo, String date) {
        this.leagueId = leagueId;
        this.homeid = homeId;
        this.homename = homeName;
        this.homelogo = homeLogo;
        this.awayid = awayId;
        this.awayname = awayName;
        this.awaylogo = awayLogo;
        this.date = date;
    }

    // public UUID getId() {
    // return this.id;
    // }

    public Integer getLeagueId() {
        return this.leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public Integer getHomeid() {
        return this.homeid;
    }

    public void setHomeid(Integer homeid) {
        this.homeid = homeid;
    }

    public String getHomename() {
        return this.homename;
    }

    public void setHomename(String homename) {
        this.homename = homename;
    }

    public String getHomelogo() {
        return this.homelogo;
    }

    public void setHomelogo(String homelogo) {
        this.homelogo = homelogo;
    }

    public Integer getAwayid() {
        return this.awayid;
    }

    public void setAwayid(Integer awayid) {
        this.awayid = awayid;
    }

    public String getAwayname() {
        return this.awayname;
    }

    public void setAwayname(String awayname) {
        this.awayname = awayname;
    }

    public String getAwaylogo() {
        return this.awaylogo;
    }

    public void setAwaylogo(String awaylogo) {
        this.awaylogo = awaylogo;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
