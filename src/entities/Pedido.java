package entities;
import java.util.*;
import services.*;

public class Pedido 
{
		private Integer idPedido;
		private EntregaPedido tipoEntregaPedido;
		private Date dataConttatacao;
		private Date dataEnvio;
		private Cliente cliente;
		private SacolaPedido itens;

		public Pedido(Integer idPedido, EntregaPedido tipoEntregaPedido, Date dataConttatacao, Date dataEnvio, Cliente cliente, SacolaPedido itens)
		{
				this.idPedido = idPedido;
				this.tipoEntregaPedido = tipoEntregaPedido;
				this.dataConttatacao = dataConttatacao;
				this.dataEnvio = dataEnvio;
				this.cliente = cliente;
				this.itens = itens;
		}
	
		public Pedido(){
				
		}

		public void setIdPedido(Integer idPedido)
		{
				this.idPedido = idPedido;
		}

		public Integer getIdPedido()
		{
				return idPedido;
		}

		public void setTipoEntregaPedido(EntregaPedido tipoEntregaPedido)
		{
				this.tipoEntregaPedido = tipoEntregaPedido;
		}

		public EntregaPedido getTipoEntregaPedido()
		{
				return tipoEntregaPedido;
		}

		public void setDataConttatacao(Date dataConttatacao)
		{
				this.dataConttatacao = dataConttatacao;
		}

		public Date getDataConttatacao()
		{
				return dataConttatacao;
		}

		public void setDataEnvio(Date dataEnvio)
		{
				this.dataEnvio = dataEnvio;
		}

		public Date getDataEnvio()
		{
				return dataEnvio;
		}

		public void setCliente(Cliente cliente)
		{
				this.cliente = cliente;
		}

		public Cliente getCliente()
		{
				return cliente;
		}

		public void setItens(SacolaPedido itens)
		{
				this.itens = itens;
		}

		public SacolaPedido getItens()
		{
				return itens;
		}
	
		
}
