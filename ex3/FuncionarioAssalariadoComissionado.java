package ex3;
public class FuncionarioAssalariadoComissionado extends FuncionarioComissionado {

    public FuncionarioAssalariadoComissionado(String nomFunc, String cargoFunc) {
        super(nomFunc, cargoFunc);
    }

    @Override
    public double getPorcentagemComiss() {
        return super.getPorcentagemComiss();
    }

    @Override
    public void setPorcentagemComiss(double porcentagemComiss) {
        super.setPorcentagemComiss(porcentagemComiss);
    }

    @Override
    public double getValorEmVendas() {
        return super.getValorEmVendas();
    }

    @Override
    public void setValorEmVendas(double valorEmVendas) {
        super.setValorEmVendas(valorEmVendas);
    }

    @Override
    public void setSalFunc(double salFunc) {
        super.setSalFunc(salFunc);
    }

    @Override
    public double getSalFunc() {
        return super.getSalFunc();
    }

    @Override
    public double calcSalario() {
        return super.calcSalario() + getSalFunc();
    }
}
