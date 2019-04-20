package dev.tnordquist;

/**
 * CodingBat:Given base and n that are both 1 or more, compute recursively (no loops) the value of
 * base to the n power, so powerN(3, 2) is 9
 */

public class PowerN {

  public int powerN(int base, int n) {

    if (base == 1) {
      return 1;
    }

    if (n == 1) {
      return base;
    } else {
      return base * powerN(base, n - 1);
    }

  }

}
  