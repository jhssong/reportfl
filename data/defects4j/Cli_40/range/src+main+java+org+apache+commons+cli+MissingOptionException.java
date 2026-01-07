{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/MissingOptionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MissingOptionException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 26,
      "end_line": 94,
      "comment": "\n * Thrown when a required option has not been provided.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": " This exception {@code serialVersionUID}. "
    },
    {
      "type": "field",
      "varNames": [
        "missingOptions"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " The list of missing options and groups "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.MissingOptionException.MissingOptionException(java.lang.String)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     * Construct a new \u003ccode\u003eMissingSelectedException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param message the detail message\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.MissingOptionException.MissingOptionException(java.util.List)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Constructs a new \u003ccode\u003eMissingSelectedException\u003c/code\u003e with the\n     * specified list of missing options.\n     *\n     * @param missingOptions the list of missing options and groups\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 44)",
        "(line 55,col 9)-(line 55,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.MissingOptionException.getMissingOptions()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Returns the list of options or option groups missing in the command line parsed.\n     *\n     * @return the missing options, consisting of String instances for simple\n     *         options, and OptionGroup instances for required option groups.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.MissingOptionException.createMessage(java.util.List\u003c?\u003e)",
      "begin_line": 76,
      "end_line": 93,
      "comment": "\n     * Build the exception message from the specified list of options.\n     *\n     * @param missingOptions the list of missing options and groups\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 79)",
        "(line 79,col 9)-(line 79,col 58)",
        "(line 80,col 9)-(line 80,col 25)",
        "(line 82,col 9)-(line 82,col 57)",
        "(line 83,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 92,col 30)"
      ]
    }
  ]
}