package AllOperators;

public class SwappingTwoNos {
	
	int a,b ;
	public SwappingTwoNos() {
		// TODO Auto-generated constructor stub
		this.a=30;
		this.b=50;
	}
	SwappingTwoNos(int x,int z){
		this.a=x;
		this.b=z;
	};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwappingTwoNos stn = new SwappingTwoNos();
		SwappingTwoNos stn1 = new SwappingTwoNos(1,6);
		stn.usingTempVar(10,20);
		stn.usingAddSubOperators(10,20);
		stn.usingMulDivOperators(10,20);
		stn.usingXOROperator(10, 20);
		stn.usingSingleStatement(10, 20);
		stn.printClassValues();
		stn1.usingTempVar();

	}	
	public void usingTempVar(){
		System.out.println("Before Swapping value of a = "+a+",b = "+b);
		int c=this.a;
		this.a=this.b;
		this.b=c;
		System.out.println("After Swapping value of a = "+a+",b = "+b);
		System.out.println();
	}
	public void printClassValues() {
		System.out.println("value of a = "+this.a+", value of b = "+this.b );
		System.out.println();
	}
	
	public void usingTempVar(int a,int b){
		System.out.println("Before Swapping value of a = "+a+",b = "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping value of a = "+a+",b = "+b);
		System.out.println();
	}
	public void usingAddSubOperators(int a,int b) {

		System.out.println("Before Swapping value of a = "+a+",b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping value of a = "+a+",b = "+b);
		System.out.println();
	}
	public void usingMulDivOperators(int a,int b) {

		System.out.println("Before Swapping value of a = "+a+",b = "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping value of a = "+a+",b = "+b);
		System.out.println();
	}
	public void usingXOROperator(int a,int b) {

		System.out.println("Before Swapping value of a = "+a+",b = "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping value of a = "+a+",b = "+b);
		System.out.println();
	}
	public void usingSingleStatement(int a,int b) {

		System.out.println("Before Swapping value of a = "+a+",b = "+b);
		a = a+b -(b=a);
		System.out.println("After Swapping value of a = "+a+",b = "+b);
		System.out.println();
	}
}
