package cse360assignment02;

class Main{
	public static void main(String[] args) {
		AddingMachine test1 = new AddingMachine();
		test1.add(4);
		test1.subtract(2);
		test1.add(5);
		System.out.println(test1);
		System.out.println(test1.getTotal());
}}

public class AddingMachine {
  private int total;
  private String msg = "0";
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total += value;
	  msg = msg + " + " + value;
  }

  public void subtract (int value) {
	  total = total - value;
	  msg = msg + " - " + value;
  }

  public String toString () {
    return msg;
  }

  public void clear() {
	  msg = "0";
	  total = 0;
  }
}

