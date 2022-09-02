package Ex03_NotasAlunos;

public class aluno{
    private String nome,curso;
    private int matricula, periodo;
    private float notaAV1, notaAV2, notaAE;
  

    

    //Gerar construtor automático: [ctrl+.] == Generate Constructors...(Eclipse gcuf ou Ctrl+3)

    public aluno(String nome, int matricula, int periodo, float notaAV1, float notaAV2, float notaAE, String curso) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.periodo = periodo;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAE = notaAE;
        this.curso = curso;
    }

    //Método para alterar notas

        // metodo retorno classe parametros
    public void alterarNotaAv1(float nota){
        this.notaAV1 = nota;
    }

    
    public void alterarNotaAv2(float nota){
        this.notaAV2 = nota;
    }

    
    public void alterarNotaAE(float nota){
        this.notaAE = nota;
    }

    public String avaliarAluno(){
        if((this.notaAV1+this.notaAV2)>=60)
            return "Aprovado";
        else
            return "Recuperação";
    }
    
    public String avaliarRecuperacao(){
        if(((this.notaAV1+this.notaAV2+this.notaAE)/2)>=60)
            return "Aprovado";
        else
            return "Reprovado";
    }

    public static void main(String[] args) {
        aluno aluno01;
        aluno01 = new aluno("Clebson", 873, 3, 32.5f, 49, 70,"asdva");
        System.out.println(aluno01.avaliarAluno());
        aluno01.alterarNotaAv2(26);
        System.out.println(aluno01.avaliarAluno());
        System.out.println(aluno01.avaliarRecuperacao());
    }


}
