import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    EngineeringCaculator myCaculator = EngineeringCaculator.getINSTANCE();
    int result = 0;
    Scanner input = new Scanner(System.in);
    String arg = null;
    String[] argArray = null;

    myCaculator.powerOn();

    while (true) {
      System.out.println("---------------------------------------------");
      System.out.print("계산할 식을 입력하시오 : ");
      arg = input.nextLine();

      argArray = arg.split(" ");


      switch (argArray[1]) {

      }
    }
  }
}
