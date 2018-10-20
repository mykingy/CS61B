public class Planet{
  public double xxPos;
  public double yyPos;
  public double xxVel;
  public double yyVel;
  public double mass;
  public String imgFileName;
  public static double G = 6.67e-11;

  public Planet(double xP, double yP, double xV, double yV, double m, String img){
    xxPos = xP;
    yyPos = yP;
    xxVel = xV;
    yyVel = yV;
    mass = m;
    imgFileName = img;
  }

  public Planet(Planet p){
    xxPos = p.xxPos;
    yyPos = p.yyPos;
    xxVel = p.xxVel;
    yyVel = p.yyVel;
    mass = p.mass;
    imgFileName = p.imgFileName;
  }




  public double calcDistance(Planet p){
    double dx = this.xxPos - p.xxPos;
    double dy = this.yyPos - p.yyPos;
    double R2 = dx * dx + dy * dy;
    double R = Math.sqrt(R2);
    return R;
  }

  public double calcForceExertedBy(Planet p){
    double F = (this.mass * p.mass * G) / (this.calcDistance(p) * this.calcDistance(p));

    return F;
  }

  public double calcForceExertedByX(Planet p){
    double dx = this.xxPos - p.xxPos;
    double forceX;
    if (dx >= 0){
      forceX = this.calcForceExertedBy(p) * dx / this.calcDistance(p);
    } forceX = - (this.calcForceExertedBy(p) * dx / this.calcDistance(p));

    return forceX;
  }

  public double calcForceExertedByY(Planet p){
    double dy = this.yyPos - p.yyPos;
    double forceY;
    if (dy >= 0){
      forceY = this.calcForceExertedBy(p) * dy / this.calcDistance(p);
    } forceY = this.calcForceExertedBy(p) * (-dy) / this.calcDistance(p);

    return forceY;
  }



}
