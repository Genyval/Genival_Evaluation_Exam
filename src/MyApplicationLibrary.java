
public class MyApplicationLibrary {
	
	@ApplicationPath("/rest")
	public class MyApplicationLibrary extends Application {

		
		public Set<Class<?>> getClasses(){
			final Set<Class<?>> classes = new HashSet<Class<?>>();
			classes.add(LibraryResource.class);
			return classes;
		}
		
		
	}
}
