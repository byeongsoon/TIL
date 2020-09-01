public class EngineeringCalculator extends Calculator{
  static EngineeringCalculator INSTANCE = new EngineeringCalculator();

  public static EngineeringCalculator getINSTANCE() {
    return INSTANCE;
  }

  private EngineeringCalculator() { }

  @Override
  public void powerOn() {
    System.out.println("공학용 계산기 전원을 켭니다.");
    System.out.println("사용법 : 숫자 계산식 [숫자]");
  }

  @Override
  public void powerOff() {
    System.out.println("공학용 계산기 전원을 끕니다.");
  }

  public double sqrt(double x) {
    return Math.sqrt(x);
  }

  public double pow(double x) {
    return Math.pow(x,2);
  }
}
