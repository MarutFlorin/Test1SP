package test.fmi.sp;

public class PrintVisitor implements Visitor {
    @Override
    public void visitStudent(Student student) {
        System.out.println("\t\t\t" + student.getNume() + ", " + student.getEmail());
    }

    @Override
    public void visitSemigrupa(Semigrupa semigrupa) {
        System.out.println("\t\t" + semigrupa.getNume());
        for(Element element : semigrupa.getElements())
            element.accept(this);
    }

    @Override
    public void visitGrupa(Grupa grupa) {
        System.out.println("\t" + grupa.getNume());
        for(Element element : grupa.getElements())
            element.accept(this);
    }

    @Override
    public void visitAn(An an) {
        System.out.println(an.getNume());
        for(Element element : an.getElements())
            element.accept(this);
    }
}
