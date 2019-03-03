package groupthree.gitruler.cli;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

  @Test
  public void testMainAddFunction() {
    Main classUnderTest = new Main();
    assertEquals(classUnderTest.add(1, 2), 3);
  }
}
