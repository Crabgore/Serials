public abstract class SerialBuilder {
    protected Serial serial;

    public Serial getSerial() {
        return serial;
    }

    public SerialBuilder addNewSerial() {
        serial = new Serial();
        return this;
    }

    public abstract SerialBuilder addTitle();
    public abstract SerialBuilder addSeasons();
    public abstract SerialBuilder addSeries();
    public abstract SerialBuilder addYear();
}
