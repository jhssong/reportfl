{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/UnrecognizedOptionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "UnrecognizedOptionException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.ParseException"
      ],
      "begin_line": 24,
      "end_line": 69,
      "comment": "\n * Exception thrown during parsing signalling an unrecognized\n * option was seen.\n "
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
      "comment": " The  unrecognized option "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.UnrecognizedOptionException.UnrecognizedOptionException(java.lang.String)",
      "begin_line": 40,
      "end_line": 43,
      "comment": "\n     * Construct a new \u003ccode\u003eUnrecognizedArgumentException\u003c/code\u003e\n     * with the specified detail message.\n     *\n     * @param message the detail message\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.UnrecognizedOptionException.UnrecognizedOptionException(java.lang.String, java.lang.String)",
      "begin_line": 53,
      "end_line": 57,
      "comment": "\n     * Construct a new \u003ccode\u003eUnrecognizedArgumentException\u003c/code\u003e\n     * with the specified option and detail message.\n     *\n     * @param message the detail message\n     * @param option  the unrecognized option\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 22)",
        "(line 56,col 9)-(line 56,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.UnrecognizedOptionException.getOption()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Returns the unrecognized option.\n     *\n     * @return the related option\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 22)"
      ]
    }
  ]
}