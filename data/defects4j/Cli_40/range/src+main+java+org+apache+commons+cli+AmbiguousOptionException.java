{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/AmbiguousOptionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AmbiguousOptionException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.UnrecognizedOptionException"
      ],
      "begin_line": 28,
      "end_line": 87,
      "comment": "\n * Exception thrown when an option can\u0027t be identified from a partial name.\n *\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * This exception {@code serialVersionUID}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "matchingOptions"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The list of options matching the partial name specified "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.AmbiguousOptionException.AmbiguousOptionException(java.lang.String, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Constructs a new AmbiguousOptionException.\n     *\n     * @param option          the partial option name\n     * @param matchingOptions the options matching the name\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 62)",
        "(line 47,col 9)-(line 47,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AmbiguousOptionException.getMatchingOptions()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Returns the options matching the partial name.\n     * @return a collection of options matching the name\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AmbiguousOptionException.createMessage(java.lang.String, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 66,
      "end_line": 86,
      "comment": "\n     * Build the exception message from the specified list of options.\n     * \n     * @param option\n     * @param matchingOptions\n     * @return\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 75)",
        "(line 69,col 9)-(line 69,col 27)",
        "(line 70,col 9)-(line 70,col 37)",
        "(line 72,col 9)-(line 72,col 63)",
        "(line 73,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 24)",
        "(line 85,col 9)-(line 85,col 30)"
      ]
    }
  ]
}