package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1,"Jose da Silva","jose@gmail");
		Pessoa p2 = new Pessoa(2,"Manoel dos Santos","manoel@gmail");
		Pessoa p3 = new Pessoa(3,"Kamila Oliveira","jose@gmail");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
