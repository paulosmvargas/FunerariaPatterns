public class Resolvido implements State {
	
	@Override
	public void emAberto() {
		System.out.print("N�o");
	};
	
	@Override
	public void resolvido() {
		System.out.print("Sim");
	}
}
