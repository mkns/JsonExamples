import java.util.List;

public class Member {

	private String name;
	private int age;
	private List<String> stuff;

	public Member() {
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge( int age ) {
		this.age = age;
	}

	public List<String> getStuff() {
		return stuff;
	}

	public void setStuff( List<String> stuff ) {
		this.stuff = stuff;
	}

}
