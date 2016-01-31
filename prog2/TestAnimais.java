import java.util.Scanner;

public class TestAnimais{
  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o numero de animais(menor que 10): ");
    int quantidadeAnimal = scanner.nextInt();
    int num_max_obj = 0;
    //Permitindo no maximo 10  objetos por classe
    if(quantidadeAnimal<=10){
      num_max_obj = quantidadeAnimal;
    } 

    animal camelo[] = new animal[num_max_obj];
    animal tubarao[] = new peixe[num_max_obj];
    animal urso[] = new mamifero[num_max_obj];

    //instanciando os animais
    for(int i = 0; i< num_max_obj; i++){

    camelo[i] = new animal("Camelo","Amarelo","Terra",150,2,4);
    tubarao[i] = new peixe("Tubarao","Cinzento","Mar",300,1.5,0,"Barbatanas e cauda");
    urso[i] = new mamifero("urso_do_canada","Vermelho","Terra",180,0.5,4,"Mel");

    } 

    //mustrando informações 

    for(int i = 0; i<num_max_obj; i++){

    camelo[i].mostraInfo();
    tubarao[i].mostraInfo();
    urso[i].mostraInfo();

    } 
  }
}