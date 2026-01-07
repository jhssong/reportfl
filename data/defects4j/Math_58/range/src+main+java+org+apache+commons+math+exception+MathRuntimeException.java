{
  "filepath": "/tmp/Math-58b/src/main/java/org/apache/commons/math/exception/MathRuntimeException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathRuntimeException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException",
        "org.apache.commons.math.exception.MathThrowable"
      ],
      "begin_line": 34,
      "end_line": 116,
      "comment": "\n * This class is primarily intended as a base class for exceptions\n * that must wrap low-level exceptions in order to propagate an\n * exception that better corresponds to the high-level action that\n * triggered the problem.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
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
      "signature": "org.apache.commons.math.exception.MathRuntimeException.MathRuntimeException(java.lang.Throwable, org.apache.commons.math.exception.util.Localizable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 61,
      "end_line": 69,
      "comment": "\n     * Build an exception from two patterns (specific and general) and\n     * an argument list.\n     *\n     * @param cause Cause of the error (may be null).\n     * @param specific Format specifier for the specific part (may be null).\n     * @param general Format specifier for the general part (may be null).\n     * @param arguments Format arguments. They will be substituted in\n     * \u003cem\u003eboth\u003c/em\u003e the {@code general} and {@code specific} format specifiers.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 21)",
        "(line 66,col 9)-(line 66,col 33)",
        "(line 67,col 9)-(line 67,col 31)",
        "(line 68,col 9)-(line 68,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.MathRuntimeException(java.lang.Throwable)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Wrap an exception.\n     *\n     * @param cause Cause of the error (may be null).\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getSpecificPattern()",
      "begin_line": 81,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getGeneralPattern()",
      "begin_line": 86,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getArguments()",
      "begin_line": 91,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getMessage(java.util.Locale)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Get the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getMessage()",
      "begin_line": 106,
      "end_line": 109,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathRuntimeException.getLocalizedMessage()",
      "begin_line": 112,
      "end_line": 115,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 47)"
      ]
    }
  ]
}