{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/exception/MathUserException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUserException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.math.exception.MathThrowable"
      ],
      "begin_line": 35,
      "end_line": 155,
      "comment": "\n * This class is intended as a sort of communication channel between\n * layers of \u003cem\u003euser\u003c/em\u003e code separated from each other by calls to\n * the Commons-Math library.\n * The Commons-Math code will never catch such an exception.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "specific"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Pattern used to build the specific part of the message (problem description).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "general"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Pattern used to build the general part of the message (problem description).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Build an exception with a default message.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 31)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * Build an exception with a default message.\n     * @param cause Cause of the error (may be null).\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Build an exception with a localizable message.\n     * @param pattern Format specifier.\n     * @param arguments Format arguments.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Build an exception with a localizable message.\n     * @param cause Cause of the error (may be null).\n     * @param pattern Format specifier.\n     * @param arguments Format arguments.\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 60)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(org.apache.commons.math.exception.util.Localizable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Builds an exception from two patterns (specific and general) and\n     * an argument list.\n     *\n     * @param specific Format specifier for the specific part (may be null).\n     * @param general Format specifier for the general part (may be null).\n     * @param arguments Format arguments. They will be substituted in\n     * \u003cem\u003eboth\u003c/em\u003e the {@code general} and {@code specific} format specifiers.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathUserException.MathUserException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 110,
      "end_line": 117,
      "comment": "\n     * Builds an exception from two patterns (specific and general) and\n     * an argument list.\n     *\n     * @param cause Cause of the error (may be null).\n     * @param specific Format specifier for the specific part (may be null).\n     * @param general Format specifier for the general part (may be null).\n     * @param arguments Format arguments. They will be substituted in\n     * \u003cem\u003eboth\u003c/em\u003e the {@code general} and {@code specific} format specifiers.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 21)",
        "(line 114,col 9)-(line 114,col 34)",
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 116,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getSpecificPattern()",
      "begin_line": 120,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getGeneralPattern()",
      "begin_line": 125,
      "end_line": 127,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getArguments()",
      "begin_line": 130,
      "end_line": 132,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getMessage(java.util.Locale)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Get the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getMessage()",
      "begin_line": 145,
      "end_line": 148,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathUserException.getLocalizedMessage()",
      "begin_line": 151,
      "end_line": 154,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 47)"
      ]
    }
  ]
}