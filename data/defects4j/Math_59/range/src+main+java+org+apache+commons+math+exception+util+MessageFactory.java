{
  "filepath": "/tmp/Math-59b/src/main/java/org/apache/commons/math/exception/util/MessageFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MessageFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 78,
      "comment": "\n * Class for constructing localized messages.\n *\n * @since 2.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.exception.util.MessageFactory.MessageFactory()",
      "begin_line": 32,
      "end_line": 32,
      "comment": "\n     * Class contains only static methods.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.MessageFactory.buildMessage(java.util.Locale, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 42,
      "end_line": 46,
      "comment": "\n     * Builds a message string by from a pattern and its arguments.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @param pattern Format specifier.\n     * @param arguments Format arguments.\n     * @return a localized message string.\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.MessageFactory.buildMessage(java.util.Locale, org.apache.commons.math.exception.util.Localizable, org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 59,
      "end_line": 77,
      "comment": "\n     * Builds a message string by from two patterns (specific and general) and\n     * an argument list.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @param specific Format specifier (may be null).\n     * @param general Format specifier (may be null).\n     * @param arguments Format arguments. They will be substituted in\n     * \u003cem\u003eboth\u003c/em\u003e the {@code general} and {@code specific} format specifiers.\n     * @return a localized message string.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 53)",
        "(line 64,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 76,col 29)"
      ]
    }
  ]
}