import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

import Fabric.BronzeGenerator;
import Fabric.DiamondGenerator;
import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.PlatinumGenerator;
import Fabric.RubinGenerator;
import Fabric.SilverGenerator;


public class Main {
    public static void main(String[] args) throws Exception {
        ItemGenerator generator = new GemGenerator();
        ItemGenerator goldgenerator = new GoldGenerator();
        ItemGenerator silvergenerator = new SilverGenerator();
        ItemGenerator bronzegenerator = new BronzeGenerator();
        ItemGenerator rubingenerator = new RubinGenerator();
        ItemGenerator diamondgenerator = new DiamondGenerator();
        ItemGenerator platinumgenerator = new PlatinumGenerator();
        
        List<ItemGenerator> generators = new ArrayList<>();

        // добавляем счетчики для добавления заданного количества наград
        int countGem = 1;
        int countGold = 3;
        int countOther = 10;

        // добавляем заданное количество наград из драг.камней
        for (int i = 0; i < countGem; i ++){
            generators.add(generator);
        }

        // добавляем заданное (10) количество других наград
        for (int i = 0; i < countOther; i ++){
            generators.add(silvergenerator);
            generators.add(bronzegenerator);
            generators.add(platinumgenerator);
            generators.add(rubingenerator);
            generators.add(diamondgenerator);
        }

        // добавляем заданное количество золотых
        for (int i = 0; i < countGold; i ++){
            generators.add(goldgenerator);
        }

        // перемешиваем значения generators
        Collections.shuffle(generators, new Random());

        // выводим на печать перемешанный generators построчно
        for(ItemGenerator p : generators){
            p.openReward();
        }
    }
}