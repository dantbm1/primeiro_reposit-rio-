import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        int xp; 
        try (Scanner scanner = new Scanner(System.in)){  
            System.out.println("digite o nome do seu heroi");
            nome = scanner.nextLine();
            System.out.println("quanto xp voce tem(1-10)");
            xp = scanner.nextInt();

            if (xp < 1 ) { System.out.println("o heroi " + nome + " danielesta no nivel de Ferro");     
            }
            else if (xp <= 2 ) {System.out.println("o heroi " + nome + " esta no nivel de Broze");
            }
            else if (xp <= 5) {System.out.println("o heroi " + nome + " esta no nivel de Prata");
                
            } else if (xp <= 7 ) {System.out.println("o heroi " + nome + " esta no nivel de Ouro");
                
            }else if (xp <= 8) {System.out.println("o heroi " + nome + " esta no nivel de Platina");
                
            }else if (xp <= 9 ) {System.out.println("o heroi " + nome + " esta no nivel de Ascendete");
                
            }else if (xp <= 10 ) {System.out.println("o heroi " + nome + " esta no nivel de imortal");
                
            }else {System.out.println("o heroi " + nome + "esta no nivel de radiante ");
                
            }
        }
        
    }
}
