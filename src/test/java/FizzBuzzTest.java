import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
  @Test
  public void should_return_one_when_run_with_number_one() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    assertEquals("1", fizzBuzz.run(1));
  }

  @Test
  public void should_return_fizz_when_run_with_number_three() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    assertEquals("Fizz", fizzBuzz.run(3));
  }

  @Test
  public void should_return_buzz_when_run_with_number_five() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    assertEquals("Buzz", fizzBuzz.run(5));
  }

  @Test
  public void should_return_fizz_buzz_when_run_with_number_fifteen() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    assertEquals("FizzBuzz", fizzBuzz.run(15));
  }

  @Test
  public void should_return_buzz_when_run_with_number_twenty_five() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    assertEquals("Buzz", fizzBuzz.run(25));
  }

  @Test
  public void should_return_buzz_and_fizz_when_run_with_number_fifty_one() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    assertEquals("FizzBuzz", fizzBuzz.run(51));
  }

  @Test
  public void should_return_buzz_and_fizz_when_run_with_number_thirty_five() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    assertEquals("FizzBuzz", fizzBuzz.run(35));
  }
}
