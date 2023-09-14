import model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de funcionarios que serão registrados.");
        int quantidadeFuncionarios = sc.nextInt();

        List<Funcionario> funcionariosList = new ArrayList();
        System.out.println("--------------------------------------------");
        for(int indice=0; indice<quantidadeFuncionarios; indice++){
            System.out.println();
            System.out.println("Empregado #" +(indice+1) + ":");
            System.out.print("Id: ");
            Long id = sc.nextLong();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, nome, salario);

            funcionariosList.add(funcionario);
        }
        System.out.println("Informe o id do funcinário que vai receber aumento : ");
        long funcionarioId = sc.nextLong();
        Funcionario funcionarioEncontrado = funcionariosList.stream().filter(funcionario -> funcionario.getId() == funcionarioId).findFirst().orElse(null);
        if(funcionarioEncontrado == null){
            System.out.println("Funcionario de id : "+funcionarioId+" não foi encontrado!");
        }else{
            System.out.println("Informe a porcentagem: ");
            double porcentagem = sc.nextDouble();
            funcionarioEncontrado.acrecentaSalario(porcentagem);
            for(Funcionario funcionario: funcionariosList){
                System.out.println(funcionario.getId()+" "+funcionario.getNome()+" "+funcionario.getSalario());
            }
        }

        sc.close();
        /*nomes.add("Maria");
        nomes.add("Alex");
        nomes.add("Bob");
        nomes.add("Anna");
        nomes.add("Marco");

        for(String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("----------------------------------------");
        nomes.removeIf(nome->nome.charAt(0)=='M');
        for(String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("----------------------------------------");
        System.out.println("Indice Bob: " + nomes.indexOf("Bob"));
        System.out.println("----------------------------------------");
        System.out.println("Resultados");
        List<String> resultados = nomes.stream().filter(nome->nome.charAt(0)=='A').collect(Collectors.toList());
        for(String nome: resultados){
            System.out.println(nome);
        }*/
    }
}
