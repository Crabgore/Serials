public class SerialMaker {
    private SerialBuilder serialBuilder;

    public void setSerialBuilder(SerialBuilder serialBuilder) {
        this.serialBuilder = serialBuilder;
    }

    public Serial getSerial() {
        return serialBuilder.getSerial();
    }

    public SerialBuilder getSerialBuilder() {
        return serialBuilder;
    }

    public void addSerial() {
        serialBuilder.addNewSerial()
                .addTitle()
                .addSeasons()
                .addSeries()
                .addYear();
    }

    public void addFullSerial(String title, int seasons, int series, int year) {
        serialBuilder.addNewFullSerial(title, seasons, series, year);
    }

    // Метод сразу возвращающий сериал. Вдруг понадобится.
    public Serial makeAndAddNewSerial() {
        return serialBuilder.addNewSerial()
                .addTitle()
                .addSeasons()
                .addSeries()
                .addYear()
                .getSerial();
    }

    // Метод сразу возвращающий сериал сл всеми полями. Вдруг понадобится.
    public Serial makeAndAddNewFullSerial(String title, int seasons, int series, int year) {
        return serialBuilder.addNewFullSerial(title, seasons, series, year).getSerial();
    }

    @Override
    public String toString() {
        return getSerial().toString();
    }
}
