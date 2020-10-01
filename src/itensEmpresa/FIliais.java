package itensEmpresa;

public class FIliais extends Empresas{
	protected String nomeEmpresa;
	protected String cnpjEmpresa;
	protected String dataInauguracao;
	protected String sociosEmpresa[];
	protected String filiaisEmpresa[];
	
	public FIliais(String nomeEmpresa,String cnpjEmpresa, String dataInauguracao) {
		this.nomeEmpresa = nomeEmpresa;
		this.cnpjEmpresa = cnpjEmpresa;
		this.dataInauguracao = dataInauguracao;
	}
	
	public void imprimirDados() {
		System.out.println("Nome da Empresa: "+nomeEmpresa+"\n"+
				"CNPJ da Empresa: "+cnpjEmpresa+"\n"+
				"Data de Inauguração da Empresa: "+dataInauguracao+"\n"
				/*"Socios da Empresa: "+sociosEmpresa+"\n"+
				"Filiais da Empresa: "+filiaisEmpresa+"\n"*/);
	}
	
	
}
