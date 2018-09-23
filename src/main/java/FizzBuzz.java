import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  private List<String> numbers;
  //fourth step
  private Boolean isAlreadyGenerated;

  public FizzBuzz(int length) {
    numbers = new ArrayList<>();
    for(int i=0; i<length; i++){
      numbers.add(String.valueOf(i+1));
    }
    //fourth step
    this.isAlreadyGenerated = false;
  }

  //first step: multiple of 3 (Fizz)
//  public List<String> generateList(){
//    for (int i = 0; i < this.numbers.size(); i++) {
//      Integer numberInt = Integer.parseInt(this.numbers.get(i));
//
//      if (numberInt % 3 == 0) {
//        this.numbers.set(i, "Fizz");
//      }
//    }
//    return numbers;
//  }

  //second step: adding the multiple of 5 (Buzz)
//  public List<String> generateList(){
//    for (int i = 0; i < this.numbers.size(); i++) {
//      Integer numberInt = Integer.parseInt(this.numbers.get(i));
//
//      if (numberInt % 3 == 0) {
//        this.numbers.set(i, "Fizz");
//      } else if (numberInt % 5 == 0) {
//        this.numbers.set(i, "Buzz");
//      }
//    }
//    return numbers;
//  }

  //third step: adding the multiple of 3 AND 5 (FizzBuzz)
//  public List<String> generateList(){
//    for (int i = 0; i < this.numbers.size(); i++) {
//      Integer numberInt = Integer.parseInt(this.numbers.get(i));
//      if (numberInt % 3 == 0 && numberInt % 5 == 0 ) {
//        this.numbers.set(i, "FizzBuzz");
//      } else if (numberInt % 3 == 0) {
//        this.numbers.set(i, "Fizz");
//      } else if (numberInt % 5 == 0) {
//        this.numbers.set(i, "Buzz");
//      }
//    }
//    return numbers;
//  }

  //fourth step: handle the double generation
  public List<String> generateList(){
    if(!isAlreadyGenerated) {
      for (int i = 0; i < this.numbers.size(); i++) {
        Integer numberInt = Integer.parseInt(this.numbers.get(i));
        if (numberInt % 3 == 0 && numberInt % 5 == 0) {
          this.numbers.set(i, "FizzBuzz");
        } else if (numberInt % 3 == 0) {
          this.numbers.set(i, "Fizz");
        } else if (numberInt % 5 == 0) {
          this.numbers.set(i, "Buzz");
        }
      }
      this.isAlreadyGenerated = true;
    }
    return numbers;
  }

  public List<String> getNumbers() {
    return numbers;
  }
}
