class Pessoa{
	static int id =1;

	static void metodo(){
		System.out.println(id);
	}


}

class EscopoDeVariavelDeClasse{
	
	public static void main(String[] args){
		Pessoa p = new Pessoa();
		System.out.println(p.id); //Posso Acessar pela Instância Estática
		System.out.println(Pessoa.id); //Posso Acessar pela variável de Classe

		Pessoa.metodo(); //Chamada direta de um método estático


	}



}