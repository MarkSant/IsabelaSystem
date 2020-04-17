package services;
import entities.*;

public abstract class EntregaPedido
{
	 public Double frete(Cliente cliente,TiposCorreio tipoCorreio){
			 String endereco = cliente.getEnderecoCliente();
			 switch(tipoCorreio) {
					 case CARTA:
							 return 1.0;
							 break;
						case PAC:
								return 2.0;
								break;
						case SEDEX:
								return 3.0;
								break;
							
						default:
						return 4.0;
							 
			 }
	 }
	  
}
