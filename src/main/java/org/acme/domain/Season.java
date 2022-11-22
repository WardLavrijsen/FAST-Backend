package org.acme.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Season {
    @Id
    private String year;

    public Season() {
    }

    public Season(String year) {
        this.year = year;
    }

    public String getId() {
        return year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
