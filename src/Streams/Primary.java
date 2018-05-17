package Streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by soich on 17.05.2018.
 */
public class Primary {

    public static void main(String[] args) {


        List<Integer> primes = new ArrayList<>();

        int prime = 2;



        for (int j = 2; j < 10001; j++) {

            boolean isPrime = true;

            for (int i = 2; i < j && isPrime; i++) {
                if (j % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime){
                primes.add(j);
                System.out.println(j);
            }


        }
    }
}
