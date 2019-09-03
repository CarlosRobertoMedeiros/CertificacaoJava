class EscopoDeVariaveisDeInstanciaOuObjeto{

	String nome = "Roberto";

	public EscopoDeVariaveisDeInstanciaOuObjeto(){
		System.out.println(nome);//Escopo do Construtor pode acessar a variável
	}

	public void m2(){
		System.out.println(nome); //Escopo do Método

	}

	public static void main(String[] args){
		EscopoDeVariaveisDeInstanciaOuObjeto escopoDeVariaveisDeInstanciaOuObjeto = new EscopoDeVariaveisDeInstanciaOuObjeto();
		escopoDeVariaveisDeInstanciaOuObjeto.m2();

	}


}