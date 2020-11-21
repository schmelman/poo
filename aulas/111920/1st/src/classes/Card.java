package src.classes;

import javax.xml.crypto.Data;

public class Card {
  private Integer number;
  private Data expiration;
  private Client owner;

  public Card(Integer n, Data e, Client c) {
    this.setExpiration(e);
    this.setNumber(n);
    this.setOwner(c);
  }

  public Data getExpiration() {
    return this.expiration;
  }

  public Integer getNumber() {
    return this.number;
  }

  public Client getOwner() {
    return this.owner;
  }

  public void setExpiration(Data e) {
    this.expiration = e;
  }

  public void setNumber(Integer n) {
    this.number = n;
  }

  public void setOwner(Client c) {
    this.owner = new Client(c.getName(), c.getBalance(), c.getLimit());
  }

  public String toString() {
    return  "Number: " + this.getNumber().toString().replaceAll("(.{4})", "$1 ").trim() +
            "\nExpiration Date: " + this.getExpiration().toString() +
            "\nOwner: {\n" + this.getOwner().toString() + "}";
  }
}
