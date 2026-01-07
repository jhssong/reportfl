{
  "filepath": "/tmp/Cli-39b/src/main/java/org/apache/commons/cli/AmbiguousOptionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AmbiguousOptionException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.UnrecognizedOptionException"
      ],
      "begin_line": 29,
      "end_line": 88,
      "comment": "\n * Exception thrown when an option can\u0027t be identified from a partial name.\n * \n * @version $Id$\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": "\n     * This exception {@code serialVersionUID}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "matchingOptions"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The list of options matching the partial name specified "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.AmbiguousOptionException.AmbiguousOptionException(java.lang.String, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "\n     * Constructs a new AmbiguousOptionException.\n     *\n     * @param option          the partial option name\n     * @param matchingOptions the options matching the name\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 62)",
        "(line 48,col 9)-(line 48,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AmbiguousOptionException.getMatchingOptions()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Returns the options matching the partial name.\n     * @return a collection of options matching the name\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AmbiguousOptionException.createMessage(java.lang.String, java.util.Collection\u003cjava.lang.String\u003e)",
      "begin_line": 67,
      "end_line": 87,
      "comment": "\n     * Build the exception message from the specified list of options.\n     * \n     * @param option\n     * @param matchingOptions\n     * @return\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 75)",
        "(line 70,col 9)-(line 70,col 27)",
        "(line 71,col 9)-(line 71,col 37)",
        "(line 73,col 9)-(line 73,col 63)",
        "(line 74,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 24)",
        "(line 86,col 9)-(line 86,col 30)"
      ]
    }
  ]
}