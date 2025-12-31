package designpatterns.singleton.test;

import designpatterns.singleton.dominio.AircraftSingletonEnum;

public class AircraftSigletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum isntance = AircraftSingletonEnum.INSTANCE;
        System.out.println(isntance.bookSeat(seat));
    }
}
