public class Hospital {

    public static void main(String[] args) {
        //int i ;
        //String sd = "July 22";
        //String ed = "July 23";

        // Case 1
        Case caso = new Case(3, "July 22", "July 23");
        Case.Patient p = caso.new Patient('M', 22, 185);
        Case.Diagnose d = caso.new Diagnose("Headache", "Ibuprofen");
        Case.workers wk = caso.new workers(5);
        Case.doctor dr = caso.new doctor("Juan James", "Brain");
        Case.nurse nr = caso.new nurse(3);
        Case.visitors vt = caso.new visitors(10);

        // Case 2
        Case caso2 = new Case(4, "July 25", "July 29");
        Case.Patient p2 = caso2.new Patient('F', 19, 135);
        Case.Diagnose d2 = caso2.new Diagnose("Headache", "Ibuprofen");
        Case.workers wk2 = caso2.new workers(5);
        Case.doctor dr2 = caso2.new doctor("Juan James", "Brain");
        Case.nurse nr2 = caso2.new nurse(4);
        Case.visitors vt2 = caso.new visitors(10);

        // Checking toString
        System.out.println(caso);
        System.out.println(caso2);
        System.out.println(p);
        System.out.println(d);

        // Checking hashCode
        if (caso.hashCode() == caso2.hashCode()) {
            System.out.println("Same Case " + caso.hashCode() + " " + caso2.hashCode());
        } else {
            System.out.println("Different Case");
        }

        System.out.println(p.hashCode() + " " + p2.hashCode());
        System.out.println(dr.hashCode() + " " + dr2.hashCode());


        // Checking Equals
        System.out.println(nr2.equals(nr));
        System.out.println(wk2.equals(wk));

        if (vt.equals(vt2)) {
            System.out.println("Same amount of visitors");
        }


    }

}


