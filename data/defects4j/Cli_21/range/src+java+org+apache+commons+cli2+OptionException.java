{
  "filepath": "/tmp/Cli-21b/src/java/org/apache/commons/cli2/OptionException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 27,
      "end_line": 108,
      "comment": "\n * A problem found while dealing with command line options.\n "
    },
    {
      "type": "field",
      "varNames": [
        "HELP_SETTINGS"
      ],
      "begin_line": 34,
      "end_line": 35,
      "comment": "\n     * The settings used when displaying the related Option.\n     *\n     * @see DisplaySetting\n     "
    },
    {
      "type": "field",
      "varNames": [
        "helper"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " resource helper instance "
    },
    {
      "type": "field",
      "varNames": [
        "option"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The Option the exception relates to "
    },
    {
      "type": "field",
      "varNames": [
        "message"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The message explaining the Exception "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.OptionException.OptionException(org.apache.commons.cli2.Option)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Creates a new OptionException.\n     *\n     * @param option\n     *            The Option the exception relates to\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.OptionException.OptionException(org.apache.commons.cli2.Option, java.lang.String)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * Creates a new OptionException.\n     * @param option the Option the exception relates to\n     * @param messageKey the id of the message to display\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.OptionException.OptionException(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)",
      "begin_line": 72,
      "end_line": 93,
      "comment": "\n     * Creates a new OptionException.\n     * @param option the Option the exception relates to\n     * @param messageKey the id of the message to display\n     * @param value a value to display with the message\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 29)",
        "(line 77,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.OptionException.getOption()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Gets the Option the exception relates to\n     *\n     * @return The related Option\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.OptionException.getMessage()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 23)"
      ]
    }
  ]
}