{
  "filepath": "/tmp/Cli-17b/src/java/org/apache/commons/cli/Util.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Util",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 70,
      "comment": "\n * Contains useful helper methods for classes within this package.\n *\n * @author John Keyes (john at integralsource.com)\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Util.stripLeadingHyphens(java.lang.String)",
      "begin_line": 34,
      "end_line": 49,
      "comment": "\n     * \u003cp\u003eRemove the hyphens from the begining of \u003ccode\u003estr\u003c/code\u003e and\n     * return the new String.\u003c/p\u003e\n     *\n     * @param str The string from which the hyphens should be removed.\n     *\n     * @return the new String.\n     ",
      "child_ranges": [
        "(line 36,col 9)-(line 38,col 9)",
        "(line 39,col 9)-(line 46,col 9)",
        "(line 48,col 9)-(line 48,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(java.lang.String)",
      "begin_line": 60,
      "end_line": 69,
      "comment": "\n     * Remove the leading and trailing quotes from \u003ccode\u003estr\u003c/code\u003e.\n     * E.g. if str is \u0027\"one two\"\u0027, then \u0027one two\u0027 is returned.\n     *\n     * @param str The string from which the leading and trailing quotes\n     * should be removed.\n     *\n     * @return The string without the leading and trailing quotes.\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 68,col 19)"
      ]
    }
  ]
}