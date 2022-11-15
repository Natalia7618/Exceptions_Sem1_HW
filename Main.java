import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println ("Задание 1");
        try
        {
            InsertArrayFirstElement(1);
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            ExtractArraySecondElement(2);
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            UpdateArrayThirdElement(5);
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        //System.out.println("Функция #4: " + ArifmeticException(10));
        //System.out.println("Функция #5: " + NullPointerException(null));

        System.out.println ("Задание 2");
        try
        {
            int[] array1 = {11, 12, 53, 74, 55, 96, 77, 88};
            int[] array2 = {50, 12, 22, 34, 35, 26, 11, 25, 83};
            System.out.println("Массив 1: " + Arrays.toString(array1));
            System.out.println("Массив 2: " + Arrays.toString(array2));
            System.out.println("Полученный массив" + ArrayDiff(array1, array2));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
                
    }

    // Функция #1 для вставки элемента на первое место в массиве 
    public static void InsertArrayFirstElement(int i) throws Exception
    {        
        if (i != 0)
        {
            throw new Exception("Функция #1. Вы должны вставить первый элемент массива, который равен 0");
        }

        ArrayList<String> list_Color = new ArrayList<String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Функция #1. Изначальный массив: " + list_Color);
        list_Color.add(i, "Фиолетовый");
        System.out.println ("Полученный массив: " + list_Color);
    }
    // Функция #2 для извлечения второго элемента в массиве 
    public static void ExtractArraySecondElement(int i) throws Exception
    {        
        if (i != 1)
        {
            throw new Exception("Функция #2. Вы должны вставить второй элемент массива, который равен 1");
        }
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Функция #2. Изначальный массив: " + list_Color);
        String element = list_Color.get(i);
        System.out.println ("Второй элемент массива: " + element);
    }

    // Функция #3 для обновления третьего элемента массива 
    public static void UpdateArrayThirdElement(int i) throws Exception
    {        
        if (i != 2)
        {
            throw new Exception("Функция #3. Вы должны вставить третий элемент массива, который равен 2");
        }
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Функция #3. Изначальный массив: " + list_Color);
        list_Color.set(i, "Пурпурный");
        System.out.println ("Полученный массив: " + list_Color);
    }
    // Функция #4 - нельзя делить на ноль 
    public static int ArifmeticException(int i)
    {
        return i/0;
    } 
    
    // Функция #5 - обращение к несуществующему объекту 
    public static int NullPointerException(String str)
    {
        return str.length();
    } 
    
    // Задание #2 - Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
    // каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    
    public static ArrayList<Integer> ArrayDiff (int[] a1, int[] a2) throws Exception
    {
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        {
            if (min < max) 
            {
                throw new Exception("Длины массивов не равны. Необходимо создать массивы с одинаковой длиной.");
            }  
        }
        
        ArrayList<Integer> result = new ArrayList<>();                 
        for (int i = 0; i < min; i++) 
        {
            result.add(a1[i] - a2[i]);
        }
        return result;
    }
}