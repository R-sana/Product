package inheritance.product.dbapp;

public class Software extends Product {

	private String version;
	
	public Software() {
		// TODO Auto-generated constructor stub
	super();
	version = " ";
	count++;
		}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return super.toString() + version;
	}
	
	
}
