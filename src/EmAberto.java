public class EmAberto implements State{
	
	@Override
	public void aberto() {
		System.out.print("Sim");
	};
	
	@Override
	public void resolvido() {
		System.out.print("Não");
	}
}
