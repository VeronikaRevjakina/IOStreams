package main.java;

import java.util.Date;


public class Actor implements java.io.Serializable{

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
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        if (!this.getName().equals(actor.getName())) return false;
        if (!this.getSurname().equals(actor.getSurname())) return false;
        return getDateOfBirth() != null ? getDateOfBirth().equals(actor.getDateOfBirth()) : actor.getDateOfBirth() == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        return result;

    }


}