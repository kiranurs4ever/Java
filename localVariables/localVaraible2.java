class localVariable2{
	public static void main(String[] args){
		try{
			System.out.println("Hello");
			int i = Integer.parseInt("10");
			//int decimalExample = Integer.parseInt("20");
		}
		catch(NumberFroamtException e){
			System.out.println("How are you");
			i = 0;
		}
		System.out.println(i);
	}
}
