package org.acme.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Competition {
    @Id
    private Integer id;
    private String name;
    private String logo;

    public Competition() {
    }

    public Competition(Integer id, String name, String logo) {
        this.id = id;
        this.name = name;
        this.logo = logo;
    }

    public Integer getId() {
        return id;
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
