// Сам класс сериала с необходимыми полями и сеттерами
public class Serial {
    private String title;
    private int seasons;
    private int series;
    private int year;

    public Serial(String title, int seasons, int series, int year) {
        this.title = title;
        this.seasons = seasons;
        this.series = series;
        this.year = year;
    }

    public Serial() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название: " + title + "\n" + "Количество сезонов: " + seasons + "\n" + "Количество серий: "  + series
                + "\n" + "Год выпуска: "+ year;
    }
}
