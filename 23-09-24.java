
import javax.swing.JOptionPane; 

public class Addition 
{
   public static void main(String[] args)
   {

      String firstNumber = // onde tem operador de atribuição, tem declaração de variável
         JOptionPane.showInputDialog("Digie o primeiro número inteiro"); // abrir uma caixa de interação com o usuário para receber um número e armazenar
      String secondNumber =
         JOptionPane.showInputDialog("Digite o segundo número inteiro");


      int number1 = Integer.parseInt(firstNumber); // receber o número e converter de string para intenger (texto para número inteiro)
      int number2 = Integer.parseInt(secondNumber);

      int sum = number1 + number2; // recebe os dois números inteiros digitados pelo usuário e realiza a soma

      
      JOptionPane.showMessageDialog(null, "A soma é " + sum, // abre uma nova caixa de interação apenas de leitura, 
                                                                              
         "Soma de dois números inteiros", JOptionPane.PLAIN_MESSAGE);  //para informar a soma dos dois números informados pelo usuário      
   } 
}