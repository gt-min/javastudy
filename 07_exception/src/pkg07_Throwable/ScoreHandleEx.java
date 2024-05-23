package pkg07_Throwable;

public class ScoreHandleEx {

  public static void main(String[] args) {

    try {
      ScoreHandle scoreHandle = new ScoreHandle();
      String pass = scoreHandle.getPass(-100);
      System.out.println(pass);
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }

  }

}
