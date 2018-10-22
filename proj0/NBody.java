public class NBody{
  public static double readRadius(String text){
    In in = new In(text);
    int n = in.readInt();
    double r = in.readDouble();
    return r;
  }

  public static Planet[] readPlanets(String text){
    In in = new In(text);

    int n = in.readInt();
    double r = in.readDouble();

    Planet[] stars = new Planet[n];

    for (int i = 0; i < stars.length; i = i + 1){
      stars[i] = new Planet(0.0, 0.0, 0.0, 0.0, 0.0, "");
      stars[i].xxPos = in.readDouble();
      stars[i].yyPos = in.readDouble();
      stars[i].xxVel = in.readDouble();
      stars[i].yyVel = in.readDouble();
      stars[i].mass = in.readDouble();
      stars[i].imgFileName = in.readString();
    }

    return stars;

  }

  public static void main(String[] args){
    double T = Double.parseDouble(args[0]);
    double dt = Double.parseDouble(args[1]);
    String filename = args[2];
    double unra = this.readRadius(filename);
    Plant[] pl = this.readPlanets(filename);

    //draw the background

    StdDraw.enableDoubleBuffering();
    StdDraw.setScale(-unra, unra);
    StdDraw.clear();



  }
}
