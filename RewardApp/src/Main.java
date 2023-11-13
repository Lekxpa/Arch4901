import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabric.BronzeGenerator;
import Fabric.DiamondGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.PlatinumGenerator;
import Fabric.RubinGenerator;
import Fabric.SilverGenerator;

public class Main {
    public static void main(String[] args) throws Exception{
        ItemGenerator generator = new GemGenerator();
        generator.openReward();
        List<ItemGenerator> generators = new ArrayList<>();
        generators.add(generator);
        generators.add(new GoldGenerator());
        generators.add(new BronzeGenerator());
        generators.add(new DiamondGenerator());
        generators.add(new PlatinumGenerator());
        generators.add(new RubinGenerator());
        generators.add(new SilverGenerator());

        Random random = new Random();
        for (int i = 0; i < 100; i ++){
            generators.get(random.nextInt(generators.size())).openReward();
        }
    }
}