package br.bean;

public enum Discipline {

	DISCIPLINE_A("EES00"), DISCIPLINE_B("EES01"), DISCIPLINE_C("EE02"), DISCIPLINE_D("NOT FOUND");

	private String discipline;

	private Discipline(String discipline) {
		// TODO Auto-generated constructor stub
		this.discipline = discipline;

	}

	public static Discipline fromValue(int value)
			throws IllegalArgumentException {
		try {
			return Discipline.values()[value];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException("not found :" + value);
		}
	}


	public static Discipline getValue(String value)
			throws IllegalArgumentException {
		try {

			for (Discipline e : Discipline.values()) {
				if (e.toString().equals(value)) {
					return e;
				}
			}
			return Discipline.DISCIPLINE_D;// not found

		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IllegalArgumentException("not found");
		}
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return discipline;
	}

}
