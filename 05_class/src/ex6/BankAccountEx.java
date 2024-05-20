package ex6;

public class BankAccountEx {

  public static void main(String[] args) {
    
    // BankAccount 타입의 인스턴스 생성
    BankAccount bankAccount = new BankAccount("010-1234-5678", 0);
    
    // 입금 및 조회
    bankAccount.deposit(-10);
    bankAccount.deposit(100);
    bankAccount.deposit(200);
    bankAccount.inquiry();
    
    // 출금 및 조회
    System.out.println(bankAccount.withdrawal(500) + "원 출금 성공!");
    System.out.println(bankAccount.withdrawal(300) + "원 출금 성공!");
    bankAccount.inquiry();
    
  }

}
