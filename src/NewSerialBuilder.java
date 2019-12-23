public class NewSerialBuilder extends SerialBuilder {
    @Override
    public SerialBuilder addTitle() {
        return this;
    }

    @Override
    public SerialBuilder addSeasons() {
        return this;
    }

    @Override
    public SerialBuilder addSeries() {
        return this;
    }

    @Override
    public SerialBuilder addYear() {
        return this;
    }

    public SerialBuilder addTitle(String title) {
        getSerial().setTitle(title);
        return null;
    }

    public SerialBuilder addSeasons(int seasons) {
        serial.setSeasons(seasons);
        return null;
    }

    public SerialBuilder addSeries(int series) {
        serial.setSeries(series);
        return null;
    }

    public SerialBuilder addYear(int year) {
        serial.setYear(year);
        return null;
    }

}
