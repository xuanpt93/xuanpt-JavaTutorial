package bk1;

@FunctionalInterface
public interface lamda {
    void showMessage(String message);

    default void defaultMethod() {
        System.out.println("This is a default method");
    }
}
