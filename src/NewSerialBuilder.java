// Билдер для добавления нового сериала с любыми необходимыми или имеющимися параметрами (универсальный)
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

    public void addTitle(String title) {
        serial.setTitle(title);
    }

    public void addSeasons(int seasons) {
        serial.setSeasons(seasons);
    }

    public void addSeries(int series) {
        serial.setSeries(series);
    }

    public void addYear(int year) {
        serial.setYear(year);
    }

}
