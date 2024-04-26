package Oop;

public class NullPointer {
    public static void main(String[] args) {
        Counter foo = new Counter(5);
        System.out.println(foo.value());

        Counter bar = foo;
        bar.increase();
        System.out.println(foo.value());

        foo = null;
        // bar = null;

        System.out.println(bar.value());
    }
}
