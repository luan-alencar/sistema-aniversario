package david.augusto.luan;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import david.augusto.luan.entidades.MinhaAgendaDeAniversario;
import david.augusto.luan.exceptions.AniversarianteNaoEncontradoException;

public class MinhaAgendaDeAniversarioTeste {

	private MinhaAgendaDeAniversario agenda;

	@BeforeEach
	void setUp() throws Exception {
		agenda = new MinhaAgendaDeAniversario();
	}
	
	@Test
	public void testAdicionarAniversariante() {
		assertEquals(0, agenda.getAniversariantes().size());
		agenda.adicionarAniversariante("Fulano 1", 10, 11);
		agenda.adicionarAniversariante("Fulano 2", 11, 11);
		agenda.adicionarAniversariante("Fulano 3", 12, 11);
		agenda.adicionarAniversariante("Fulano 4", 15, 11);
		assertEquals(4, agenda.getAniversariantes().size());
	}

	@Test
	public void obterAniversariante() {
		agenda.adicionarAniversariante("Fulano 1", 10, 11);
		agenda.adicionarAniversariante("Fulano 2", 11, 11);
		agenda.adicionarAniversariante("Fulano 3", 12, 11);
		agenda.adicionarAniversariante("Fulano 4", 15, 11);
		
		assertEquals(4, agenda.obterAniversariante(11).size());
	}
	
	@Test
	public void removerAniversariante() throws AniversarianteNaoEncontradoException {
		agenda.adicionarAniversariante("Fulano 1", 10, 11);
		agenda.adicionarAniversariante("Fulano 2", 11, 11);
		agenda.adicionarAniversariante("Fulano 3", 12, 11);
		agenda.adicionarAniversariante("Fulano 4", 15, 11);
		agenda.removerAniversariante("Fulano 2");
		assertEquals(3, agenda.getAniversariantes().size());
	}
}
