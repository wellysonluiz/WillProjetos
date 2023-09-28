/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wellysonluiz_recup_agenda07_ds_01;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author furby
 */
public class wellysonLuiz_Recup_agenda07_DS_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        
        Scanner Leitor = new Scanner(System.in);
        
        String[]sexos={"masculino" ,"feminino"};
    
    int n_total_masculino = 0;
    int n_total_feminino = 0;
    int contador = 0;
    
    for(int i=0;i<50;i++){
    int idade=Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade!"));
    int sexo=Integer.parseInt(JOptionPane.showInputDialog("""
                                                          Informe seu Sexo
                                                          0-Masculino
                                                          1-Feminino"""));
    
    if(sexo==0){
    JOptionPane.showMessageDialog(null,"Seu sexo é :"+sexos[sexo]);
    n_total_masculino++;
    }
    else if(sexo==1){
        JOptionPane.showMessageDialog(null,"Seu sexo é :"+sexos[sexo]);
        n_total_feminino++;
    }
contador++;
    }
double porcentagem_pesquisa0=(n_total_masculino*100.0)/contador;
    double porcentagem_pesquisa1=(n_total_feminino*100.0)/contador;
       
    
    JOptionPane.showMessageDialog(null,"Resuldado da pesquisa em porcentagem:");
    JOptionPane.showMessageDialog(null,"Masculino:"+porcentagem_pesquisa0+"%");
    JOptionPane.showMessageDialog(null,"Feminino:"+porcentagem_pesquisa1+"%");
                                                    
                                                                                                      
                                                                                                      
    
    }

    private static void elseif(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

