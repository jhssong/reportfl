{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/MathUnsupportedOperationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUnsupportedOperationException",
      "is_interface": false,
      "parent_types": [
        "java.lang.UnsupportedOperationException",
        "org.apache.commons.math3.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 33,
      "end_line": 73,
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
      "signature": "org.apache.commons.math3.exception.MathUnsupportedOperationException.MathUnsupportedOperationException()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.exception.MathUnsupportedOperationException.MathUnsupportedOperationException(org.apache.commons.math3.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n     * @param pattern Message pattern providing the specific context of\n     * the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 45)",
        "(line 54,col 9)-(line 54,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathUnsupportedOperationException.getContext()",
      "begin_line": 58,
      "end_line": 60,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathUnsupportedOperationException.getMessage()",
      "begin_line": 63,
      "end_line": 66,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.MathUnsupportedOperationException.getLocalizedMessage()",
      "begin_line": 69,
      "end_line": 72,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 45)"
      ]
    }
  ]
}