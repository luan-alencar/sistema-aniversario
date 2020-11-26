package david.augusto.luan.entidades;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Aniversariante {

	private String nome;
	private DataAniversario dataAniversario;

	public Aniversariante(String nome, int dia, int mes) {
		this.nome = nome;
		this.dataAniversario = new DataAniversario(dia, mes);
	}

	public boolean isAniversarianteDoMes(int mes) {
		return true;
	}
}
