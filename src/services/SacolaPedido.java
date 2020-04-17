package services;
import java.util.*;
import item.Cor;

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
	
		public Map<Cor, Double> mapConsuCorAreaSacola () {

				Map<Cor,Double> mapCorTamSac = new HashMap<Cor, Double>();
				for (ItemSolicitado item : listaSacola) {
						
						Map<Cor, Double> mapCorTamItem = item.mapConsumCorAreaSoli();
					 
						mapCorTamItem.forEach((k,v) -> {
								if(!mapCorTamSac.containsKey(k)) {
										mapCorTamSac.put(k,v);
								} else {
								double soma = mapCorTamSac.get(k) + v;
								mapCorTamSac.put(k, soma);
								}
						}
						
						/*for (int i = 0; i < mapCorTamItem.size(); i++) {
							Double sum = mapCorTamSac.get(cores.get(i)) + mapCorTamItem.get(cores.get(i));
								mapCorTamSac.put(cores.get(i), sum);
						}
						*/
				}
			return mapCorTamSac;	
		}
		
}
