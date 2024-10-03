
package com.trybe.acc.java;

import java.time.LocalDateTime;


/**
 * author joao.
 *
 */
public class SimuladorRendimento {

  /**
   * param Start. End.
   *
   */
  public int simularRendimentoAnos(double start, double end) {
    double projected = start;
    int years = 0;

    while (projected < end) {
      projected *= 1.1;
      years += 1;
    }
    return LocalDateTime.now().plusYears(years).getYear();
  }

  /**
   * Prime args.
   */
  public static void main(String[] args) {
    SimuladorRendimento obj = new SimuladorRendimento();
    double inicial = 500;
    double objetivo = 5000;
    System.out.println("Com " + inicial + " seu rendimento será " + objetivo + " no ano "
        + obj.simularRendimentoAnos(inicial, objetivo));
  }
}


