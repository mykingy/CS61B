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


  private double calcDx(Planet p){
    double dx = p.xxPos - this.xxPos;
    return dx;
  }

  private double calcDy(Planet p){
    double dy = p.yyPos - this.yyPos;
    return dy;
  }


  public double calcDistance(Planet p){
    double R2 = this.calcDx(p) * this.calcDx(p) + this.calcDy(p) * this.calcDy(p);
    double R = Math.sqrt(R2);
    return R;
  }

  public double calcForceExertedBy(Planet p){
    double F = (this.mass * p.mass * G) / (this.calcDistance(p) * this.calcDistance(p));

    return F;
  }

  public double calcForceExertedByX(Planet p){
    double forceX = this.calcForceExertedBy(p) * this.calcDx(p) / this.calcDistance(p);

    return forceX;
  }

  public double calcForceExertedByY(Planet p){
    double forceY = this.calcForceExertedBy(p) * this.calcDy(p) / this.calcDistance(p);

    return forceY;
  }

public double calcNetForceExertedByX(Planet[] stars){
  double forceNetX = 0.0;
  for(int i = 0; i < stars.length; i = i + 1){
    if (stars[i] != this){
      forceNetX = forceNetX + this.calcForceExertedByX(stars[i]);
    }
  }
    return forceNetX;
}

public double calcNetForceExertedByY(Planet[] stars){
  double forceNetY = 0.0;
  for(int i = 0; i < stars.length; i = i + 1){
    if (stars[i] != this){
      forceNetY = forceNetY + this.calcForceExertedByY(stars[i]);
    }
  }
  return forceNetY;
}

public void update(double dt, double fx, double fy){
  double ax = fx / this.mass;
  double ay = fy / this.mass;

  this.xxVel = this.xxVel + dt * ax;
  this.yyVel = this.yyVel + dt * ay;

  this.xxPos = this.xxPos + dt * this.xxVel;
  this.yyPos = this.yyPos + dt * this.yyVel;

}

}
