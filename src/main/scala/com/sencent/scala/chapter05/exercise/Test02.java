package com.sencent.scala.chapter05.exercise;

public class Test02 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        printArr(arr);
        System.out.println("=======================================");
        arr = invert(arr);
        printArr(arr);
    }

    public static int[][] invert(int[][] arr){
        int length = arr.length;
        int[][] temp = new int[length][length];
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                temp[i][j] = arr[j][i];
            }
        }
        return temp;
    }

    public static void printArr(int[][] arr){
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
