package INTER_FACE.collections;

public class student1 implements Comparable<student1> {
    int id;
    String name;
    double score;
    student1(int id, String name, double score){
        this.id = id;
        this.name = name;
        this.score = score;
    }


    @Override
    public int compareTo(student1 o) {
        if (id>o.id){ 
            return 1;
        }else if (id<o.id) { 
            return -1;
        }else { 
            return 0;}
    }


	public static int size() {
		return 0;
	}
    
}