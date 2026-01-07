{
  "filepath": "/tmp/Math-55b/src/main/java/org/apache/commons/math/exception/MathArithmeticException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathArithmeticException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathRuntimeException"
      ],
      "begin_line": 31,
      "end_line": 53,
      "comment": "\n * Base class for arithmetic exceptions.\n * It is used for all the exceptions that share the semantics of the standard\n * {@link ArithmeticException}, but must also provide a localized\n * message.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Serializable version Id. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathArithmeticException.MathArithmeticException()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Default constructor.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 58)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathArithmeticException.MathArithmeticException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 49,
      "end_line": 52,
      "comment": "\n     * Constructor with a specific message.\n     *\n     * @param pattern Message pattern providing the specific context of\n     * the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 34)"
      ]
    }
  ]
}