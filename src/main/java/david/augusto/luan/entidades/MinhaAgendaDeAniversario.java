package david.augusto.luan.entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import david.augusto.luan.exceptions.AniversarianteNaoEncontradoException;
import david.augusto.luan.interfaces.AgendaDeAniversario;
import lombok.Getter;

public class MinhaAgendaDeAniversario implements AgendaDeAniversario {
	
	@Getter 
	private List<Aniversariante> aniversariantes;

	public MinhaAgendaDeAniversario() {
		this.aniversariantes = new ArrayList<Aniversariante>();
	}

	@Override
	public void adicionarAniversariante(String nome, int dia, int mes) {
		Aniversariante aniversario = new Aniversariante(nome, dia, mes);
		aniversariantes.add(aniversario);
	}

	@Override
	public List<Aniversariante> obterAniversariante(int mes) {
		List<Aniversariante> aniversariosDoMes = new ArrayList<Aniversariante>();
		for (Aniversariante a : this.aniversariantes) {
			if (a.getDataAniversario().getMes() == mes) {
				aniversariosDoMes.add(a);
			}
		}
		return aniversariosDoMes;
	}

	@Override
	public void removerAniversariante(String nomeAniversariante) throws AniversarianteNaoEncontradoException {
		Iterator<Aniversariante> iterator = aniversariantes.iterator();
		boolean it = false;

		while (iterator.hasNext()) {
			Aniversariante aniversariante = iterator.next();
			if (aniversariante.getNome().equals(nomeAniversariante)) {
				iterator.remove();
				it = true;
			}
		}
		if (!it) {
			throw new AniversarianteNaoEncontradoException();
		}
	}

}
