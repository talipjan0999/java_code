package mythesis;
		import java.util.Vector;

		public class thesiubb {
		  public static void main(String[] args) {
		    //     initialization of  arrays
			  int a,b;
		    Vector u = new Vector();
		    Vector z=new Vector(2);
		    Vector o=new Vector(2);

		    u.addElement(new Integer(a));
		    u.addElement(new Integer(0));
		    Vector v = (Vector) u.clone();
		    Vector w = u;
		    //     printing vectors
		    System.out.println("initial vectors");
		    System.out.println("u = " + u + ", v = " + v + ", w = " + w);
		    System.out.println("");
		    //
		    //    changing u
		    //
		    u.setElementAt(new Integer(2),0);
		    //
		    System.out.println("changing u; v stays the same; w changes as well");
		    System.out.println("u = " + u + ", v = " + v + ", w = " + w);
		    System.out.println("");
		    //
		    //    changing v
		    //
		    v.setElementAt(new Integer(3),0);
		    //
		    System.out.println("changing v; u and w stay the same");
		    System.out.println("u = " + u + ", v = " + v + ", w = " + w);
		    System.out.println("");
		    //    
		    //    changing w
		    //
		    w.setElementAt(new Integer(4),0);
		    //
		    System.out.println("changing w; v stays the same; u changes as well");
		    System.out.println("u = " + u + ", v = " + v + ", w = " + w);
		    System.out.println("");
		  }
		}
		
