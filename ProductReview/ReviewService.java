package ProductReview;


public class ReviewService {
 public void submitReview(int rating, String comment) throws InvalidRatingException, EmptyReviewException {
     if (rating < 1 || rating > 5) throw new InvalidRatingException("Rating must be between 1 and 5.");
     if (comment == null || comment.trim().isEmpty()) throw new EmptyReviewException("Review comment cannot be empty.");
     System.out.println("Thanks! Your review was submitted.");
 }
}

