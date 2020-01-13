// Билдер со всеми необходимыми абстрактными методами
public abstract class SerialBuilder {
    protected Serial serial;

    public Serial getSerial() {
        return serial;
    }

    public SerialBuilder addNewSerial() {
        serial = new Serial();
        return this;
    }

    public SerialBuilder addNewFullSerial(String title, int seasons, int series, int year) {
        serial = new Serial(title, seasons, series, year);
        return this;
    }

    public abstract SerialBuilder addTitle();
    public abstract SerialBuilder addSeasons();
    public abstract SerialBuilder addSeries();
    public abstract SerialBuilder addYear();
}
