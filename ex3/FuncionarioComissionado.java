package ex3;
public class FuncionarioComissionado extends Funcionario {

    private double porcentagemComiss;
    private double valorEmVendas;
    private double salFunc;

    public FuncionarioComissionado(String nomFunc, String cargoFunc) {
        super(nomFunc, cargoFunc);
    }

    public double getSalFunc() {
        return salFunc;
    }

    public double getPorcentagemComiss() {
        return porcentagemComiss;
    }

    public void setPorcentagemComiss(double porcentagemComiss) {
        this.porcentagemComiss = porcentagemComiss;
    }

    public double getValorEmVendas() {
        return valorEmVendas;
    }

    public void setValorEmVendas(double valorEmVendas) {
        this.valorEmVendas = valorEmVendas;
    }

    @Override
    public void setSalFunc(double salFunc) {
        this.salFunc = salFunc;
    }

    @Override
    public double calcSalario() {
        return (getPorcentagemComiss() * getValorEmVendas());
    }


}
