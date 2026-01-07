{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/exception/MathUserException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUserException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.exception.MathRuntimeException"
      ],
      "begin_line": 31,
      "end_line": 99,
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
        "(line 39,col 9)-(line 39,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Build an exception with a default message.\n     * @param cause Cause of the error (may be null).\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Build an exception with a localizable message.\n     * @param pattern Format specifier.\n     * @param arguments Format arguments.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Build an exception with a localizable message.\n     * @param cause Cause of the error (may be null).\n     * @param pattern Format specifier.\n     * @param arguments Format arguments.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(org.apache.commons.math.exception.util.Localizable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Builds an exception from two patterns (specific and general) and\n     * an argument list.\n     *\n     * @param specific Format specifier for the specific part (may be null).\n     * @param general Format specifier for the general part (may be null).\n     * @param arguments Format arguments. They will be substituted in\n     * \u003cem\u003eboth\u003c/em\u003e the {@code general} and {@code specific} format specifiers.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 94,
      "end_line": 98,
      "comment": "\n     * Builds an exception from two patterns (specific and general) and\n     * an argument list.\n     *\n     * @param cause Cause of the error (may be null).\n     * @param specific Format specifier for the specific part (may be null).\n     * @param general Format specifier for the general part (may be null).\n     * @param arguments Format arguments. They will be substituted in\n     * \u003cem\u003eboth\u003c/em\u003e the {@code general} and {@code specific} format specifiers.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 51)"
      ]
    }
  ]
}