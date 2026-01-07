{
  "filepath": "/tmp/Cli-30b/src/main/java/org/apache/commons/cli/AlreadySelectedException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AlreadySelectedException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 27,
      "end_line": 83,
      "comment": "\n * Thrown when more than one option in an option group\n * has been provided.\n *\n * @author John Keyes ( john at integralsource.com )\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "group"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " The option group selected. "
    },
    {
      "type": "field",
      "varNames": [
        "option"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The option that triggered the exception. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.AlreadySelectedException.AlreadySelectedException(java.lang.String)",
      "begin_line": 41,
      "end_line": 44,
      "comment": "\n     * Construct a new \u003ccode\u003eAlreadySelectedException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param message the detail message\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.AlreadySelectedException.AlreadySelectedException(org.apache.commons.cli.OptionGroup, org.apache.commons.cli.Option)",
      "begin_line": 54,
      "end_line": 60,
      "comment": "\n     * Construct a new \u003ccode\u003eAlreadySelectedException\u003c/code\u003e\n     * for the specified option group.\n     *\n     * @param group  the option group already selected\n     * @param option the option that triggered the exception\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 57,col 78)",
        "(line 58,col 9)-(line 58,col 27)",
        "(line 59,col 9)-(line 59,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AlreadySelectedException.getOptionGroup()",
      "begin_line": 68,
      "end_line": 71,
      "comment": "\n     * Returns the option group where another option has been selected.\n     *\n     * @return the related option group\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.AlreadySelectedException.getOption()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Returns the option that was added to the group and triggered the exception.\n     *\n     * @return the related option\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 22)"
      ]
    }
  ]
}