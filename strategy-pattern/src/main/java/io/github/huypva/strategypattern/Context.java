package io.github.huypva.strategypattern;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @author huypva
 */
@Setter
@AllArgsConstructor
public class Context {

  private Strategy strategy;

  public void doSomething(int input) {
    strategy.method(input);
  }
}
