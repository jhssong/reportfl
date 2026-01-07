{
  "filepath": "/tmp/Math-60b/src/main/java/org/apache/commons/math/exception/MathIllegalArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathIllegalArgumentException",
      "is_interface": false,
      "parent_types": [
        "java.lang.IllegalArgumentException",
        "org.apache.commons.math.exception.MathThrowable"
      ],
      "begin_line": 35,
      "end_line": 111,
      "comment": "\n * Base class for all preconditions violation exceptions.\n * In most cases, this class should not be instantiated directly: it should\n * serve as a base class to create all the exceptions that share the semantics\n * of the standard {@link IllegalArgumentException}, but must also provide a\n * localized message.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
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
        "specific"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Pattern used to build the message (specific context).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "general"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Pattern used to build the message (general problem description).\n     "
    },
    {
      "type": "field",
      "varNames": [
        "arguments"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": "\n     * Arguments used to build the message.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.MathIllegalArgumentException(org.apache.commons.math.exception.util.Localizable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 59,
      "end_line": 65,
      "comment": "\n     * @param specific Message pattern providing the specific context of\n     * the error.\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 33)",
        "(line 63,col 9)-(line 63,col 31)",
        "(line 64,col 9)-(line 64,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.MathIllegalArgumentException(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * @param general Message pattern explaining the cause of the error.\n     * @param args Arguments.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getSpecificPattern()",
      "begin_line": 76,
      "end_line": 78,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getGeneralPattern()",
      "begin_line": 81,
      "end_line": 83,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getArguments()",
      "begin_line": 86,
      "end_line": 88,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getMessage(java.util.Locale)",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * Get the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @return the localized message.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getMessage()",
      "begin_line": 101,
      "end_line": 104,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathIllegalArgumentException.getLocalizedMessage()",
      "begin_line": 107,
      "end_line": 110,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 47)"
      ]
    }
  ]
}