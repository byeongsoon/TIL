public class Calculator {
  Calculator() { }

  public double add(double x, double y) {
    return x+y;
  }

  public double sub(double x, double y) {
    return x-y;
  }

  public double mul(double x, double y) {
    return x * y;
  }

  public double div(double x, double y) {
    return x / y;
  }

  public void error() {
    System.out.println("그런 계산식은 없어요");
  }

  public void powerOn() {
    System.out.println("계산기 전원을 켭니다.");
  }

  public void powerOff() {
    System.out.println("계산기 전원을 끕니다.");
  }

}
