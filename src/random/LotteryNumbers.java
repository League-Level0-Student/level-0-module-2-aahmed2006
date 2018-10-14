package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random randy = new Random();
	int r = randy.nextInt(9);
	Random randy1 = new Random();
	int a = randy1.nextInt(9);
	Random randy2 = new Random();
	int b = randy2.nextInt(9);
	Random randy3 = new Random();
	int c = randy3.nextInt(9);
	Random randy4 = new Random();
	int d = randy4.nextInt(9);
	System.out.println(r + a + c +d + b);
}
}
