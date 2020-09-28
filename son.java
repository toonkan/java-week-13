package week13;

public  class son implements father,mather {

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("Mom cooks nice");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Father work");
		
	}
	public static void main(String[]args) {
		son s1 = new son();
		s1.cook();
		s1.work();
	}
	
}
