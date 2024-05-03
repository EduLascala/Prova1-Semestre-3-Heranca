package ex1;

public abstract class Funcionario {
    private String nomFunc;
    private String cargoFunc;
    private int codFunc;

    public Funcionario(String nomFunc, String cargoFunc, int codFunc) {
        this.nomFunc = nomFunc;
        this.cargoFunc = cargoFunc;
        this.codFunc = codFunc;
    }

    public String getNomFunc() {
        return nomFunc;
    }

    public String getCargoFunc() {
        return cargoFunc;
    }

    public int getCodFunc() {
        return codFunc;
    }
}
