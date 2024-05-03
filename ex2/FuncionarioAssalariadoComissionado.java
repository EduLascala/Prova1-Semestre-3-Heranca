package ex2;

public class FuncionarioAssalariadoComissionado extends FuncionarioComissionado {
    private double salarioFixo;

    public FuncionarioAssalariadoComissionado(String nomFunc, String cargoFunc, int codFunc) {
        super(nomFunc, cargoFunc, codFunc);
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioTotal() {
        return salarioFixo + super.getComissao();
    }
}
