{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/exception/ContextedRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContextedRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.lang3.exception.ExceptionContext"
      ],
      "begin_line": 67,
      "end_line": 209,
      "comment": "\n * \u003cp\u003e\n * A runtime exception that provides an easy and safe way to add contextual information.\n * \u003c/p\u003e\u003cp\u003e\n * An exception trace itself is often insufficient to provide rapid diagnosis of the issue.\n * Frequently what is needed is a select few pieces of local contextual data.\n * Providing this data is tricky however, due to concerns over formatting and nulls.\n * \u003c/p\u003e\u003cp\u003e\n * The contexted exception approach allows the exception to be created together with a\n * map of context values. This additional information is automatically included in the\n * message and printed stack trace.\n * \u003c/p\u003e\u003cp\u003e\n * An checked version of this exception is provided by ContextedException.\n * \u003c/p\u003e\n * \u003cp\u003e\n * To use this class write code as follows:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   try {\n *     ...\n *   } catch (Exception e) {\n *     throw new ContextedException(\"Error posting account transaction\", e)\n *          .addValue(\"accountNumber\", accountNumber)\n *          .addValue(\"amountPosted\", amountPosted)\n *          .addValue(\"previousBalance\", previousBalance)\n *   }\n * }\n * \u003c/pre\u003e\n * \u003c/p\u003e\u003cp\u003e\n * The output in a printStacktrace() (which often is written to a log) would look something like the following:\n * \u003cpre\u003e\n * org.apache.commons.lang3.exception.ContextedRuntimeException: java.lang.Exception: Error posting account transaction\n *  Exception Context:\n *  [accountNumber\u003dnull]\n *  [amountPosted\u003d100.00]\n *  [previousBalance\u003d-2.17]\n *\n *  ---------------------------------\n *  at org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testAddValue(ContextedExceptionTest.java:88)\n *  ..... (rest of trace)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n * \n * @see ContextedException\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " The serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "exceptionContext"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " The context where the data is stored. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Instantiates ContextedRuntimeException without message or cause.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 16)",
        "(line 81,col 9)-(line 81,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * Instantiates ContextedRuntimeException with message, but without cause.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     * \n     * @param message  the exception message, may be null\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 23)",
        "(line 93,col 9)-(line 93,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.Throwable)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause, but without message.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     * \n     * @param cause  the underlying cause of the exception, may be null\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 21)",
        "(line 105,col 9)-(line 105,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String, java.lang.Throwable)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause and message.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     * \n     * @param message  the exception message, may be null\n     * @param cause  the underlying cause of the exception, may be null\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 30)",
        "(line 118,col 9)-(line 118,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String, java.lang.Throwable, org.apache.commons.lang3.exception.ExceptionContext)",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause, message, and ExceptionContext.\n     * \n     * @param message  the exception message, may be null\n     * @param cause  the underlying cause of the exception, may be null\n     * @param context  the context used to store the additional information, null uses default implementation\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 30)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.addValue(java.lang.String, java.lang.Object)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * Adds information helpful to a developer in diagnosing and correcting\n     * the problem.  For the information to be meaningful, the value passed\n     * should have a reasonable toString() implementation. If the added label\n     * is already available, the label is appended with an index.\n     * \u003cp\u003e\n     * Note: This exception is only serializable if the object added is serializable.\n     * \u003c/p\u003e\n     * \n     * @param label  a textual label associated with information, null not recommended\n     * @param value  information needed to understand exception, may be null\n     * @return this, for method chaining\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 48)",
        "(line 152,col 9)-(line 152,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.replaceValue(java.lang.String, java.lang.Object)",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * Replaces information helpful to a developer in diagnosing and correcting\n     * the problem.  For the information to be meaningful, the value passed\n     * should have a reasonable toString() implementation. If the replaced\n     * label does not yet exist, it is simply added.\n     * \u003cp\u003e\n     * Note: This exception is only serializable if the object added is serializable.\n     * \u003c/p\u003e\n     * \n     * @param label  a textual label associated with information, null not recommended\n     * @param value  information needed to understand exception, may be null\n     * @return this, for method chaining\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 52)",
        "(line 170,col 9)-(line 170,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getValue(java.lang.String)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Retrieves a contextual data value associated with the label.\n     * \n     * @param label  the label to get the contextual value for, may be null\n     * @return the contextual value associated with the label, may be null\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getLabelSet()",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Retrieves the labels defined in the contextual data.\n     * \n     * @return the set of labels, never null\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getMessage()",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Provides the message explaining the exception, including the contextual data.\n     * \n     * @see java.lang.Throwable#getMessage()\n     * @return the message, never null\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 74)"
      ]
    }
  ]
}