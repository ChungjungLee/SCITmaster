import java.io.UnsupportedEncodingException;

public class StringTest2_test {
	public static void main(String[] args) throws UnsupportedEncodingException {
		StringTest2 test = new StringTest2();
		
		String s1 = "ʫʦʥ";
		
		System.out.println("size: " + test.size(s1));
		System.out.println("char at: " + test.charat(s1, 2));
		//test.reverse_print(s1);
		System.out.println("reversed: " + test.reverse(s1));
		
		
		System.out.println("===============");
		
		// The input string for this test
		final String string = "hello world";

		// Check length, in characters
		System.out.println(string.length()); // prints "11"

		// Check encoded sizes
		final byte[] utf8Bytes = string.getBytes("UTF-8");
		System.out.println(utf8Bytes.length); // prints "11"

		final byte[] utf16Bytes= string.getBytes("UTF-16");
		System.out.println(utf16Bytes.length); // prints "24"

		final byte[] utf32Bytes = string.getBytes("UTF-32");
		System.out.println(utf32Bytes.length); // prints "44"

		final byte[] isoBytes = string.getBytes("ISO-8859-1");
		System.out.println(isoBytes.length); // prints "11"

		final byte[] winBytes = string.getBytes("CP1252");
		System.out.println(winBytes.length); // prints "11"
	}
}
