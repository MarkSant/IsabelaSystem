package controle;
import java.util.*;
import entities.*;
import item.*;
import services.*;

public class PedidosDia 
{
		private int idPedidosDia;
		private List<Pedido> listaPedidos;
	
		public PedidosDia(){
				
		}

		public PedidosDia(int idPedidosDia, List<Pedido> listaPedidos)
		{
				this.idPedidosDia = idPedidosDia;
				this.listaPedidos = listaPedidos;
		}

		public void setIdPedidosDia(int idPedidosDia)
		{
				this.idPedidosDia = idPedidosDia;
		}

		public int getIdPedidosDia()
		{
				return idPedidosDia;
		}

		public void setListaPedidos(List<Pedido> listaPedidos)
		{
				this.listaPedidos = listaPedidos;
		}

		public List<Pedido> getListaPedidos()
		{
				return listaPedidos;
		}
	
	
		public Set<Cor> setCoresDia() {
				Set<Cor> setCores = new HashSet<Cor>();
				for(Pedido pedido : listaPedidos) {
						List<ItemSolicitado> listaItSol = pedido.getItens().getListaSacola();
						for (ItemSolicitado itemSol : listaItSol) {
								Set<Cor> setCoresItemSol = itemSol.mapConsumCorAreaSoli().keySet();
								setCores.addAll(setCoresItemSol);
						}
				}
				return setCores;
		}
	
		public Map<Cor,Double> mapCorConsumDia() {
				Map<Cor,Double> mapCC = new HashMap<Cor,Double>();
				for(Pedido pedido : listaPedidos) {
						List<ItemSolicitado> listaItSol = pedido.getItens().getListaSacola();
						for (ItemSolicitado itemSol : listaItSol) {
								Map<Cor, Double> mapCorTamItem = itemSol.mapConsumCorAreaSoli();

								mapCorTamItem.forEach((k,v) -> {
										if(!mapCC.containsKey(k)) {
												mapCC.put(k,v);
										} else {
												double soma = mapCC.get(k) + v;
												mapCorTamItem.put(k, soma);
										}
								}
								
						}
				}
				return mapCC;
		}
}
