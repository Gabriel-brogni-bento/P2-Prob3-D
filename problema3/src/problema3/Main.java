package problema3;

public class Main {
	public static void main(String[] args) {

		Produto borracha = new Produto("Borracha", 20, 10);
		Produto lapis = new Produto("Lapis", 10, 50);
		Produto caderno = new Produto("Caderno", 75, 5);
		
		Pedido pedido1 = new Pedido(); 
		Pedido pedido = new Pedido();
		pedido.incluirItem(borracha, 110);
		pedido.incluirItem(lapis, 220);
		
		pedido1.incluirItem(caderno, 31);
		
		try {
			pedido.setTipoEntrega(SEDEX.getInstance());
			System.out.println("Valor da entrega: " + pedido.getValorTotal());
			
		} catch (TipoEntregaInvalido e) {
			// TODO Auto-generated catch block
			System.out.println("Nao entregamos acima de 5kg");
			//e.printStackTrace();
		}
		
		try {
			pedido.setTipoEntrega(PAC.getInstance());
			System.out.println("Valor da entrega: " + pedido.getValorTotal());
		} catch (TipoEntregaInvalido e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pedido1.setTipoEntrega(Motoboy.getInstance());
			System.out.println("Valor da entrega: " + pedido1.getValorTotal());
		} catch (TipoEntregaInvalido e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
