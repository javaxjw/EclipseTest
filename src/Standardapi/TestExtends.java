package Standardapi;

public class TestExtends extends Song implements TestJiekou, TestJiekou1{



//	public void play() {
//		// TODO Auto-generated method stub
//		System.out.println("实现接口的play方法");
//	}
	
	public void fatherPlay(){
		super.play();
	}

	@Override
	public String getString(String str) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
