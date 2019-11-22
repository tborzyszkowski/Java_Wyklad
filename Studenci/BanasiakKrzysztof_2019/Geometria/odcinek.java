class Odcinek {
    private Punkt pierwszy;
    private Punkt drugi;

    Odcinek(double zx, double zy, double vx, double vy) {
        setOdcinek(zx,zy,vx,vy);
    }
    Odcinek() {
        this(0,0,1,0);
    }

    Odcinek(Punkt a, Punkt b) {
        this(a.getX(),a.getY(),b.getX(),b.getY());
    }

    Odcinek(Punkt a, double x, double y) {
        this(a.getX(),a.getY(),x,y);
    }

    public Punkt getPierwszy() {
        return this.pierwszy;
    }

    public Punkt getDrugi() {
        return this.drugi;
    }

    public Double getPierwszyX() {
        return this.pierwszy.getX();
    }

    public Double getPierwszyY() {
        return this.pierwszy.getY();
    }

    public Double getDrugiX() {
        return this.drugi.getX();
    }

    public Double getDrugiY() {
        return this.drugi.getY();
    }

    public void setPierwszy(double x, double y)
    {
        this.pierwszy = new Punkt(x, y);
    }

    public void setDrugi(double x, double y)
    {
        this.drugi = new Punkt(x, y);
    }

    public void setOdcinek(double x1, double y1, double x2, double y2)
    {
        setPierwszy(x1, y1);
        setDrugi(x2, y2);
    }

    void swiftOdcinek(double i, double j)
    {
        this.pierwszy.swiftXY(i,j);
        this.drugi.swiftXY(i,j);
    }

    double pointDistance(Punkt p){
        double x1=0; double y1=0; double x2=0; double y2=0; double x=0; double y=0;

        x1=this.getPierwszyX();
        y1=this.getPierwszyY();
        x2=this.getDrugiX();
        y2=this.getDrugiY();
        x=p.getX();
        y=p.getY();
        return Math.abs(((y2-y1)/(x2-x1))*x-y+(x2*y1-x1*y2)/(x2-x1))/Math.sqrt((Math.pow((y2-y1)/(x2-x1),2))+1);
    }
}
