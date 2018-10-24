package problema3;

public class Main {
	public static void main(String[] args) {

		Produto borracha = new Produto("Borracha", 20, 10);
		Produto lapis = new Produto("Lapis", 10, 50);
		
		Pedido pedido = new Pedido();
		pedido.incluirItem(borracha, 110);
		pedido.incluirItem(lapis, 220);
		
		try {
			pedido.setTipoEntrega(new SEDEX());
			System.out.println("Valor da entrega: " + pedido.getValorTotal());
			
		} catch (TipoEntregaInvalido e) {
			// TODO Auto-generated catch block
			System.out.println("Nao entregamos acima de 5kg");
			e.printStackTrace();
		}
		
		try {
			pedido.setTipoEntrega(new PAC());
			System.out.println("Valor da entrega: " + pedido.getValorTotal());
		} catch (TipoEntregaInvalido e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
