{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/exception/MathArithmeticException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArithmeticException",
      "is_interface": false,
      "parent_types": [
        "java.lang.ArithmeticException"
      ],
      "begin_line": 35,
      "end_line": 91,
      "comment": "\n * Base class for arithmetic exceptions.\n * It is used for all the exceptions that share the semantics of the standard\n * {@link ArithmeticException}, but must also provide a localized\n * message.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.exception.MathArithmeticException.MathArithmeticException(java.lang.Object...)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathArithmeticException.MathArithmeticException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
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
      "signature": "org.apache.commons.math.exception.MathArithmeticException.getMessage(java.util.Locale)",
      "begin_line": 73,
      "end_line": 78,
      "comment": "\n     * Get the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     *\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 77,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathArithmeticException.getMessage()",
      "begin_line": 81,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathArithmeticException.getLocalizedMessage()",
      "begin_line": 87,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 47)"
      ]
    }
  ]
}