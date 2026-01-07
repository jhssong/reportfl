{
  "filepath": "/tmp/Math-61b/src/main/java/org/apache/commons/math/exception/util/Localizable.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Localizable",
      "is_interface": true,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 43,
      "comment": "\n * Interface for localizable strings.\n *\n * @version $Revision$ $Date$\n * @since 2.2\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.Localizable.getSourceString()",
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * Get the source (non-localized) string.\n     * @return source string\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.exception.util.Localizable.getLocalizedString(java.util.Locale)",
      "begin_line": 41,
      "end_line": 41,
      "comment": "\n     * Get the localized string.\n     * @param locale locale into which to get the string\n     * @return localized string or the source string if no localized version is available\n     ",
      "child_ranges": []
    }
  ]
}