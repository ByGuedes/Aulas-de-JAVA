public class Principal {
    public static void main (String[] args){
        //Criar um objeto a partir da classe piloto
        Piloto bortoleto = new Piloto();
        bortoleto.nome= "Gabriel Bortoleto";
        bortoleto.equipe = "Sauber";
        bortoleto.peso = 85f;
        bortoleto.vitorias = 0;

        //Criar o objeto Medico

        Piloto verstappen = new Piloto();
        verstappen.nome= "Verstappen";
        verstappen.equipe = "Red Bull Racing";
        verstappen.peso = 85;
        verstappen.titulos = 4;

        //Exibir os valores
        System.out.println(bortoleto.nome +"Peso: "+bortoleto.peso);
        System.out.println(bortoleto.vitorias);
        System.out.println(bortoleto);
    }
}
