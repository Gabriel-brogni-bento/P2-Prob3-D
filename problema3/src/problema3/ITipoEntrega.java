package problema3;

import java.util.ArrayList;

public interface ITipoEntrega {
	double getValorEntrega(ArrayList<ItemPedido> itens) throws TipoEntregaInvalido;
}
