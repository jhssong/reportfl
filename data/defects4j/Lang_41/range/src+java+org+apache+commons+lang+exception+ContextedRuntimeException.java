{
  "filepath": "/tmp/Lang-41b/src/java/org/apache/commons/lang/exception/ContextedRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContextedRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.lang.exception.ExceptionContext"
      ],
      "begin_line": 30,
      "end_line": 138,
      "comment": "\n * Provides an unchecked version of ContextedException\n * @see ContextedException\n * @author D. Ashmore\n * @author J\u0026ouml;rg Schaible\n * @since 3.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exceptionContext"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ContextedRuntimeException.ContextedRuntimeException()",
      "begin_line": 40,
      "end_line": 41,
      "comment": "\n     * Instantiates ContextedRuntimeException without message or cause.\n     * \u003cp\u003eDefaultExceptionContext used to store and format context information.\u003c/p\u003e\n     * \n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * Instantiates ContextedRuntimeException with message, but without cause.\n     * \u003cp\u003eDefaultExceptionContext used to store and format context information.\u003c/p\u003e\n     * @param message The exception message\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.Throwable)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause, but without message.\n     * \u003cp\u003eDefaultExceptionContext used to store and format context information.\u003c/p\u003e\n     * @param cause Exception creating need for ContextedRuntimeException\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String, java.lang.Throwable)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause and message.\n     * \u003cp\u003eDefaultExceptionContext used to store and format context information.\u003c/p\u003e\n     * @param message The exception message\n     * @param cause Exception creating need for ContextedException\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 97)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String, java.lang.Throwable, org.apache.commons.lang.exception.ExceptionContext)",
      "begin_line": 81,
      "end_line": 86,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause, message, and ExceptionContext.\n     * @param message The exception message\n     * @param cause Exception creating need for ContextedRuntimeException\n     * @param context Context used to store additional information\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 30)",
        "(line 83,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ContextedRuntimeException.addLabeledValue(java.lang.String, java.io.Serializable)",
      "begin_line": 97,
      "end_line": 100,
      "comment": "\n     * Adds information helpful to a developer in diagnosing and correcting\n     * the problem.  \n     * @see ContextedException#addLabeledValue(String, Serializable)\n     * @param label  a textual label associated with information\n     * @param value  information needed to understand exception.  May be \u003ccode\u003enull\u003c/code\u003e.\n     * @return this\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 60)",
        "(line 99,col 9)-(line 99,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ContextedRuntimeException.getLabeledValue(java.lang.String)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Convenience method to retrieve a value from the underlying ExceptionContext.\n     * @param label  a textual label associated with information\n     * @return value  information needed to understand exception.  May be \u003ccode\u003enull\u003c/code\u003e.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ContextedRuntimeException.getLabelSet()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * Convenience method to retrieve  currently defined labels from the underlying ExceptionContext.\n     * @return labelSet\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ContextedRuntimeException.getMessage()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * Provides message pertaining to exception.\n     * @see java.lang.Throwable#getMessage()\n     * @return message\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ContextedRuntimeException.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 79)"
      ]
    }
  ]
}