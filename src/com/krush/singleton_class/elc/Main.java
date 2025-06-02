package com.krush.singleton_class.elc;

import com.krush.singleton_class.blc.Singleton;

public class Main {
    public static void main(String[] args) {
        // Try to get instance of Singleton class
        Singleton s1 = Singleton.getInstance();
        s1.showMessage();

        Singleton s2 = Singleton.getInstance();
        s2.showMessage();

        // Check if both are the same instance
        System.out.println("Are s1 and s2 the same? " + (s1 == s2));
    }
}