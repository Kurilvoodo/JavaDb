package  Entities;

import  com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
@SuppressWarnings("PMD")
@Entity
@Inheritance(strtegy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "Games")

public  class Games{
    @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private  int idGame;
    @Column(name="typeOfGame")
    private  int typeOfGame;

    @Column(name="GameName")
    private String gameName;
    @Column(name="BasePrice")
    private double basePrice;
    @Column(name="OurPrice")
    private double ourPrice;

    public Game(){}
    public Game(int type,String name, double price,double shopprice){
        typeOfGame = type;
        gameName = name;
        basePrice = price;
        ourPrice = shopprice;
    }
    public int getIdGame(){return idGame;}
    public void setIdGame(int id){ idGame = id;}
    public String getGameName(){return gameName;}
    public void setGameName(String Name){gameName = Name;}
    public double getBasePrice(){return basePrice;}
    public void setBasePrice(double base){ basePrice = base;}
    public double getOurPrice(){return ourPrice;}
    public void setOurPrice(double price){ourPrice = price;}

}