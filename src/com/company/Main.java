package com.company;

public class Main {

    public static void main(String[] args) {
        String[] array1 = {"PitBull", "Dogo Argentino", "Rottweiler"};
        String[] array2 = {"Shiba", "Akita", "Huski"};
        String[] array3 = gopMang(array1, array2);
        for (String element : array3) {
            System.out.println(element);
        }
    }

    public static String[] gopMang(String[] arrA, String[] arrB) {
        int Array3 = arrA.length + arrB.length;
        String[] arr3 = new String[Array3];
        for (int i = 0; i < arrA.length; i++) {
            arr3[i] = arrA[i];
        }
        for (int i = arrA.length; i < Array3; i++) {
            arr3[i] = arrB[i - arrA.length];
        }
        return arr3;
    }
}
