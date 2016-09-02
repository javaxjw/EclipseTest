package Standardapi;

public class DemoPojo implements Comparable{
		
		private int id;
		private String name;
	
		public DemoPojo(int id ,String name) {
			this.id= id;
			this.name = name;
			System.out.println("对象被创建！");
		}
			
		public DemoPojo() {
			// TODO Auto-generated constructor stub
		}	
		
		@Override
		public void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize方法被调用！");
		}
		
		@Override
		public int compareTo(Object o) {
				
			DemoPojo p1 = (DemoPojo)o;
			
			
			return p1.getId()> this.getId()? 1 :p1.getId()< this.getId()? -1:0;
			}
		
		
		public String toString() {
		// TODO Auto-generated method stub
		return "[ id=" + this.id + ", name=" + this.name + "]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
}
