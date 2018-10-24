package problema3;

import java.util.ArrayList;

public class SEDEX implements ITipoEntrega {

	@Override
	public double getValorEntrega(ArrayList<ItemPedido> itens) throws TipoEntregaInvalido {
		
		int peso = 0;
		
		for (ItemPedido itemPedido : itens) {
			peso += itemPedido.getProduto().getPeso() * itemPedido.getQuantidade();
			
		}
		
		if (peso <= 1000) {
			return 10;
		} else if (peso <= 2000) {
			return 15;
		} else if (peso <= 3000) {
			return 20;
		} else if (peso <= 5000) {
			return 30;
		} else {
			throw new TipoEntregaInvalido();
		}
	}

}
