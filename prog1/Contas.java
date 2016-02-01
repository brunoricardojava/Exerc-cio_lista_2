import java.util.Scanner;

public class Contas{
  public static void main(String args[]) {

    ContaPoupanca obj1 = new ContaPoupanca("Bruno",2015068,2000.0,0.05);

    obj1.mostraDados();

    obj1.sacar(100);

    obj1.deposito(50);

    obj1.mostraDados();

    obj1.calcularNovoSaldo();

    obj1.mostraDados();

  }
}