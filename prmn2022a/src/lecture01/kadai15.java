package lecture01;

public class kadai15 {



    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};
        String han=null;

        for(int x=0;x< score.length;x++){
            if(score[x]<60){
                han ="不可";
            }else if(score[x]<70){
                han="可";
            }else if(score[x]<80){
                han="良";
            } else if (score[x]<90) {
                han="優";
            }else{
                han="秀";
            }
            System.out.println(x+"番　"+score[x]+"点 "+han);
        }

        int mi=Min(score);
        int ma=Max(score);
        double ave=Average(score);

        System.out.println("最高点:"+ma);
        System.out.println("最低点:"+mi);
        System.out.println("平均点:"+ave);
    }

    static int Min(int score[]){
        int min=score[0];
        for(int x=0;x< score.length;x++){
            if(min>score[x]){
                min =score[x];
            }
        }
        return min;
    }

    static int Max(int score[]) {
        int max = score[0];
        for (int x = 0; x < score.length; x++) {
            if (max <score[x]) {
                max = score[x];
            }
        }
        return max;
    }

    static double Average(int score[]){
        double sum =0.0D;
        for(int x=0;x< score.length;x++){
            sum=sum+score[x];
        }
        return (double)sum/ (double) score.length;
    }
}
