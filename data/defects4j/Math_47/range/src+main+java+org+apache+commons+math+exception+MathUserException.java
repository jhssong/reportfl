{
  "filepath": "/tmp/Math-47b/src/main/java/org/apache/commons/math/exception/MathUserException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUserException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.math.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 35,
      "end_line": 115,
      "comment": "\n * This class is intended as a sort of communication channel between\n * layers of \u003cem\u003euser\u003c/em\u003e code separated from each other by calls to\n * the Commons-Math library.\n * The Commons-Math code will never catch such an exception.\n *\n * @since 2.2\n * @version $Id$\n "
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
        "context"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Context. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "\n     * Build an exception with a default message.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable)",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * Build an exception with a default message.\n     * @param cause Cause of the error (may be null).\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 21)",
        "(line 55,col 9)-(line 55,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Builds an exception with a localizable message.\n     *\n     * @param pattern Format specifier.\n     * @param arguments Format arguments.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 76,
      "end_line": 81,
      "comment": "\n     * Builds an exception with a localizable message.\n     *\n     * @param cause Cause of the error (may be null).\n     * @param pattern Format specifier.\n     * @param arguments Format arguments.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 21)",
        "(line 80,col 9)-(line 80,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getContext()",
      "begin_line": 84,
      "end_line": 86,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getException()",
      "begin_line": 89,
      "end_line": 91,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getMessage()",
      "begin_line": 94,
      "end_line": 97,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getLocalizedMessage()",
      "begin_line": 100,
      "end_line": 103,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getMessage(java.util.Locale)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     * @return localized message\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 42)"
      ]
    }
  ]
}