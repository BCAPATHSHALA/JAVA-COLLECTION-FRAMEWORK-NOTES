//Algorith 04: Array initialization with key value

import java.util.Arrays;

public class FillArrayWithNewElement {

    public static void main(String[] args) {

        Integer[] numbers = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };
        
        Arrays.fill(numbers, 12);

        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}

/*
OUTPUT:
12 12 12 12 12 12 12 12 12 12 
*/