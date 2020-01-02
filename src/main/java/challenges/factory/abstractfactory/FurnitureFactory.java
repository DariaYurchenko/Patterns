package challenges.factory.abstractfactory;

import challenges.factory.abstractfactory.furniture.Chair;
import challenges.factory.abstractfactory.furniture.Table;

public interface FurnitureFactory {

    Chair createChair();

    Table createTable();

}
