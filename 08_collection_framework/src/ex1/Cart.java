package ex1;

import java.util.ArrayList;
import java.util.List;

public class Cart {

  // field
  private List<Product> products;
  
  // constructor
  public Cart() {
    products = new ArrayList<Product>();
  }
  
  // getter / setter
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  // 물건 추가하기
  public void addProduct(Product product) {
    
  }
  
  // 물건 빼기
  public void removeProduct(int index) {
    
  }
  
  // 물건 빼기
  public void removeProduct(Product product) {
    
  }
  
}
