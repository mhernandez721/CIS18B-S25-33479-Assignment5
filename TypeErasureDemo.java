package notification;

public class TypeErasureDemo {
    public static void demo(Notification<?> notification) {
        //  prevents us from knowing the exact generic type here
        System.out.println("Type erasure means we can't know the generic type at runtime.");
    }
}
