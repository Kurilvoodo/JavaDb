package  DAO;

import  Entities.GameCode;
import com.fasterxml.jackson.core.JsonProcessingException;

import  java.util.List;

public interface  IGamesDAO{
    GamesCode BuyGameById(int idGame);
    void Unable();
}