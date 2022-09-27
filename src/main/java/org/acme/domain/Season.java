package org.acme.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Season {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String year;

    public Season() {
    }

    public Season(String year) {
        this.year = year;
    }

    public UUID getId() {
        return id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
