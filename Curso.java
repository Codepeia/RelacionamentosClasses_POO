
import java.util.ArrayList;
public class Curso {
    private String nome;
    private ArrayList<Professor> professores = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    public void addProfessor(Professor professor){
        //professor.addCurso(this);
        professores.add(professor);  
    }
    public void imprimir(){
        System.out.println("Nome: "+getNome());
        System.out.println("Professores associados ao curso");
        for(int i = 0; i < professores.size();i++ ){
            System.out.println(" "+getProfessores().get(i).getNome());
        }
    }
   
}
