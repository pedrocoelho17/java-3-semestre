import javax.swing.JOptionPane;

public class Idade {
    
    public static void main(String[] args) {
        String idade = JOptionPane.showInputDialog("Qual a sua idade?");

        int resposta = Integer.parseInt(idade);
        
        if (resposta >= 18){
            JOptionPane.showMessageDialog(null, "Você é maior de idade!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Você é menor de idade!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

