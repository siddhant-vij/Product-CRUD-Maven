package com.product;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
  @Test
  public void test_prints_hello_world() {
    java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
    System.setOut(new java.io.PrintStream(outContent));
    Main.main(new String[] {});
    assertEquals("Hello World!\n", outContent.toString());
  }
}