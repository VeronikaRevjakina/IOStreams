package main.java;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilmCollection implements java.io.Serializable {


    public static List<Film> readCollectionFromFile(String pathToSerializedFile) {

        List<Film> filmsCollection = new ArrayList<Film>();

        try(ObjectInputStream in =new ObjectInputStream(new FileInputStream(new File(pathToSerializedFile)))){
          filmsCollection=( ArrayList<Film>) in.readObject();
        }
        catch(FileNotFoundException f){
            System.out.println("FileNotFoundException worked");
            f.printStackTrace();
        }
        catch(IOException exception) {
            System.out.println("IOException worked");
            exception.printStackTrace();

        }
        catch(ClassNotFoundException exception){
            System.out.println("ClassNotFoundException worked");
            exception.printStackTrace();
        }
        return filmsCollection;
    }


    public static void writeCollectionToFile(List<Film> filmsCollection,String pathToSerializedFile){
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(pathToSerializedFile))){
            out.writeObject(filmsCollection);
        }
        catch(FileNotFoundException f){
            System.out.println("FileNotFoundException worked");
            f.printStackTrace();
        }
        catch(IOException exception) {
            System.out.println("IOException worked");
            exception.printStackTrace();

        }

    }

    public static boolean editFilmTitleInFilmCollection(List<Film> filmsCollection,String oldTitle,String newTitle){
        for(Film film:filmsCollection){
           if( film.getTitle().equals(oldTitle)){
               film.setTitle(newTitle);
               return true;
           }
        }
        System.out.println("Film with this title doesnt exist,use add");
        return false;
    }
}
