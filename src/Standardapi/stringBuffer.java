package Standardapi;

public class stringBuffer {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("nima").append("梦回唐朝").insert(0, "cao").delete(1, 3);
		sb.setCharAt(1, 'a');
		sb.setCharAt(2, 'o');
		System.out.println(sb);
		
		String sb_str = sb.toString();
		
	}
}
