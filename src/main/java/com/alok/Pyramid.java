package com.alok;

/**
 * Created by ALOK on 8/28/2017.
 */
public class Pyramid {
           public static void main(String[] args) {
            int i = 0;
            int j = 5;
            for (i = 0; i < 5; i++) {
                for (j = 5; j> i; j--) {
                    System.out.print ("*");
                }
                System.out.println();
            }
            for (i = 0; i < 5; i++) {
                for (j = 0; j< i; j++) {
                    System.out.print ("*");
                }

                System.out.println();
            }

        }
    }

