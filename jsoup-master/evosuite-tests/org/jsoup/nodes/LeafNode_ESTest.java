/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 19 02:53:12 GMT 2024
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LeafNode_ESTest extends LeafNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("org.jsoup.parser.ParseErrorList");
      DataNode dataNode0 = new DataNode("org.jsoup.parser.ParseErrorList", (String) null);
      dataNode0.parentNode = (Node) cDataNode0;
      String string0 = dataNode0.baseUri();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("2)GjS", "Leaf Nodes do not have child nodes.", false);
      String string0 = xmlDeclaration0.attr("2)GjS");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "org.jsoup.select.Evaluator$AttributeWithValueMatching", "org.jsoup.select.Evaluator$AttributeWithValueMatching", "org.jsoup.select.Evaluator$AttributeWithValueMatching");
      documentType0.setBaseUri("A:;'6M6");
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode(":YJ#`");
      TextNode textNode0 = cDataNode0.text(":YJ#`");
      assertEquals("#cdata", textNode0.nodeName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("84mAvci0=93g\"st9(%m", "", "84mAvci0=93g\"st9(%m", "84mAvci0=93g\"st9(%m", "84mAvci0=93g\"st9(%m");
      String string0 = documentType0.absUrl("*N");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("[a-zA-Z_:][-a-zA-Z0-9_:.]*", "}ucY xqRsbCT;0)Or", "", "}ucY xqRsbCT;0)Or");
      // Undeclared exception!
      try { 
        documentType0.ensureChildNodes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Leaf Nodes do not have child nodes.
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TextNode textNode0 = new TextNode("");
      Node node0 = textNode0.removeAttr("");
      assertFalse(node0.hasParent());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode(":YJ#`");
      cDataNode0.toString();
  }
}
