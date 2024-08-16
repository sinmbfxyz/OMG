class outerclass {
    private int n1;

    public void setouter(int n1) {
        this.n1 = n1;
    }

    public void displayouter() {
        System.out.println("N1=" + this.n1);

    }

    // Access Inner class
    public void accessinner() {
        // to access inner class create its object
        Innerclass i1 = new Innerclass();
        i1.setinner(1000);
        i1.displayinner();
    }

    private class Innerclass {
        private int n2;

        public void setinner(int n2) {
            this.n2 = n2;
        }

        public void displayinner() {
            System.out.println("N2=" + this.n2);
            n1 = 100;
            displayouter();
            setouter(1200);
        }
    }
}

public class Nested {
    public static void main(String[] args) {
        outerclass o1 = new outerclass();
        o1.setouter(10);
        o1.displayouter();
        o1.accessinner();
    }
}