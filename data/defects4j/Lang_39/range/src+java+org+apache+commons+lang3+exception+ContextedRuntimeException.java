{
  "filepath": "/tmp/Lang-39b/src/java/org/apache/commons/lang3/exception/ContextedRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContextedRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception",
        "org.apache.commons.lang3.exception.ExceptionContext"
      ],
      "begin_line": 70,
      "end_line": 192,
      "comment": "\n * \u003cp\u003e\n * A runtime exception that provides an easy and safe way to add contextual information.\n * \u003c/p\u003e\u003cp\u003e\n * An exception trace itself is often insufficient to provide rapid diagnosis of the issue.\n * Frequently what is needed is a select few pieces of local contextual data.\n * Providing this data is tricky however, due to concerns over formatting and nulls.\n * \u003c/p\u003e\u003cp\u003e\n * The contexted exception approach allows the exception to be created together with a\n * map of context values. This additional information is automatically included in the\n * message and printed stack trace.\n * \u003c/p\u003e\u003cp\u003e\n * An checked version of this exception is provided by ContextedException.\n * \u003c/p\u003e\n * \u003cp\u003e\n * To use this class write code as follows:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   try {\n *     ...\n *   } catch (Throwable e) {\n *     throw new ContextedException(\"Error posting account transaction\", e)\n *          .addValue(\"accountNumber\", accountNumber)\n *          .addValue(\"amountPosted\", amountPosted)\n *          .addValue(\"previousBalance\", previousBalance)\n *   }\n * }\n * \u003c/pre\u003e\n * \u003c/p\u003e\u003cp\u003e\n * The output in a printStacktrace() (which often is written to a log) would look something like the following:\n * \u003cpre\u003e\n * org.apache.commons.lang3.exception.ContextedRuntimeException: java.lang.Exception: Error posting account transaction\n *  Exception Context:\n *  [accountNumber\u003dnull]\n *  [amountPosted\u003d100.00]\n *  [previousBalance\u003d-2.17]\n *\n *  ---------------------------------\n *  at org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testAddValue(ContextedExceptionTest.java:88)\n *  ..... (rest of trace)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n * \n * @see ContextedException\n * @author Apache Software Foundation\n * @author D. Ashmore\n * @author J\u0026ouml;rg Schaible\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " The serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "exceptionContext"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " The context where the data is stored. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException()",
      "begin_line": 82,
      "end_line": 85,
      "comment": "\n     * Instantiates ContextedRuntimeException without message or cause.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 16)",
        "(line 84,col 9)-(line 84,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Instantiates ContextedRuntimeException with message, but without cause.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     * \n     * @param message  the exception message, may be null\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 23)",
        "(line 96,col 9)-(line 96,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.Throwable)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause, but without message.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     * \n     * @param cause  the underlying cause of the exception, may be null\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 21)",
        "(line 108,col 9)-(line 108,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String, java.lang.Throwable)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause and message.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     * \n     * @param message  the exception message, may be null\n     * @param cause  the underlying cause of the exception, may be null\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 30)",
        "(line 121,col 9)-(line 121,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String, java.lang.Throwable, org.apache.commons.lang3.exception.ExceptionContext)",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause, message, and ExceptionContext.\n     * \n     * @param message  the exception message, may be null\n     * @param cause  the underlying cause of the exception, may be null\n     * @param context  the context used to store the additional information, null uses default implementation\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 30)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.addValue(java.lang.String, java.lang.Object)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * Adds information helpful to a developer in diagnosing and correcting\n     * the problem.  For the information to be meaningful, the value passed\n     * should have a reasonable toString() implementation.\n     * \u003cp\u003e\n     * Note: This exception is only serializable if the object added is serializable.\n     * \n     * @param label  a textual label associated with information, null not recommended\n     * @param value  information needed to understand exception, may be null\n     * @return this, for method chaining\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 48)",
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getValue(java.lang.String)",
      "begin_line": 162,
      "end_line": 164,
      "comment": "\n     * Retrieves a contextual data value associated with the label.\n     * \n     * @param label  the label to get the contextual value for, may be null\n     * @return the contextual value associated with the label, may be null\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getLabelSet()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Retrieves the labels defined in the contextual data.\n     * \n     * @return the set of labels, never null\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getMessage()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * Provides the message explaining the exception, including the contextual data.\n     * \n     * @see java.lang.Throwable#getMessage()\n     * @return the message, never null\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 74)"
      ]
    }
  ]
}