{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/exception/MathUnsupportedOperationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUnsupportedOperationException",
      "is_interface": false,
      "parent_types": [
        "java.lang.UnsupportedOperationException",
        "org.apache.commons.math.exception.MathThrowable"
      ],
      "begin_line": 35,
      "end_line": 106,
      "comment": "\n * Base class for all unsupported features.\n * It is used for all the exceptions that share the semantics of the standard\n * {@link UnsupportedOperationException}, but must also provide a localized\n * message.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "specific"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Pattern used to build the message (specific context).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.MathUnsupportedOperationException(java.lang.Object...)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.MathUnsupportedOperationException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 60,
      "end_line": 64,
      "comment": "\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 33)",
        "(line 63,col 9)-(line 63,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.getSpecificPattern()",
      "begin_line": 67,
      "end_line": 69,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.getGeneralPattern()",
      "begin_line": 72,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.getArguments()",
      "begin_line": 77,
      "end_line": 79,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.getMessage(java.util.Locale)",
      "begin_line": 88,
      "end_line": 93,
      "comment": "\n     * Get the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     *\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 92,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.getMessage()",
      "begin_line": 96,
      "end_line": 99,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.getLocalizedMessage()",
      "begin_line": 102,
      "end_line": 105,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 47)"
      ]
    }
  ]
}