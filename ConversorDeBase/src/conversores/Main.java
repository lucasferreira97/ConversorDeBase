package conversores;

import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args)throws Exception{
        String opStr;
        int op;
        
        opStr = JOptionPane.showInputDialog(null, "Escolha a Opção de base de entrada:\n"
                + "1 - Binario\n"
                + "2 - Hexadecimal\n"
                + "3 - Octal\n"
                + "4 - Decimal\n");
        
        op = Integer.parseInt(opStr);
        
        switch(op){
            case 1 :
                String numBin = JOptionPane.showInputDialog(null, "Informe o Valor em Binario: ");
                JOptionPane.showMessageDialog(null, "Valor Informado: " + numBin 
                        + "\nValor Hex: \t" + Conversor.binToHex(numBin)
                        + "\nValor Oct: \t" + Conversor.binToOct(numBin)
                        + "\nValor Dec: \t" + Conversor.binToDec(numBin));
                break;
            case 2 :
                String numHex = JOptionPane.showInputDialog(null, "Informe o Valor em String: ");
                JOptionPane.showMessageDialog(null, "Valor Informado: " + numHex 
                        + "\nValor Bin: \t" + Conversor.hexToBin(numHex)
                        + "\nValor Oct: \t" + Conversor.hexToOct(numHex)
                        + "\nValor Dec: \t" + Conversor.hexToDec(numHex));
                break;
            case 3 :
                String numOct = JOptionPane.showInputDialog(null, "Informe o Valor em Octal: ");
                JOptionPane.showMessageDialog(null, "Valor Informado: " + numOct 
                        + "\nValor Bin: \t" + Conversor.octToBin(numOct)
                        + "\nValor Hex: \t" + Conversor.octToHex(numOct)
                        + "\nValor Dec: \t" + Conversor.octToDec(numOct));
                Conversor.octToHex(numOct);
                Conversor.octToBin(numOct);
                Conversor.octToDec(numOct);
                break;
            case 4 :
                int numDec = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Valor em Decimal: "));
                JOptionPane.showMessageDialog(null, "Valor Informado: " + numDec 
                        + "\nValor Bin: \t" + Conversor.decToBin(numDec)
                        + "\nValor Hex: \t" + Conversor.decToHex(numDec)
                        + "\nValor Oct: \t" + Conversor.decToOct(numDec));
                break;
            default:
                throw new Exception("Opção Inválida");
                
        }
    }
           
}
