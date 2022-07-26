package io.github.huypva.strategypattern;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author huypva
 */
class ContextTest {

  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @Test
  void testConcreteStrategy1DoSomething() {
    System.setOut(new PrintStream(outputStreamCaptor));

    Context context = new Context(new ConcreteStrategy1());
    context.doSomething(1);

    Assertions.assertEquals("ConcreteStrategy1: 1", outputStreamCaptor.toString()
        .trim());
  }

  @Test
  void testConcreteStrategy2DoSomething() {
    System.setOut(new PrintStream(outputStreamCaptor));

    Context context = new Context(new ConcreteStrategy2());
    context.doSomething(1);

    Assertions.assertEquals("ConcreteStrategy2: 1", outputStreamCaptor.toString()
        .trim());
  }
}