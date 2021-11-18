package test.fmi.sp;

public interface Visitor {
    void visitStudent(Student student);
    void visitSemigrupa(Semigrupa semigrupa);
    void visitGrupa(Grupa grupa);
    void visitAn(An an);
}
