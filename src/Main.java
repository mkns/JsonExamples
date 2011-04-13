import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main( String[] args ) {
		Main m = new Main();
		m.execute( args );
	}

	private void execute( String[] args ) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Member member = new Member();

		List<String> stuff = new ArrayList<String>();
		stuff.add( "shoes" );
		stuff.add( "hat" );
		member.setStuff( stuff );
		member.setName( "Bert" );
		member.setAge( 21 );

		String output = gson.toJson( member, Member.class );
		log( output );
		
		Member member2 = gson.fromJson( output, Member.class );
		log(member2.getName());
	}

	private void log( String text ) {
		System.out.println( text );
	}

}
