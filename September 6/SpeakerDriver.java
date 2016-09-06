public class SpeakerDriver
{
  //illustrate polymorphism
  public static void main(String [] args)
  {
    Speaker s = new Speaker("CS Prof");
    System.out.println(s.speak());
    s = new Politician("Trump");//second form for s
    System.out.println(s.speak());
    s = new Philosopher("G. Edge");//third form for s
    System.out.println(s.speak());
    s = new SuperHero("Mighty Mouse");//fourth form for s
    System.out.println(s.speak());
    s = new Plant("Groot");//fifth form for s
    System.out.println(s.speak());
    System.out.println(s instanceof Plant);
    System.out.println(s instanceof SuperHero);
    System.out.println(s instanceof Politician);
    System.out.println(s instanceof Speaker);
    
  }
}