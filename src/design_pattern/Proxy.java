package design_pattern;

interface Subject{
    void f();
    void g();
    void h();
}
class Proxy implements Subject {
    private Subject realSubject;
    public Proxy() {
        realSubject = new RealSubject ();
    }
    // Pass method calls to the realSubject:
    public void f() { realSubject.f(); }
    public void g() { realSubject.g(); }
    public void h() { realSubject.h(); }
}
class RealSubject implements Subject {

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

    @Override
    public void h() {

    }
}