package src.classes;

public class Client {
  private String name;
  private Double balance, limit;

  public Client(String n, Double b, Double l) {
    this.setName(n);
    this.setBalance(b);
    this.setLimit(l);
  }

  public Double getBalance() {
    return this.balance;
  }

  public Double getLimit() {
    return this.limit;
  }

  public String getName() {
    return this.name;
  }

  public void setBalance(Double b) {
    this.balance = b;
  }

  public void setLimit(Double l) {
    this.limit = l;
  }

  public void setName(String n) {
    this.name = n;
  }

  public String toString() {
    return  "Name: " + this.getName() +
            "\nBalance: " + this.getBalance() +
            "\nLimit: " + this.getLimit();
  }
}
