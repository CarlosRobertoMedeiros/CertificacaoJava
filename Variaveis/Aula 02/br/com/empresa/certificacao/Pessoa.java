package br.com.empresa.certificacao; //O Pacote é Opcional e sempre a primeira informação

import java.util.Date; //Diversos Imports
import java.io.*;


//Classes e Interfaces Enuns vem depois dos packages e imports
//Comentário entra em qualquer lugar

//Um arquivo java pode ter 0 ou mais classes
// 
class B{
	int B; //Pode-se ter o mesmo nome de uma classe e do atributo
	B(){   //Pode-se ter o mesmo nome do construtor de uma classe

	}
	void B(){//Pode-se ter o mesmo nome do método de uma classe

	}
}

class Pessoa{
	String nome;
	Pessoa(String nome){

	}

	public String getNome(){
		String sobrenome = "Robnerto";
		return sobrenome;

	}
	public static void main(String[] args){
		System.out.println("Funcionou");
	}

}
interface Figura{

}

//Comentário pode ficar em qualquer lugar do código
//Esse é um comentário simples
/* Comentário de Várias limhas */

/**JavaDoc começa com 2 */

