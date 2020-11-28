package com.academy.lesson01;

public class HerringBone {
    public static void main(String[] args) {
        if (args.length == 1) {
            String tree = args[0];
            System.out.println(
                      "\n" + tree
                    + "\n" + tree + tree
                    + "\n" + tree + tree + tree
                    + "\n" + tree + tree + tree + tree
                    + "\n" + tree + tree + tree + tree + tree + "\n"
            );
        } else {
            System.out.println("\n*\n**\n***\n****\n*****\n");
        }





    }
}
