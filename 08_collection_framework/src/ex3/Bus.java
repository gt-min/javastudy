package ex3;

import java.util.List;

public class Bus {

  private List<Seat> seats;
  public static final int LIMIT = 25;
  private int numOfPerson;
  
  public Bus() {
    // 구현
  }
  
  // 버스 타기 (항상 앞자리부터 채운다.)
  public void on(Person person) throws RuntimeException {
    // 구현
  }
  
  // 버스 내리기 (내리는 사람의 좌석 번호가 전달된다.)
  public void off(int seatNo) throws RuntimeException {
    // 구현
  }
  
  // 탑승자 목록 확인
  public void passengerList() {
    // 01번 좌석 : 홍길동
    // 02번 좌석 : 김두한
    // 03번 좌석 : 비어있음
    // ...
    // 25번 좌석 : 비어있음
  }
  
}
