package desafio.gerenciadordecena.model.DTO;

import desafio.gerenciadordecena.model.Models.Log;

public class ReturnLogDto {
	public int CenaId;
	public String Action;
	public String De;
	public String Para;
	public String Time;
	
	public ReturnLogDto(Log log) {
		this.CenaId = log.CenaId;
		this.Action = log.Action.toString();
		this.De = log.De.toString();
		this.Para = log.Para.toString();
		this.Time = log.Time.toString();
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
