public class Resolvido implements State {
	
	@Override
	public void emAberto() {
		System.out.print("Não");
	};
	
	@Override
	public void resolvido() {
		System.out.print("Sim");
	}
}
