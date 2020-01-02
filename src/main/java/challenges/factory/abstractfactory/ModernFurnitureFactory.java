package challenges.factory.abstractfactory;

import challenges.factory.abstractfactory.furniture.ModerChair;
import challenges.factory.abstractfactory.furniture.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {

    public ModerChair createChair() {
        return new ModerChair();
    }

    public ModernTable createTable() {
        return new ModernTable();
    }
}
