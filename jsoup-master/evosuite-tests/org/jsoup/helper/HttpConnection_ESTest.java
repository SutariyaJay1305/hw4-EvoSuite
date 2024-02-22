/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 19 03:03:05 GMT 2024
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownServiceException;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HttpConnection_ESTest extends HttpConnection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.timeout(1744);
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request1.url = uRL0;
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("A", "p y0Sf,i\u0005Q");
      httpConnection_Request0.data((Connection.KeyVal) httpConnection_KeyVal0);
      httpConnection_Request0.data((Connection.KeyVal) httpConnection_KeyVal0);
      try { 
        HttpConnection.Response.execute(httpConnection_Request0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // HTTP error fetching URL
         //
         verifyException("org.jsoup.helper.HttpConnection$Response", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.proxy("p y0Sf,i\u0005Q", 1744);
      Connection.Method connection_Method0 = Connection.Method.PATCH;
      HttpConnection.Request httpConnection_Request2 = (HttpConnection.Request)httpConnection_Request0.method(connection_Method0);
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request1.url = uRL0;
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("p y0Sf,i\u0005Q", "p y0Sf,i\u0005Q");
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      httpConnection_KeyVal0.inputStream((InputStream) sequenceInputStream0);
      httpConnection_Request1.data((Connection.KeyVal) httpConnection_KeyVal0);
      try { 
        HttpConnection.Response.execute(httpConnection_Request2);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // java.lang.UnsupportedOperationException: Method not implemented.
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("onc?~t}n*8.}d");
      hashMap0.put("onc?~t}n*8.}d", linkedList0);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      assertEquals(0, httpConnection_Response0.statusCode());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      hashMap0.put((String) null, (List<String>) null);
      httpConnection_Response0.processResponseHeaders(hashMap0);
      assertNull(httpConnection_Response0.statusMessage());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.timeout(1744);
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request1.url = uRL0;
      httpConnection_Request0.cookie("A", "/GIc");
      try { 
        HttpConnection.Response.execute(httpConnection_Request1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // HTTP error fetching URL
         //
         verifyException("org.jsoup.helper.HttpConnection$Response", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.proxy("p y0Sf,i\u0005Q", 1744);
      Connection.Method connection_Method0 = Connection.Method.PATCH;
      HttpConnection.Request httpConnection_Request2 = (HttpConnection.Request)httpConnection_Request0.method(connection_Method0);
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request1.url = uRL0;
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("p y0Sf,i\u0005Q", "p y0Sf,i\u0005Q");
      httpConnection_Request1.requestBody("LO'=}Gl:}");
      httpConnection_Request2.data((Connection.KeyVal) httpConnection_KeyVal0);
      try { 
        HttpConnection.Response.execute(httpConnection_Request0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // java.lang.UnsupportedOperationException: Method not implemented.
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.timeout(1744);
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request1.url = uRL0;
      Connection.Method connection_Method0 = Connection.Method.POST;
      httpConnection_Request1.method(connection_Method0);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("A", "p y0Sf,i\u0005Q");
      httpConnection_Request1.data((Connection.KeyVal) httpConnection_KeyVal0);
      try { 
        HttpConnection.Response.execute(httpConnection_Request1);
        fail("Expecting exception: UnknownServiceException");
      
      } catch(UnknownServiceException e) {
         //
         // protocol doesn't support output
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.timeout(1744);
      URL uRL0 = MockURL.getFtpExample();
      httpConnection_Request1.url = uRL0;
      try { 
        HttpConnection.Response.execute(httpConnection_Request0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // Only http & https protocols supported
         //
         verifyException("org.jsoup.helper.HttpConnection$Response", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      // Undeclared exception!
      try { 
        httpConnection_Request0.postDataCharset("time");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // time
         //
         verifyException("org.jsoup.helper.HttpConnection$Request", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      httpConnection_Request0.maxBodySize(1744);
      assertEquals(1744, httpConnection_Request0.maxBodySize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      // Undeclared exception!
      try { 
        httpConnection_Request0.maxBodySize((-1824));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxSize must be 0 (unlimited) or larger
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      // Undeclared exception!
      try { 
        httpConnection_Request0.timeout((-1606));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Timeout milliseconds must be 0 (infinite) or greater
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.Request httpConnection_Request1 = (HttpConnection.Request)httpConnection_Request0.header("accept-encoding", "accept-encoding");
      assertEquals(30000, httpConnection_Request1.timeout());
      assertFalse(httpConnection_Request1.ignoreHttpErrors());
      assertTrue(httpConnection_Request1.followRedirects());
      assertEquals(1048576, httpConnection_Request1.maxBodySize());
      assertFalse(httpConnection_Request1.ignoreContentType());
      assertEquals("UTF-8", httpConnection_Request1.postDataCharset());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.Request httpConnection_Request1 = (HttpConnection.Request)httpConnection_Request0.addHeader("accept-encoding", "accept-encoding");
      assertEquals(30000, httpConnection_Request1.timeout());
      assertEquals(1048576, httpConnection_Request1.maxBodySize());
      assertFalse(httpConnection_Request1.ignoreContentType());
      assertTrue(httpConnection_Request1.validateTLSCertificates());
      assertTrue(httpConnection_Request1.followRedirects());
      assertEquals("UTF-8", httpConnection_Request1.postDataCharset());
      assertFalse(httpConnection_Request1.ignoreHttpErrors());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.Request httpConnection_Request1 = (HttpConnection.Request)httpConnection_Request0.header("p y0Sf,i\u0005Q", (String) null);
      assertFalse(httpConnection_Request1.ignoreContentType());
      assertEquals("UTF-8", httpConnection_Request1.postDataCharset());
      assertEquals(1048576, httpConnection_Request1.maxBodySize());
      assertEquals(30000, httpConnection_Request1.timeout());
      assertTrue(httpConnection_Request1.validateTLSCertificates());
      assertFalse(httpConnection_Request1.ignoreHttpErrors());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("od=ch*", "V<_xA7``;-L*C7(");
      String string0 = httpConnection_KeyVal0.toString();
      assertEquals("od=ch*=V<_xA7``;-L*C7(", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("ngu", "ngu");
      Connection.KeyVal connection_KeyVal0 = httpConnection_KeyVal0.contentType("bjgrcoxx@'|{ci's");
      assertSame(httpConnection_KeyVal0, connection_KeyVal0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("ngu", "ngu");
      String string0 = httpConnection_KeyVal0.contentType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("ngu", "ngu");
      InputStream inputStream0 = httpConnection_KeyVal0.inputStream();
      assertNull(inputStream0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      int int0 = httpConnection_Response0.statusCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = httpConnection_Response0.charset();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        httpConnection_Response0.bodyAsBytes();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      String string0 = httpConnection_Response0.statusMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        httpConnection_Response0.bodyStream();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      // Undeclared exception!
      try { 
        httpConnection_Response0.bufferUp();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Request must be executed (with .execute(), .get(), or .post() before getting response body
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HttpConnection.Response httpConnection_Response1 = httpConnection_Response0.charset("Fyd}gcz+X");
      assertEquals("Fyd}gcz+X", httpConnection_Response1.charset());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.encodeUrl(httpConnection_Request0.url);
      assertEquals(30000, httpConnection_Request0.timeout());
      assertFalse(httpConnection_Request0.ignoreHttpErrors());
      assertTrue(httpConnection_Request0.followRedirects());
      assertEquals(1048576, httpConnection_Request0.maxBodySize());
      assertEquals("UTF-8", httpConnection_Request0.postDataCharset());
      assertFalse(httpConnection_Request0.ignoreContentType());
      assertTrue(httpConnection_Request0.validateTLSCertificates());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpConnection.connect("http");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: http
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpConnection.connect((URL) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // URL must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      HttpConnection.Response httpConnection_Response0 = new HttpConnection.Response();
      HttpConnection.Response httpConnection_Response1 = (HttpConnection.Response)httpConnection_Response0.removeCookie("application/x-www-form-urlencoded");
      assertNull(httpConnection_Response1.contentType());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      boolean boolean0 = httpConnection_Request0.followRedirects();
      assertTrue(boolean0);
      assertFalse(httpConnection_Request0.ignoreContentType());
      assertEquals("UTF-8", httpConnection_Request0.postDataCharset());
      assertEquals(30000, httpConnection_Request0.timeout());
      assertTrue(httpConnection_Request0.validateTLSCertificates());
      assertEquals(1048576, httpConnection_Request0.maxBodySize());
      assertFalse(httpConnection_Request0.ignoreHttpErrors());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      assertTrue(httpConnection_Request0.validateTLSCertificates());
      
      httpConnection_Request0.validateTLSCertificates(false);
      assertFalse(httpConnection_Request0.validateTLSCertificates());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      boolean boolean0 = httpConnection_Request0.validateTLSCertificates();
      assertTrue(httpConnection_Request0.followRedirects());
      assertEquals(1048576, httpConnection_Request0.maxBodySize());
      assertFalse(httpConnection_Request0.ignoreContentType());
      assertEquals("UTF-8", httpConnection_Request0.postDataCharset());
      assertEquals(30000, httpConnection_Request0.timeout());
      assertFalse(httpConnection_Request0.ignoreHttpErrors());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.proxy((Proxy) null);
      assertFalse(httpConnection_Request1.ignoreHttpErrors());
      assertEquals(30000, httpConnection_Request1.timeout());
      assertEquals(1048576, httpConnection_Request1.maxBodySize());
      assertFalse(httpConnection_Request1.ignoreContentType());
      assertEquals("UTF-8", httpConnection_Request1.postDataCharset());
      assertTrue(httpConnection_Request1.validateTLSCertificates());
      assertTrue(httpConnection_Request1.followRedirects());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      Connection.Request connection_Request0 = httpConnection_Request0.ignoreContentType(false);
      assertEquals(30000, connection_Request0.timeout());
      assertTrue(connection_Request0.validateTLSCertificates());
      assertFalse(connection_Request0.ignoreHttpErrors());
      assertTrue(connection_Request0.followRedirects());
      assertFalse(httpConnection_Request0.ignoreContentType());
      assertEquals(1048576, connection_Request0.maxBodySize());
      assertEquals("UTF-8", connection_Request0.postDataCharset());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.parser((Parser) null);
      assertEquals(1048576, httpConnection_Request1.maxBodySize());
      assertTrue(httpConnection_Request1.validateTLSCertificates());
      assertTrue(httpConnection_Request1.followRedirects());
      assertFalse(httpConnection_Request1.ignoreContentType());
      assertEquals("UTF-8", httpConnection_Request1.postDataCharset());
      assertFalse(httpConnection_Request1.ignoreHttpErrors());
      assertEquals(30000, httpConnection_Request1.timeout());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      HttpConnection.KeyVal httpConnection_KeyVal0 = HttpConnection.KeyVal.create("application/x-www-form-urlencoded", "@woj;W", (InputStream) sequenceInputStream0);
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.data((Connection.KeyVal) httpConnection_KeyVal0);
      assertFalse(httpConnection_Request1.ignoreHttpErrors());
      assertEquals(1048576, httpConnection_Request1.maxBodySize());
      assertEquals(30000, httpConnection_Request1.timeout());
      assertEquals("@woj;W", httpConnection_KeyVal0.value());
      assertEquals("application/x-www-form-urlencoded", httpConnection_KeyVal0.key());
      assertFalse(httpConnection_Request1.ignoreContentType());
      assertEquals("UTF-8", httpConnection_Request1.postDataCharset());
      assertTrue(httpConnection_Request1.followRedirects());
      assertTrue(httpConnection_Request1.validateTLSCertificates());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      boolean boolean0 = httpConnection_Request0.ignoreContentType();
      assertFalse(httpConnection_Request0.ignoreHttpErrors());
      assertEquals(30000, httpConnection_Request0.timeout());
      assertTrue(httpConnection_Request0.validateTLSCertificates());
      assertFalse(boolean0);
      assertTrue(httpConnection_Request0.followRedirects());
      assertEquals(1048576, httpConnection_Request0.maxBodySize());
      assertEquals("UTF-8", httpConnection_Request0.postDataCharset());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, ":7");
      HttpConnection.Request httpConnection_Request1 = httpConnection_Request0.timeout(1744);
      URL uRL0 = MockURL.getHttpExample();
      httpConnection_Request1.url = uRL0;
      HttpConnection.Response httpConnection_Response0 = HttpConnection.Response.execute(httpConnection_Request1);
      httpConnection_Response0.parse();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      assertFalse(httpConnection_Request0.ignoreHttpErrors());
      
      httpConnection_Request0.ignoreHttpErrors(true);
      assertTrue(httpConnection_Request0.ignoreHttpErrors());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      HttpConnection.Request httpConnection_Request0 = new HttpConnection.Request();
      Connection.Request connection_Request0 = httpConnection_Request0.followRedirects(true);
      assertEquals("UTF-8", connection_Request0.postDataCharset());
      assertEquals(30000, connection_Request0.timeout());
      assertEquals(1048576, connection_Request0.maxBodySize());
      assertFalse(connection_Request0.ignoreContentType());
      assertTrue(httpConnection_Request0.followRedirects());
      assertTrue(connection_Request0.validateTLSCertificates());
      assertFalse(connection_Request0.ignoreHttpErrors());
  }
}
