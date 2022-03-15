public class ClientPlanningCollections {
    public static void main(String[]args){
        PlanningCollections test= new PlanningCollections();
        test.ajout(new Reservation("Tâche 1", new DateCalendrier(21,06,2022), new PlageHoraire(new Horaire(14, 30),new Horaire(15, 30))));
        test.ajout(new Reservation("Tâche 2", new DateCalendrier(24,06,2022), new PlageHoraire(new Horaire(14, 30),new Horaire(15, 30))));
        test.ajout(new Reservation("Tâche 3", new DateCalendrier(23,06,2022), new PlageHoraire(new Horaire(14, 15),new Horaire(17, 30))));
        System.out.println(test);
        System.out.println(test.getReserv(new DateCalendrier(23,06,2022)));
        System.out.println(test.getReserv("Tâche 2"));
        
    }
}