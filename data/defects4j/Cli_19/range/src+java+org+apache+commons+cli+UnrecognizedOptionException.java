{
  "filepath": "/tmp/Cli-19b/src/java/org/apache/commons/cli/UnrecognizedOptionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnrecognizedOptionException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 27,
      "end_line": 66,
      "comment": "\n * Exception thrown during parsing signalling an unrecognized\n * option was seen.\n *\n * @author bob mcwhiter (bob @ werken.com)\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "option"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": " The  unrecognized option "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.UnrecognizedOptionException.UnrecognizedOptionException(java.lang.String)",
      "begin_line": 38,
      "end_line": 41,
      "comment": "\n     * Construct a new \u003ccode\u003eUnrecognizedArgumentException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param message the detail message\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.UnrecognizedOptionException.UnrecognizedOptionException(java.lang.String, java.lang.String)",
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n     * Construct a new \u003ccode\u003eUnrecognizedArgumentException\u003c/code\u003e\n     * with the specified option and detail message.\n     *\n     * @param message the detail message\n     * @param option  the unrecognized option\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 22)",
        "(line 54,col 9)-(line 54,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.UnrecognizedOptionException.getOption()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * Returns the unrecognized option.\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 22)"
      ]
    }
  ]
}