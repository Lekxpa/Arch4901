package Fabric;


import Interface.IGameItem;
import Product.Rubin;


public class RubinGenerator extends ItemGenerator{
    
    @Override
    public IGameItem createItem(){
        return new Rubin();
    }
}