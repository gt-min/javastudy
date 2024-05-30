package pkg04_open_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class NaverSearchApiEx {

  public static void main(String[] args) throws Exception {
    
    // 검색어 입력
    Scanner sc = new Scanner(System.in);
    System.out.print("검색어 입력 >>> ");
    String query = sc.nextLine();  // 공백 포함한 문자열 입력이 가능하다.
    
    // 요청 주소
    String apiURL = "https://openapi.naver.com/v1/search/book?query=" + URLEncoder.encode(query, "UTF-8");
    
    // 접속 생성
    URL url = URI.create(apiURL).toURL();
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    
    // 요청 메소드
    conn.setRequestMethod("GET");
    
    // 요청 헤더
    conn.setRequestProperty("X-Naver-Client-Id", "HJPMJZOK2mSYg8Kt_Jjj");
    conn.setRequestProperty("X-Naver-Client-Secret", "6pe2vK6231");
    
    // 접속
    conn.connect();

    // 응답 코드 확인(HTTP status)
    if(conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
      throw new RuntimeException("접속 실패");
    }
    
    // 문자 입력 스트림 생성
    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    
    // 응답 결과 (json) 받기
    StringBuilder builder = new StringBuilder();
    String line = null;
    while((line = in.readLine()) != null) {
      builder.append(line + "\n");
    }
    
    // 응답 결과 (json) 확인
    System.out.println(builder.toString());
    
    // 스트림 닫기
    in.close();
    
    // 접속 해제
    conn.disconnect();

  }

}
