package pkg05_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

  /*
   * Map<K, V>        (Interface)
   * ↑
   * HashMap<K, V>    (Class)
   */
  
  /*
   * Map
   * 1. 인스턴스(객체)를 대신할 수 있는 자료구조이다.
   * 2. 구성
   *   1) Entry : Map 을 구성하는 데이터의 기본 단위로 키(Key) 와 값(Value)으로 구성한다.
   *   2) Key   : 식별자. 데이터를 꺼낼 때 사용하는 고유의 식별자. Set 로 구성되어 있다.
   *   3) Value : 값. 데이터 자체.
   */
  
  public static void ex1() {
    
    // Mutable (저장된 Entry 가 바뀔 수 있다.)
    
    // Map 타입 선언
    Map<String, String> book;
    
    // HashMap 인스턴스 생성
    book = new HashMap<String, String>();
    
    // Entry 추가 (Key 와 Value 모두 추가)
    book.put("title", "어린왕자");
    int price = 10000;
    book.put("price", price + "");
    
    // Key 를 이용해서 Value 확인하기
    System.out.println("제목 : " + book.get("title"));
    System.out.println("가격 : " + book.get("price"));
    
  }

  public static void ex2() {
    
    // Immutable (저장된 Entry 가 바뀔 수 없다.)
    
    Map<String, Object> book = Map.of("title", "어린왕자", "price", 10000);
    
    // Entry 구성을 바꾸려는 시도 (예외가 발생)
    book.put("publisher", "좋은출판사");
    
  }
  
  public static void main(String[] args) {
    ex2();
  }

}
