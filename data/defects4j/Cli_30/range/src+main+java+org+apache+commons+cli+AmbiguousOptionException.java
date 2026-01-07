{
  "filepath": "/tmp/Cli-30b/src/main/java/org/apache/commons/cli/AmbiguousOptionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AmbiguousOptionException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.UnrecognizedOptionException"
      ],
      "begin_line": 30,
      "end_line": 83,
      "comment": "\n * Exception thrown when an option can\u0027t be identified from a partial name.\n * \n * @author Emmanuel Bourg\n * @version $Revision$, $Date$\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "matchingOptions"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The list of options matching the partial name specified "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.AmbiguousOptionException.AmbiguousOptionException(java.lang.String, java.util.Collection)",
      "begin_line": 41,
      "end_line": 45,
      "comment": "\n     * Constructs a new AmbiguousOptionException.\n     *\n     * @param option          the partial option name\n     * @param matchingOptions the options matching the name\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 62)",
        "(line 44,col 9)-(line 44,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AmbiguousOptionException.getMatchingOptions()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Returns the options matching the partial name.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AmbiguousOptionException.createMessage(java.lang.String, java.util.Collection)",
      "begin_line": 62,
      "end_line": 82,
      "comment": "\n     * Build the exception message from the specified list of options.\n     * \n     * @param option\n     * @param matchingOptions\n     * @return\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 68)",
        "(line 65,col 9)-(line 65,col 28)",
        "(line 66,col 9)-(line 66,col 38)",
        "(line 68,col 9)-(line 68,col 49)",
        "(line 69,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 25)",
        "(line 81,col 9)-(line 81,col 31)"
      ]
    }
  ]
}