public class Atendimento {
	private Ticket ticket;
	private Logica logica;

    public Atendimento(Ticket ticket, Logica i){
        this.ticket = ticket;
        this.logica = logica;
    }

    public void setLogica(Logica Logica){
        this.logica = Logica;
    }

    public Logica getLogica(){
        return this.logica;
    }
    
    public Ticket getTicket(){
        return ticket;
    }

    public void setTicket(Ticket Ticket){
        this.ticket = ticket;
    }

    public void resumo(){
        System.out.println("Tipo ticket: " + ticket.getTipo());
        System.out.println("Nivel urgencia: " + ticket.getUrgencia());
        System.out.println("Descricao: " + ticket.getDesc());
        System.out.println("Estado: " + logica.estado());
        
    }
}
