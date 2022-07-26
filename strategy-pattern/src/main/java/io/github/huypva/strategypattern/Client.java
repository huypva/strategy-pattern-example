package io.github.huypva.strategypattern;

/**
 * @author huypva
 */
public class Client {

  public static void main(String[] args) {
    Context context = new Context(new ConcreteStrategy1());
    context.doSomething(1);

    context.setStrategy(new ConcreteStrategy2());
    context.doSomething(2);
  }
}
