package challenges.factory.abstractfactory;

import challenges.factory.abstractfactory.furniture.Chair;
import challenges.factory.abstractfactory.furniture.Table;
import challenges.factory.abstractfactory.furniture.VictorianChair;
import challenges.factory.abstractfactory.furniture.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

    public VictorianChair createChair() {
        return new VictorianChair();
    }

    public VictorianTable createTable() {
        return new VictorianTable();
    }
}
