{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/MathArithmeticException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArithmeticException",
      "is_interface": false,
      "parent_types": [
        "java.lang.ArithmeticException",
        "org.apache.commons.math3.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 33,
      "end_line": 77,
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
      "signature": "org.apache.commons.math3.exception.MathArithmeticException.MathArithmeticException()",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 45)",
        "(line 45,col 9)-(line 45,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MathArithmeticException.MathArithmeticException(org.apache.commons.math3.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Constructor with a specific message.\n     *\n     * @param pattern Message pattern providing the specific context of\n     * the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 45)",
        "(line 58,col 9)-(line 58,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathArithmeticException.getContext()",
      "begin_line": 62,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathArithmeticException.getMessage()",
      "begin_line": 67,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathArithmeticException.getLocalizedMessage()",
      "begin_line": 73,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 45)"
      ]
    }
  ]
}