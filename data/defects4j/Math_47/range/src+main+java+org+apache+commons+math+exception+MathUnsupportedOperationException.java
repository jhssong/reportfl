{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/exception/MathUnsupportedOperationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUnsupportedOperationException",
      "is_interface": false,
      "parent_types": [
        "java.lang.UnsupportedOperationException",
        "org.apache.commons.math.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 33,
      "end_line": 77,
      "comment": "\n * Base class for all unsupported features.\n * It is used for all the exceptions that have the semantics of the standard\n * {@link UnsupportedOperationException}, but must also provide a localized\n * message.\n *\n * @since 2.2\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.MathUnsupportedOperationException()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.MathUnsupportedOperationException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * @param pattern Message pattern providing the specific context of\n     * the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.getContext()",
      "begin_line": 57,
      "end_line": 59,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.getException()",
      "begin_line": 62,
      "end_line": 64,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.getMessage()",
      "begin_line": 67,
      "end_line": 70,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUnsupportedOperationException.getLocalizedMessage()",
      "begin_line": 73,
      "end_line": 76,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 45)"
      ]
    }
  ]
}