package Entities;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class Users{
    @Id
    @GeneratedValue(strategy - GenerationType.IDENTITY)
    private int idUser;

    @Column(name="Username")
    private  String username;

    @Column(name="Password")
    private  int password;

    @Column(name="Bill")
    private double bill;
    public int getIdUser(){return idUser;}
    public void setIdUser(int idUser){this.idUser = idUser;}
    public String getUsername(){return  Username;}
    public void setUsername(String Username){this.Username = Username;}
    public int getPassword(){return password;}
    public void setPassword(int password){this.password = password;}
    public double getBill(){return bill;}
    public void setBill(int bill){this.bill = bill;}

    public Users(String username, int password, double bill){
        this.setUsername(username);
        this.setPassword(password);
        this.setBill(bill);
    }
    public Users(){}
}
