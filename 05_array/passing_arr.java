public class passing_arr {

    public static void update (int marks[]){
        for( int i=0 ;i<marks.length;i++){
          marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        
        int marks[]={90,68,70};

      update(marks);
      
      //print marks

      for(int i=0;i<marks.length;i++)
      {
        System.out.print(marks[i]+" ");

      }
      System.out.println();

    }
    
}
