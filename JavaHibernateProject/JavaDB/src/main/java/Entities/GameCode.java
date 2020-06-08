package Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "GameCodes")
public class GameCode {
    @GameId
    private int idGame; //foreign key
    @Column(name = "GameCode")
    private String code;
    @Column(name = "able")
    private int able;
    public GameCode(){}
    public GameCode(int id,String codeshop, int able){
        idGame=id;
        code = codeshop;
        this.able = able;
    }
    public int getIdGame(){
        return idGame;
    }
    public void setIdGame(int id){
        idGame = id;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code=code;
    }
    public int getAble(){
        return able;
    }
    public void setAble(int able){
        this.able = able
    }
}