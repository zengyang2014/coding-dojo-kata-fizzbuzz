class FizzBuzz {

  public static final int FIZZ_DIVIDOR = 5;
  public static final int BUZZ_DIVIDOR = 3;
  public static final String FIZZ = "fizz";
  public static final String BUZZ = "buzz";
  public static final String EMPTY_STRING = "";
  public static final String BUZZ_CHARACTER = "5";
  public static final String FIZZ_CHARACTER = "3";

  public static String run(Integer input) {
    String result = EMPTY_STRING;
    if (isFizz(input))
      result += FIZZ;
    if (isBuzz(input))
      result += BUZZ;
    return result.equals(EMPTY_STRING) ? String.valueOf(input) : result;
  }

  private static boolean isBuzz(Integer input) {
    return isDividedBy(input, FIZZ_DIVIDOR) || String.valueOf(input).contains(BUZZ_CHARACTER);
  }

  private static boolean isFizz(Integer input) {
    return isDividedBy(input, BUZZ_DIVIDOR) || String.valueOf(input).contains(FIZZ_CHARACTER);
  }

  private static boolean isDividedBy(Integer input, int i) {
    return input % i == 0;
  }
}
