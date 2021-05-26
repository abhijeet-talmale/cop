package Test;

import BatchData.Batch;
import StudentData.Student;

public class TestStudentBatch {

	public static void main(String[] args) {
		
		Student s = new Student();
        s.aceeptInfoStudent() ;
        s.displayInfo();
        
        Batch batch = new Batch();
		batch.acceptInfo();
		batch.displayInfo();

	}

}
