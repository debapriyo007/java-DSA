public class sotest_path {

    public static float findoutSortestpath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {

            char dir = path.charAt(i);

            // North
            if (dir == 'N') {
                y++;
            }

            // South

            else if (dir == 'S') {
                y--;
            }
            //West

            else if (dir == 'W') {
                x++;
            }
            //East
            
             else {
                x--;
            }

        }

        int X2=x*x;
        int Y2=y*y;
        return(float)Math.sqrt(X2+Y2);
    }

    public static void main(String[] args) {

        String path = "WNEENESENNN";
        System.out.println(findoutSortestpath(path));   
    }

}
