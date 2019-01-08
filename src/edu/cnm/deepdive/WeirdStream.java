package edu.cnm.deepdive;

import java.security.SecureRandom;
import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class WeirdStream {

  public static void main(String[] args) {
    IntStream.generate(new RandomSupplier())
        .limit(1000)
        .forEach(new IntConsumer() {
          @Override
          public void accept(int value) {
            System.out.println(value);
          }
        });
  }
  private static class RandomSupplier implements IntSupplier{

    private Random rng;
    {
      rng = new SecureRandom();
    }

    @Override
    public int getAsInt() {
      return rng.nextInt();
    }
  }
}
