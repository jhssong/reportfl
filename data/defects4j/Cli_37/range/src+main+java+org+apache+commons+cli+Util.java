{
  "filepath": "/tmp/Cli-37b/src/main/java/org/apache/commons/cli/Util.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Util",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 72,
      "comment": "\n * Contains useful helper methods for classes within this package.\n *\n * @version $Id$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Util.stripLeadingHyphens(java.lang.String)",
      "begin_line": 35,
      "end_line": 51,
      "comment": "\n     * Remove the hyphens from the beginning of \u003ccode\u003estr\u003c/code\u003e and\n     * return the new String.\n     *\n     * @param str The string from which the hyphens should be removed.\n     *\n     * @return the new String.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 40,col 9)",
        "(line 41,col 9)-(line 48,col 9)",
        "(line 50,col 9)-(line 50,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Util.stripLeadingAndTrailingQuotes(java.lang.String)",
      "begin_line": 62,
      "end_line": 71,
      "comment": "\n     * Remove the leading and trailing quotes from \u003ccode\u003estr\u003c/code\u003e.\n     * E.g. if str is \u0027\"one two\"\u0027, then \u0027one two\u0027 is returned.\n     *\n     * @param str The string from which the leading and trailing quotes\n     * should be removed.\n     *\n     * @return The string without the leading and trailing quotes.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 34)",
        "(line 65,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 70,col 19)"
      ]
    }
  ]
}