package ex1;

public class Customer {

  // field
  private int money;
  private Cart cart;
  
  // constructor
  public Customer(int money) {
    this.money = money;
    this.cart = new Cart();
  }
  
  // 물건 담기
  public void addToCart(Product product) {
    
  }
  
  // 물건 빼기
  public void removeFromCart(int index) {
    
  }

  // 물건 빼기
  public void removeFromCart(Product product) {
    
  }
  
  // 구매
  public String buy() {
    
    String receipt = "영수증\n";
    
    
    
    return receipt;
    
  }
  
}
