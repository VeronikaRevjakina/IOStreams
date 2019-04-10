package test.java;

import main.java.Actor;
import main.java.Film;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FilmTest {

   private Film harryPotter;

    @Before
    public void setUp(){
     Actor AlanRickman=new Actor("Alan","Rickman");
     Actor DanielRad=new Actor("Daniel","Radcliffe");
     Actor EmmaWatson=new Actor("Emma","Watson");
     Actor[] hpActorsArray=new Actor[]{AlanRickman,DanielRad,EmmaWatson};
     Set<Actor>  hpCast=new HashSet<>(Arrays.asList(hpActorsArray));
     harryPotter=new Film("Harry Potter and the philosopher's stone",2001,hpCast);

 }

 @Test
 public void getNumberOfActorsShouldReturnNumberOfUniqueActorsInTheSet(){
        assertEquals(harryPotter.getNumberOfActors(),3);
 }

 @Test
 public void addNewActorShouldIgnoreDuplicate(){
     Actor AlanRickman2=new Actor("Alan","Rickman");
     harryPotter.addNewActor(AlanRickman2);
     assertEquals(harryPotter.getNumberOfActors(),3);
 }

    @Test
    public void addNewActorShouldAddNotExistingActor(){
        Actor GaryOldman=new Actor("Gary","Oldman");
        harryPotter.addNewActor(GaryOldman);
        assertEquals(harryPotter.getNumberOfActors(),4);
    }

 @Test
    public void addNewActorsShouldAddOnlyNotExistingActors(){

     Actor AlanRickman2=new Actor("Alan","Rickman");
     Actor TomFelton=new Actor("Tom","Felton");
     Actor[] hpActorsArrayAddition=new Actor[]{AlanRickman2,TomFelton};
     Set<Actor> hpCastAddition=new HashSet<>(Arrays.asList(hpActorsArrayAddition));
     harryPotter.addNewActors(hpCastAddition);
     assertEquals(harryPotter.getNumberOfActors(),4);
 }



}
