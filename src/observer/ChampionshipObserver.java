package observer;

import exceptions.ChampionshipAlreadyExistException;
import model.ChampionshipImpl;
import model.Division;
import model.Zone;

public interface ChampionshipObserver {

    void addChampionship(Division d, Zone zone) throws ChampionshipAlreadyExistException;
    
    void deleteChampionship(ChampionshipImpl champ);
}