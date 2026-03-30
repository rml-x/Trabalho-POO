import java.util.ArrayList;
import java.util.List;

public class Biblioteca{

    //lista de objetos livros da classe Livro
    private List<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public void emprestarLivro(String titulo){
        for(Livro livro : this.livros){
            if(livro.getTitulo().equals(titulo)){
                if(livro.isDisponivel()){
                    livro.setDisponivel(false);
                    System.out.println(titulo + " foi emprestado");
                } else {
                    System.out.println(titulo + " não está disponível");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }

    public void devolverLivro(String titulo){
        for(Livro livro : this.livros){
            if(livro.getTitulo().equals(titulo)){
                if(!livro.isDisponivel()){
                    livro.setDisponivel(true);
                    System.out.println(titulo + " foi devolvido");
                } else {
                    System.out.println(titulo + " já estava disponível");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado");
    }

    public void listarLivros() {
        if (this.livros.isEmpty()) {
            System.out.println("A biblioteca está vazia!");
        } else {
            System.out.println("=== LIVROS DA BIBLIOTECA ===");
            for (int i = 0; i < this.livros.size(); i++) {
                Livro livro = this.livros.get(i);
                System.out.println((i + 1) + ". " + livro.getTitulo() + 
                                 " - Autor: " + livro.getAutor() + 
                                 " | Disponível: " + livro.isDisponivel());
            }
        }
    }

    public List<Livro> getLivros() {
        return this.livros;
    }
}

class Livro{

    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor, boolean disponivel) {
		this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; 
	}


    //setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    //getters
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public boolean isDisponivel(){
        return this.disponivel;
    }
}