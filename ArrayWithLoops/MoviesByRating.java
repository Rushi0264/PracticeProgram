package ArrayWithLoops;

public class MoviesByRating {
    public static void main(String[] args) {
        int moviesRating[] = {5,4,2,1,5,3,2};
        String moviesName[] = { "Sairat","Pushpa","Pushpa 2","Golmal","Salar","Kesari","Baby John"};

        for (int i=0;i<moviesRating.length;i++){
            for (int j=i+1; j<moviesRating.length; j++){
                int temp;
                if(moviesRating[i] < moviesRating[j]) {
                    temp = moviesRating[i];
                    moviesRating[i] = moviesRating[j];
                    moviesRating[j] = temp;
                }

            }
        }
        System.out.println("Below movies arranged with rating : ");
        for (int i=0; i<moviesName.length;i++){
            System.out.println(moviesName[i]+" "+moviesRating[i]);
        }
/*        System.out.println("Sairat : "+moviesRating[0]+" star rating");
        System.out.println("Pushpa : "+moviesRating[1]+" star rating");
        System.out.println("Pushpa 2 : "+moviesRating[2]+" star rating");
        System.out.println("Golmal : "+moviesRating[3]+" star rating");
        System.out.println("Salar : "+moviesRating[4]+" star rating");
        System.out.println("Kesari : "+moviesRating[5]+" star rating");
        System.out.println("Baby John : "+moviesRating[6]+" star rating");*/
    }
}
