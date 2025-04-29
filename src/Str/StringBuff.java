package Str;
import java.lang.StringBuffer;
public class StringBuff {
	public static void main(String[] args) {
		String st="Eswar is good cricketer";
		st.concat ("in Ngp");
		StringBuffer sb=new StringBuffer(st);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(st);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
}
}
 