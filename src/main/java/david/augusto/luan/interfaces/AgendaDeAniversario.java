package david.augusto.luan.interfaces;

import java.util.List;

import david.augusto.luan.entidades.Aniversariante;
import david.augusto.luan.exceptions.AniversarianteNaoEncontradoException;

public interface AgendaDeAniversario {

	public void adicionarAniversariante(String nome, int dia, int mes);

	public List<Aniversariante> obterAniversariante(int dia);

	public void removerAniversariante(String nomeAniversariante) throws AniversarianteNaoEncontradoException;
}
