package packone;

public class ClassOne {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4;

    public void display() {
        System.out.println("Inside ClassOne:");
        System.out.println("publicVar = " + publicVar);
        System.out.println("privateVar = " + privateVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar = " + defaultVar);
    }
}
