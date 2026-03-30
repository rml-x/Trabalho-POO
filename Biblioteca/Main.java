public class Main {
    public static void main(String[] args) {
        System.out.println("========== TESTES DA BIBLIOTECA ==========\n");

        // 1. Criar biblioteca vazia
        System.out.println("✅ Teste 1: Criar biblioteca vazia");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.listarLivros(); // Deve mostrar "vazia"
        System.out.println();

        // 2. Adicionar livros
        System.out.println("✅ Teste 2: Adicionar 3 livros");
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", true);
        Livro livro2 = new Livro("O Cortiço", "Aluísio Azevedo", true);
        Livro livro3 = new Livro("Grande Sertão Veredas", "Guimarães Rosa", true);
        
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        System.out.println("3 livros adicionados!");
        System.out.println();

        // 3. Listar livros disponíveis
        System.out.println("✅ Teste 3: Listar livros disponíveis");
        biblioteca.listarLivros();
        System.out.println();

        // 4. Emprestar um livro
        System.out.println("✅ Teste 4: Emprestar 'Dom Casmurro'");
        biblioteca.emprestarLivro("Dom Casmurro");
        System.out.println("Disponível após empréstimo? " + livro1.isDisponivel()); // Deve ser false
        System.out.println();

        // 5. Tentar emprestar livro que já foi emprestado
        System.out.println("✅ Teste 5: Tentar emprestar 'Dom Casmurro' novamente");
        biblioteca.emprestarLivro("Dom Casmurro"); // Deve falar que não está disponível
        System.out.println();

        // 6. Devolver livro
        System.out.println("✅ Teste 6: Devolver 'Dom Casmurro'");
        biblioteca.devolverLivro("Dom Casmurro");
        System.out.println("Disponível após devolução? " + livro1.isDisponivel()); // Deve ser true
        System.out.println();

        // 7. Tentar emprestar livro inexistente
        System.out.println("✅ Teste 7: Tentar emprestar livro inexistente");
        biblioteca.emprestarLivro("livro que não existe");
        System.out.println();

        // 8. Listar livros novamente (todos disponíveis)
        System.out.println("✅ Teste 8: Listar novamente");
        biblioteca.listarLivros();
        System.out.println();

        // 9. Emprestar 2 livros
        System.out.println("✅ Teste 9: Emprestar 2 livros");
        biblioteca.emprestarLivro("O Cortiço");
        biblioteca.emprestarLivro("Grande Sertão Veredas");
        System.out.println();

        // 10. Listar livros com alguns emprestados
        System.out.println("✅ Teste 10: Listar (com empréstimos)");
        biblioteca.listarLivros();
        System.out.println();

        System.out.println("========== FIM DOS TESTES ==========");
    }
}
