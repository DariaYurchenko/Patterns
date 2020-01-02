package challenges.factory.factorymethod;

public class ZoneFactory {

    public Zone createZone(String zone) {
        Zone zone1 = null;
        if("US".equals(zone)) {
            zone1 = new ZoneUSCentral();
        }
        if("Pacific".equals(zone)) {
            zone1 = new ZoneUSPacific();
        }
        return zone1;

    }
}
