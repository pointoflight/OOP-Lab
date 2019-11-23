import java.util.*;
import java.io.*;
public class ParseRecords {
	
	java.util.HashMap<java.lang.String,Student> IDtoStudentObj;
	java.util.HashMap<java.lang.String,Batch> batchtoBatchObj;
	
	public ParseRecords() {
		
		IDtoStudentObj = new HashMap<String, Student>();
		batchtoBatchObj = new HashMap<String, Batch>();
	}
	
	int getRecords(java.lang.String filename) {
		
		BufferedReader in1 = null;
		int res = 0;
		try {
			in1 = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
			
		}catch(FileNotFoundException e) {
			System.out.println(e.toString());
			return -1;
		}
		
		
		
		
		try {
			String s;
		do
		{
			s = in1.readLine();
			if (s == null)
				break;
			res++;
		String[] inf = s.split(" ");
		String id = inf[0];
		String batch = id.substring(0,4);
		String name = inf[1];
		String sem = inf[2];
		String gpa = inf[3];
		if (batchtoBatchObj.get(batch) == null)
		{
			Batch b = new Batch(batch);
			batchtoBatchObj.put(batch,b);
		}
		if (IDtoStudentObj.get(id) == null)
		{
			Student st = new Student(id,name);
			st.addGPA(sem, gpa);
			IDtoStudentObj.put(id, st);
			batchtoBatchObj.get(batch).addStudenttoBatch(st);
		}
		else
		{
			IDtoStudentObj.get(id).addGPA(sem, gpa);
		}
		}while (true);
	
		}catch(IOException e) {
			System.out.println(e.toString());
			return -1;
		}
		
		try {
			in1.close();
		}catch(IOException e) {
			System.out.println(e.toString());
			return -1;
		}
		
		return res;
	}
	
	int getStudentSize() {
		
		return IDtoStudentObj.size();
		
	}
	
	int getBatchSize() {
		
		return batchtoBatchObj.size();
	}
	
	void answerQueries(java.lang.String inputfile, java.lang.String outputfile) {
		
		BufferedReader in = null;
		BufferedWriter bw = null;
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(inputfile)));
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputfile,false)));
		}catch(FileNotFoundException e) {
			System.out.println(e.toString());
		}
		
		try {
			
			String s = in.readLine();
			String[] inf = s.split(" ");
			if (inf[0].equals("Q1"))
			{
				Student stu = IDtoStudentObj.get(inf[1]);
				bw.write(stu.studentInfo());
			}
			else if (inf[0].equals("Q2"))
			{
				Batch b1 = batchtoBatchObj.get(inf[1]);
				for (Student s3 : b1.allStudents()) {
					bw.write(s3.studentInfo());
				}
			}
			else if (inf[0].equals("Q3"))
			{
				Batch b1 = batchtoBatchObj.get(inf[1]);
				b1.sortByID();
				for (Student s3 : b1.allStudents()) {
					bw.write(s3.studentInfo());
				}
			}
			else if (inf[0].equals("Q4"))
			{
				Batch b1 = batchtoBatchObj.get(inf[1]);
				b1.sortByCGPA();
				for (Student s3 : b1.allStudents()) {
					bw.write(s3.studentInfo());
				}
			}
			else
			{
				String b1 = inf[1];
				String branch = inf[2];
				bw.write(batchtoBatchObj.get(b1).findMaxCGPA(branch).studentInfo());
			}
		}catch(IOException e)
		{
			System.out.println(e.toString());
		}
		
		try {
			in.close();
			bw.close();
		}catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}
