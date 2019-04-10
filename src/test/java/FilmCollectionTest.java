package test.java;

import main.java.Actor;
import main.java.Film;
import main.java.FilmCollection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FilmCollectionTest {

    private List<Film> hpCollection;

    @Before
    public void setUp(){
        Actor AlanRickman=new Actor("Alan","Rickman");
        Actor DanielRad=new Actor("Daniel","Radcliffe");
        Actor EmmaWatson=new Actor("Emma","Watson");
        Actor[] hpActorsArray=new Actor[]{AlanRickman,DanielRad,EmmaWatson};
        Set<Actor>  hpCast=new HashSet<>(Arrays.asList(hpActorsArray));
        Film harryPotterPS=new Film("Harry Potter and the philosopher's stone",2001,hpCast);
        Actor TomFelton=new Actor("Tom","Felton");
        hpCast.add(TomFelton);
        Film harryPotterCS=new Film("Harry Potter and the chamber of secrets",2002,hpCast);
        hpCast.add(new Actor("Gary","Oldman"));
        Film harryPotterPA=new Film("Harry Potter and the Prisoner of Azkaban",2003 ,hpCast);
        hpCollection=new ArrayList<>();
        hpCollection.add(harryPotterPS);
        hpCollection.add(harryPotterCS);
        hpCollection.add(harryPotterPA);

    }

    @Test
    public void writeCollectionToFileShouldWriteCollectionToExiatingFile(){
       FilmCollection.writeCollectionToFile(hpCollection,"src/main/resources/serialization.txt");
    }

    @Test
    public void readCollectionFromFileShouldReturnListOfFilmsObjects(){
       List<Film> resultCollection =
               FilmCollection.readCollectionFromFile("src/main/resources/serialization.txt");
       assertEquals(resultCollection.size(),3);
    }

    @Test
    public void editFilmTitleInFilmCollectionShouldReturnTrueIfTitleChanged(){
        Assert.assertTrue(FilmCollection.editFilmTitleInFilmCollection(hpCollection,
                "Harry Potter and the Prisoner of Azkaban", "Hary Potter and the Goblet of Fire"));
    }

    @Test
    public void editFilmTitleInFilmCollectionShouldReturnFalseIfThisFilmDoesNotExist(){
        Assert.assertFalse(FilmCollection.editFilmTitleInFilmCollection(hpCollection,
                "Harry Potter and the Deathly Hallows", "Hary Potter and the Goblet of Fire"));
    }
}
