{
  "filepath": "/tmp/Cli-39b/src/main/java/org/apache/commons/cli/UnrecognizedOptionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnrecognizedOptionException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 26,
      "end_line": 71,
      "comment": "\n * Exception thrown during parsing signalling an unrecognized\n * option was seen.\n *\n * @version $Id$\n "
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
      "comment": " The  unrecognized option "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.UnrecognizedOptionException.UnrecognizedOptionException(java.lang.String)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "\n     * Construct a new \u003ccode\u003eUnrecognizedArgumentException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param message the detail message\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.UnrecognizedOptionException.UnrecognizedOptionException(java.lang.String, java.lang.String)",
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Construct a new \u003ccode\u003eUnrecognizedArgumentException\u003c/code\u003e\n     * with the specified option and detail message.\n     *\n     * @param message the detail message\n     * @param option  the unrecognized option\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 22)",
        "(line 58,col 9)-(line 58,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.UnrecognizedOptionException.getOption()",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * Returns the unrecognized option.\n     *\n     * @return the related option\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 22)"
      ]
    }
  ]
}