import java.util.Scanner; 

class Main{

public static void main(String[] args){

float nota1 = 0;
float nota2 = 0;
float nota3 = 0;

float peso1 = 0;
float peso2 = 0;
float peso3 = 0;

float media = 0;

Scanner in = new Scanner(System.in); 

System.out.println("Vamos calcular a média do aluno.");

System.out.println("Informe a primeira nota:");
nota1 = in.nextFloat(); 

System.out.println("Informe o primeiro peso:");
peso1 = in.nextFloat(); 

System.out.println("Informe a segunda nota:");
nota2 = in.nextFloat(); 

System.out.println("Informe o segundo peso:");
peso2 = in.nextFloat(); 

System.out.println("Informe a terceira nota:");
nota3 = in.nextFloat(); 

System.out.println("Informe o terceiro peso:");
peso3 = in.nextFloat(); 
in.close();

media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

System.out.println("A média do aluno é: " + media);

if(media > 7){
System.out.println("O aluno foi aprovado!");  
}

if(media == 7){
System.out.println("O aluno foi aprovado!");  
}

if(media < 7){
System.out.println("O aluno não foi aprovado!");
    }
  } 
}
