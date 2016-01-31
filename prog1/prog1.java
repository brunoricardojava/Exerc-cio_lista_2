//Programa 1 da lista 2 Estrutura de dados
class ContaBancaria{
  //Atributos
  private String cliente;
  private int num_conta;
  private double saldo;

  //Construtor
  public ContaBancaria(String Cliente, int Num_Conta, double Saldo){
    this.cliente = Cliente;
    this.num_conta = Num_Conta;
    this.saldo = Saldo;
  }

  //Metodos
  
  void sacar(int quantia){
    if(quantia<=this.saldo) this.saldo -= quantia;
  }

  void deposito(int quantia){
    this.saldo += quantia;
  }

  void mostraDados(){
    System.out.println("Seu saldo eh: "+this.saldo);
  }

  //Métodos Set
  void setCliente(String Cliente){
    this.cliente = Cliente;
  }

  void setNum_Conta(int Num_Conta){
    this.num_conta = Num_Conta;
  }

  void setSaldo(double Saldo){
    this.saldo = Saldo;
  }

  //Métodos Get
  String getCliente(){
    return this.cliente;
  }

  int getNum_Conta(){
    return this.num_conta;
  }

  double getSaldo(){
    return this.saldo;
  }

}


class ContaPoupanca extends ContaBancaria{
  private int dia_de_rendimento;
  private double taxa;

  public ContaPoupanca(String Cliente, int Num_Conta, double Saldo, double Taxa){
    super(Cliente, Num_Conta, Saldo);
    this.taxa = Taxa;
  }
  

  void calcularNovoSaldo(double Taxa){
    super.setSaldo(super.getSaldo()+(super.getSaldo()*Taxa));
  }
}

class ContaEspecial extends ContaBancaria{
  //Atributo
  private float limite;

  //Contrutor
  public ContaEspecial(String Cliente, int Num_Conta, double Saldo, float Limite){
    super(Cliente, Num_Conta, Saldo);
    this.limite = Limite;
  }

  @Override
  void sacar(int quantia){
    if(Math.abs(super.getSaldo()-quantia)<=this.limite) super.setSaldo(super.getSaldo()-quantia);
  }
}