package ex2;

public class FuncionarioComissionado extends Funcionario {

    private double valorTotalVendas;
    private double porcentagemVendas;

    public FuncionarioComissionado(String nomFunc, String cargoFunc, int codFunc) {
        super(nomFunc, cargoFunc, codFunc);
    }

    public double getComissao() {
        return (getPorcentagemVendas() / 100) * getValorTotalVendas();
    }

    public void setValorTotalVendas(double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }

    public void setPorcentagemVendas(double porcentagemVendas) {
        this.porcentagemVendas = porcentagemVendas;
    }

    public double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public double getPorcentagemVendas() {
        return porcentagemVendas;
    }
}
