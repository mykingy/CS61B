public class NBody{
  public static double readRadius(String text){
    In in = new In(text);
    int n = in.readInt();
    double r = in.readDouble();
    return r;
  }
}
