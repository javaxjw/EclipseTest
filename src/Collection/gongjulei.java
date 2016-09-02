package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class gongjulei {
		public static void main(String[] args) {
			
			HashMap hm = new HashMap();
			hm.put("南方路50號", "家庭地址");
			hm.put("許吳村","家庭地址");
			hm.put("康順大廈8樓", "工作地址");
			
			hm.remove("許吳村");
			System.out.println(hm);
			
			System.out.println(hm.containsKey("許吳村"));
			System.out.println(hm.containsValue("家庭地址"));
			
			System.out.println(hm.size());
			
			Set ks =hm.keySet();
			Iterator ki = ks.iterator();
			
			while(ki.hasNext())
			{
				System.out.println("key:" + ki.next() + "------> value:" + hm.get(ki.next()) );
			}
			
//			for(Object k : ks)
//			{
//				System.out.println("key:" + k + "------> value:" + hm.get(k) );
//			}
//			
			System.out.println("close");
		}
	}

