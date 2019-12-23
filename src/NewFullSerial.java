// Билдер для полного заполения всех полей сериала (если всё точно изветсно, например)
public class NewFullSerial extends SerialBuilder {
    private String title;
    private int seasons;
    private int series;
    private int year;

    public NewFullSerial(String title, int seasons, int series, int year) {
        this.title = title;
        this.seasons = seasons;
        this.series = series;
        this.year = year;
    }

    public SerialBuilder addTitle() {
        serial.setTitle(title);
        return this;
    }

    public SerialBuilder addSeasons() {
        serial.setSeasons(seasons);
        return this;
    }

    public SerialBuilder addSeries() {
        serial.setSeries(series);
        return this;
    }

    public SerialBuilder addYear() {
        serial.setYear(year);
        return this;
    }
}
