package entities;

public class Cliente
{
		private Integer idCliente;
		private String nomeCliente;
		private String emailCliente;
		private Integer telefoneCliente;
		private String enderecoCliente;

		public Cliente(Integer idCliente, String nomeCliente, String emailCliente, Integer telefoneCliente, String enderecoCliente)
		{
				this.idCliente = idCliente;
				this.nomeCliente = nomeCliente;
				this.emailCliente = emailCliente;
				this.telefoneCliente = telefoneCliente;
				this.enderecoCliente = enderecoCliente;
		}
	
		public Cliente() {
				
		}

		public void setIdCliente(Integer idCliente)
		{
this.idCliente = idCliente;
}

public Integer getIdCliente()
{
return idCliente;
}

public void setNomeCliente(String nomeCliente)
{
this.nomeCliente = nomeCliente;
}

public String getNomeCliente()
{
return nomeCliente;
}

public void setEmailCliente(String emailCliente)
{
this.emailCliente = emailCliente;
}

public String getEmailCliente()
{
return emailCliente;
}

public void setTelefoneCliente(Integer telefoneCliente)
{
this.telefoneCliente = telefoneCliente;
}

public Integer getTelefoneCliente()
{
return telefoneCliente;
}

public void setEnderecoCliente(String enderecoCliente)
{
this.enderecoCliente = enderecoCliente;
}

public String getEnderecoCliente()
{
return enderecoCliente;
}
	
		
		
}
