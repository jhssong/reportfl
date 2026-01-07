{
  "filepath": "/tmp/Math-53b/src/main/java/org/apache/commons/math/exception/MathUserException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUserException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.math.exception.util.ExceptionContextProvider"
      ],
      "begin_line": 33,
      "end_line": 97,
      "comment": "\n * This class is intended as a sort of communication channel between\n * layers of \u003cem\u003euser\u003c/em\u003e code separated from each other by calls to\n * the Commons-Math library.\n * The Commons-Math code will never catch such an exception.\n *\n * @since 2.2\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Build an exception with a default message.\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable)",
      "begin_line": 51,
      "end_line": 54,
      "comment": "\n     * Build an exception with a default message.\n     * @param cause Cause of the error (may be null).\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 21)",
        "(line 53,col 9)-(line 53,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Builds an exception with a localizable message.\n     *\n     * @param pattern Format specifier.\n     * @param arguments Format arguments.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 74,
      "end_line": 79,
      "comment": "\n     * Builds an exception with a localizable message.\n     *\n     * @param cause Cause of the error (may be null).\n     * @param pattern Format specifier.\n     * @param arguments Format arguments.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 21)",
        "(line 78,col 9)-(line 78,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getContext()",
      "begin_line": 82,
      "end_line": 84,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getMessage()",
      "begin_line": 87,
      "end_line": 90,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getLocalizedMessage()",
      "begin_line": 93,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 45)"
      ]
    }
  ]
}