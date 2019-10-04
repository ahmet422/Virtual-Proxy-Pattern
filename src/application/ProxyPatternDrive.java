package application;

public class ProxyPatternDrive {

	public static void main(String[] args) {
		
		//case 1: when an image created with RealImage class Downloading starts automatically but not viewing
		System.out.println("  case 1 ________________");
		Image image1 = new RealImage("D:/images/funMoments1.jpg");
		
		
		// case 2:  when an image created with RealImage class Downloading starts automatically and
		//only after method display is called Viewing starts as well
		System.out.println("\n case 2_________________");
		
		Image image2 = new RealImage("D:/images/funMoments2.jpg");
		
		image2.display();
		
		
		//case 3: when image is created with ProxyImage class nothing will start, no Downloading, no Viewing
		
		System.out.println("\n case 3________________");
		Image image3 = new ProxyImage("D:/images/landscapePic1.jpg");
		// in output nothing happens because proxy pattern holds operations until user really decides to view images
		
		//case 4: when image is created with ProxyImage class and called method display bot Downloading and Viewing starts
		
		System.out.println("\n case 4_________________");
		Image image4 = new ProxyImage("D:/images/landscapePic2.jpg");
		image4.display();
		
		// example of Virtual Proxy => used to get access to image only if client really decided to view it. 
		// sometimes user might want to view the image in his intentions but at last moment changes his mind. 
		// here using virtual proxy pattern helped us with avoiding unecessary operations and improved optimization.
	}

}
