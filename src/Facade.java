public class Facade {
    private SerialMaker maker = new SerialMaker();

    public String makeDefaultSerial() {
        SerialBuilder serialBuilder = new DefaultSerial();

        maker.setSerialBuilder(serialBuilder);
        maker.addSerial();

        return maker.toString();
    }

    public String makeFullSerial(String title, int seasons, int series, int year) {
        maker.addFullSerial(title, seasons, series, year);

        return maker.toString();
    }

    public String makeNewSerial(String title, int...ints) {
        NewSerialBuilder serialBuilder = new NewSerialBuilder();

        maker.setSerialBuilder(serialBuilder);
        maker.addSerial();

        serialBuilder.addTitle(title);
        if (ints.length>0) serialBuilder.addSeasons(ints[0]);
        if (ints.length>1) serialBuilder.addSeries(ints[1]);
        if (ints.length>2) serialBuilder.addSeries(ints[2]);

        return maker.toString();
    }
}
