package packtwo;

import packone.ClassOne;

public class ClassTwo {
    public static void main(String[] args) {
        ClassOne obj = new ClassOne();

        System.out.println("Accessing from packtwo.ClassTwo:");

        System.out.println("publicVar = " + obj.publicVar); 
    }
}
