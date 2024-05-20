package ex6;

public class BankAccount {

  // 계좌 잔액을 저장할 balance 필드 선언
  long balance;
  
  // 계좌 번호를 저장할 accNo 필드 선언
  String accNo;
  
  // 생성자
  BankAccount(String paramAccNo, long paramBalance) {
    accNo = paramAccNo;
    balance = paramBalance;
  }
  
  // 입금 (마이너스 입금 방지)
  void deposit(long money) {
    if(money <= 0) {
      System.out.println(money + "원 입금 불가!");
      return;
    }
    System.out.println(money + "원 입금 완료!");
    balance += money;
  }
  
  // 출금 (실제 출금액을 반환 / 계좌 잔액보다 큰 출금 방지)
  long withdrawal(long money) {
    if(balance < money) {
      System.out.println("잔액 부족!");
      return 0;
    }
    System.out.println(money + "원 출금 완료!");
    balance -= money;
    return money;
  }
  
  // 계좌 정보 조회 (계좌 번호 / 잔액 출력)
  void inquiry() {
    System.out.println("계좌 번호 : " + accNo);
    System.out.println("계좌 잔액 : " + balance + "원");
  }
  
}
