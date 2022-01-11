package desafio.gerenciadordecena.model.DTO;

public class ReturnLogDto {
	public int CenaId;
	public String Action;
	public String De;
	public String Para;
	public String Time;
	public int getCenaId() {
		return CenaId;
	}
	public void setCenaId(int cenaId) {
		CenaId = cenaId;
	}
	public String getAction() {
		return Action;
	}
	public void setAction(String action) {
		Action = action;
	}
	public String getDe() {
		return De;
	}
	public void setDe(String de) {
		De = de;
	}
	public String getPara() {
		return Para;
	}
	public void setPara(String para) {
		Para = para;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	
}
