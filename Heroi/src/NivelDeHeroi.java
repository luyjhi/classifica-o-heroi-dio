import java.util.Scanner;

public class NivelDeHeroi {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        while(true){      
            String nome = "Magnata Cometa";     
            System.out.println("Digite o Xp do Heroi veja sua classificação ou digite um número negativo para sair):");
            int xp = sc.nextInt();
            
            if (xp < 0) {
                System.out.println("Fim de programa");
                break;
            }

            if(xp >= 1 &&  xp <= 1000){
                String nivel = "Ferro";
                System.out.printf("O Herói de nome %s está no nível de %s%n", nome, nivel);
            }
            else if (xp >= 1001 &&  xp <= 2000) {
                String nivel = "Bronze";
                System.out.printf("O Herói de nome %s está no nível de %s%n", nome, nivel);   
            } 
            else if (xp >= 2001 &&  xp <= 5000) {
                String nivel = "Prata";
                System.out.printf("O Herói de nome %s está no nível de %s%n", nome, nivel);   
            }
            else if (xp >= 5001 &&  xp <= 7000) {
                String nivel = "Ouro";
                System.out.printf("O Herói de nome %s está no nível de %s%n", nome, nivel);   
            }
            else if (xp >= 7001 &&  xp <= 8000) {
                String nivel = "Platina";
                System.out.printf("O Herói de nome %s está no nível de %s%n", nome, nivel);   
            }
            else if (xp >= 8001 &&  xp <= 9000) {
                String nivel = "Ascendente";
                System.out.printf("O Herói de nome %s está no nível de %s%n", nome, nivel);   
            }
            else if (xp >= 9001 &&  xp <= 10000) {
                String nivel = "Imortal";
                System.out.printf("O Herói de nome %s está no nível de %s%n", nome, nivel);   
            }
            else if (xp > 10000) {  
                String nivel = "Radiante";
                System.out.printf("O Herói de nome %s está no nível de %s%n", nome, nivel);   
            }
            else {
                System.out.println("Valor incorreto, digite número acima de 0.");
            }
        }

        sc.close(); 
    }
}
