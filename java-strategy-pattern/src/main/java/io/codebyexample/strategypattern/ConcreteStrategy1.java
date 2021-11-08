package io.codebyexample.strategypattern;

/**
 * @author huypva
 */
public class ConcreteStrategy1 implements Strategy {

  @Override
  public void method(int input) {
    System.out.println("ConcreteStrategy1: " + input);
  }
}
