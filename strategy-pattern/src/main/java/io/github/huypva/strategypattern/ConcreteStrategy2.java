package io.github.huypva.strategypattern;

/**
 * @author huypva
 */
public class ConcreteStrategy2 implements Strategy {

  @Override
  public void method(int input) {
    System.out.println("ConcreteStrategy2: " + input);
  }
}
