{
  "filepath": "/tmp/Math-66b/src/main/java/org/apache/commons/math/exception/MathIllegalArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalArgumentException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalArgumentException"
      ],
      "begin_line": 34,
      "end_line": 118,
      "comment": "\n * Base class for all preconditions violation exceptions.\n * This class is not intended to be instantiated directly: it should serve\n * as a base class to create all the exceptions that share the semantics of\n * the standard {@link IllegalArgumentException}, but must also provide a\n * localized message.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "specific"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Pattern used to build the message (specific context).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "general"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Pattern used to build the message (general problem description).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.MathIllegalArgumentException(org.apache.commons.math.util.Localizable, org.apache.commons.math.util.Localizable, java.lang.Object...)",
      "begin_line": 54,
      "end_line": 60,
      "comment": "\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 33)",
        "(line 58,col 9)-(line 58,col 31)",
        "(line 59,col 9)-(line 59,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.MathIllegalArgumentException(org.apache.commons.math.util.Localizable, java.lang.Object...)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getMessage()",
      "begin_line": 71,
      "end_line": 82,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 53)",
        "(line 75,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 78)",
        "(line 81,col 9)-(line 81,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getLocalizedMessage()",
      "begin_line": 85,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 53)",
        "(line 89,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 88)",
        "(line 95,col 9)-(line 95,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.flatten(java.lang.Object[])",
      "begin_line": 105,
      "end_line": 117,
      "comment": "\n     * Transform a multidimensional array into a one-dimensional list.\n     *\n     * @param array Array (possibly multidimensional).\n     * @return a list of all the {@code Object} instances contained in\n     * {@code array}.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 58)",
        "(line 107,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 20)"
      ]
    }
  ]
}