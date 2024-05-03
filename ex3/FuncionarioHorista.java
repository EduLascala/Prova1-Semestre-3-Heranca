package ex3;
public class FuncionarioHorista extends FuncionarioAssalariado {
    private double salFunc;
    private int horas;

    public FuncionarioHorista(String nomFunc, String cargoFunc) {
        super(nomFunc, cargoFunc);
    }

    public double getSalFunc() {
        return salFunc;
    }

    @Override
    public void setSalFunc(double salFunc) {
        this.salFunc = salFunc;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public double calcSalario() {
        double dinheiroPorHora = getSalFunc()/160;

        if (getHoras() > 40) {
           return (this.getSalFunc() + (dinheiroPorHora * 1.5 * (getHoras() - 40)));
       } else {
           return this.getSalFunc();
       }
       }

}
