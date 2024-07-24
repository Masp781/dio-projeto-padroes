public class Facadeproject {

	public void migrarCliente(String nome, String cep) {
		String cidade = Cep.getInstancia().recuperarCidade(cep);
		String estado = Cep.getInstancia().recuperarEstado(cep);
		
		Servico.gravarCliente(nome, cep, cidade, estado);
	}
}