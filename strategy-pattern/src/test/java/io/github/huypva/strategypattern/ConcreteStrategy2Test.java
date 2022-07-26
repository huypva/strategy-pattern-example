package io.github.huypva.strategypattern;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class ConcreteStrategy2Test {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void method() {
    System.setOut(new PrintStream(outputStreamCaptor));

    ConcreteStrategy2 concreteStrategy2 = new ConcreteStrategy2();
    concreteStrategy2.method(1);

    Assertions.assertEquals("ConcreteStrategy2: 1", outputStreamCaptor.toString()
        .trim());
  }
}