// package accessmodifiers;

class modifiers {
    public int a = 2;
    protected int b = 8;
    int c = 6;
    private int d = 35;

    public void method1() {
        // System.out.println("a : " + a);
    }
}

public class accessmodify {
    public static void main(String[] args) {
        modifiers m = new modifiers();
        m.method1();
        System.out.println(m.a);
        System.out.println(m.b);
        System.out.println(m.c);
        // System.out.println(m.d);
    }
}
