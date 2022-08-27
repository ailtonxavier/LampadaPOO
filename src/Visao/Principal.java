package Visao;
import Dominio.Lampada;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int op;
        Scanner teclado = new Scanner(System.in);
        Lampada l1 = new Lampada(); //instanciando um objeto na memória

        do {


            System.out.println("MENU");
            System.out.println("1 - ligar");
            System.out.println("2 - desligar");
            System.out.println("3 - A lampada esta ligada?");
            System.out.println("4 - verificar potencia");
            System.out.println("5 - Alterar potencia");
            System.out.println("-------------------------");
            System.out.println("6 - sair");
            op = teclado.nextInt();

            switch(op) {
                case 1:
                    l1.ligar();
                    break;
                case 2:
                    l1.desligar();
                    break;
                case 3:
                    System.out.println("A lampada esta ligada: " + l1.estaligada());
                    break;
                case 4:
                    System.out.println("Potencia da lampada: " + l1.verificarPotencia());
                    break;
                case 5:
                    System.out.println("Qual a nova potencia?");
                    l1.alterarPotencia(teclado.nextInt());
                    break;
                }
        }while(op != 6);
    }
}
