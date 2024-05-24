package pkg03_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

  /*
   * Collection<E> (Interface)
   * ↑
   * List<E>       (Interface)
   * ↑
   * ArrayList<E>  (Class)
   */
  
  public static void ex1() {
    
    // ArrayList<E> 선언
    List<Integer> numbers;
    
    // numbers 인스턴스 생성
    numbers = new ArrayList<Integer>();  // 기본 capacity = 10
    
    // 요소 추가하기
    numbers.add(10);  // 인덱스 0 위치에 저장
    numbers.add(20);  // 인덱스 1 위치에 저장
    
    // 요소 확인하기
    System.out.println(numbers.get(0));
    System.out.println(numbers.get(1));
    
  }

  public static void ex2() {
    
    // ArrayList<E> 선언과 생성
    List<String> movies = new ArrayList<String>();
    
    // 요소 저장
    movies.add("범죄도시");
    movies.add("밀수");
    
    // 저장된 요소의 개수
    int size = movies.size();
    
    // for 문을 활용한 ArrayList<E> 순회
    for(int i = 0; i < size; i++) {
      System.out.println(movies.get(i));
    }
    
    // 동작하지만,
    // movies.size() 메소드 호출이 여러 번 진행되기 때문에 좋지 않다.
    for(int i = 0; i < movies.size(); i++) {
      System.out.println(movies.get(i));
    }
    
  }
  
  public static void main(String[] args) {
    ex2();
  }

}
