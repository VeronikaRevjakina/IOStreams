package main.java;

import java.util.Date;
import java.io.Serializable;


public class Actor implements Serializable{

    private String name;
    private String surname;

    private Date dateOfBirth;



    public Actor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Actor(String name, String surname, Date dateOfBirth) {
        this(name, surname);
        this.dateOfBirth = dateOfBirth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
       return new StringBuilder().append(name).append(" ").append(surname).toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Actor actor = (Actor) o;

        if (getName() != null ? !getName().equals(actor.getName()) : actor.getName() != null) {
            return false;
        }
        if (getSurname() != null ? !getSurname().equals(actor.getSurname()) : actor.getSurname() != null) {
            return false;
        }
        return getDateOfBirth() != null ? getDateOfBirth().equals(actor.getDateOfBirth()) : actor.getDateOfBirth() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getDateOfBirth() != null ? getDateOfBirth().hashCode() : 0);
        return result;
    }
}