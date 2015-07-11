package br.view;

import br.controler.DisciplineControl;

public class Curse {

	
	public String getListStudentByDiscipline(String discipline){
		return DisciplineControl.getInstance().getStudentByDiscipline(discipline);
	}
	
	
}
