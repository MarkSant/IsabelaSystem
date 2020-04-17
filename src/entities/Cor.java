package entities;

public class Cor
{
		private Integer idCor;
		private String nomeCor;
		private Double precoCM2;

		public Cor(Integer idCor, String nomeCor, Double precoCM2)
		{
				this.idCor = idCor;
				this.nomeCor = nomeCor;
				this.precoCM2 = precoCM2;
		}
	
		public Cor() {
				
		}

		public void setIdCor(Integer idCor)
		{
				this.idCor = idCor;
		}

		public Integer getIdCor()
		{
				return idCor;
		}

		public void setNomeCor(String nomeCor)
		{
				this.nomeCor = nomeCor;
		}

		public String getNomeCor()
		{
				return nomeCor;
		}

		public void setPrecoCM2(Double precoCM2)
		{
				this.precoCM2 = precoCM2;
		}

		public Double getPrecoCM2()
		{
				return precoCM2;
		}
	
		public Double precoCm2(Double altChapa, Double largChapa,Double precoChapa) {
				return (altChapa * largChapa)/precoChapa;
		}
}
