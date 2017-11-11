package _04_Dziedziczenie;

// przyklad wywolan polimorficznych z wykorzystaniem 
// zmiennych this i super
class AA { 
    int m() { return 1; }
    int test() { return m();}
    int testThis() { return this.test();}
}
class BB extends AA { 
    int m(){ return super.m(); } //return 2;}
//    int testSuper() { return super.test(); }
    int testSuper() { return this.test(); }
    int superOne() { return super.m(); }
    int test() { return this.m();}
//    int test() { return m();}
}
class CC extends BB { 
    int m() { return 3; }
    int superTwo() {return superOne(); }
    int testSuper() { return super.m(); }
//    int test() { return super.m();}

}
class DynWia{
    public static void main(String[] args) {
	AA a = new AA() ;	BB b = new BB() ;	CC c = new CC() ;
	System.out.println(a.test() + " " + a.testThis());
	System.out.println(b.test() + " " + b.testThis() + " " + b.testSuper());
	System.out.println(c.test() + " " + c.testThis() + " " + c.testSuper());
  }
}



// obj.methC() = C.methC(b)
// b.testThis() = A.testThis(b) = b.test() = B.test(b) = b.m() = B.m(b) = 2