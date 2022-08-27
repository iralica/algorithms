package HomeWork3;

//Даны два целых числа x и n, напишите функцию для вычисления x^n (x в степени n)
//Первое решение выполнить рекурсивно за временную сложность O(n) - лиейная
//Второе решение это улучшить решение 1 до временной сложности O(log n) логарифмическая 1

import javax.sound.midi.Soundbank;

public class Pow1 {
    public static void main(String[] args) {
        Pow1 pow1 = new Pow1();
        int powerRec1 = pow1.powerRec(2, 6);
        System.out.println("2^6 = " + powerRec1);
        int powerRec2 = pow1.powerDC(2, 8);
        System.out.println("2^8 = " + powerRec2);
    }

    private int powerRec(int x, int n) // recursion
    {
        if (n == 0) // любое число в 0 степени = 1
            return 1;
        else if (n % 2 == 0) // если n четное
            return powerRec(x, n / 2) * powerRec(x, n / 2);
        else
            return x * powerRec(x, n / 2) * powerRec(x, n / 2);
    }

    private int powerDC(int x, int n) // dc
    {
        int temp;
        if( n == 0)
            return 1;
        temp = powerDC(x, n / 2);
        if (n % 2 == 0)
            return temp*temp;
        else
            return x*temp*temp;
    }
}
