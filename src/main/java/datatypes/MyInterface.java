package datatypes;

public interface MyInterface {
    int AddTwoData();
    static void SayHello() {
        System.out.println("Hello Panch, Good use of Interface");
    }

    default void SayHelloInDefault() {
        System.out.println("Hello Panch (default), Good use of Interface");
    }
}
