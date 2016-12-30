import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import Standardapi.Song;

public class Sort {
	
	public static void showArrayList(){
		ArrayList<Song> list = new ArrayList<>();
		Song s1 = new Song("爱你1", "xjw" , "3:21");
		Song s2 = new Song("爱你2", "xjw" , "3:21");
		Song s3 = new Song("爱你3", "xjw" , "3:21");
		Song s4 = new Song("爱你4", "xjw" , "3:21");
		
		list.add(s3);
		list.add(s2);
		list.add(s4);
		list.add(s1);
		
		
		
		System.out.println(list);
	}
	
	public static void showTreeSet(){
		TreeSet<Song> ts = new TreeSet<>(new Comparator<Song>(){
			@Override
			public int compare(Song o1, Song o2) {
				if(o1.getSongName().length() > o2 .getSongName(). length() ){
					return 1;
				}else if(o1.getSongName().length() == o2 .getSongName(). length()){
					return 0;
				}else{
					return -1;
				}
				
				
			}
		});
		ts.add(new Song("wushwqeqw"));
		ts.add(new Song("keai1"));

	
	System.out.println(ts);
	}
	
	public static void showMap(){
	
		
	}
	
	public static void stringTest() throws UnsupportedEncodingException{
		byte[] b = new byte[]{88,22,77,99,100};
		String str3 = new String(b);
		System.out.println(str3);
		String str4 = new String(b,"utf-8");
		System.out.println(str4);
		String str5 = new String(b, 1,2);
		System.out.println(str5);
		
		char[] c = new char[]{'A','O','B'};
		String str6 = new String(c);
		System.out.println(str6);
		
		StringBuilder sb = new StringBuilder(str6);
		System.out.println(sb);
		sb.getChars(0, 3, c, 0);
		
		String strnew = "nilaomouwolaomei";
		//查
		System.out.println(strnew.length());
		System.out.println(strnew.charAt(3));
		System.out.println(strnew.indexOf('l'));
		System.out.println(strnew.startsWith("nia"));
		System.out.println(strnew.endsWith("o"));
		System.out.println(strnew.contains("laoo"));
		System.out.println(strnew.lastIndexOf('o',11));
		//改
		System.out.println(strnew.substring(2,3));
		System.out.println(strnew.subSequence(1, 5));
		System.out.println(strnew.replace('a','B'));
		System.out.println(strnew.toCharArray());
		System.out.println(strnew.getBytes());
		
		System.out.println(Arrays.asList(strnew));
		System.out.println(Arrays.toString(c));
		ArrayList<String> list = new ArrayList<String>();
		list.toArray();
		
		
	}
	
	public static void setTest(){
		HashSet<String> hs = new HashSet<String>();
		hs.add("nimei");
		
	}
	
	public void showListType(){
		
	}
	
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
	}
}

class NameCompare implements Comparator<Song>{
	@Override
	public int compare(Song o1, Song o2) {
		
		return o1.getArtist().compareTo(o2.getArtist());
	}
}
