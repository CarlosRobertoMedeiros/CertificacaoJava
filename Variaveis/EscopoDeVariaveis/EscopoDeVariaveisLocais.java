class EscopoDeVariaveisLocais{
	
	
	public static void main(String[] args){
		System.out.println("Funcionou");
		EscopoDeVariaveisLocais escopoDeVariaveis = new EscopoDeVariaveisLocais();
		escopoDeVariaveis.m1();//Chamada do Método Para o Exemplo 1
		escopoDeVariaveis.m2(); //O Y só existe dentro da construção do bloco do if
								//Se tentar imprimir Y fora do if gera exceção 
								// cannot find symbol System.out.println(y) apontando para o y
		escopoDeVariaveis.m3(); // Testando dentro de um laço for
								// Se não tiver no laço também vai apresentar o mesmo erro acima
								//	cannot find symbol System.out.println(y) apontando para o y e para o x
		escopoDeVariaveis.m4("Roberto"); // Um parâmetro também é uma variável local





	}

	//Exemplo 1 Dentro de um Método
	public void m1(){
		int x = 10;
		System.out.println(x);

	}

	public void m2(){
		int x = 10;
		
		if (x>=10){
			int y = 50;
			System.out.println(y);			
		}
		//System.out.println(x);
		//System.out.println(y);			

	}

	public void m3(){

		//As chaves do for podem ser implícitas e explicitas
		//o j++ tem uma chave antes e outra depois 
		//  for (int i=0, j=0; i<=10; i++) {
		//	  j++
		//  };

		//No exemplo a frente as chaves estavam implícitas
		for (int i=0, j=0; i<=10; i++) j++;
			//System.out.println(i);
			//System.out.println(j);
	}

	public void m4(String nome){
		System.out.println(nome);
	}



}