package io.codebyexample.strategypattern;

/**
 * @author huypva
 */
public class Context {

  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void doSomething(int input) {
    strategy.method(input);
  }
}
