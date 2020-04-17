package services;
import entities.*;
import java.util.*;


public class ItemSolicitado 
{
		private Integer idItemSolicitado;
		private Double tamanhoSolicitado;
		private int qtdadeSolicitado;
		private Item idItem;

		public ItemSolicitado(Integer idItemSolicitado, Double tamanhoSolicitado, int qtdadeSolicitado, Item idItem)
		{
				this.idItemSolicitado = idItemSolicitado;
				this.tamanhoSolicitado = tamanhoSolicitado;
				this.qtdadeSolicitado = qtdadeSolicitado;
				this.idItem = idItem;
		}
	
		public ItemSolicitado() {
				
		}

		public void setIdItemSolicitado(Integer idItemSolicitado)
		{
				this.idItemSolicitado = idItemSolicitado;
		}

		public Integer getIdItemSolicitado()
		{
				return idItemSolicitado;
		}

		public void setTamanhoSolicitado(Double tamanhoSolicitado)
		{
				this.tamanhoSolicitado = tamanhoSolicitado;
		}

		public Double getTamanhoSolicitado()
		{
				return tamanhoSolicitado;
		}

		public void setQtdadeSolicitado(int qtdadeSolicitado)
		{
				this.qtdadeSolicitado = qtdadeSolicitado;
		}

		public int getQtdadeSolicitado()
		{
				return qtdadeSolicitado;
		}

		public void setIdItem(Item idItem)
		{
				this.idItem = idItem;
		}

		public Item getIdItem()
		{
				return idItem;
		}

		
	
		public Map<Cor, Double> mapConsumoCorArea (ItemSolicitado itemsolicitado) {
			
				double razaoTamanhos = ((itemsolicitado.getTamanhoSolicitado() - itemsolicitado.getIdItem().getTamanhoPadrao())/itemsolicitado.getIdItem().getTamanhoPadrao());
				Map<Cor, Double> corTam = itemsolicitado.getIdItem().mapCorAreaPartes(itemsolicitado.getIdItem());
				List<Cor> cores = itemsolicitado.getIdItem().listaCores(itemsolicitado.getIdItem().getListaPartes());
				for(int i = 0; i < corTam.size(); i++) {
						double tamSoli = corTam.get(cores.get(i)) + (razaoTamanhos * corTam.get(cores.get(i)));
						corTam.put(cores.get(i),tamSoli);
				}
				return corTam;
		}
		
}
