public class ShortestDistance {
 public static void main(String[] args) {
  String path = "WNEENESENNN";
  System.out.println(getshortestPath(path));
 }  
  public static Float getshortestPath(String path) {
    int x=0, y=0;

    for(int i=0; i<=path.length()-1; i++){
      char direction = path.charAt(i);

      // north..
      if(direction == 'N'){
        y++;
      }
      // south
      else if(direction == 'S'){
        y--;
      }
      // east
      else if(direction == 'E'){
        x++;
      }else{
        x--;
      }
    }
    int X2 = x*x;
    int Y2 = y*y;

    return (float) Math.sqrt(X2+ Y2);
  }
}
