package com.company;

import accessmodifier.AccessModifier;

public class Call2 {
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
//        System.out.println(obj.b);coz of default
//        System.out.println(obj.c);coz of protected
//        System.out.println(obj.d);coz of private
    }
}
