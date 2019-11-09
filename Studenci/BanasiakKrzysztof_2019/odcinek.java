class Odcinek {
    Punkt pierwszy;
    Punkt drugi;

    Odcinek() {

        this.pierwszy = new Punkt();
        this.drugi = new Punkt();
        this.pierwszy.x = 0;
        this.pierwszy.y = 0;
        this.drugi.x = 0;
        this.drugi.y = 0;
    }

    Odcinek(Punkt a, Punkt b) {
        this.pierwszy = new Punkt(a);
        this.drugi = new Punkt(b);
    }

    Odcinek(Punkt a, double x, double y) {

        this.pierwszy = new Punkt(a);
        this.drugi = new Punkt();
        this.drugi.x =x;
        this.drugi.y=y;

    }
    Odcinek(double zx, double zy, double vx, double vy) {

        this.pierwszy = new Punkt();
        this.drugi = new Punkt();
        this.pierwszy.x =zx;
        this.pierwszy.y=zy;
        this.drugi.x =vx;
        this.drugi.y=vy;

    }

    void swiftXY(double i, double j) {
        pierwszy.x = pierwszy.x + i;
        pierwszy.y = pierwszy.y + j;
        drugi.x = drugi.x + i;
        drugi.y = drugi.y + j;
    }

    double pointDistance(Punkt p){
        double x1=0; double y1=0; double x2=0; double y2=0; double x=0; double y=0;

        x1=this.pierwszy.x;
        y1=this.pierwszy.y;
        x2=this.drugi.x;
        y2=this.drugi.y;
        x=p.x;
        y=p.y;
        return Math.abs(((y2-y1)/(x2-x1))*x-y+(x2*y1-x1*y2)/(x2-x1))/Math.sqrt((Math.pow((y2-y1)/(x2-x1),2))+1);
    }
}