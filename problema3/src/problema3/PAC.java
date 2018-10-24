package problema3;

import java.util.ArrayList;

public class PAC implements ITipoEntrega {

	@Override
	public double getValorEntrega(ArrayList<ItemPedido> itens) {
		
		int peso = 0;
		
		for (ItemPedido itemPedido : itens) {
			peso += itemPedido.getProduto().getPeso() * itemPedido.getQuantidade();	
		}
		
		if (peso <= 500) {
			return 12.5;
		} else if (peso <= 750) {
			return 20;
		} else if (peso <= 1200) {
			return 30;
		} else if (peso <= 2000) {
			return 45;
		} else {
			double valorBase = 45;
			
			peso -= 2000;
			
			int mod = peso % 100;
			peso = peso / 100;
			
			if (mod != 0)
				peso++;
			
			valorBase += peso * 1.5;
			
			return valorBase;
		}
	}
}
