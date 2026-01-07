{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/exception/MathThrowable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathThrowable",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 95,
      "comment": "\n* Interface for commons-math throwables.\n*\n* @version $Revision$ $Date$\n* @since 2.2\n"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathThrowable.addMessage(org.apache.commons.math.exception.util.Localizable)",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Sets a message.\n     *\n     * @param pattern Message.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathThrowable.addMessage(org.apache.commons.math.exception.util.Localizable, java.lang.Object...)",
      "begin_line": 45,
      "end_line": 46,
      "comment": "\n     * Sets a message.\n     *\n     * @param pattern Message pattern.\n     * @param arguments Values for replacing the placeholders in the message\n     * pattern.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathThrowable.setContext(java.lang.String, java.lang.Object)",
      "begin_line": 56,
      "end_line": 56,
      "comment": "\n     * Sets the context (key, value) pair.\n     * Keys are assumed to be unique within an instance. If the same key is\n     * assigned a new value, the previous one will be lost.\n     *\n     * @param key Context key (not null).\n     * @param value Context value.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathThrowable.getContext(java.lang.String)",
      "begin_line": 64,
      "end_line": 64,
      "comment": "\n     * Gets the value associated to the given context key.\n     *\n     * @param key Context key.\n     * @return the context value or {@code null} if the key does not exist.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathThrowable.getContextKeys()",
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Gets all the keys stored in the exception\n     *\n     * @return the set of keys.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathThrowable.getMessage(java.util.Locale)",
      "begin_line": 79,
      "end_line": 79,
      "comment": "\n     * Gets the message in a specified locale.\n     *\n     * @param locale Locale in which the message should be translated\n     * @return localized message\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathThrowable.getMessage()",
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Gets the message in a conventional US locale.\n     *\n     * @return localized message\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.MathThrowable.getLocalizedMessage()",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Gets the message in the system default locale.\n     *\n     * @return localized message\n     ",
      "child_ranges": []
    }
  ]
}