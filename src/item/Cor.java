package item;

public class Cor
{
		private Integer idCor;
		private String nomeCor;
		private Double precoCM2;
		private double altChInt,largChInt;
		private double altChCorte,largChCorte;

		public Cor(Integer idCor, String nomeCor, Double precoCM2)
		{
				this.idCor = idCor;
				this.nomeCor = nomeCor;
				this.precoCM2 = precoCM2;
		}
	
		public Cor() {
				
		}

		public void setAltChInt(double altChInt)
		{
				this.altChInt = altChInt;
		}

		public double getAltChInt()
		{
				return altChInt;
		}

		public void setLargChInt(double largChInt)
		{
				this.largChInt = largChInt;
		}

		public double getLargChInt()
		{
				return largChInt;
		}

		public void setAltChCorte(double altChCorte)
		{
				this.altChCorte = altChCorte;
		}

		public double getAltChCorte()
		{
				return altChCorte;
		}

		public void setLargChCorte(double largChCorte)
		{
				this.largChCorte = largChCorte;
		}

		public double getLargChCorte()
		{
				return largChCorte;
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
	
		public Double precoCm2(Double precoChapa) {
				return (altChInt * largChInt)/precoChapa;
		}
}
