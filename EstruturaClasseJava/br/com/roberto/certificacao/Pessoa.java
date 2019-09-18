package br.com.roberto.certificacao;

import java.util.Date;
import java.sql.*;


//Uma interface pode ter variáveis e métodos
//Na certificação o que é cobrado que pode ter dentro da interface são as variáveis constantes que não pode ter o seu valor ou referência alterada
//									  pode ter a definição de métodos abstratos públicos

//
// 
//Tanto a variável TAMANHO quanto o metodo autentica são públicos independente de um digitar ou não por ser uma interface
// Por padrão a variável é static
// Por padrão o método é abstrato
interface A{
	public final int TAMANHO=5; //variáveis constantes
	public void autentica(String nome, String senha); //métodos abstratos públicos
}

//Não existe conflito entre o nome da variável membro,nome do método e o nome da classe
class B{ //Posso ter uma classe, dentro dela uma variável, um construtor e um método todos com o mesmo nome Isso é compilável
	int b;
	B(){

	}
	void b(){
	}
}

class Pessoa{
	
	static int totalDePessoas =0; //Variável de Classe, Variável Estática
	String nome; //Posso ter dentro da minha classe Variáveis Membro ou Atributos, Variáveis de Instância ou de Objeto
	Pessoa(String nome){ //Posso ter dentro da minha classe Métodos Construtores com Variáveis que são parâmetros
		if (nome==null){
			this.nome = "Carlos";
		}
		this.nome = nome;
		return; //Em um construtor eu posso passar um return assim sem nada, porém ele não tem retorno só se for um retorno vazio
	}

	public String getNome(){ //Posso ter dentro da minha classe métodos
		String sobrenome = "Medeiros ";//nesse método posso ter variáveis locais
		return nome+sobrenome;
	} 


}

interface Figura{

}

enum Valores{
	SIM,
	NAO
}