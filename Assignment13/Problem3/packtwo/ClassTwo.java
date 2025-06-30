package packtwo;

import packone.ClassOne;

public class ClassTwo {
    public static void main(String[] args) {
        ClassOne obj = new ClassOne();

        System.out.println("Accessing from packtwo.ClassTwo:");

        System.out.println("publicVar = " + obj.publicVar); // ✅ Accessible

        // System.out.println("privateVar = " + obj.privateVar); // ❌ Compile error
        // System.out.println("protectedVar = " + obj.protectedVar); // ❌ Compile error
        // System.out.println("defaultVar = " + obj.defaultVar); // ❌ Compile error
    }
}
