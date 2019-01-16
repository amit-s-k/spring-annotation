package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
    @Autowired
    private Actor actor;

    public Movie() {

    }

    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void log() {
        System.out.println(this.actor.toString());
    }

    public Actor getActor() {
        return this.actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
