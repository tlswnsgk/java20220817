package ch15.book.exercise.p10;



public class Student implements Comparable<Student> {
	public String id;
	public int score;
	
	public Student (String id,int score) {
		this.id = id;
		this.score = score;
		
	}
	
	public int compareTo(Student o) {
		//코드 작성 
		
			int scoreDiff = this.score - o.score;
			if (scoreDiff == 0) {
				return this.score - o.score;
			}

			return scoreDiff;
	}
}
