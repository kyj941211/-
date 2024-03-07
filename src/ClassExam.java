
public class ClassExam {
	//field
	private int a;
	
	//c
	public ClassExam(){
		System.out.println("디폴트 생성자");
	}
	public ClassExam(int aa){
		a = aa;
	}
	
	//m
	public void setA(int num) {
		a = num;
	}
	public int getA() {
		return a;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassExam ce2= new ClassExam();
		ClassExam ce3= new ClassExam(10);
		ClassExam ce4= new ClassExam(5600);
		ce2.setA(500);
		System.out.println(ce2.getA());
		System.out.println(ce3.a);
		System.out.println(ce4.a);
		
	}

}
