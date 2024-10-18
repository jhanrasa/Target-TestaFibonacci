import javax.swing.JOptionPane;

public class TestaFibonacci {
    public static void main(String[] args) {

        // Declara as variaveis para a sequência de fibonacci
        int Numero1 = 0;
        int Numero2 = 1;
        int Auxiliar = Numero2;

        // Declara a String que vai armazenar a resposta
        String Resposta = "";

        
        // Declara e pede o número de valores a serem exibidos
        int Valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Número que deseja verificar : "));

        // Laço de repetição para calcular a sequência de fibonacci
        for (int i = 0; i != 1;) {

            Auxiliar = Numero2;
            Numero2 += Numero1;
            Numero1 = Auxiliar;
            if (Numero2 == Valor) {
                i = 1;
                Resposta = "O valor digitado faz parte da sequência de fibonacci";
            }
            if (Numero2 > Valor) {
                i = 1;
                Resposta = "O valor digitado não faz parte da sequência de fibonacci";
            }
        }
        // Imprime os números da sequência
            JOptionPane.showMessageDialog(null, Resposta);
    }
}
