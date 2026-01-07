{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/exception/util/Localizable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Localizable",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 44,
      "comment": "\n * Interface for localizable strings.\n *\n * @version $Id$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.Localizable.getSourceString()",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Gets the source (non-localized) string.\n     *\n     * @return the source string.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.exception.util.Localizable.getLocalizedString(java.util.Locale)",
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Gets the localized string.\n     *\n     * @param locale locale into which to get the string.\n     * @return the localized string or the source string if no\n     * localized version is available.\n     ",
      "child_ranges": []
    }
  ]
}