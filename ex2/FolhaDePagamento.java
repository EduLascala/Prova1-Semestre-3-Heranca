package ex2;

public class FolhaDePagamento {

    public static void main(String[] args) {
        System.out.print("\n********************************************************************************\n");

        FuncionarioAssalariado funcAss = new FuncionarioAssalariado("Eduardo Mari", "Atendente", 1);
        funcAss.setSalFunc(2200);
        System.out.printf("""
                Nome do funcionário: %s
                Cargo: %s
                Código: %d
                Salário fixo: R$ %.2f
                """, funcAss.getNomFunc(), funcAss.getCargoFunc(), funcAss.getCodFunc(), funcAss.getSalFunc());

        System.out.println("\n********************************************************************************\n");

        FuncionarioHorista funcHor = new FuncionarioHorista("Arthur Melo", "Supervisor", 2);
        funcHor.setSalFunc(4000);
        funcHor.setHorasExtras(5);
        funcHor.setTaxaHoras((funcHor.getSalFunc()) / 160);
        funcHor.calcSalTotal();
        System.out.printf("""
                        Nome do funcionário: %s
                        Cargo: %s
                        Código: %d
                        Salário fixo: R$ %.2f
                        Horas extras trabalhadas: %.2f horas
                        Ganho por hora trabalhada extra: R$ %.2f
                        Salário Total: R$ %.2f
                        """, funcHor.getNomFunc(), funcHor.getCargoFunc(), funcHor.getCodFunc(),
                funcHor.getSalFunc(), funcHor.getHorasExtras(), funcHor.getTaxaHoras(), funcHor.calcSalTotal());

        System.out.println("\n********************************************************************************\n");

        FuncionarioComissionado funcComi = new FuncionarioComissionado("Henrique Machado", "Vendedor", 3);
        funcComi.setPorcentagemVendas(40);
        funcComi.setValorTotalVendas(10000);
        System.out.printf("""
                Nome do funcionário: %s
                Cargo: %s
                Código: %d
                Porcentagem recebido por venda: %.2f%%
                Valor total em vendas: R$ %.2f
                Comissão: R$ %.2f
                """, funcComi.getNomFunc(), funcComi.getCargoFunc(), funcComi.getCodFunc(), funcComi.getPorcentagemVendas(), funcComi.getValorTotalVendas(), funcComi.getComissao());

        System.out.println("\n********************************************************************************\n");

        FuncionarioAssalariadoComissionado funcComiAss = new FuncionarioAssalariadoComissionado("Vitor Hugo", "Gerente em vendas", 4);
        funcComiAss.setSalarioFixo(4000);
        funcComiAss.setPorcentagemVendas(15);
        funcComiAss.setValorTotalVendas(8000);
        System.out.printf("""
                Nome do funcionário: %s
                Cargo: %s
                Código: %d
                Porcentagem recebido por venda: %.2f%%
                Valor total em vendas: R$ %.2f
                Comissão: R$ %.2f
                Salário Fixo: R$ %.2f
                Salário Total: R$ %.2f
                """, funcComiAss.getNomFunc(), funcComiAss.getCargoFunc(), funcComiAss.getCodFunc(), funcComiAss.getPorcentagemVendas(), funcComiAss.getValorTotalVendas(), funcComiAss.getComissao(), funcComiAss.getSalarioFixo(), funcComiAss.getSalarioTotal());

    }
}
