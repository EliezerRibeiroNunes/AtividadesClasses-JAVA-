package ATVCarro;

public class Carro {
	
    private String Modelo;
    private String Cor;
    private int Ano;
    private String Marca;
    private double Chassi;
    private static String Proprietario;
    private float VelocidadeMaxima;
    private float VelocidadeAtual;
    private int QtdPortas;
    private String tetosolar;
    private int Marchas;
    private String cambioAutomático;
    private int combustivel;

    public Carro(String Modelo, String Cor, int Ano, String Marca, double Chassi, String Proprietário, 
    		float VelocidadeMaxima, float VelocidadeAtual, int QtdPortas, String tetosolar, int Marchas, 
    		String cambioAutomático, int combustivel, String Proprietario) {
    	
        this.Modelo=Modelo;
        this.Cor=Cor;
        this.Ano=Ano;
        this.Marca=Marca;
        this.Chassi=Chassi;
        Carro.Proprietario=Proprietario;
        this.VelocidadeMaxima=VelocidadeMaxima;
        this.VelocidadeAtual=VelocidadeAtual;
        this.QtdPortas=QtdPortas;
        this.tetosolar=tetosolar;
        this.Marchas=Marchas;
        this.cambioAutomático=cambioAutomático;
        this.combustivel=combustivel;
	}
    
    public Carro() {
	}
    //getters and setters:
    
	public String getModelo() {
    	return Modelo;
    }
    public String getCor() {
    	return Cor;
    }
    public int getAno() {
    	return Ano;
    }
    public String getMarca() {
    	return Marca;
    }
    public double getChassi() {
    	return Chassi;
    }
    public String getProprietario() {
    	return Proprietario;
    }
    public float getVelocidadeMaxima(){
    	return VelocidadeMaxima;
    }
    public float getVelocidadeAtual(){
    	return VelocidadeAtual;
    }
    public int getQtdPortas() {
    	return QtdPortas;
    }
    public String getTetosolar() {
    	return tetosolar;
    }
    public int getMarchas() {
    	return Marchas;
    }
    public String getCambioAutomático() {
    	return cambioAutomático;
    }
    public int getCombustivel() {
    	return combustivel;
    }
    //===================================
    public String setModelo() {
    	return Modelo;
    }
    public String setCor() {
    	return Cor;
    }
    public int setAno() {
    	return Ano;
    }
    public String setMarca() {
    	return Marca;
    }
    public double setChassi() {
    	return Chassi;
    }
    public String setProprietario() {
    	return Proprietario;
    }
    public float setVelocidadeMaxima(){
    	return VelocidadeMaxima;
    }
    public float setVelocidadeAtual(){
    	return VelocidadeAtual;
    }
    public int setQtdPortas() {
    	return QtdPortas;
    }
    public String setTetosolar() {
    	return tetosolar;
    }
    public int setMarchas() {
    	return Marchas;
    }
    public String setCambioAutomático() {
    	return cambioAutomático;
    }
    public int setCombustivel() {
    	return combustivel;
    }
    
    
    //methods:
    
    public void AumentaVelo(float VelocidadeAtual){
    	VelocidadeAtual= VelocidadeAtual++;  	
    }
    public void FreiaCarro(float VelocidadeAtual){
    	VelocidadeAtual= 0;  	
    }
    public void trocaMarcha(int Marcha) {
    	Marcha=Marcha++;
    }
    public void reduzMarcha(int Marcha) {
    	Marcha=Marcha--;
    }
}
