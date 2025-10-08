package Composite;

public class Main {
    public static void main(String[] args) {

        // Criando a viagem principal
        TravelExpense completeTrip = new TravelExpense();

        // --- Primeira parada: São Paulo ---
        Itinerary itinerarySaoPaulo = new Itinerary("São Paulo");
        itinerarySaoPaulo.addExpense(new FoodExpense("Almoço no restaurante", 150.00));
        itinerarySaoPaulo.addExpense(new TransportExpense("Uber para o hotel", 80.00));
        itinerarySaoPaulo.addExpense(new EntertainmentExpense("Ingresso para o museu", 200.00));

        // --- Segunda parada: Rio de Janeiro ---
        Itinerary itineraryRio = new Itinerary("Rio de Janeiro");
        itineraryRio.addExpense(new FoodExpense("Jantar na orla", 250.00));
        itineraryRio.addExpense(new TransportExpense("Metrô", 120.00));

        // Adicionando as paradas e uma despesa principal à viagem
        completeTrip.loadExpenses(
                itinerarySaoPaulo,
                itineraryRio,
                new TransportExpense("Passagem Aérea Principal", 1200.00)
        );


        // Calcular o custo total da viagem
        System.out.println("----------- INICIANDO CÁLCULO DE CUSTOS DA VIAGEM -----------");
        double custoTotal = completeTrip.calculateCost();
        System.out.println("-------------------------------------------------------------");
        System.out.println("\nCUSTO TOTAL DA VIAGEM: " + String.format("%.2f", custoTotal));
    }
}
