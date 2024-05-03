package ex1;

public class FuncionarioHorista extends Funcionario{
    private double salFunc;
    private double horasExtras;
    private double taxaHoras;


    public FuncionarioHorista(String nomFunc, String cargoFunc, int codFunc) {
        super(nomFunc, cargoFunc, codFunc);
    }

    public void setSalFunc(double salFunc) {
        this.salFunc = salFunc;
    }

    public double getSalFunc() {
        return salFunc;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void setTaxaHoras(double taxaHoras) {
        this.taxaHoras = taxaHoras;
    }

    public double getTaxaHoras() {
        return taxaHoras;
    }

    public double calcSalTotal () {
        if ((getHorasExtras() + 40) > 40) {
            return getSalFunc() + (getHorasExtras() * getTaxaHoras() * 1.5);
        } else {
            return getSalFunc();
        }
    }
}
