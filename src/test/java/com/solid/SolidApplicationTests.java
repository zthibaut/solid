package com.solid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class SolidApplicationTests {

  @Test
  void shouldPass() {
    assertThat(true, is(true));
  }

  @Test
  void shouldThrowException() {
    assertThrows(IllegalArgumentException.class, () -> {
      throw new IllegalArgumentException("Illegal happening here...");
    });
  }

}
