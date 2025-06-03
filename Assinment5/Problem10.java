import java.util.Scanner;

class ShapeDrawer {
    String shapeName;
    int width;
    int height;

    ShapeDrawer() {
        shapeName = "";
        width = 0;
        height = 0;
    }

    void draw() {
        System.out.println("Drawing shape");
    }

    void draw(String s1) {
        shapeName = s1;
        System.out.println("Drawing a " + shapeName);
    }

    void draw(String s1, int size) {
        shapeName = s1;
        width = size;
        height = size;
        System.out.println("Drawing a " + shapeName + " of size " + size);
    }

    void draw(String s1, int w1, int h1) {
        shapeName = s1;
        width = w1;
        height = h1;
        System.out.println("Drawing a " + shapeName + " of width " + width + " and height " + height);
    }
}

class Problem10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeDrawer ob1 = new ShapeDrawer();
        ob1.draw();

        System.out.print("Enter shape name: ");
        String s1 = sc.next();
        ob1.draw(s1);

        System.out.print("Enter shape name: ");
        String s2 = sc.next();
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        ob1.draw(s2, size);

        System.out.print("Enter shape name: ");
        String s3 = sc.next();
        System.out.print("Enter width: ");
        int w = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        ob1.draw(s3, w, h);
    }
}
