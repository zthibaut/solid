package com.solid;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class MockSampleTest {

  @Mock
  SolidApplication app;

  @Test
  public void sample() {
    Object obj = new Object();
    given(app.hello(obj)).willReturn(true);

    boolean result = app.hello(obj);

    assertThat(result, is(true));
    verify(app).hello(obj);
  }
}
