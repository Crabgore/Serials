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

    public Serial makeAndAddNewSerial() {
        return serialBuilder.addNewSerial()
                .addTitle()
                .addSeasons()
                .addSeries()
                .addYear()
                .getSerial();
    }

    @Override
    public String toString() {
        return getSerial().toString();
    }
}
