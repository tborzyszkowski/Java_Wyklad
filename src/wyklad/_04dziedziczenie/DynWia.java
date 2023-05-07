package wyklad._04dziedziczenie;

class AA {
    int m() { return 1; }
    int test() { return m();}
    int testThis() { return this.test();}
}
class BB extends AA {
    int m() { return 2; }
    int testSuper() { return super.test(); }
    int superOne() { return super.m(); }
}
class CC extends BB { 
    int m() { return 3; }
    int superTwo() { return superOne(); }
    int testSuper() { return super.m(); }
    int test() { return super.test();}
}
class DynWia{
    public static void main(String[] args) {
	AA a = new AA() ;	BB b = new BB() ;	CC c = new CC() ;
	System.out.println(a.test() + " " + a.testThis()); //
	System.out.println(b.test() + " " + b.testThis() + " " + b.testSuper()); //
	System.out.println(c.test() + " " + c.testThis() + " " + c.testSuper() + " " + c.superOne()); //
  }
}

// b.test() = A.test(b) = b.m() = B.m(b) = 2
// b.testSuper() = super.test(b) = A.test(b) = B.m(b) = 2
// c.test() = B.m(c) = 2
// c.testThis() = A.testThis(c) = c.test() = B.test(c) = A.test(c) = c.m() = C.m(c) = 3