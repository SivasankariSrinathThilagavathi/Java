class Calculator{
    public void add(int x, int y){
        int sum=x+y;
        System.out.println("Sum of "+x+" and "+y+" = "+sum);
    }
    public void add(double x, double y){
        double sum=x+y;
        System.out.println("Sum of "+x+" and "+y+" = "+sum);
    }
    public void add(int x, int y, int z){
        int sum=x+y+z;
        System.out.println("Sum of "+x+" and "+y+" and "+z+" = "+sum);
    }
    public void subtract(int x, int y){
        int diff=x-y;
        System.out.println("Difference of "+x+" and "+y+" = "+diff);
    }
    public void subtract(double x, double y){
        double diff=x-y;
        System.out.println("Difference of "+x+" and "+y+" = "+diff);
    }
    public void subtract(int x, int y, int z){
        int diff=x-y-z;
        System.out.println("Difference of "+x+" and "+y+" and "+z+" = "+diff);
    }
    public void multiply(int x, int y){
        int prod=x*y;
        System.out.println("Product of "+x+" and "+y+" = "+prod);
    }
    public void multiply(double x, double y){
        double prod=x*y;
        System.out.println("Product of "+x+" and "+y+" = "+prod);
    }
    public void multiply(int x, int y, int z){
        int prod=x*y*z;
        System.out.println("Product of "+x+" and "+y+" and "+z+" = "+prod);
    }
    public void division(int x, int y){
        int div=x/y;
        System.out.println("Division of "+x+" and "+y+" = "+div);
    }
    public void division(double x, double y){
        double div=x/y;
        System.out.println("Division of "+x+" and "+y+" = "+div);
    }
    public void division(int x, int y, int z){
        int div=x/y/z;
        System.out.println("Division of "+x+" and "+y+" and "+z+" = "+div);
    }
}

class Problem1{
    public static void main(String[] args){
        Calculator ob1=new Calculator();
        ob1.add(9,8);
        ob1.subtract(4.5,3.6);
        ob1.multiply(3,4,2);
        ob1.division(8,4);

    }
}
