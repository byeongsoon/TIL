public class EngineeringCaculator extends Caculator{
  static EngineeringCaculator INSTANCE = new EngineeringCaculator();

  public static EngineeringCaculator getINSTANCE() {
    return INSTANCE;
  }

  private EngineeringCaculator() { }

  @Override
  public void powerOn() {
    System.out.println("공학용 계산기 전원을 켭니다.");
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
