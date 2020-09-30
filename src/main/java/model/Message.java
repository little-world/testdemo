package model;

public class Message {

  int id;
  String text;

  public Message() {
  }

  public Message(int id, String data) {
    this.id = id;
    this.text = data;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
