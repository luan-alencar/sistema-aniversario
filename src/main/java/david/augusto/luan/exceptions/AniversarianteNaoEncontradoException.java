package david.augusto.luan.exceptions;

public class AniversarianteNaoEncontradoException extends Exception {
	private static final long serialVersionUID = 1L;

	public AniversarianteNaoEncontradoException() {
		super("Aniversariante não encontrado");
	}
}
