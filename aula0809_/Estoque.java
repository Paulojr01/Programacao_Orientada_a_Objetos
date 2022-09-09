package aula0809_;

public class Estoque {

    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    // criamos um metodo para dar baixa na quantidade atual do estoque.
    public void darBaixa(int qtde){
        if (qtde <= this.qtdAtual)
            this.qtdAtual -= qtde;
        else
          System.out.println("Impossível dar baixa no estoque");
    }

        public boolean precisaRepor(){
            if (qtdAtual <= qtdMinima)
            return true;
            
            else
                return false;     
    }

        public String mostrar() {
            return "produto: " + getNome() + "\nEstoque Atual" + getQtdAtual() + "\n Estoque minimo: " +getQtdMinima();

        }

        // dentro da classe não precisamos usar get ou set
    // os metodos são feito na classe e não na main
    // Posso ter mais de um construtor na classe
    // que chama overload de construtores
    // indentificamos um metodo com a abertura das chaves{}
    public Estoque (){

    }
    
    // construtor é o metodo que tem que ter o mesmo nome da classe
    // e é utilizado para iniciar os atributos da classe
    public Estoque (String nome, int qdtAtual, int qtdMinima){
        // so será usado quando tiver uma classe filha
        super (); 
        // this referencia os atributos da própria classe
        this.nome = nome; 
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
        // set é o metodo para alterar o valor do atributo
        // get é o metodo para retorna o coteudo do atributo
        // o set tem parametro () pois ele vai ser alterado no caso ele recebe a variavel.
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtdAtual() {
        return qtdAtual;
    }
    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }
    public int getQtdMinima() {
        return qtdMinima;
    }
    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

}


// construtor é o metodo que tem que ter o mesmo nome da classe e é utilizado para iniciar os atributos da classe