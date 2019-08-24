class static1{
	static int x = 10;
	// Static variable can be acessed from object
	public static void main(String[] args){
		System.out.println(x);
		m1();
	}
	// Non static methode can not be invoked from static methode
	public static void m1(){
		System.out.println(x);
	}
}
