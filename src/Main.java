public class Main {
    public static void main(String[] args) {
        SerialMaker maker = new SerialMaker();

//        SerialBuilder serialBuilder = new DefaultSerial();
//
//        maker.setSerialBuilder(serialBuilder);
//        maker.addSerial();
//
//        System.out.println(maker.toString());

//        SerialMaker maker = new SerialMaker();
//        SerialBuilder serialBuilder = new NewFullSerial("Название", 3, 24, 2019);
//
//        maker.setSerialBuilder(serialBuilder);
//        maker.addSerial();
//
//        System.out.println(maker.toString());

        NewSerialBuilder serialBuilder = new NewSerialBuilder();

        maker.setSerialBuilder(serialBuilder);
        maker.addSerial();

        serialBuilder.addTitle("Название");
        serialBuilder.addSeasons(1);
        serialBuilder.addSeries(12);

        System.out.println(maker.toString());
    }
}
