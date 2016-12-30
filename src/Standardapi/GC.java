package Standardapi;

import java.lang.ref.SoftReference;

public class GC {
	public static void main(String[] args) {
		
//		new DemoPojo();
//		System.gc();
//		System.runFinalization();
		
		//强引用，不可能被垃圾回收
		DemoPojo d = new DemoPojo();
		
		//虚引用引用DemoPojo对象
//		WeakReference w = new WeakReference(d);
		SoftReference<DemoPojo> s = new SoftReference<>(d);
		for(int i =0 ; i <100 ; i++)
		{
			new DemoPojo();
		}
		
		d=null;
		
		System.out.println(s.get());
		
		
		System.gc();
		System.runFinalization();
		
		
		
		
	}
}
