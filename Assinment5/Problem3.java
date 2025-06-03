class Area{
    public void calculate(float r){
        float areac=3.14f*r*r;
        System.out.println("The area of the circle is: "+areac);
    }

    public void calculate(float a, float b){
        float arear=a*b;
        System.out.println("The area of the rectangle is: "+arear);
    }

    public void calculate(float a, float b, float is_tri){
        float areat=0.5f*a*b;
        System.out.println("The area of the triangle is: "+areat);
    }

}
class Problem3{
    public static void main(String[] args) {
        Area ob=new Area();
        ob.calculate(10.0f);
        ob.calculate(2.0f,3.0f);
        ob.calculate(4.0f,5.0f,1.0f); //1 to confirm its a triangle
    }
}
