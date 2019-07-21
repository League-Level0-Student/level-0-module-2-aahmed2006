package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random randy = new Random();
	int r = randy.nextInt(9);
	System.out.print(r);
	Random randy1 = new Random();
	int a = randy1.nextInt(9);
	System.out.print(a);
	Random randy2 = new Random();
	int b = randy2.nextInt(9);
	System.out.print(b);
	Random randy3 = new Random();
	int c = randy3.nextInt(9);
	System.out.print(c);
	Random randy4 = new Random();
	int d = randy4.nextInt(9);
	System.out.print(d);
}
}
