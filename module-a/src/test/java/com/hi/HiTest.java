package com.hi;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class HiTest {

  @Test
  public void testInstantiation() {
    assertNotNull(new Hi());
  }
}
