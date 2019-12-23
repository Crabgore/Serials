//Дефолтный билдер для сериала. Вряд ли такой понадобится, но пусть будет.
public class DefaultSerial extends SerialBuilder{
    public SerialBuilder addTitle() {
        serial.setTitle("Название");
        return this;
    }

    public SerialBuilder addSeasons() {
        serial.setSeasons(3);
        return this;
    }

    public SerialBuilder addSeries() {
        serial.setSeries(24);
        return this;
    }

    public SerialBuilder addYear() {
        serial.setYear(2019);
        return this;
    }
}
