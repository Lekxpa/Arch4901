package Fabric;

import Interface.IGameItem;

public abstract class ItemGenerator {

    public void openReward(){
        createItem().open();
    }
    public abstract IGameItem createItem();

    @Override
    public String toString(){
        return getClass().getName();
        
    }
}
