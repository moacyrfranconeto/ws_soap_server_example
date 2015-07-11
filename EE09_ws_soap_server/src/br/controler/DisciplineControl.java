package br.controler;

import java.util.ArrayList;

import com.google.gson.Gson;

import br.bean.Discipline;
import br.bean.Student;
import br.bean.Team;

public class DisciplineControl {

	private static final DisciplineControl instance = new DisciplineControl();

	private DisciplineControl() {}

	public static DisciplineControl getInstance() {
		return instance;
	}
	
	
	
	public String getStudentByDiscipline(String discipline){
		
		Gson gson = new Gson();
		return gson.toJson(Team.getStudentByDiscipline(discipline));
		
	}
	
	

}
