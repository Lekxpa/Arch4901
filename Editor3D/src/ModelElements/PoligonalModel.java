package ModelElements;

import java.util.ArrayList;
import java.util.List;
import Stuff.Types.Point3D;
import Stuff.Types.Poligon;
import Stuff.Types.Texture;


public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;


    public PoligonalModel(List<Texture> texture){
        this.Textures = texture;
        this.Poligons = new ArrayList<>();
        this.Poligons.add(new Poligon(new Point3D()));
    }

}
