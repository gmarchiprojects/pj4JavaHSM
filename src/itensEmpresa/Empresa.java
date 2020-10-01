package itensEmpresa;

public class Empresa {
	protected String nomeEmpresa;
	protected String cnpjEmpresa;
	protected String dataInauguracao;
	protected String sociosEmpresa[];
	protected String filiaisEmpresa[];
	
	public Empresa(String nomeEmpresa,String cnpjEmpresa, String dataInauguracao/*, String sociosEmpresa[],String filiaisEmpresa[]*/) {
		this.nomeEmpresa = nomeEmpresa;
		this.cnpjEmpresa = cnpjEmpresa;
		this.dataInauguracao = dataInauguracao;
		/*this.sociosEmpresa = sociosEmpresa;
		this.filiaisEmpresa = filiaisEmpresa;*/
	}
	
	public void imprimirDados() {
		System.out.println("Nome da Empresa: "+nomeEmpresa+"\n"+
				"CNPJ da Empresa: "+cnpjEmpresa+"\n"+
				"Data de Inauguração da Empresa: "+dataInauguracao+"\n"
				/*"Socios da Empresa: "+sociosEmpresa+"\n"+
				"Filiais da Empresa: "+filiaisEmpresa+"\n"*/);
	}
	
	
}
