package ex3;
public class FolhaDePagamento {
    public static void main(String[] args) {

        System.out.println("\n******************************************************\n");

        Funcionario funcAss = new FuncionarioAssalariado("Eduardo Mari", "Recepcionista");
        funcAss.setSalFunc(2000);
        System.out.printf("""
                - Funcionário Assalariado -
                Código do funcionário: %d
                Nome do funcionário: %s
                Cargo do funcionário: %s
                Salário total: R$ %.2f
                """, funcAss.getCodFunc(), funcAss.getNomFunc(), funcAss.getCargoFunc(), funcAss.calcSalario());

        System.out.println("\n******************************************************\n");

        Funcionario funcHor = new FuncionarioHorista("Arthur Melo", "Atendente");
        funcHor.setSalFunc(4000);
        ((FuncionarioHorista)funcHor).setHoras(45); // Usando downcasting para converter a referência da superclasse para a subclasse
        System.out.printf("""
                - Funcionário Horista -
                Código do funcionário: %d
                Nome do funcionário: %s
                Cargo do funcionário: %s
                Horas extras trabalhadas: %d
                Salário total: R$ %.2f
                """, funcHor.getCodFunc(), funcHor.getNomFunc(), funcHor.getCargoFunc(),
                ((FuncionarioHorista) funcHor).getHoras(), funcHor.calcSalario());

        System.out.println("\n******************************************************\n");

        Funcionario funcComiss = new FuncionarioComissionado("Carlos Gilberto", "Gerente em Vendas");
        funcComiss.setSalFunc(0);
        ((FuncionarioComissionado)funcComiss).setPorcentagemComiss(0.65);
        ((FuncionarioComissionado)funcComiss).setValorEmVendas(13000);
        System.out.printf("""
                - Funcionário Comissionado -
                Código do funcionário: %d
                Nome do funcionário: %s
                Cargo do funcionário: %s
                Porcentagem de comissão: %.0f%%
                Valor em vendas: R$ %.2f
                Salário total: R$ %.2f
                """, funcComiss.getCodFunc(),funcComiss.getNomFunc(), funcComiss.getCargoFunc(),
                ((FuncionarioComissionado) funcComiss).getPorcentagemComiss() * 100,
                ((FuncionarioComissionado) funcComiss).getValorEmVendas(), funcComiss.calcSalario());

        System.out.println("\n******************************************************\n");

        Funcionario funcComissAss = new FuncionarioAssalariadoComissionado("Henrique Machado", "Vendedor");
        funcComissAss.setSalFunc(3000);
        ((FuncionarioAssalariadoComissionado)funcComissAss).setPorcentagemComiss(0.3);
        ((FuncionarioAssalariadoComissionado)funcComissAss).setValorEmVendas(10000);
        System.out.printf("""
                - Funcionário Assalariado Comissionado -
                Código do funcionário: %d
                Nome do funcionário: %s
                Cargo do funcionário: %s
                Porcentagem de comissão: %.0f%%
                Valor em vendas: %.2f
                Salário fixo: R$ %.2f
                Salário total: R$ %.2f
                """, funcComissAss.getCodFunc(), funcComissAss.getNomFunc(), funcComissAss.getCargoFunc(),
                ((FuncionarioAssalariadoComissionado) funcComissAss).getPorcentagemComiss() * 100,
                ((FuncionarioAssalariadoComissionado) funcComissAss).getValorEmVendas(),
                ((FuncionarioAssalariadoComissionado) funcComissAss).getSalFunc(), funcComissAss.calcSalario());

    }
}
