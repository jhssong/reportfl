{
  "filepath": "/tmp/Lang-7b/src/main/java/org/apache/commons/lang3/exception/ContextedRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ContextedRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.lang3.exception.ExceptionContext"
      ],
      "begin_line": 84,
      "end_line": 254,
      "comment": "\n * \u003cp\u003e\n * A runtime exception that provides an easy and safe way to add contextual information.\n * \u003c/p\u003e\u003cp\u003e\n * An exception trace itself is often insufficient to provide rapid diagnosis of the issue.\n * Frequently what is needed is a select few pieces of local contextual data.\n * Providing this data is tricky however, due to concerns over formatting and nulls.\n * \u003c/p\u003e\u003cp\u003e\n * The contexted exception approach allows the exception to be created together with a\n * list of context label-value pairs. This additional information is automatically included in\n * the message and printed stack trace.\n * \u003c/p\u003e\u003cp\u003e\n * A checked version of this exception is provided by ContextedException.\n * \u003c/p\u003e\n * \u003cp\u003e\n * To use this class write code as follows:\n * \u003c/p\u003e\n * \u003cpre\u003e\n *   try {\n *     ...\n *   } catch (Exception e) {\n *     throw new ContextedRuntimeException(\"Error posting account transaction\", e)\n *          .addContextValue(\"Account Number\", accountNumber)\n *          .addContextValue(\"Amount Posted\", amountPosted)\n *          .addContextValue(\"Previous Balance\", previousBalance)\n *   }\n * }\n * \u003c/pre\u003e or improve diagnose data at a higher level:\n * \u003cpre\u003e\n *   try {\n *     ...\n *   } catch (ContextedRuntimeException e) {\n *     throw e.setContextValue(\"Transaction Id\", transactionId);\n *   } catch (Exception e) {\n *     if (e instanceof ExceptionContext) {\n *       e.setContextValue(\"Transaction Id\", transactionId);\n *     }\n *     throw e;\n *   }\n * }\n * \u003c/pre\u003e\n * \u003c/p\u003e\u003cp\u003e\n * The output in a printStacktrace() (which often is written to a log) would look something like the following:\n * \u003cpre\u003e\n * org.apache.commons.lang3.exception.ContextedRuntimeException: java.lang.Exception: Error posting account transaction\n *  Exception Context:\n *  [1:Account Number\u003dnull]\n *  [2:Amount Posted\u003d100.00]\n *  [3:Previous Balance\u003d-2.17]\n *  [4:Transaction Id\u003d94ef1d15-d443-46c4-822b-637f26244899]\n *\n *  ---------------------------------\n *  at org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testAddValue(ContextedExceptionTest.java:88)\n *  ..... (rest of trace)\n * \u003c/pre\u003e\n * \u003c/p\u003e\n * \n * @see ContextedException\n * @since 3.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The serialization version. "
    },
    {
      "type": "field",
      "varNames": [
        "exceptionContext"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The context where the data is stored. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * Instantiates ContextedRuntimeException without message or cause.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 16)",
        "(line 98,col 9)-(line 98,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Instantiates ContextedRuntimeException with message, but without cause.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     * \n     * @param message  the exception message, may be null\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 23)",
        "(line 110,col 9)-(line 110,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.Throwable)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause, but without message.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     * \n     * @param cause  the underlying cause of the exception, may be null\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 21)",
        "(line 122,col 9)-(line 122,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String, java.lang.Throwable)",
      "begin_line": 133,
      "end_line": 136,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause and message.\n     * \u003cp\u003e\n     * The context information is stored using a default implementation.\n     * \n     * @param message  the exception message, may be null\n     * @param cause  the underlying cause of the exception, may be null\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 30)",
        "(line 135,col 9)-(line 135,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.ContextedRuntimeException(java.lang.String, java.lang.Throwable, org.apache.commons.lang3.exception.ExceptionContext)",
      "begin_line": 145,
      "end_line": 151,
      "comment": "\n     * Instantiates ContextedRuntimeException with cause, message, and ExceptionContext.\n     * \n     * @param message  the exception message, may be null\n     * @param cause  the underlying cause of the exception, may be null\n     * @param context  the context used to store the additional information, null uses default implementation\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 30)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.addContextValue(java.lang.String, java.lang.Object)",
      "begin_line": 167,
      "end_line": 171,
      "comment": "\n     * Adds information helpful to a developer in diagnosing and correcting the problem.\n     * For the information to be meaningful, the value passed should have a reasonable\n     * toString() implementation.\n     * Different values can be added with the same label multiple times.\n     * \u003cp\u003e\n     * Note: This exception is only serializable if the object added is serializable.\n     * \u003c/p\u003e\n     * \n     * @param label  a textual label associated with information, {@code null} not recommended\n     * @param value  information needed to understand exception, may be {@code null}\n     * @return {@code this}, for method chaining, not {@code null}\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 55)",
        "(line 170,col 9)-(line 170,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.setContextValue(java.lang.String, java.lang.Object)",
      "begin_line": 186,
      "end_line": 190,
      "comment": "\n     * Sets information helpful to a developer in diagnosing and correcting the problem.\n     * For the information to be meaningful, the value passed should have a reasonable\n     * toString() implementation.\n     * Any existing values with the same labels are removed before the new one is added.\n     * \u003cp\u003e\n     * Note: This exception is only serializable if the object added as value is serializable.\n     * \u003c/p\u003e\n     * \n     * @param label  a textual label associated with information, {@code null} not recommended\n     * @param value  information needed to understand exception, may be {@code null}\n     * @return {@code this}, for method chaining, not {@code null}\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 55)",
        "(line 189,col 9)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getContextValues(java.lang.String)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getFirstContextValue(java.lang.String)",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getContextEntries()",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getContextLabels()",
      "begin_line": 219,
      "end_line": 222,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getMessage()",
      "begin_line": 230,
      "end_line": 233,
      "comment": "\n     * Provides the message explaining the exception, including the contextual data.\n     * \n     * @see java.lang.Throwable#getMessage()\n     * @return the message, never null\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getRawMessage()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * Provides the message explaining the exception without the contextual data.\n     * \n     * @see java.lang.Throwable#getMessage()\n     * @return the message\n     * @since 3.0.1\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.exception.ContextedRuntimeException.getFormattedExceptionMessage(java.lang.String)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 74)"
      ]
    }
  ]
}