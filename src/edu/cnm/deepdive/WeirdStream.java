package edu.cnm.deepdive;

import java.security.SecureRandom;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class WeirdStream {

  public static void main(String[] args) {
    IntStream.generate(new IntSupplier() {
        private Random rng;
      {
        rng = new Random(-1);
      }

      @Override
      public int getAsInt() {
        return rng.nextInt();
      }
    })
        .limit(1000)
        .boxed()
        .sorted()
        .forEach(
          System.out::println);
  }

}
