public class ProgramaPrincipal {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,3,1);
        l[1] = new Lutador("Putyscript","Brasil",29,1.68f,57.9f,14,2,3);
        l[2] = new Lutador("Bill","Mervas",56,1.68f,57.9f,5,5,5);
        l[3] = new Lutador("Poww","Fuzakstão",50,1.68f,57.9f,7,2,3);
        l[4] = new Lutador("Capacete","New Iork",22,1.68f,57.9f,44,2,3);
        l[5] = new Lutador("Mc. Cress","Inglaterra",15,1.68f,57.9f,4,2,3);
        l[5].apresentar(); //apresenta o lutador 
        l[5].status(); //Imprime o status do lutador 6 da lista com o que ele ganhou,perdeu e empatou

      
    }
}
