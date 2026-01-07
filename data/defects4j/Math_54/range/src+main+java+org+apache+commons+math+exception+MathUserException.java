{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/exception/MathUserException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUserException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathRuntimeException"
      ],
      "begin_line": 31,
      "end_line": 75,
      "comment": "\n * This class is intended as a sort of communication channel between\n * layers of \u003cem\u003euser\u003c/em\u003e code separated from each other by calls to\n * the Commons-Math library.\n * The Commons-Math code will never catch such an exception.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Build an exception with a default message.\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable)",
      "begin_line": 46,
      "end_line": 49,
      "comment": "\n     * Build an exception with a default message.\n     * @param cause Cause of the error (may be null).\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 21)",
        "(line 48,col 9)-(line 48,col 52)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Builds an exception with a localizable message.\n     *\n     * @param pattern Format specifier.\n     * @param arguments Format arguments.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 69,
      "end_line": 74,
      "comment": "\n     * Builds an exception with a localizable message.\n     *\n     * @param cause Cause of the error (may be null).\n     * @param pattern Format specifier.\n     * @param arguments Format arguments.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 21)",
        "(line 73,col 9)-(line 73,col 39)"
      ]
    }
  ]
}