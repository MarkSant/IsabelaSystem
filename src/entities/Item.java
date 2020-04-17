package entities;
import java.util.*;
import services.*;

public class Item
{
		private Integer idItem;
		private String codigoItem;
		private Double tamanhoPadrao;
		private Double areaPadrao;
		private Double pesoPadrao;
		private List<ParteItem> listaPartes;

		public Item(Integer idItem, String codigoItem, Double tamanhoPadrao, Double areaPadrao, Double pesoPadrao, List<ParteItem> listaPartes)
		{
				this.idItem = idItem;
				this.codigoItem = codigoItem;
				this.tamanhoPadrao = tamanhoPadrao;
				this.areaPadrao = areaPadrao;
				this.pesoPadrao = pesoPadrao;
				this.listaPartes = listaPartes;
		}
	
		public Item(){
				
		}

		public void setIdItem(Integer idItem)
		{
				this.idItem = idItem;
		}

		public Integer getIdItem()
		{
				return idItem;
		}

		public void setCodigoItem(String codigoItem)
		{
				this.codigoItem = codigoItem;
		}

		public String getCodigoItem()
		{
				return codigoItem;
		}

		public void setTamanhoPadrao(Double tamanhoPadrao)
		{
				this.tamanhoPadrao = tamanhoPadrao;
		}

		public Double getTamanhoPadrao()
		{
				return tamanhoPadrao;
		}

		public void setAreaPadrao(Double areaPadrao)
		{
				this.areaPadrao = areaPadrao;
		}

		public Double getAreaPadrao()
		{
				return areaPadrao;
		}

		public void setPesoPadrao(Double pesoPadrao)
		{
				this.pesoPadrao = pesoPadrao;
		}

		public Double getPesoPadrao()
		{
				return pesoPadrao;
		}

		public void setListaPartes(List<ParteItem> listaPartes)
		{
				this.listaPartes = listaPartes;
		}

		public List<ParteItem> getListaPartes()
		{
				return listaPartes;
		}
	
		public Map<Cor,Double> mapCorAreaPartes (Item item) {
		
				Map<Cor, Double> mapCorArea = new HashMap<Cor, Double>();
				List <ParteItem> partes = item.getListaPartes();
				for(int i = 0; i < partes.size(); i++) {
						mapCorArea.put(partes.get(i).getCor(), partes.get(i).getAreaParte());
				}
				return mapCorArea;
		}
	
		public List<Cor> listaCores (List<ParteItem> partes){
				List<Cor> cores = new ArrayList<Cor>();
				for (int i = 0; i < partes.size(); i++) {
						cores.add(i, partes.get(i).getCor());
				}
				return cores;
		}
		
}
