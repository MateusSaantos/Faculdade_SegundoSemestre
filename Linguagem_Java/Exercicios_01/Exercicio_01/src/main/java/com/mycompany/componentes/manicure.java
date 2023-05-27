import java.util.Scanner;

public class manicure {
        
    //Variaveis
    private String nome;
    private double pes;
    private double maos;
    private double podologia;
    private double valor;

    //Construtores
    public manicure(){

    }

    public manicure(String nome, double pes, double maos, double podologia, double valor){
        this.nome = nome;
        this.pes = pes;
        this.maos = maos;
        this.podologia = podologia;
        this.valor = valor;
    }

    //Metodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public double getMaos() {
        return maos;
    }

    public void setMaos(double maos) {
        this.maos = maos;
    }

    public double getPodologia() {
        return podologia;
    }

    public void setPodologia(double podologia) {
        this.podologia = podologia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    //Metodo Cadastrar Manicure
    public void cadastrarManicure(){
        Scanner ler = new Scanner(System.in);
        manicure m = new manicure();

        //Variaveis
        String nome;
        double pes;
        double maos;
        double podologia;
        double valor;

        //Leitura dos dados
        System.out.println("==== CADASTRO DE MANICURE ====");
        
        System.out.println("NOME: ");
        nome = ler.nextLine();
        m.setNome(nome);
        
        System.out.println("VALOR MÃOS: ");
        maos = ler.nextDouble();
        m.setMaos(maos);

        System.out.println("VALOR PES: ");
        pes = ler.nextDouble();
        m.setPes(pes);

        System.out.println("VALOR PODOLOGIA: ");
        podologia = ler.nextDouble();
        m.setPodologia(podologia);

        m.setValor(m.calculaValor(m.getPes(), m.getMaos(), m.getPodologia()));
    }
    
    public double calculaValor(double pes, double maos, double podologia){
        //Variaveis
        double valor;

        //Operação
        valor = (pes + maos + podologia) * 0.50;

        //Retorno
        return valor;
    }
}
