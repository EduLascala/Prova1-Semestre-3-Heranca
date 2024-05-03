package ex1;

public class FuncionarioAssalariado extends Funcionario{

    private double salFunc;

    public FuncionarioAssalariado(String nomFunc, String cargoFunc, int codFunc) {
        super(nomFunc, cargoFunc, codFunc);
    }

    public void setSalFunc(double salFunc) {
        this.salFunc = salFunc;
    }

    public double getSalFunc() {
        return salFunc;
    }
}
