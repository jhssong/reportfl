{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/AlreadySelectedException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AlreadySelectedException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 24,
      "end_line": 85,
      "comment": "\n * Thrown when more than one option in an option group\n * has been provided.\n "
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
        "group"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " The option group selected. "
    },
    {
      "type": "field",
      "varNames": [
        "option"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " The option that triggered the exception. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.AlreadySelectedException.AlreadySelectedException(java.lang.String)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "\n     * Construct a new \u003ccode\u003eAlreadySelectedException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param message the detail message\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.AlreadySelectedException.AlreadySelectedException(org.apache.commons.cli.OptionGroup, org.apache.commons.cli.Option)",
      "begin_line": 56,
      "end_line": 62,
      "comment": "\n     * Construct a new \u003ccode\u003eAlreadySelectedException\u003c/code\u003e\n     * for the specified option group.\n     *\n     * @param group  the option group already selected\n     * @param option the option that triggered the exception\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 59,col 78)",
        "(line 60,col 9)-(line 60,col 27)",
        "(line 61,col 9)-(line 61,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AlreadySelectedException.getOptionGroup()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Returns the option group where another option has been selected.\n     *\n     * @return the related option group\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AlreadySelectedException.getOption()",
      "begin_line": 81,
      "end_line": 84,
      "comment": "\n     * Returns the option that was added to the group and triggered the exception.\n     *\n     * @return the related option\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 22)"
      ]
    }
  ]
}