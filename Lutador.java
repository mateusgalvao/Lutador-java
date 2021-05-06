public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    //metodos especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    //get set inicio
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        this.nome = no;
    }
  
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int id) {
        this.idade = id;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        this.altura = al;
    }
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }
    public float getPeso() {
        return peso;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if(this.peso<52){
            this.categoria = "Inválido";
        }
        else if (this.peso<=70.3){
            this.categoria = "Leve";
            }
        else if (this.peso<=93){
            this.categoria = "Médio";
        }
        else if (this.peso <=120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int em) {
        this.empates = em;
    }
    //set e get fim
    //metodos

    public void apresentar(){
        System.out.println("-------------------------------------");
        System.out.println("Lutador "  + this.getNome());
        System.out.println("-------------------------------------");
        System.out.println("Origem "  + this.getNacionalidade());
        System.out.println("-------------------------------------");
        System.out.println(this.getIdade() + " anos");
        System.out.println("-------------------------------------");
        System.out.println(this.getAltura() + "m de altura");
        System.out.println("-------------------------------------");
        System.out.println("Pesando " + this.getPeso());
        System.out.println("-------------------------------------");
        System.out.println("Ganhou " + this.getVitorias());
        System.out.println("-------------------------------------");
        System.out.println("Perdeu " + this.getDerrotas());
        System.out.println("-------------------------------------");
        System.out.println("Empatou " + this.getEmpates());
        System.out.println("-------------------------------------");

    }
    public void status(){
        System.out.println("Lutador "  + this.getNome() +" é um peso " + this.getCategoria());
        System.out.println("=====================================");
        System.out.println("Ganhou "+ this.getVitorias());
        System.out.println("=====================================");
        System.out.println("Perdeu " + this.getDerrotas());
        System.out.println("=====================================");
        System.out.println("Empatou " + this.getEmpates());
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}

