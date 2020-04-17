package services;
import entities.Item;
import entities.Cor;

public class ParteItem
{
		private Cor cor;
		private Double areaParte;
		private Integer idParte;
		private Item item;

		public ParteItem(Cor cor, Double areaParte, Integer idParte, Item item)
		{
				this.cor = cor;
				this.areaParte = areaParte;
				this.idParte = idParte;
				this.item = item;
		}
	
	
		public ParteItem(){
				
		}

		public void setItem(Item item)
		{
				this.item = item;
		}

		public Item getItem()
		{
				return item;
		}

		public void setCor(Cor cor)
		{
				this.cor = cor;
		}

		public Cor getCor()
		{
				return cor;
		}

		public void setAreaParte(Double areaParte)
		{
				this.areaParte = areaParte;
		}

		public Double getAreaParte()
		{
				return areaParte;
		}

		public void setIdParte(Integer idParte)
		{
				this.idParte = idParte;
		}

		public Integer getIdParte()
		{
				return idParte;
		}
	
		
}
