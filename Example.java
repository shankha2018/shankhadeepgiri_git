
class Demo{
	public static void main(String[] args) {
		B ob = new B(1,2,3);
		ob.show();

	}
}
class A{
	int i,j;
	A(int a, int b)
	{
		i=a;h
		j=b;
	}
	void show()
	{
		System.out.println( "i and j are :" + i +" "+j);

	}
}
class B extends A{
	 int k;
	 B(int a, int b, int c)
	 {
	 	super(a,b);
	 	k=c;
	 }
	 void show()
	 {
	 	super.show();
	 	System.out.println("k is " + k);
	 }
}