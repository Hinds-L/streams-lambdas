package edu.cnm.deepdive;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;

public WeirdStream {

  public static void main(String[] args) {
    Random rng = new Random(-1); // Reproducible sequence.
    Comparator<Integer> bitCountComp = (o1, o2) -> Integer.bitCount(o1) - Integer.bitCount(o2);
    IntStream.generate( rng::nextInt)
        .limit(1000)
        .boxed()
        .sorted(bitCountComp.thenComparing(Comparator.naturalOrder()))
        .map(Integer::toBinaryString)
        .forEach(System.out::println);
  }

}
