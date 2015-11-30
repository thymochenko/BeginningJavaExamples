import static java.lang.Integer.toBinaryString;

public class BitwiseOps {
    //pagina 52
    public static void main(String[] args){
		int indicators = 0b1111_1111_0000_0111;
		int selectBit3   = 0b0000_0000_0000_0100;
		
		System.out.println(" indicators : " + toBinaryString(indicators));
		System.out.println(" selecBit3 : " + toBinaryString(selectBit3));
		 
		indicators &= selectBit3;
		System.out.println("indicators & selectBit3 = " + toBinaryString(indicators));
		
		// Try the bitwise OR to switch the third bit on
		indicators = 0b1111_1111_0000_1001;
		// Same as 0xFF09
		System.out.println("\n indicators = "+ toBinaryString(indicators));
		System.out.println("selectBit3 = "+ toBinaryString(selectBit3));
		indicators |= selectBit3;
		System.out.println("indicators | selectBit3 = " + toBinaryString(indicators));
		// Now switch the third bit off again
		indicators &= ~selectBit3;													
	}
}
