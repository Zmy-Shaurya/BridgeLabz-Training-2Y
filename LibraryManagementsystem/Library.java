package LibraryManagementsystem;


import java.util.*;

public class Library {
 private final Map<String, Boolean> bookAvailable = new HashMap<>();
 private final Map<String, Set<String>> userToBorrowed = new HashMap<>();

 public Library() {
     bookAvailable.put("Clean Code", true);
     bookAvailable.put("Design Patterns", true);
     bookAvailable.put("Java Concurrency", false);
 }

 public void borrow(String user, String book) throws BookNotAvailableException, UserLimitExceededException {
     userToBorrowed.putIfAbsent(user, new HashSet<>());
     Set<String> borrowed = userToBorrowed.get(user);
     if (borrowed.size() >= 5) throw new UserLimitExceededException("Borrow limit exceeded (max 5).");
     Boolean avail = bookAvailable.get(book);
     if (avail == null || !avail) throw new BookNotAvailableException(book + " is not available.");
     borrowed.add(book);
     bookAvailable.put(book, false);
     System.out.println(user + " borrowed: " + book);
 }

 public void returnBook(String user, String book) throws InvalidReturnException {
     Set<String> borrowed = userToBorrowed.getOrDefault(user, Collections.emptySet());
     if (!borrowed.contains(book)) throw new InvalidReturnException("This book was not borrowed by " + user);
     borrowed.remove(book);
     bookAvailable.put(book, true);
     System.out.println(user + " returned: " + book);
 }
}
