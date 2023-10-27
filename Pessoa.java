
import java.util.ArrayList;


public class Pessoa {

      
    private String nome;
    private Endereco end;
    private ArrayList<Telefone> telefones;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
    
    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    public void imprimirPessoa(){
        System.out.println("Nome: "+getNome());
        System.out.println("Telefones:");
        for(int i = 0 ; i < getTelefones().size(); i++){
            System.out.println(getTelefones().get(i).getNum());
        }
    }

    
    
}
