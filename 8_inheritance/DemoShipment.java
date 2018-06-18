class Box {
	private double width;
	private double height;
	private double depth;

	Box (Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	Box (double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	Box () {
		width = -1;
		height = -1;
		depth = -1;
	}

	Box (double len) {
		width = height = depth = len;			
	}

	Double volume() {
		return width*height*width;
	}
}

class BoxWeight extends Box {
	double weight;

	BoxWeight (BoxWeight ob) {
		super (ob);			// notice the use of super
		weight = ob.weight;
	}

	BoxWeight (double w, double h, double d, double m) {
		super (w, h, d);
		weight = m;
	}

	BoxWeight () {
		super ();
		weight = -1;
	}

	BoxWeight (double len, double m) {
		super (len);
		weight = m;
	}
}

class Shipment extends BoxWeight {
	double cost;
	Shipment (Shipment ob) {
		super (ob);
		cost = ob.cost;
	}

	Shipment (double w, double h, double d, 
		double m, double c) {
		super (w, h, d, m);
		cost = c;
	}

	Shipment () {
		super ();
		cost = -1;
	}

	Shipment (double len, double m, double c) {
		super (len, m);
		cost = c;
	}
}

class DemoShipment {
	public static void main(String[] args) {
		Shipment shipment1 = new Shipment(10, 20, 15, 32, 23.4);
		Shipment shipment2 = new Shipment(2, 3, 4, 6 , 1.4);

		double vol;

		vol = shipment1.volume();

		System.out.println("Volume of shipment1: " + vol);
		System.out.println("Weight of shipment1: " + shipment1.weight);
		System.out.println("Shipping cost: $" + shipment1.cost);
		System.out.println();

		vol = shipment2.volume();
		System.out.println("Volume of shipment2: " + vol);
		System.out.println("Weight of shipment2: " + shipment2.weight);
		System.out.println("Shipping cost: $" + shipment2.cost);
		System.out.println();

	}
}