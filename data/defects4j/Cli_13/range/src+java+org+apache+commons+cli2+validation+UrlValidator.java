{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/validation/UrlValidator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UrlValidator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.validation.Validator"
      ],
      "begin_line": 52,
      "end_line": 115,
      "comment": "\n * The \u003ccode\u003eUrlValidator\u003c/code\u003e validates the string argument\n * values are URLs.  If the value is a URL, the string value in\n * the {@link java.util.List} of values is replaced with the\n * {@link java.net.URL} instance.\n *\n * URLs can also be validated based on their scheme by using\n * the {@link #setProtocol setProtocol} method, or by using the specified\n * {@link #UrlValidator(java.lang.String) constructor}.\n *\n * The following example shows how to limit the valid values\n * for the site argument to \u0027https\u0027 URLs.\n *\n * \u003cpre\u003e\n * ...\n * ArgumentBuilder builder \u003d new ArgumentBuilder();\n * Argument site \u003d\n *     builder.withName(\"site\");\n *            .withValidator(new URLValidator(\"https\"));\n * \u003c/pre\u003e\n *\n * @author Rob Oxspring\n * @author John Keyes\n "
    },
    {
      "type": "field",
      "varNames": [
        "protocol"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " allowed protocol "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.validation.UrlValidator.UrlValidator()",
      "begin_line": 59,
      "end_line": 60,
      "comment": "\n     * Creates a UrlValidator.\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.validation.UrlValidator.UrlValidator(java.lang.String)",
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * Creates a UrlValidator for the specified protocol.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.UrlValidator.validate(java.util.List)",
      "begin_line": 76,
      "end_line": 96,
      "comment": "\n     * Validate the list of values against the list of permitted values.\n     * If a value is valid, replace the string in the \u003ccode\u003evalues\u003c/code\u003e\n     * {@link java.util.List} with the { java.net.URL} instance.\n     *\n     * @see org.apache.commons.cli2.validation.Validator#validate(java.util.List)\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 95,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.UrlValidator.getProtocol()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Returns the protocol that must be used by a valid URL.\n     *\n     * @return the protocol that must be used by a valid URL.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.validation.UrlValidator.setProtocol(java.lang.String)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * Specifies the protocol that a URL must have to be valid.\n     *\n     * @param protocol the protocol that a URL must have to be valid.\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 33)"
      ]
    }
  ]
}