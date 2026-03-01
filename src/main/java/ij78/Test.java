package ij78;

import java.time.LocalDate;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class Test {

  static void main() {
    LocalDate d1 = null;
    // IntelliJ should not display a "Method invocation 'plusDays' will produce 'NullPointerException'" warning
    LocalDate localDate = d1.plusDays(1);
    System.out.println(localDate);
  }
}
