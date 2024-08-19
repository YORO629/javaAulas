/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioDependencia;

public class InstanciaPessoa{
    
import javax.swing.JOptionPane;

     public class InstanciaPessoa
     {
          public static void main (String args[])
	  {
               Pessoa PES = new Pessoa();

               PES.cadastrarDadosPessoa();
       
               PES.exibirDadosPessoa();
	  }

      }
} 
