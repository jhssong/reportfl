{
  "filepath": "/tmp/Lang-40b/src/java/org/apache/commons/lang/exception/ContextedException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContextedException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception",
        "org.apache.commons.lang.exception.ExceptionContext"
      ],
      "begin_line": 75,
      "end_line": 184,
      "comment": "\n * Provides an easier and safer way for developers to provide context when\n * generating checked exceptions.  Often, additional information, besides what\u0027s\n * embedded in the exception cause, is needed for developers to debug and correct \n * a bug.  Often, this additional information can reduce the time it takes\n * to replicate and fix a bug.\n * \n * \u003cp\u003eContextedException is easier as developers don\u0027t need to be concerned \n * with formatting the exception message to include additional information \n * with the exception.  Additional information is automatically included\n * in the message and printed stack trace.  This often thins out exception\n * handling code.\u003c/p\u003e\n * \n * \u003cp\u003eContextedException is safer as the additional code needed to embed additional\n * information in a normal exception tends to be tested less and is more vulnerable\n * to errors such as null pointer exceptions.\u003c/p\u003e\n * \n * \u003cp\u003eAn unchecked version of this exception is provided by ContextedRuntimeException.\u003c/p\u003e\n * \n * \u003cp\u003eTo use this class write code as follows:\u003c/p\u003e\n *\n * \u003cpre\u003e\n *   try {\n * \n *   ...\n * \n *   } catch (Throwable e) {\n *     throw new ContextedException(\"Error posting account transaction\", e)\n *          .addLabeledValue(\"accountNumber\", accountNumber)\n *          .addLabeledValue(\"amountPosted\", amountPosted)\n *          .addLabeledValue(\"previousBalance\", previousBalance)\n *   }\n * }\n * \u003c/pre\u003e\n * \n * \u003cp\u003eThe output in a printStacktrace() (which often is written to a log) would look something like the following:\n * \u003cpre\u003e\n * org.apache.commons.lang.exception.ContextedException: java.lang.Exception: Error posting account transaction\n *  Exception Context:\n *  [accountNumber\u003dnull]\n *  [amountPosted\u003d100.00]\n *  [previousBalance\u003d-2.17]\n *\n *  ---------------------------------\n *  at org.apache.commons.lang.exception.ContextedExceptionTest.testAddLabeledValue(ContextedExceptionTest.java:88)\n *  ..... (rest of trace)\n * \u003c/pre\u003e\n * \n * @see ContextedRuntimeException\n * @author D. Ashmore\n * @since 3.0\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "exceptionContext"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ContextedException.ContextedException()",
      "begin_line": 84,
      "end_line": 85,
      "comment": "\n     * Instantiates ContextedException without message or cause.\n     * \u003cp\u003eDefaultExceptionContext used to store and format context information.\u003c/p\u003e\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ContextedException.ContextedException(java.lang.String)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "\n     * Instantiates ContextedException with message, but without cause.\n     * \u003cp\u003eDefaultExceptionContext used to store and format context information.\u003c/p\u003e\n     * @param message The exception message\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ContextedException.ContextedException(java.lang.Throwable)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Instantiates ContextedException with cause, but without message.\n     * \u003cp\u003eDefaultExceptionContext used to store and format context information.\u003c/p\u003e\n     * @param cause Exception creating need for ContextedException\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ContextedException.ContextedException(java.lang.String, java.lang.Throwable)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Instantiates ContextedException with cause and message.\n     * \u003cp\u003eDefaultExceptionContext used to store and format context information.\u003c/p\u003e\n     * @param message The exception message\n     * @param cause Exception creating need for ContextedException\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.exception.ContextedException.ContextedException(java.lang.String, java.lang.Throwable, org.apache.commons.lang.exception.ExceptionContext)",
      "begin_line": 122,
      "end_line": 127,
      "comment": "\n     * Instantiates ContextedException with cause, message, and ExceptionContext.\n     * @param message The exception message\n     * @param cause Exception creating need for ContextedException\n     * @param context Context used to store additional information\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 30)",
        "(line 124,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ContextedException.addLabeledValue(java.lang.String, java.io.Serializable)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n     * Adds information helpful to a developer in diagnosing and correcting\n     * the problem.  For the information to be meaningful, the value passed\n     * should have a reasonable toString() implementation.\n     * \n     * \u003cp\u003eNote:  If the value provided isn\u0027t Serializable, one solution would be\n     * to provide its toString() if it has a meaningful implementation or \n     * individual properties of the value object instead.\u003c/p\u003e\n     * @param label  a textual label associated with information\n     * @param value  information needed to understand exception.  May be \u003ccode\u003enull\u003c/code\u003e.\n     * @return this\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 60)",
        "(line 145,col 9)-(line 145,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ContextedException.getLabeledValue(java.lang.String)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Convenience method to retrieve a value from the underlying ExceptionContext.\n     * @param label  a textual label associated with information\n     * @return value  information needed to understand exception.  May be \u003ccode\u003enull\u003c/code\u003e.\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ContextedException.getLabelSet()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Convenience method to retrieve currently defined labels from the underlying ExceptionContext.\n     * @return labelSet\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ContextedException.getMessage()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Provides message pertaining to exception.\n     * @see java.lang.Throwable#getMessage()\n     * @return message\n     * @since 3.0\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.exception.ContextedException.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 79)"
      ]
    }
  ]
}