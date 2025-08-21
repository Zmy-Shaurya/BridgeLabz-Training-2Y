public class SamMarks {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int total = maths + physics + chemistry;
        double pcm_percentage = (double) total / 300 * 100;
        System.out.println("Total Marks: " + total+"/100");
        System.out.println("PCM Percentage: " + pcm_percentage + "%");

}
}
