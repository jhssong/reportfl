{
  "filepath": "/tmp/JxPath-11b/src/java/org/apache/commons/jxpath/JXPathException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "JXPathException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 26,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 27,
      "end_line": 27,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exception"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " @serial "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathException.JXPathException()",
      "begin_line": 37,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 38,col 10)-(line 38,col 17)",
        "(line 39,col 10)-(line 39,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathException.JXPathException(java.lang.String)",
      "begin_line": 48,
      "end_line": 51,
      "comment": "\n     * Create a new \u003ccode\u003eJXPathException\u003c/code\u003e with\n     * the \u003ccode\u003eString \u003c/code\u003e specified as an error message.\n     *\n     * @param msg The error message for the exception.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 19)",
        "(line 50,col 9)-(line 50,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathException.JXPathException(java.lang.Throwable)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Create a new \u003ccode\u003eJXPathException\u003c/code\u003e with a\n     * given \u003ccode\u003eThrowable\u003c/code\u003e base cause of the error.\n     *\n     * @param e The exception to be encapsulated in a\n     * JXPathException.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 28)",
        "(line 63,col 9)-(line 63,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.jxpath.JXPathException.JXPathException(java.lang.String, java.lang.Throwable)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Create a new \u003ccode\u003eJXPathException\u003c/code\u003e with the\n     * given \u003ccode\u003eException\u003c/code\u003e base cause and detail message.\n     *\n     * @param e The exception to be encapsulated in a\n     * JXPathException\n     * @param msg The detail message.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 19)",
        "(line 76,col 9)-(line 76,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathException.getMessage()",
      "begin_line": 87,
      "end_line": 99,
      "comment": "\n     * Return the message (if any) for this error . If there is no\n     * message for the exception and there is an encapsulated\n     * exception then the message of that exception will be returned.\n     *\n     * @return The error message.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 44)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 46)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 45)",
        "(line 97,col 9)-(line 97,col 73)",
        "(line 98,col 9)-(line 98,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathException.getException()",
      "begin_line": 107,
      "end_line": 109,
      "comment": "\n     * Return the actual exception (if any) that caused this exception to\n     * be raised.\n     *\n     * @return The encapsulated exception, or null if there is none.\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.jxpath.JXPathException.getCause()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Same as {@link #getException() getException()}\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 25)"
      ]
    }
  ]
}