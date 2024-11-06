package avaliacao;

public class Questionario {
	private String questao;
	private String alternativas;
	private String respostaGabarito;
	
	public Questionario(String questao, String alternativas, String respostaGabarito) {
		this.questao = questao;
		this.alternativas = alternativas;
		this.respostaGabarito = respostaGabarito;
	}

	public String getQuestao() {
		return questao;
	}

	public String getAlternativas() {
		return alternativas;
	}

	public String getRespostaGabarito() {
		return respostaGabarito;
	}

	@Override
	public String toString() {
		return questao + ", " + alternativas + ", "	+ respostaGabarito;
	}
}