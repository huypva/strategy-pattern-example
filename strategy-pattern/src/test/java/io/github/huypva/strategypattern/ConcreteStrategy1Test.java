package io.github.huypva.strategypattern;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class ConcreteStrategy1Test {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void method() {
    System.setOut(new PrintStream(outputStreamCaptor));

    ConcreteStrategy1 concreteStrategy1 = new ConcreteStrategy1();
    concreteStrategy1.method(1);

    Assertions.assertEquals("ConcreteStrategy1: 1", outputStreamCaptor.toString()
        .trim());
  }
}