package streamExamples;

import java.util.stream.Stream;

public class streamBuilderExample {

  public static void main(String[] args) {

    Stream.Builder<String> builder = Stream.builder();
    Stream<String> stream = builder.add("Geeks").build();
    stream.forEach(System.out::println);
  }
// For Rest API, instead of using this Stream, we should use Future and Promises in Java.
//  Future is all about asynchronous, waiting for something or certain conditions to happen before
//  it can do something.
}
