class X{
	int x=5;

	void metodo(){
		int a = 10;
		System.out.println(a);
	} 
}

class TestandoShaddowing{
	
	int x=0;

	public static void main(String[] args){
		int x=2;
		System.out.println(x);  //Shadowing escondeu o valor da variável membro

		new X().metodo(); //Shadowing com metodo
	}

}