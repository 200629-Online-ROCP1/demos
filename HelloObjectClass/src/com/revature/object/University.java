package com.revature.object;

public class University {
	
	public int students;
	public int professors;
	public String name;
	public int classrooms;
	
	public University(int students, int professors, String name, int classrooms) {
		this.students=students;
		this.classrooms = classrooms;
		this.professors=professors;
		this.name=name;
	}
	
	public static void staticcheck() {
		System.out.println("in static check university");
	}
	
	public final void checkover() {
		System.out.println("I am final");
	}
	
	@Override //This is an annotation. the Override annotation ensures that you are actually overriding something. If you are not, your code will not compile. 
	public String toString() {
		return ("name: "+name+" students: "+students+" profs: "+professors+" classrooms: "+classrooms);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + classrooms;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + professors;
		result = prime * result + students;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		University other = (University) obj;
		if (classrooms != other.classrooms)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (professors != other.professors)
			return false;
		if (students != other.students)
			return false;
		return true;
	}


	

}
