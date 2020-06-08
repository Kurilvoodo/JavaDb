package  DAO;

import  Entities.Games;
import Entities.GameCode
import com.fasterxml.jackson.core.JsonProcessingException;

import  java.util.List;

public interface  IGamesDAO{
    List<Games> getAllGames();
    Games GetGameById(int idGame);
    GamesCode BuyGameById(Games game, int idUser);
    List<Games> GetGameByType(int type);
    void addGame(Games game);
    GameCode SpinTheRoulette(int userId);
}