class FizzBuzz {

  String run(int inputNumber) {
    String result = "";

    if(isFizz(inputNumber))
      result += "Fizz";
    if(isBuzz(inputNumber))
      result += "Buzz";

    return result.equals("") ? String.valueOf(inputNumber) : result;
  }

  private boolean isBuzz(int inputNumber) {
    return isDividedBy(inputNumber, 5) || String.valueOf(inputNumber).contains("5");
  }

  private boolean isFizz(int inputNumber) {
    return isDividedBy(inputNumber, 3) || String.valueOf(inputNumber).contains("3");
  }

  private boolean isDividedBy(int inputNumber, int dividor) {
    return (inputNumber % dividor) == 0;
  }
}
