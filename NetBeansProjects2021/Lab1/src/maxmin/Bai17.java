/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class Bai17 {

    public static void main(String args[]) {
        int row, col, i, j;
        int arr[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Row for Array (max 10) : ");
        row = scan.nextInt();
        System.out.print("Enter Number of Column for Array (max 10) : ");
        col = scan.nextInt();
        System.out.print("Enter " + (row * col) + " Array Elements : ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.print("The Array is :\n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
