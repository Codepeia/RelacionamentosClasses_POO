
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        //CRIAR LISTAS ATRAVES DE ARRAYLISTS E MANIPULAÇÃO DOS METODOS DISPONIBILIZADOS PELA CLASSE
        ArrayList<Double> notas = new ArrayList<>();
        System.out.println(notas.isEmpty());
        
        notas.add(10.0);
        notas.add(9.0);
        notas.add(7.0);
        notas.size();
        
        notas.add(0, 5.0);
        notas.set(0, 100.0);
        
        notas.remove(0);
     
        for(int i = 0; i < notas.size(); i++ ){
            System.out.println(notas.get(i));
        }
        //RELACIONAMENTO 1 PARA 1
        Pessoa p1 = new Pessoa();
        Endereco end = new Endereco();
        
        p1.setNome("Maria");

        end.setCidade("BSB");
        end.setRua("CSB");
        p1.setEnd(end);//ATRIBUÇÃO DO OBJETO ENDERECO AO OBJETO PESSOA
        
        System.out.println("Pessoa: "+p1.getNome()+
                            "\nEndereco: "+p1.getEnd().getCidade()+
                               "\nCep: "+p1.getEnd().getRua());
       

       //RELACIONAMENTO UM PARA MUITOS
       Pessoa p2 = new Pessoa();
       ArrayList<Telefone> telefones = new ArrayList<>();
       
       Telefone t1 = new Telefone();
       Telefone t2 = new Telefone();
       Telefone t3 = new Telefone();
       
       t1.setNum("123");
       t2.setNum("223");
       t3.setNum("323");
       
       p2.setNome("Ana");
       
       telefones.add(0, t1);
       telefones.add(1, t2);
       telefones.add(2, t3);
       
       p2.setTelefones(telefones);
       p2.imprimirPessoa();     
    }
    
}
