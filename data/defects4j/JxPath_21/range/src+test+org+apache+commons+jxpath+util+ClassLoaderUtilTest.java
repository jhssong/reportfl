{
  "filepath": "/tmp/JxPath-21b/src/test/org/apache/commons/jxpath/util/ClassLoaderUtilTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ClassLoaderUtilTest",
      "is_interface": false,
      "parent_types": [
        "junit.framework.TestCase"
      ],
      "begin_line": 36,
      "end_line": 216,
      "comment": "\n * Tests org.apache.commons.jxpath.util.ClassLoaderUtil.\n * \n * @author John Trimble\n "
    },
    {
      "type": "field",
      "varNames": [
        "TEST_CASE_CLASS_NAME"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " special class loader which may be unable to load those classes."
    },
    {
      "type": "field",
      "varNames": [
        "EXAMPLE_CLASS_NAME"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "orginalContextClassLoader"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtilTest.setUp()",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n   * Setup for the tests.\n   ",
      "child_ranges": [
        "(line 50,col 5)-(line 50,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtilTest.tearDown()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n   * Cleanup for the tests.\n   ",
      "child_ranges": [
        "(line 57,col 5)-(line 57,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtilTest.testClassLoadFailWithoutContextClassLoader()",
      "begin_line": 64,
      "end_line": 68,
      "comment": "\n   * Tests that JXPath cannot dynamically load a class, which is not visible to\n   * its class loader, when the context class loader is null.\n   ",
      "child_ranges": [
        "(line 65,col 5)-(line 65,col 55)",
        "(line 66,col 5)-(line 66,col 70)",
        "(line 67,col 5)-(line 67,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtilTest.testClassLoadSuccessWithContextClassLoader()",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n   * Tests that JXPath can dynamically load a class, which is not visible to \n   * its class loader, when the context class loader is set and can load the\n   * class.\n   ",
      "child_ranges": [
        "(line 76,col 5)-(line 76,col 78)",
        "(line 77,col 5)-(line 77,col 70)",
        "(line 78,col 5)-(line 78,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtilTest.testCurrentClassLoaderFallback()",
      "begin_line": 86,
      "end_line": 90,
      "comment": "\n   * Tests that JXPath will use its class loader to dynamically load a \n   * requested class when the context class loader is set but unable to load\n   * the class.\n   ",
      "child_ranges": [
        "(line 87,col 5)-(line 87,col 70)",
        "(line 88,col 5)-(line 88,col 53)",
        "(line 89,col 5)-(line 89,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtilTest.testClassLoadSuccessWithoutContextClassLoader()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n   * Tests that JXPath can dynamically load a class, which is visible to\n   * its class loader, when there is no context class loader set.\n   ",
      "child_ranges": [
        "(line 97,col 5)-(line 97,col 55)",
        "(line 98,col 5)-(line 98,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtilTest.callExampleMessageMethodAndAssertClassNotFoundJXPathException()",
      "begin_line": 105,
      "end_line": 113,
      "comment": "\n   * Performs a basic query that requires a class be loaded dynamically by\n   * JXPath and asserts the dynamic class load fails.\n   ",
      "child_ranges": [
        "(line 106,col 5)-(line 106,col 67)",
        "(line 107,col 5)-(line 112,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtilTest.callExampleMessageMethodAndAssertSuccess()",
      "begin_line": 119,
      "end_line": 128,
      "comment": "\n   * Performs a basic query that requires a class be loaded dynamically by\n   * JXPath and asserts the dynamic class load succeeds.\n   ",
      "child_ranges": [
        "(line 120,col 5)-(line 120,col 67)",
        "(line 121,col 5)-(line 121,col 17)",
        "(line 122,col 5)-(line 127,col 5)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtilTest.executeTestMethodUnderClassLoader(java.lang.ClassLoader, java.lang.String)",
      "begin_line": 138,
      "end_line": 166,
      "comment": "\n   * Loads this class through the given class loader and then invokes the \n   * indicated no argument static method of the class.\n   * \n   * @param cl the class loader under which to invoke the method.\n   * @param methodName the name of the static no argument method on this class\n   * to invoke.\n   ",
      "child_ranges": [
        "(line 139,col 5)-(line 139,col 27)",
        "(line 140,col 5)-(line 144,col 5)",
        "(line 145,col 5)-(line 145,col 29)",
        "(line 146,col 5)-(line 152,col 5)",
        "(line 154,col 5)-(line 165,col 5)"
      ]
    },
    {
      "type": "class_interface",
      "name": "TestClassLoader",
      "is_interface": false,
      "parent_types": [
        "java.lang.ClassLoader"
      ],
      "begin_line": 178,
      "end_line": 215,
      "comment": "\n   * A simple class loader which delegates all class loading to its parent \n   * with two exceptions. First, attempts to load the class \n   * \u003ccode\u003eorg.apache.commons.jxpath.util.ClassLoaderUtilTest\u003c/code\u003e will\n   * always result in a ClassNotFoundException. Second, loading the class\n   * \u003ccode\u003eorg.apache.commons.jxpath.util.ClassLoadingExampleClass\u003c/code\u003e will \n   * result in the class being loaded by this class loader, regardless of \n   * whether the parent can/has loaded it. \n   *\n   "
    },
    {
      "type": "field",
      "varNames": [
        "testCaseClass"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtilTest.TestClassLoader.TestClassLoader(java.lang.ClassLoader)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "",
      "child_ranges": [
        "(line 182,col 7)-(line 182,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.util.ClassLoaderUtilTest.TestClassLoader.loadClass(java.lang.String, boolean)",
      "begin_line": 185,
      "end_line": 214,
      "comment": "",
      "child_ranges": [
        "(line 186,col 7)-(line 212,col 7)",
        "(line 213,col 7)-(line 213,col 46)"
      ]
    }
  ]
}