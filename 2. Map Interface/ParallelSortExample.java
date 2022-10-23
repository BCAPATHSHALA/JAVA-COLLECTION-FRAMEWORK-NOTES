//Algorith 03: Parallel Sorting of array

import java.util.Arrays;

public class ParallelSortExample{

    public static void main(String[] args) 
    {

        Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
        Arrays.sort(numbers);


        for (int i : numbers) 
        {
            System.out.print(i + " ");
        }
    }
}

/*
OUTPUT:
2 9 10 12 15 17 32 48 76 79 
*/