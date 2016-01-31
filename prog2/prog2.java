class animal{
	//Atributos
	private String nome;
	private String cor;
	private String ambiente;
	private int comprimento;
	private double velocidade;
	private int patas = 4;

	//Construtor
	public animal(String Nome, String Cor, String Ambiente, int Comprimento, double Velocidade, int Patas){
		this.nome = Nome;
		this.cor = Cor;
		this.ambiente = Ambiente;
		this.comprimento = Comprimento;
		this.velocidade = Velocidade;
		this.patas = Patas;
	}

	//Métodos Set
	void setNome(String Nome){
		this.nome = Nome;
	}

	void setComprimento(int Comprimento){
		this.comprimento = Comprimento;
	}

	void setPatas(int Patas){
		this.patas = Patas;
	}

	void setCor(String Cor){
		this.cor = Cor;
	}

	void setAmbiente(String Ambiente){
		this.ambiente = Ambiente;
	}

	void setVelocidade(double Velocidade){
		this.velocidade = Velocidade;
	}

	//Métodos Get
	String getNome(){
		return this.nome;
	}

	int getComprimento(){
		return this.comprimento;
	}

	int getPatas(){
		return this.patas;
	}

	String getCor(){
		return this.cor;
	}

	String getAmbiente(){
		return this.ambiente;
	}

	double getVelocidade(){
		return this.velocidade;
	}

	//Método para mostrar dados
	void mostraInfo(){
		System.out.println("------------------------------");
		System.out.println("Nome do animal: "+this.nome);
		System.out.println("Comprimento: "+this.comprimento);
		System.out.println("Quantidade de patas: "+this.patas);
		System.out.println("A cor do animal eh: "+ this.cor);
		System.out.println("Ambinete: "+this.ambiente);
		System.out.println("Sua velocidade eh: "+ this.velocidade);
	}

}

class peixe extends animal{
	String caracteristica;

	peixe(String Nome, String Cor, String Ambiente, int Comprimento, double Velocidade, int Patas, String Caracteristica){
		super(Nome, Cor = "Cinzenta", Ambiente = "Mar", Comprimento, Velocidade, Patas = 0);
		this.caracteristica = Caracteristica;
	}

	void setCaracteristica(String Caracteristica){
		this.caracteristica = Caracteristica;
	}

	String getCaracteristica(){
		return this.caracteristica;
	}

	@Override
	void mostraInfo(){
		System.out.println("------------------------------");
		System.out.println("Nome do animal: "+super.getNome());
		System.out.println("Comprimento: "+super.getComprimento());
		System.out.println("Quantidade de patas: "+super.getPatas());
		System.out.println("A cor do animal eh: "+ super.getCor());
		System.out.println("Ambinete: "+super.getAmbiente());
		System.out.println("Sua velocidade eh: "+ super.getVelocidade());
		System.out.println("Cracteristica(s): "+ this.caracteristica);
	}

}

class mamifero extends animal{
	private String alimento;

	mamifero(String Nome, String Cor, String Ambiente, int Comprimento, double Velocidade, int Patas, String Alimento){
		super(Nome, Cor, Ambiente = "Terra", Comprimento, Velocidade, Patas);
		this.alimento = Alimento;
	}

	void setAlimento(String Alimento){
		this.alimento = Alimento;
	}

	String alimento(){
		return this.alimento;
	}

	@Override
	void mostraInfo(){
		System.out.println("------------------------------");
		System.out.println("Nome do animal: "+super.getNome());
		System.out.println("Comprimento: "+super.getComprimento());
		System.out.println("Quantidade de patas: "+super.getPatas());
		System.out.println("A cor do animal eh: "+ super.getCor());
		System.out.println("Ambinete: "+super.getAmbiente());
		System.out.println("Sua velocidade eh: "+ super.getVelocidade());
		System.out.println("Alimento: "+ this.alimento);
	}

}