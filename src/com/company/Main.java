package com.company;

public class Main
{
    public static void main(String[] args)
    {
        //insertion sort
        int [] array = {9, 7, 2, 11};
        for (int i = 1; i < array.length; i++)
        {
            int val = array[i];
            int j = i - 1;
            for (j = i - 1; j >= 0 && array[j] > val; j--)
                array[j + 1] = array[j];
            array[j + 1] = val;
        }
        for (int a : array)
            System.out.println (a + " ");
    }
}
