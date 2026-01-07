{
  "filepath": "/tmp/Cli-30b/src/main/java/org/apache/commons/cli/MissingOptionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MissingOptionException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 29,
      "end_line": 93,
      "comment": "\n * Thrown when a required option has not been provided.\n *\n * @author John Keyes ( john at integralsource.com )\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "missingOptions"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " The list of missing options "
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
      "comment": "\n     * Constructs a new \u003ccode\u003eMissingSelectedException\u003c/code\u003e with the\n     * specified list of missing options.\n     *\n     * @param missingOptions the list of missing options\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 44)",
        "(line 55,col 9)-(line 55,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.MissingOptionException.getMissingOptions()",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Return the list of options (as strings) missing in the command line parsed.\n     *\n     * @return the missing options\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.MissingOptionException.createMessage(java.util.List)",
      "begin_line": 75,
      "end_line": 92,
      "comment": "\n     * Build the exception message from the specified list of options.\n     *\n     * @param missingOptions\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 72)",
        "(line 78,col 9)-(line 78,col 59)",
        "(line 79,col 9)-(line 79,col 26)",
        "(line 81,col 9)-(line 81,col 48)",
        "(line 82,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 31)"
      ]
    }
  ]
}