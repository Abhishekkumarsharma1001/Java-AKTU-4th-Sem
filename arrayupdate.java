public class arrayupdate {
    public static void update(int marks[]){
        for(int i =0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }   
    public static void main(String[] args) {
        int marks[]= {98,97,96};
        update(marks);
        for(int i =0;i<marks.length;i++){
            System.out.print("marks:"+marks[i]+" ");
        }
        System.out.println();
    }
}
    
//update arrays element by using update function
