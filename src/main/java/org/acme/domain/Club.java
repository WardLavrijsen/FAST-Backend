package org.acme.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Club {
    @Id
    private Integer id;
    private String name;
    private String logo;
    private Integer leagueId;

    public Club() {
    }

    public Club(Integer id, String name, String logo, Integer leagueId) {
        this.id = id;
        this.name = name;
        this.logo = logo;
    }

    public Integer getId() {
        return id;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
