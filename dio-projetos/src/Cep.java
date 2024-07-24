public class Cep {

	private static Cep instancia = new Cep();

	private Cep() {
		super();
	}

	public static Cep getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Uberlândia";
	}
	
	public String recuperarEstado(String cep) {
		return "MG";
	}
}