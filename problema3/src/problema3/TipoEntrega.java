package problema3;

import java.util.ArrayList;

public abstract class TipoEntrega {
	
	
	abstract double getValorEntrega(ArrayList<ItemPedido> itens) throws TipoEntregaInvalido;
	
	public int getPesoTotal(ArrayList<ItemPedido> itens) {
		
		int peso = 0;
		
		for (ItemPedido itemPedido : itens) {
			peso += itemPedido.getProduto().getPeso() * itemPedido.getQuantidade();	
		}
		
		return peso;
	}
	
	
}
