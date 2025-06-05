class InfoDisplay{
    public void show(int x){
        System.out.println("Integer: "+x);
    }
    public void show(String x){
        System.out.println("String: "+x);
    }
    public void show(String y, int x){
        System.out.println("String: "+y+" and Integer: "+x);
    }
}

class Problem5{
    public static void main(String[] args) {
        InfoDisplay ob=new InfoDisplay();
        ob.show(9);
        ob.show("Hi!");
        ob.show("Good Morning",989);
    }
}
