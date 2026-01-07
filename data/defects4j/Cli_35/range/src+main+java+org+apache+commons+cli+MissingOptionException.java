{
  "filepath": "/tmp/Cli-35b/src/main/java/org/apache/commons/cli/MissingOptionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MissingOptionException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 28,
      "end_line": 96,
      "comment": "\n * Thrown when a required option has not been provided.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " This exception {@code serialVersionUID}. "
    },
    {
      "type": "field",
      "varNames": [
        "missingOptions"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The list of missing options and groups "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.MissingOptionException.MissingOptionException(java.lang.String)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Construct a new \u003ccode\u003eMissingSelectedException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param message the detail message\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.MissingOptionException.MissingOptionException(java.util.List)",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Constructs a new \u003ccode\u003eMissingSelectedException\u003c/code\u003e with the\n     * specified list of missing options.\n     *\n     * @param missingOptions the list of missing options and groups\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 44)",
        "(line 57,col 9)-(line 57,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.MissingOptionException.getMissingOptions()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Returns the list of options or option groups missing in the command line parsed.\n     *\n     * @return the missing options, consisting of String instances for simple\n     *         options, and OptionGroup instances for required option groups.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.MissingOptionException.createMessage(java.util.List\u003c?\u003e)",
      "begin_line": 78,
      "end_line": 95,
      "comment": "\n     * Build the exception message from the specified list of options.\n     *\n     * @param missingOptions the list of missing options and groups\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 73)",
        "(line 81,col 9)-(line 81,col 58)",
        "(line 82,col 9)-(line 82,col 25)",
        "(line 84,col 9)-(line 84,col 51)",
        "(line 85,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 94,col 30)"
      ]
    }
  ]
}