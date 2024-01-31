package rvt;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);

        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));
        
        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));
        
        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));

    }
    public static void smallestIndex(int[] numbers){
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println(MainProgram.indexOfSmallest(numbers));
    }
    public static void indexSmallestFrom(int[] numbers) {
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }
}
