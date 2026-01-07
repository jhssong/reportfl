{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/exception/MathIllegalStateException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalStateException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalStateException"
      ],
      "begin_line": 32,
      "end_line": 94,
      "comment": "\n * Base class for all exceptions that signal a mismatch between the\n * current state and the user\u0027s expectations.\n *\n * @since 3.0\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serializable version Id. "
    },
    {
      "type": "field",
      "varNames": [
        "specific"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Pattern used to build the message (specific context).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "general"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Pattern used to build the message (general problem description).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(org.apache.commons.math.exception.util.Localizable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 56,
      "end_line": 62,
      "comment": "\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 33)",
        "(line 60,col 9)-(line 60,col 31)",
        "(line 61,col 9)-(line 61,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.MathIllegalStateException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.getMessage(java.util.Locale)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Get the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     *\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.getMessage()",
      "begin_line": 84,
      "end_line": 87,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalStateException.getLocalizedMessage()",
      "begin_line": 90,
      "end_line": 93,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 47)"
      ]
    }
  ]
}