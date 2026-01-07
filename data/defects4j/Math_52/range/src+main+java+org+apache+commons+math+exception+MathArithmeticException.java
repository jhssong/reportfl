{
  "filepath": "/tmp/Math-52b/src/main/java/org/apache/commons/math/exception/MathArithmeticException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArithmeticException",
      "is_interface": false,
      "parent_types": [
        "java.lang.ArithmeticException",
        "org.apache.commons.math.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 33,
      "end_line": 75,
      "comment": "\n * Base class for arithmetic exceptions.\n * It is used for all the exceptions that have the semantics of the standard\n * {@link ArithmeticException}, but must also provide a localized\n * message.\n *\n * @since 3.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "context"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Context. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathArithmeticException.MathArithmeticException()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathArithmeticException.MathArithmeticException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Constructor with a specific message.\n     *\n     * @param pattern Message pattern providing the specific context of\n     * the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathArithmeticException.getContext()",
      "begin_line": 60,
      "end_line": 62,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathArithmeticException.getMessage()",
      "begin_line": 65,
      "end_line": 68,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathArithmeticException.getLocalizedMessage()",
      "begin_line": 71,
      "end_line": 74,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 45)"
      ]
    }
  ]
}