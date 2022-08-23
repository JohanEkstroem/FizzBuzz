package FizzBuzz;

public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (i == 42) {
        System.out.println("Answer to the Ultimate Question of Life, the Universe, and Everything");
        }
        else if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");  
        } else if (i % 5 == 0) {
          System.out.println("Buzz");
        } else if (i % 3 == 0) {
          System.out.println("Fizz");
        } else if (i == 42 && i%3 != 0) {
        } else {
          System.out.println(i);
        }
    }
  }  
}

/* 
  Uppgiften går ut på att skriva ut alla tal mellan 1 och 100, ett tal per rad.
  [x] Om talet är jämnt delbart med 3 så ska ordet “Fizz” skrivas ut istället för talet.
  [x] Om talet är jämnt delbart med 5 så ska ordet “Buzz” skrivas ut istället för talet.
  [x] Om talet är jämnt delbart med både 3 och 5 så ska ordet “Fizzbuzz” skrivas ut istället för någonting annat.
  [x] Om talet är 42 så ska “Answer to the Ultimate Question of Life, the Universe, and Everything” skrivas ut.
*/