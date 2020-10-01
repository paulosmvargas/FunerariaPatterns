public class Atendimento {
	private Ticket ticket;
	private Logica logica;
	private State state;

    public Atendimento(Ticket ticket, Logica logica, State state) {
        this.ticket = ticket;
        this.logica = logica;
        this.state = state;
    }

    public void setLogica(Logica Logica) {
        this.logica = Logica;
    }

    public Logica getLogica() {
        return this.logica;
    }
    
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket Ticket) {
        this.ticket = ticket;
    }
    
    public void emAberto() {
    	state.aberto();
    }
    
    public void resolvido() {
    	state.resolvido();
    }
    
    public void resumo(){
        System.out.println("Tipo ticket: " + ticket.getTipo());
        System.out.println("Nivel urgencia: " + ticket.getUrgencia());
        System.out.println("Descricao: " + ticket.getDesc());
        System.out.println("Resposta: " + logica.resposta());

        System.out.println("Estado: " + state);
    }
}
