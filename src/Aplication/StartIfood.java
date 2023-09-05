package Aplication;

import java.util.Date;
import javax.swing.JOptionPane;
import Collection.StatusPedido;
import Entities.Pedido;

public class StartIfood {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(543, new Date() , StatusPedido.PENDENTE_DE_PAGAMENTO);
		
		JOptionPane.showMessageDialog(null, pedido);
		
		//converte um objeto String em enum
		//Instancia de pedido2,receber um stauts de entregues
		
		StatusPedido pedido2 = StatusPedido.ENTREGUE;
		
	}

}
