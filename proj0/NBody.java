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
    double radius = readRadius(filename);
    Planet[] planets = readPlanets(filename);

    //draw the background


    StdDraw.setScale(-radius, radius);
    StdDraw.clear();

    StdDraw.picture(0, 0, "images/starfield.jpg");

    int num = planets.length;

    for(int i = 0; i < num; i = i + 1){
      planets[i].draw();
    }

    StdDraw.enableDoubleBuffering();

    for (double t = 0.0; t < T; t = t + dt){
      double[] xForces = new double[num];
      double[] yForces = new double[num];

      for(int i = 0; i < num; i = i + 1){
        xForces[i] = planets[i].calcNetForceExertedByX(planets);
        yForces[i] = planets[i].calcNetForceExertedByY(planets);

      }

      for(int i =0; i < num; i = i + 1){
        planets[i].update(dt, xForces[i], yForces[i]);
      }
        StdDraw.pause(10);
        StdDraw.show();
    }

    StdOut.printf("%d\n", planets.length);
    StdOut.printf("%.2e\n", radius);
    for (int i = 0; i < planets.length; i++) {
    StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                  planets[i].xxPos, planets[i].yyPos, planets[i].xxVel,
                  planets[i].yyVel, planets[i].mass, planets[i].imgFileName);
}

  }
}
