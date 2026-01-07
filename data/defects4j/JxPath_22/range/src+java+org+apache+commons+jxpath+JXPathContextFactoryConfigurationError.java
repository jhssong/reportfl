{
  "filepath": "/tmp/JxPath-22b/src/java/org/apache/commons/jxpath/JXPathContextFactoryConfigurationError.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathContextFactoryConfigurationError",
      "is_interface": false,
      "parent_types": [
        "java.lang.Error"
      ],
      "begin_line": 28,
      "end_line": 104,
      "comment": "\n * Thrown when a problem with configuration with the {@link JXPathContextFactory JXPathContextFactories}\n * exists. This error will typically be thrown when the class of a\n * factory specified in the system properties cannot be found\n * or instantiated.\n *\n * @author Dmitri Plotnikov\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "exception"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " @serial "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathContextFactoryConfigurationError.JXPathContextFactoryConfigurationError()",
      "begin_line": 37,
      "end_line": 40,
      "comment": "\n     * Create a new \u003ccode\u003eJXPathContextFactoryConfigurationError\u003c/code\u003e with no\n     * detail mesage.\n     ",
      "child_ranges": [
        "(line 38,col 10)-(line 38,col 17)",
        "(line 39,col 10)-(line 39,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathContextFactoryConfigurationError.JXPathContextFactoryConfigurationError(java.lang.String)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Create a new \u003ccode\u003eJXPathContextFactoryConfigurationError\u003c/code\u003e with\n     * the \u003ccode\u003eString \u003c/code\u003e specified as an error message.\n     *\n     * @param msg The error message for the exception.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 19)",
        "(line 50,col 9)-(line 50,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathContextFactoryConfigurationError.JXPathContextFactoryConfigurationError(java.lang.Exception)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Create a new \u003ccode\u003eJXPathContextFactoryConfigurationError\u003c/code\u003e with a\n     * given \u003ccode\u003eException\u003c/code\u003e base cause of the error.\n     *\n     * @param e The exception to be encapsulated in a\n     * JXPathContextFactoryConfigurationError.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 28)",
        "(line 63,col 9)-(line 63,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathContextFactoryConfigurationError.JXPathContextFactoryConfigurationError(java.lang.Exception, java.lang.String)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Create a new \u003ccode\u003eJXPathContextFactoryConfigurationError\u003c/code\u003e with the\n     * given \u003ccode\u003eException\u003c/code\u003e base cause and detail message.\n     *\n     * @param e The exception to be encapsulated in a\n     * JXPathContextFactoryConfigurationError\n     * @param msg The detail message.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 19)",
        "(line 76,col 9)-(line 76,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContextFactoryConfigurationError.getMessage()",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * Return the message (if any) for this error . If there is no\n     * message for the exception and there is an encapsulated\n     * exception then the message of that exception will be returned.\n     *\n     * @return The error message.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 44)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathContextFactoryConfigurationError.getException()",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Return the actual exception (if any) that caused this exception to\n     * be raised.\n     *\n     * @return The encapsulated exception, or null if there is none.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 25)"
      ]
    }
  ]
}