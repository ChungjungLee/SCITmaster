
public class Movie {
	String name;
	double score;
	String director;
	int year;
	
	void print() {
		System.out.println(
				"<<" + name + ">>\n" +
				"평점: " + score + "\n" +
				"감독: " + director + "\n" +
				"개봉 년도: " + year
		);
		
	}
}
