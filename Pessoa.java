/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicioDependencia;
/**
 *
 * @author Aluno
 */
    import javax.swing.JOptionPane;
 
     public class Pessoa
     {  
        public static void main(String[] args) {
           
            Pessoa Pe = new Pessoa();
           
	String nome, cpf, endereço, cep, bairro, númeroContato, sexo; //atributos

	void cadastrarDadosPessoa(){				      // método cadastrarDadosPessoa

	  nome = JOptionPane.showInputDialog("Digite seu nome");
	  cpf  = JOptionPane.showInputDialog("Digite seu cpf");
	  sexo = JOptionPane.showInputDialog("Digite seu sexo");
	  endereço = JOptionPane.showInputDialog("Digite seu endereço");
	  cep      = JOptionPane.showInputDialog("Digite o CEP");
	  bairro   = JOptionPane.showInputDialog("Digite o bairro");
	  númeroContato = JOptionPane.showInputDialog("Digite seu número de Contato");	   

	}
	void exibirDadosPessoa(){ 				      // método exibirDadosPessoa

	  JOptionPane.showMessageDialog(null,"DADOS PESSOAIS\n"+
					     "=====================\n"+
					     "NOME : "+nome+"\n"+
					     "CPF  : "+cpf+"\n"+
					     "SEXO : "+sexo+"\n"+
					     "=====================\n"+
					     "ENDEREÇO :"+endereço+"\n"+
					     "CEP      : "+cep+"\n"+
					     "BAIRRO   : "+bairro+"\n"+
					     "CONTATO  : "+númeroContato);  

	}
            System.out.println("executando codigo"); }
     }