public class ClientPlageHoraire{
    public static void main(String[]args){
        Horaire h1 = new Horaire(12,45);
        Horaire h2 = new Horaire(13,45);
        PlageHoraire hor1 = new PlageHoraire(h1,h2);
        Horaire h3 = new Horaire(9,45);
        Horaire h4 = new Horaire(14,45);
        PlageHoraire hor2 = new PlageHoraire(h3,h4);
        System.out.println(hor1);
        System.out.println(hor1.estValide());
        System.out.println(hor1.dure());
        System.out.println(hor1.compareTo(hor2));
    }
}