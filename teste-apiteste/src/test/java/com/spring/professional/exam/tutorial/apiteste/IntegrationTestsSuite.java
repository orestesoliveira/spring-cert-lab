package com.spring.professional.exam.tutorial.apiteste;

import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;
import org.junit.runner.RunWith;

@RunWith(WildcardPatternSuite.class)
@SuiteClasses("**/*IntegrationTest[0-9]*.class")
public class IntegrationTestsSuite {
}