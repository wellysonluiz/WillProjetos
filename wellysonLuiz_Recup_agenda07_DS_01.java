/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wellysonluiz_recup_agenda7_ds_1;

import javax.swing.JOptionPane;

/**
 *
 * @author furby
 */
public class Wellysonluiz_recup_agenda7_DS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] sexos = {"masculino", "feminino"};// comando responsavel por alterar as opções de numero para escrita

        int n_total_masculino = 0; // varivel declarada como inteira , inicializada em 0 , para armazenar a quantidade de intrevistados masculinos
        int n_total_feminino = 0;// varivel declarada como inteira , inicializada em 0 , para armazenar a quantidade de intrevistados femininos
        int contador = 0;// varivel declarada como inteira , inicializada em 0 , para armazenar a quantidade de repetições do codigo
        int soma_idades = 0;// varivel declarada como inteira , inicializada em 0 , para armazenar a soma da idade dos intrevistados

        for (int i = 0; i < 50; i++) {//comando for responsavel pela repetição do codigo, variavel i iniciada em 0 e declarada como inteira, ira repetir o codigo pelo quantidade declarada
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade!")); //mensagem de comunicação com usuario pedindo para informar idade 
            int sexo = Integer.parseInt(JOptionPane.showInputDialog("""
                                                          Informe seu Sexo
                                                          0-Masculino
                                                          1-Feminino""")); // mensagem de comunicação com usuario pedindo para informar o sexo

            if (sexo == 0) {
                JOptionPane.showMessageDialog(null, "Seu sexo é :" + sexos[sexo]); //mensagem ixibida caso usuario escolha opção 0 que equivale a masculino
                n_total_masculino++;
            } else if (sexo == 1) {
                JOptionPane.showMessageDialog(null, "Seu sexo é :" + sexos[sexo]); //mensagem ixibida caso usuario escolha opção 1 que equivale a feminino
                n_total_feminino++;
            }
            contador++;

            soma_idades += idade;
        }

        double porcentagem_pesquisa0 = (n_total_masculino * 100.0) / contador;
        double porcentagem_pesquisa1 = (n_total_feminino * 100.0) / contador;
        
        //mensagem final informando a porcentagem dos sexos masculinos e femininos e media de idade dos intrevistados
        JOptionPane.showMessageDialog(null, "Resuldado da pesquisa em porcentagem:");
        JOptionPane.showMessageDialog(null, "Masculino:" + porcentagem_pesquisa0 + "%");
        JOptionPane.showMessageDialog(null, "Feminino:" + porcentagem_pesquisa1 + "%");
        JOptionPane.showMessageDialog(null, "a media de idade dos entrevistados é: " + (soma_idades / contador));

    }

    private static void elseif(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
