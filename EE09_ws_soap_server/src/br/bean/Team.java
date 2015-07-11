package br.bean;

import java.util.ArrayList;

public class Team {

	
	public static ArrayList<Student> getStudentByDiscipline(String discipline) {

		ArrayList<Student> aStudent = new ArrayList<Student>();

		switch (Discipline.getValue(discipline)) {
		case DISCIPLINE_A:

			aStudent.add(Student.STUDENT_1);
			aStudent.add(Student.STUDENT_2);
			aStudent.add(Student.STUDENT_3);
			aStudent.add(Student.STUDENT_4);
			aStudent.add(Student.STUDENT_5);
			aStudent.add(Student.STUDENT_6);
			aStudent.add(Student.STUDENT_7);
			aStudent.add(Student.STUDENT_8);
			aStudent.add(Student.STUDENT_9);
			aStudent.add(Student.STUDENT_10);

			break;

		case DISCIPLINE_B:

			aStudent.add(Student.STUDENT_11);
			aStudent.add(Student.STUDENT_12);
			aStudent.add(Student.STUDENT_13);
			aStudent.add(Student.STUDENT_14);
			aStudent.add(Student.STUDENT_15);
			aStudent.add(Student.STUDENT_16);
			aStudent.add(Student.STUDENT_17);
			aStudent.add(Student.STUDENT_18);
			aStudent.add(Student.STUDENT_19);
			aStudent.add(Student.STUDENT_20);

			break;
		case DISCIPLINE_C:

			aStudent.add(Student.STUDENT_21);
			aStudent.add(Student.STUDENT_22);
			aStudent.add(Student.STUDENT_23);
			aStudent.add(Student.STUDENT_24);
			aStudent.add(Student.STUDENT_25);
			aStudent.add(Student.STUDENT_26);
			aStudent.add(Student.STUDENT_27);
			aStudent.add(Student.STUDENT_28);
			aStudent.add(Student.STUDENT_29);
			aStudent.add(Student.STUDENT_30);

			break;

		default:
			aStudent.add(Student.NOT_FOUND);
			break;
		}
		return aStudent;

	}

}
