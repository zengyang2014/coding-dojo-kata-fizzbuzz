import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
        {1, "1"}, {3, "fizz"}, {5, "buzz"}, {15, "fizzbuzz"},
        {35, "fizzbuzz"}, {51, "fizzbuzz"}
    });
  }

  private String expected;
  private Integer input;

  public FizzBuzzTest(Integer input, String expected) {
    this.expected = expected;
    this.input = input;
  }

  @Test
  public void should_return_correct_string_when_run_with_number() {
    assertEquals(expected, FizzBuzz.run(input));
  }
}
