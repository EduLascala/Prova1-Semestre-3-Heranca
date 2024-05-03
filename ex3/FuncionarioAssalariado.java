package ex3;
public class FuncionarioAssalariado extends Funcionario {
    private double salFunc;

    public FuncionarioAssalariado(String nomFunc, String cargoFunc) {
        super(nomFunc, cargoFunc);
    }

    @Override
    public void setSalFunc(double salFunc) {
        this.salFunc = salFunc;
    }

    @Override
    public double calcSalario() {
        return salFunc;
    }

}
