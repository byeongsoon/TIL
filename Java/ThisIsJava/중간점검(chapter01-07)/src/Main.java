import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    EngineeringCalculator myCalculator = EngineeringCalculator.getINSTANCE();
    double result = 0;
    Scanner input = new Scanner(System.in);
    String arg = null;
    String[] argArray = null;

    double x = 0,y = 0;

    myCalculator.powerOn();


    while (true) {
      System.out.println("---------------------------------------------");
      System.out.print("계산할 식을 입력하시오 : ");
      arg = input.nextLine();

      argArray = arg.split(" ");

      if (argArray.length < 2) {
        myCalculator.error();
        continue;
      }

      x = Double.parseDouble(argArray[0]);

      if (argArray.length == 3) {
        y = Double.parseDouble(argArray[2]);
      }

      switch (argArray[1]) {
        case "+":
          result = myCalculator.add(x,y);
          break;
        case "-":
          result = myCalculator.sub(x,y);
          break;
        case "*":
          result = myCalculator.mul(x,y);
          break;
        case "/":
          result = myCalculator.div(x,y);
          break;
        case "^":
          result = myCalculator.pow(x);
          break;
        case "rt":
          result = myCalculator.sqrt(x);
          break;
        default:
          myCalculator.error();
          continue;
      }

      System.out.println("결과는 " + result + "입니다.");
    }
  }
}
