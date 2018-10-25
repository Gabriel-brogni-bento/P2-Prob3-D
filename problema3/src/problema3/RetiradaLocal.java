package problema3;

import java.util.ArrayList;

public class RetiradaLocal extends TipoEntrega {

	private static RetiradaLocal instance;
	
	private RetiradaLocal() {
		
	}
	
	@Override
	public double getValorEntrega(ArrayList<ItemPedido> itens) {
		return 0;
	}
	
	public static TipoEntrega getInstance() {
		if(instance == null) {
			instance = new RetiradaLocal();
		}
		return instance;
	}

}
