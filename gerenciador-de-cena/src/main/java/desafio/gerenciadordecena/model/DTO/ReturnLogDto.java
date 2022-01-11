package desafio.gerenciadordecena.model.DTO;

import desafio.gerenciadordecena.model.Models.Log;

public class ReturnLogDto {
	private int CenaId;
	private String Action;
	private String De;
	private String Para;
	private String Time;

	public ReturnLogDto(Log log) {
		this.CenaId = log.getCenaId();
		this.Action = log.getAction().toString();
		this.De = log.getDe().toString();
		this.Para = log.getPara().toString();
		this.Time = log.getTime().toString();
	}

	public int getCenaId() {
		return CenaId;
	}

	public String getAction() {
		return Action;
	}

	public String getDe() {
		return De;
	}

	public String getPara() {
		return Para;
	}

	public String getTime() {
		return Time;
	}

}
