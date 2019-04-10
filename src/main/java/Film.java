package main.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;

public class Film implements Serializable {

    private String title;
    private int yearOfRelease;
    private  String genre;
    private String director;
    private Set<Actor> actors;

    public Film(String title,int yearOfRelease){
        this.title=title;
        this.yearOfRelease=yearOfRelease;
        this.actors=new HashSet<>();
    }

    public Film(String title,int yearOfRelease,Set<Actor> actors){
        this(title,yearOfRelease);
        this.actors.addAll(actors);
    }

    public Film(String title,int yearOfRelease,String genre){
     this(title,yearOfRelease);
     this.genre=genre;
    }


    public Film(String title,int yearOfRelease,String genre,String director){
        this(title,yearOfRelease,genre);
        this.director=director;
    }

    public Film(String title,int yearOfRelease,String genre,String director,Set<Actor> actors){
        this(title,yearOfRelease,genre,director);
        this.actors=actors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public void setActors(Set<Actor> actors) {
        this.actors = actors;
    }

    public void showAllActors(){
        for(Actor element: actors){
            System.out.println(element);
        }
    }

    public int getNumberOfActors(){
        return actors.size();
    }

    public boolean addNewActor(Actor actor){
       return actors.add(actor);
    }

    public boolean addNewActors(Set<Actor> actors){
        return this.actors.addAll(actors);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Film{");
        sb.append("title='").append(title).append('\'');
        sb.append(", yearOfRelease=").append(yearOfRelease);
        if(this.genre!=null) sb.append(", genre='").append(genre).append('\'');
        if(this.director!=null) sb.append(", director='").append(director).append('\'');
        if(!this.actors.isEmpty()) sb.append(", actors=").append(actors);
        sb.append('}');
        return sb.toString();
    }

}
