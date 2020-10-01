public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logica i = new Imediato();
		Logica f = new FilaEspera();
		
		Ticket t = new TicketBuilder().newTicket().tipoChamado("Hardware").nivelUrgencia("Alto").descricao("Disk partition 1 corrupted!").builder();
		Atendimento a = new Atendimento(t, i);
		
		Ticket t1 = new TicketBuilder().newTicket().tipoChamado("Software").nivelUrgencia("Baixo").descricao("Erro 2 ao abrir Excel").builder();
		Atendimento a1 = new Atendimento(t1, f);
		System.out.println("------------------------------------------------------------------");
		a.resumo();
		System.out.println("------------------------------------------------------------------");
		a1.resumo();
		System.out.println("------------------------------------------------------------------");
	}

}
