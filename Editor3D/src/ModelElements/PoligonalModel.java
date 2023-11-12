package ModelElements;

import java.util.ArrayList;
import java.util.List;
import Stuff.Point3D;
import Stuff.Poligon;
import Stuff.Texture;


public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;


    public PoligonalModel(List<Texture> texture){
        this.Textures = texture;
        this.Poligons = new ArrayList<>();
        
        this.Poligons.add(new Poligon(new Point3D()));
    }

}
