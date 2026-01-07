{
  "filepath": "/tmp/Cli-39b/src/main/java/org/apache/commons/cli/MissingArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MissingArgumentException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 26,
      "end_line": 71,
      "comment": "\n * Thrown when an option requiring an argument\n * is not provided with an argument.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": "\n     * This exception {@code serialVersionUID}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "option"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The option requiring additional arguments "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.MissingArgumentException.MissingArgumentException(java.lang.String)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Construct a new \u003ccode\u003eMissingArgumentException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param message the detail message\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.MissingArgumentException.MissingArgumentException(org.apache.commons.cli.Option)",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Construct a new \u003ccode\u003eMissingArgumentException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param option the option requiring an argument\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 64)",
        "(line 57,col 9)-(line 57,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.MissingArgumentException.getOption()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Return the option requiring an argument that wasn\u0027t provided\n     * on the command line.\n     *\n     * @return the related option\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 22)"
      ]
    }
  ]
}