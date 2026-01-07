{
  "filepath": "/tmp/Cli-30b/src/main/java/org/apache/commons/cli/MissingArgumentException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MissingArgumentException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 27,
      "end_line": 67,
      "comment": "\n * Thrown when an option requiring an argument\n * is not provided with an argument.\n *\n * @author John Keyes (john at integralsource.com)\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "option"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " The option requiring additional arguments "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.MissingArgumentException.MissingArgumentException(java.lang.String)",
      "begin_line": 38,
      "end_line": 41,
      "comment": "\n     * Construct a new \u003ccode\u003eMissingArgumentException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param message the detail message\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.MissingArgumentException.MissingArgumentException(org.apache.commons.cli.Option)",
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Construct a new \u003ccode\u003eMissingArgumentException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param option the option requiring an argument\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 64)",
        "(line 53,col 9)-(line 53,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.MissingArgumentException.getOption()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * Return the option requiring an argument that wasn\u0027t provided\n     * on the command line.\n     *\n     * @return the related option\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 22)"
      ]
    }
  ]
}