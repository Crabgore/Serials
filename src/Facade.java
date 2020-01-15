public class Facade {
    private SerialMaker maker = new SerialMaker();

    private SerialOperationExecutor serialOperationExecutor = new SerialOperationExecutor();

    public Serial makeDefaultSerial() {
        SerialBuilder serialBuilder = new DefaultSerial();

        maker.setSerialBuilder(serialBuilder);
        maker.addSerial();

        return maker.getSerial();
    }

    public Serial makeFullSerial(String title, int seasons, int series, int year) {
        maker.addFullSerial(title, seasons, series, year);

        return maker.getSerial();
    }

    public Serial makeNewSerial(String title, int...ints) {
        NewSerialBuilder serialBuilder = new NewSerialBuilder();

        maker.setSerialBuilder(serialBuilder);
        maker.addSerial();

        serialBuilder.addTitle(title);
        if (ints.length>0) serialBuilder.addSeasons(ints[0]);
        if (ints.length>1) serialBuilder.addSeries(ints[1]);
        if (ints.length>2) serialBuilder.addSeries(ints[2]);

        return maker.getSerial();
    }

    public String saveDefaultSerial() {
        return serialOperationExecutor.executeOperation(new SaveSerialOperation(makeDefaultSerial()));
    }

    public String saveFullSerial(String title, int seasons, int series, int year) {
        return serialOperationExecutor.executeOperation(new SaveSerialOperation(makeFullSerial(title, seasons, series, year)));
    }

    public String saveNewSerial(String title, int...ints) {
        return serialOperationExecutor.executeOperation(new SaveSerialOperation(makeNewSerial(title, ints)));
    }

    public String deleteDefaultSerial() {
        return serialOperationExecutor.executeOperation(new DeleteSerialOperation(makeDefaultSerial()));
    }

    public String deleteFullSerial(String title, int seasons, int series, int year) {
        return serialOperationExecutor.executeOperation(new DeleteSerialOperation(makeFullSerial(title, seasons, series, year)));
    }

    public String deleteNewSerial(String title, int...ints) {
        return serialOperationExecutor.executeOperation(new DeleteSerialOperation(makeNewSerial(title, ints)));
    }
}
