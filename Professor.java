
import java.util.ArrayList;

public class Professor {
    private String nome;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso){
        curso.addProfessor(this);
        cursos.add(curso);
    }
    public void imprimir(){
        System.out.println("Nome: "+getNome());
        System.out.println("Cursos");
        for(int i = 0; i < cursos.size(); i++){
            System.out.println(" "+getCursos().get(i).getNome());
        }
    }
    
}
