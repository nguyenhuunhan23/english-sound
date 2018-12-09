package myjava.mybignumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication{

	public static void main(String[] args) {
		IReceiver iReceiver = new IReceiver() {
			
			@Override
			public void receive(String s) {
				// TODO Auto-generated method stub
				System.out.println(s);
			}
		};
		MyBigNumber myBigNumber = new MyBigNumber(iReceiver);
		String kq = myBigNumber.sum("56465", "5465456");
		System.out.println(kq);
	}
}
