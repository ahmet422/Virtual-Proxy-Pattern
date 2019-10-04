package application;

public class RealImage implements Image {

	String file;
	
	public RealImage(String file) {
		this.file = file;
		load();
	}
	
	void load() {
		System.out.println("");
		System.out.println("Downloading of " + file);
	}
	@Override
	public void display() {
		System.out.println("Viewing of " + file);
	}

	
	
}
