{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/MissingArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MissingArgumentException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 24,
      "end_line": 69,
      "comment": "\n * Thrown when an option requiring an argument\n * is not provided with an argument.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": "\n     * This exception {@code serialVersionUID}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "option"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " The option requiring additional arguments "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.MissingArgumentException.MissingArgumentException(java.lang.String)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     * Construct a new \u003ccode\u003eMissingArgumentException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param message the detail message\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.MissingArgumentException.MissingArgumentException(org.apache.commons.cli.Option)",
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Construct a new \u003ccode\u003eMissingArgumentException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param option the option requiring an argument\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 64)",
        "(line 55,col 9)-(line 55,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.MissingArgumentException.getOption()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Return the option requiring an argument that wasn\u0027t provided\n     * on the command line.\n     *\n     * @return the related option\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 22)"
      ]
    }
  ]
}