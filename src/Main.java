public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        System.out.println(facade.makeDefaultSerial());
        System.out.println(facade.makeFullSerial("Сериал с полным набором данных", 5, 40, 2017));
        System.out.println(facade.makeNewSerial("Сериал с неполным набором данных", 4, 32));

        System.out.println(facade.saveDefaultSerial());
        System.out.println(facade.saveFullSerial("Сериал с полным набором данных", 5, 40, 2017));
        System.out.println(facade.saveNewSerial("Сериал с неполным набором данных", 4, 32));

        System.out.println(facade.deleteDefaultSerial());
        System.out.println(facade.deleteFullSerial("Сериал с полным набором данных", 5, 40, 2017));
        System.out.println(facade.deleteNewSerial("Сериал с неполным набором данных", 4, 32));
    }
}
