package ProductReview;


public class ReviewMain {
 public static void main(String[] args) {
     ReviewService rs = new ReviewService();
     try {
         rs.submitReview(6, "Great!"); // invalid rating
     } catch (InvalidRatingException e) {
         System.out.println("Review failed: " + e.getMessage());
     } catch (EmptyReviewException e) {
         System.out.println("Review failed: " + e.getMessage());
     }
 }
}
