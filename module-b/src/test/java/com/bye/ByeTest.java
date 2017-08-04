package com.bye;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;


public class ByeTest {

  @Test
  public void testInstantiation() {
    assertNotNull(new Bye());
  }
}
