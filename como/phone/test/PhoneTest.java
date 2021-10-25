package como.phone.test;
import com.phone.classes.*;

public class PhoneTest {

	public static void main(String[] args) {
		Galaxy S9 = new Galaxy("S9", 99, "Verizon","Ring Ring Ring");
		Iphone iphoneTen = new Iphone("X", 100, "AT&T", "Zing");
		
		S9.displayInfo();
		
		iphoneTen.displayInfo();

	}

}
