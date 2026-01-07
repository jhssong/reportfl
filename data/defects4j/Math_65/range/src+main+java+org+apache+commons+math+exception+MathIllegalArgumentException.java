{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/exception/MathIllegalArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalArgumentException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalArgumentException"
      ],
      "begin_line": 33,
      "end_line": 124,
      "comment": "\n * Base class for all preconditions violation exceptions.\n * This class is not intended to be instantiated directly: it should serve\n * as a base class to create all the exceptions that share the semantics of\n * the standard {@link IllegalArgumentException}, but must also provide a\n * localized message.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
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
        "specific"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Pattern used to build the message (specific context).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "general"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Pattern used to build the message (general problem description).\n     "
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
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.MathIllegalArgumentException(org.apache.commons.math.exception.Localizable, org.apache.commons.math.exception.Localizable, java.lang.Object...)",
      "begin_line": 57,
      "end_line": 63,
      "comment": "\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 33)",
        "(line 61,col 9)-(line 61,col 31)",
        "(line 62,col 9)-(line 62,col 44)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.MathIllegalArgumentException(org.apache.commons.math.exception.Localizable, java.lang.Object...)",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getMessage(java.util.Locale)",
      "begin_line": 80,
      "end_line": 90,
      "comment": " Gets the message in a specified locale.\n    *\n    * @param locale Locale in which the message should be translated\n    *\n    * @return localized message\n    * @since 2.2\n    ",
      "child_ranges": [
        "(line 81,col 8)-(line 81,col 52)",
        "(line 83,col 8)-(line 86,col 8)",
        "(line 87,col 8)-(line 87,col 74)",
        "(line 89,col 8)-(line 89,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getMessage()",
      "begin_line": 93,
      "end_line": 96,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getLocalizedMessage()",
      "begin_line": 99,
      "end_line": 102,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.flatten(java.lang.Object[])",
      "begin_line": 111,
      "end_line": 123,
      "comment": "\n     * Transform a multidimensional array into a one-dimensional list.\n     *\n     * @param array Array (possibly multidimensional).\n     * @return a list of all the {@code Object} instances contained in\n     * {@code array}.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 58)",
        "(line 113,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 20)"
      ]
    }
  ]
}