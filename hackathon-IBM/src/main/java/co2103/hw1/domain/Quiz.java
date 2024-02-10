package co2103.hw1.domain;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private int id;
    private String name;
    private String genre;
    private List<Contestant> contestants;

    public Quiz(){
        this.contestants = new ArrayList<Contestant>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContestants(List<Contestant> contestants) {
        this.contestants = contestants;
    }

    public List<Contestant> getContestants() {
        return contestants;
    }
    //method to add a new contestant to the list of contestants
    public void addContestant(Contestant contestant){
        contestants.add(contestant);
    }
}