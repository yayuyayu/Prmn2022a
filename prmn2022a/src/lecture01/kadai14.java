package lecture01;

public class kadai14 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for(int x = 0; x< array.length; x++){
            array[x]=x+1;
        }
        int sum=0;
        for(int y=0;y<array.length;y++){
            if(array[y]%2 ==0){
                sum=sum+array[y];
            }
        }
        System.out.println("total="+sum);
    }
}