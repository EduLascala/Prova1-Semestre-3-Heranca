package ex3;
public abstract class Funcionario {

    private static int codFunc;
    private String nomFunc;
    private String cargoFunc;

    public Funcionario(String nomFunc, String cargoFunc) {
        codFunc++;
        this.nomFunc = nomFunc;
        this.cargoFunc = cargoFunc;
    }

    public abstract void setSalFunc(double salFunc);
    public abstract double calcSalario();

    public int getCodFunc() {
        return codFunc;
    }

    public String getNomFunc() {
        return nomFunc;
    }

    public String getCargoFunc() {
        return cargoFunc;
    }

}
