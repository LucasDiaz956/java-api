package list.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
      this.pessoaList = new ArrayList<>();
    }
  
    public void adicionarPessoa(String nome, int idade, double altura) {
      pessoaList.add(new Pessoa(nome, idade, altura));
    }
  
    public List<Pessoa> ordenarPorIdade() {
      List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
      if (!pessoaList.isEmpty()) {
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
      } else {
        throw new RuntimeException("A lista está vazia!");
      }
    }
  
    public List<Pessoa> ordenarPorAltura() {
      List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
      if (!pessoaList.isEmpty()) {
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
      } else {
        throw new RuntimeException("A lista está vazia!");
      }
    }
  
    public static void main(String[] args) {
    // Criando uma instância da classe OrdenacaoPessoas
      OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
  
      // Adicionando pessoas à lista
      ordenacaoPessoas.adicionarPessoa("Lucas", 17, 1.80);
      ordenacaoPessoas.adicionarPessoa("Neto", 18, 1.83);
      ordenacaoPessoas.adicionarPessoa("Bruno", 18, 1.79);
      ordenacaoPessoas.adicionarPessoa("Giovanna", 17, 1.65);
  
      // Exibindo a lista de pessoas adicionadas
      System.out.println(ordenacaoPessoas.pessoaList);
  
      // Ordenando e exibindo por idade
      System.out.println(ordenacaoPessoas.ordenarPorIdade());
  
      // Ordenando e exibindo por altura
      System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
