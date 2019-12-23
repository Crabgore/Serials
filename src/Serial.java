public class Serial {
    private String title;
    private int seasons;
    private int series;
    private int year;

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
