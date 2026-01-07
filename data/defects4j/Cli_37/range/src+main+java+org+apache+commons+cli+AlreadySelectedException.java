{
  "filepath": "/tmp/Cli-37b/src/main/java/org/apache/commons/cli/AlreadySelectedException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AlreadySelectedException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 26,
      "end_line": 87,
      "comment": "\n * Thrown when more than one option in an option group\n * has been provided.\n *\n * @version $Id$\n "
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
        "group"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The option group selected. "
    },
    {
      "type": "field",
      "varNames": [
        "option"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The option that triggered the exception. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.AlreadySelectedException.AlreadySelectedException(java.lang.String)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Construct a new \u003ccode\u003eAlreadySelectedException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param message the detail message\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.AlreadySelectedException.AlreadySelectedException(org.apache.commons.cli.OptionGroup, org.apache.commons.cli.Option)",
      "begin_line": 58,
      "end_line": 64,
      "comment": "\n     * Construct a new \u003ccode\u003eAlreadySelectedException\u003c/code\u003e\n     * for the specified option group.\n     *\n     * @param group  the option group already selected\n     * @param option the option that triggered the exception\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 61,col 78)",
        "(line 62,col 9)-(line 62,col 27)",
        "(line 63,col 9)-(line 63,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AlreadySelectedException.getOptionGroup()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * Returns the option group where another option has been selected.\n     *\n     * @return the related option group\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AlreadySelectedException.getOption()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Returns the option that was added to the group and triggered the exception.\n     *\n     * @return the related option\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 22)"
      ]
    }
  ]
}