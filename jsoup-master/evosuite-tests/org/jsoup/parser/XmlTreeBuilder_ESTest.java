/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 19 03:30:17 GMT 2024
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlTreeBuilder_ESTest extends XmlTreeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      StringReader stringReader0 = new StringReader(">");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = xmlTreeBuilder0.defaultSettings();
      xmlTreeBuilder0.initialiseParse(stringReader0, "", parseErrorList0, parseSettings0);
      boolean boolean0 = xmlTreeBuilder0.processEndTag(">");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.CData token_CData0 = new Token.CData("");
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert(token_CData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.Comment token_Comment0 = new Token.Comment();
      token_Comment0.bogus = true;
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert(token_Comment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      StringReader stringReader0 = new StringReader(">");
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = xmlTreeBuilder0.defaultSettings();
      xmlTreeBuilder0.initialiseParse(stringReader0, "", parseErrorList0, parseSettings0);
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendTagName('');
      Element element0 = xmlTreeBuilder0.insert(token_StartTag0);
      assertFalse(element0.isBlock());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.Comment token_Comment0 = new Token.Comment();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.process(token_Comment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.StartTag token_StartTag0 = new Token.StartTag();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.process(token_StartTag0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Document document0 = xmlTreeBuilder0.parse(">;a8[3S;[N", ">;a8[3S;[N");
      assertEquals(">;a8[3S;[N", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      StringReader stringReader0 = new StringReader(">");
      Document document0 = xmlTreeBuilder0.parse(stringReader0, ">V5r):$I");
      assertEquals(">V5r):$I", document0.location());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Token.Doctype token_Doctype0 = new Token.Doctype();
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.process(token_Doctype0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.XmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = xmlTreeBuilder0.defaultSettings();
      xmlTreeBuilder0.parseFragment("", "{$jx\"qV@Vo%t\"", parseErrorList0, parseSettings0);
  }
}
