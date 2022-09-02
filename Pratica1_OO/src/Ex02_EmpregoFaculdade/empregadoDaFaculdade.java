package Ex02_EmpregoFaculdade;

public class empregadoDaFaculdade {
  private String nome;
  private Double salario;
  private int horasAula;

    //Construtor
    empregadoDaFaculdade(String nome, Double salario, int horasAula){
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }
    
  double getGastos(){

    //Alterar o método getGastos() para somar um bônus de R 40 reais por hora /aula
    return (this.salario + (40*horasAula));
  }
  String getInfo(){
    //Alterar o método getInfo() para retornar atualizado o valor que o professor ir receber
    return "nome: "+this.nome+" | salário: "+this.getGastos();
  }
  
  public static void main(String[] args) {
      empregadoDaFaculdade emp1;
      emp1 = new empregadoDaFaculdade("Clésio Almeida ", 4400.00, 35);
      System.out.println(emp1.getInfo());
  }
}