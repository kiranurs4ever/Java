class staticScope{
	static int x = 10;
	int y = 20;
	public static void main(String[] args){
		staticScope s = new staticScope();
		s.x = 888;
		s.y = 999;
		System.out.println(s.x+"-----------"+s.y);
		staticScope s1 = new staticScope();
		//static variable stays 888 instance is crearated again 
		System.out.println(s1.x+"---------"+s1.y);
	}
}
