import java.util.ArrayList;
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> data = new ArrayList<String>();
        System.out.println("Напишите размер массива: ");
        int n = in.nextInt();
        for (int k = 0; k < n; k++){
            System.out.print("Введите элемент " + k + " ");
            String i = in.next();
            data.add(i);
        }
        System.out.print("Готовый массив:" + data);

        System.out.println("Напишите число X:");
        int del = in.nextInt();
        data.remove(del);
        System.out.print ("Измененный массив:" + data);
    }
}



