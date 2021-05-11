package ATVCarro;

public class Endereco {

	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private double CEP;
	private String comple;
	
	public Endereco(String rua, String bairro, String cidade, String estado, double CEP, String comple) {
		this.rua=rua;
		this.bairro=bairro;
		this.cidade=cidade;
		this.estado=estado;
		this.CEP=CEP;
		this.comple=comple;
	}
	
	public Endereco() {
	}
	public String getRua(){
		return rua;
		
	}
	public String getBairro(){
		return bairro;
		
	}
	public String getCidade(){
		return cidade;
		
	}
	public String getEstado(){
		return estado;
		
	}
	public double getCEP(){
		return CEP;
		
	}
	public String getComple(){
		return comple;
	}
	
	public String setRua(){
		return rua;
		
	}
	public String setBairro(){
		return bairro;
		
	}
	public String setCidade(){
		return cidade;
		
	}
	public String setEstado(){
		return estado;
		
	}
	public double setCEP(){
		return CEP;
		
	}
	public String setComple(){
		return comple;
	}
	
}


