/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 19 03:26:37 GMT 2024
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import java.io.Reader;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("l<!iTT", "gBZ");
      assertEquals("gBZ", document0.baseUri());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      PipedReader pipedReader0 = new PipedReader();
      // Undeclared exception!
      try { 
        parser0.parseInput((Reader) pipedReader0, "7dY>_H$$");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      Parser parser0 = new Parser(xmlTreeBuilder0);
      Parser parser1 = parser0.setTrackErrors(52);
      // Undeclared exception!
      try { 
        parser1.parseInput((String) null, "4N");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      parser0.parseInput(" djNz", " djNz");
      assertFalse(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Document document0 = new Document("\u0003}W`Mzs57;Vt-0c");
      List<Node> list0 = Parser.parseFragment("DoctypePublicIdentifier_doubleQuoted", (Element) document0, "\u0003}W`Mzs57;Vt-0c", (ParseErrorList) null);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      parser0.settings();
      assertFalse(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      parser0.getTreeBuilder();
      assertFalse(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      parser0.getErrors();
      assertFalse(parser0.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      parser0.setTrackErrors(51);
      PipedReader pipedReader0 = new PipedReader(100);
      // Undeclared exception!
      try { 
        parser0.parseInput((Reader) pipedReader0, "jGv3<kR4X");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document document0 = Parser.parseBodyFragmentRelaxed(";\":(z=OR#CJ%", "");
      assertEquals("", document0.location());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parser.parseXmlFragment(")I}Kajak", ";\":(z=OR#CJ%");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parser parser0 = Parser.htmlParser();
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Parser parser1 = parser0.settings(parseSettings0);
      assertFalse(parser1.isTrackErrors());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = Parser.unescapeEntities("", false);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parser parser0 = Parser.xmlParser();
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Parser parser1 = parser0.setTreeBuilder(htmlTreeBuilder0);
      assertFalse(parser1.isTrackErrors());
  }
}
