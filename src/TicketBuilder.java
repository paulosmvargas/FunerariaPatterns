public class TicketBuilder {
	private Ticket ticket;
	
	public TicketBuilder newTicket()
    {
        ticket = new Ticket();
        return this;
    }

    public TicketBuilder tipoChamado(String tipo)
    {
        ticket.setTipo(tipo);
        return this;
    }

    public TicketBuilder nivelUrgencia(String urgencia)
    {
        ticket.setUrgencia(urgencia);
        return this;
    }
    
    public TicketBuilder descricao(String desc)
    {
        ticket.setDesc(desc);
        return this;
    }

    public Ticket builder()
    {
        return this.ticket;
    }
}
