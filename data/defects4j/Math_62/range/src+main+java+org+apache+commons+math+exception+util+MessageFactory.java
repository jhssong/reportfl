{
  "filepath": "/tmp/Math-62b/src/main/java/org/apache/commons/math/exception/util/MessageFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MessageFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 76,
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
      "begin_line": 60,
      "end_line": 75,
      "comment": "\n     * Builds a message string by from two patterns (specific and general) and\n     * an argument list.\n     *\n     * @param locale Locale in which the message should be translated.\n     * @param specific Format specifier.\n     * @param general Format specifier.\n     * @param arguments Format arguments. They will be substituted first in\n     * the {@code specific} format specifier, then the remaining arguments\n     * will be substituted in the {@code general} format specifier.\n     * @return a localized message string.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 53)",
        "(line 65,col 9)-(line 65,col 33)",
        "(line 66,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 76)",
        "(line 72,col 9)-(line 72,col 41)",
        "(line 74,col 9)-(line 74,col 29)"
      ]
    }
  ]
}