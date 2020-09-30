public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logica i = new Imediato();
		Logica f = new FilaEspera();
		
		Ticket t = new TicketBuilder().newTicket().tipoChamado("Erro").nivelUrgencia("Alto").descricao("erro ao abrir o excel").builder();
		Atendimento a = new Atendimento(t, f);
		
		a.resumo();
	}

}
