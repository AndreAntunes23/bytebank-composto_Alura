public class TestaBanco {

	public static void main(String[] args) {

		Cliente X = new Cliente();
		X.nome = "cliente 1";
		X.cpf = "111.222.333-00";
		X.profissao = "programador";
		
		Conta contaX = new Conta();
		contaX.deposita(100);
		
		//associa o cliente 'X' a conta contaDoX
		contaX.titular = X;
		System.out.println(contaX.titular.nome);
	}
}