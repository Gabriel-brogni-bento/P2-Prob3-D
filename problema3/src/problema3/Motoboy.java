package problema3;

import java.util.ArrayList;

public class Motoboy extends TipoEntrega {

	private static Motoboy instance;
	
	private Motoboy() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getValorEntrega(ArrayList<ItemPedido> itens) throws TipoEntregaInvalido {
		
		int peso = getPesoTotal(itens);
		
		if((peso < 25000) && (itens.size() < 30)) {
			return 7;
		}
		
		throw new TipoEntregaInvalido();
		
	}
	
	public static TipoEntrega getInstance() {
		if(instance == null) {
			instance = new Motoboy();
		}
		return instance;
	}

}
