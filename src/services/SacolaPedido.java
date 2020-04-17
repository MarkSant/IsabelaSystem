package services;
import java.util.*;
import entities.*;

public class SacolaPedido
{
	private Integer idSacolaPedido;
		private List<ItemSolicitado> listaSacola;

		public SacolaPedido(Integer idSacolaPedido, List<ItemSolicitado> listaSacola)
		{
				this.idSacolaPedido = idSacolaPedido;
				this.listaSacola = listaSacola;
		}
	
		public SacolaPedido() {
				
		}

		public void setIdSacolaPedido(Integer idSacolaPedido)
		{
				this.idSacolaPedido = idSacolaPedido;
		}

		public Integer getIdSacolaPedido()
		{
				return idSacolaPedido;
		}

		public void setListaSacola(List<ItemSolicitado> listaSacola)
		{
				this.listaSacola = listaSacola;
		}

		public List<ItemSolicitado> getListaSacola()
		{
				return listaSacola;
		}
	
		public Map<Cor, Double> mapConsumoCorArea () {

				Map<Cor,Double> mapCorTamSac = new HashMap<Cor, Double>();
				for (ItemSolicitado item : listaSacola) {
						List<Cor> cores = item.getIdItem().listaCores(item.getIdItem().getListaPartes());
						Map<Cor, Double> mapCorTamItem = item.mapConsumoCorArea(item);
						for (int i = 0; i < mapCorTamItem.size(); i++) {
							Double sum = mapCorTamSac.get(cores.get(i)) + mapCorTamItem.get(cores.get(i));
								mapCorTamSac.put(cores.get(i), sum);
						}
						
				}
			return mapCorTamSac;	
		}
		
}
