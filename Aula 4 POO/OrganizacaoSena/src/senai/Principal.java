package senai;

public class Principal {

    public static void main(String[] args) {

        // 1. Criar a Unidade
        UnidadeSenai unidade = new UnidadeSenai("SENAI Valença");

        // 2. Criar os Departamentos
        Departamento depTI = new Departamento(1, "Tecnologia da Informação", "(24) 2453-0001");
        Departamento depAdm = new Departamento(2, "Administração", "(24) 2453-0002");

        // 3. Criar os 4 Funcionários
        Funcionario f1 = new Funcionario(101, "Carlos Silva", "Desenvolvedor Java", 4500.00);
        Funcionario f2 = new Funcionario(102, "Mariana Souza", "Analista de Redes", 4200.00);
        Funcionario f3 = new Funcionario(103, "Roberto Alves", "Assistente Administrativo", 2800.00);
        Funcionario f4 = new Funcionario(104, "Fernanda Lima", "Gerente do Setor", 6000.00);

        // 4. Cadastrar 2 funcionários em cada departamento
        depTI.adicionarFuncionario(f1);
        depTI.adicionarFuncionario(f2);

        depAdm.adicionarFuncionario(f3);
        depAdm.adicionarFuncionario(f4);

        // 5. Adicionar os departamentos à unidade
        unidade.adicionarDepartamento(depTI);
        unidade.adicionarDepartamento(depAdm);

        // 6. Exibir a estrutura completa pela primeira vez
        System.out.println(">>> PRIMEIRA EXIBIÇÃO DA ESTRUTURA <<<");
        unidade.exibirEstrutura();

        // 7. Alterar o salário de um funcionário (ex: Carlos Silva com f1.setSalario)
        System.out.println(">>> ALTERANDO O SALÁRIO DE CARLOS SILVA PARA R$ 5000,00... <<<\n");
        f1.setSalario(5000.00);

        // 8. Exibir a estrutura novamente para confirmar o valor atualizado
        System.out.println(">>> ESTRUTURA APÓS A ALTERAÇÃO DO SALÁRIO <<<");
        unidade.exibirEstrutura();
    }
}