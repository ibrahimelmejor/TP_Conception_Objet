package tp3_pizza;

import tp3_pizza.Pizza.taillePizza;
import tp3_pizza.System.états;


public class Main {

	public static void main(String[] args) {
		Long numeroDeJeanMichMich =  (long) 0631262626;
		Long numeroDeCCDeJeanMichMich =  (long) 01234567;
		Client client = new Client(numeroDeJeanMichMich,numeroDeCCDeJeanMichMich,"1 Avenue des Champs Elysées","Jean MICHEL");
		Pizza p = new Pizza(10, "La Gourmande","http://pizzagotham/lagourmande/photos.com",taillePizza.GrandePizza);
		Commande c = new Commande();
		c.setClient(client);
		c.setEtat(états.Commandé);
		Pizza[] p_list = new Pizza [1];
		p_list[0]=p;
		c.setPizzas(p_list);
	}

}
