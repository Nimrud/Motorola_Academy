package pl.jaczewski.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArraySimulation {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        // wyrażenia przekazane do lambdy powinny być 'final' (nie inkrementujemy):
        int start = 0;

        // wypełnianie listy intami (do momentu osiągnięcia maksymalnej wielkości listy):
        IntStream.generate(() -> start).forEach(elem -> {
            ints.add(elem);
            System.out.println(elem);
        });
    }
}
