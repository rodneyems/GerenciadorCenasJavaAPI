package desafio.gerenciadordecena.model.DTO;

import java.time.LocalDateTime;

import desafio.gerenciadordecena.model.Models.Cena;
import desafio.gerenciadordecena.model.Models.StatusEnum;

public class ChangeStatusDto {
	public StatusEnum Status = StatusEnum.Pendente;
	
    public LocalDateTime TimeLastChange;
    
    public ChangeStatusDto(Cena cena) {
    	this.Status = cena.Status;
    	this.TimeLastChange = cena.TimeLastChange;
    }
    
	public StatusEnum getStatus() {
		return Status;
	}

	public LocalDateTime getTimeLastChange() {
		return TimeLastChange;
	}

}
