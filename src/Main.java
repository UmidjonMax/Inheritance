public class Main {
    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg("Dr.Anik", 51, "Kardioxirurg");
        System.out.println("Ismi: "+xirurg.name+" Yoshi: "+xirurg.age+" Turi: "+xirurg.type);

        Lor lor = new Lor("Dr.Rogan", 43, "Bolalar lori");
        System.out.println("Ismi: "+lor.name+" Yoshi: "+lor.age+" Turi: "+lor.type);
    }
}
