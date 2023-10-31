
public class Main {
    public static void main(String[] args) {
        
        Professor p1 = new Professor();
        Professor p2 = new Professor();
        Professor p3 = new Professor();
        
        p1.setNome("Maria");
        p2.setNome("Pedro");
        p3.setNome("Lucas");
        
        Curso c1 = new Curso();
        Curso c2 = new Curso();
        
        c1.setNome("BCC");
        c2.setNome("ADS");
        
       // c1.addProfessor(p1);
       // c1.addProfessor(p2);
       // c1.addProfessor(p3);
        
       // c2.addProfessor(p2);
       
       p1.addCurso(c1);
       
        
        c1.imprimir();
        
        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
       
    }
    
}
