package ATVCarro;

public class Proprietario {
	
	
	private String nome;
	private double CPF;
	private double RG;
	private double DDN;
	private static String Endereco;
	
	public Proprietario(String nome, double CPF, double RG, double DDN, String enderecoPro, String Endereco) {
		this.nome=nome;
		this.CPF=CPF;
		this.RG=RG;
		this.DDN=DDN;
		Proprietario.Endereco=Endereco;
	}

    public Proprietario(Object endereco) {
	}
		
	public String getNome(){
		return nome;
		
	}
	public double getCPF(){
		return CPF;
		
	}
	public double getRG() {
		return RG;
		
	}
	public double getDDN() {
		return DDN;
		
	}
	public String getEndereco(){
		return Endereco;
		
	}
	public String setNome(){
		return nome;
		
	}
	public double setCPF(){
		return CPF;
		
	}
	public double setRG(){
		return RG;
	}
	public double setDDN() {
		return DDN;
		
	}
	public String setEndereco(){
		return Endereco;
		
	}
	
	
	

}
