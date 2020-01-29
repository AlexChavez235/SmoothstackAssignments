public class printPattern {

    String stars = "";
    int numDashes = 9;

    public String pattern1() {
        String pattern = "";
        for (int i=0; i<4; i++) {
            this.stars += '*';
            pattern += this.stars;
            if (i<3) {
                pattern += '\n';
            }
        }
        return pattern;
    }

    public String pattern2() {
        String pattern = "";
        for (int i=4; i>0; i--) {
            pattern += this.stars.substring(0, i);
            if (i>1) {
                pattern += '\n';
            }
        }
        return pattern;
    }

    public String pattern3() {
        String pattern = "";
        for (int i=1; i<=7; i+=2) {
            int n = (this.numDashes - i)/2;
            for (int j=0; j<n; j++) {
                pattern += " ";
            }
            for (int j=0; j<i; j++) {
                pattern += "*";
            }
            for (int j=n+1; j<this.numDashes;j++) {
                pattern += " ";
            }
            if (i<=5) {
                pattern += "\n";
            }
        }
        return pattern;
    }

    public String pattern4() {
        String pattern = "";
        for (int i=7; i>0; i-=2) {
            int n = (this.numDashes - i)/2;
            for (int j=0; j<n; j++) {
                pattern += " ";
            }
            for (int j=0; j<i; j++) {
                pattern += "*";
            }
            for (int j=n+1; j<this.numDashes;j++) {
                pattern += " ";
            }
            pattern += "\n";
        }
        return pattern;
    }

    public String whichFunction(int n) {
        switch(n) {
            case 1: return pattern1();
            case 2: return pattern2();
            case 3: return pattern3();
            case 4: return pattern4();
        }
        return "";
    }

    
    public void pattern() {
        
        for (int i=1; i<5; i++) {
            System.out.println(i + ")");
            if (i % 2 == 1) {
                System.out.println(this.whichFunction(i));
                for (int j=0; j<this.numDashes; j++) {
                    System.out.print("-");
                }
            } else {
                for (int j=0; j<this.numDashes; j++) {
                    System.out.print("-");
                }
                System.out.println();
                System.out.println(this.whichFunction(i));           
            }

            System.out.println('\n');
            this.numDashes++;
        }

    }

    public static void main(String[] args) {
        printPattern pp = new printPattern();
        pp.pattern();
    }
}