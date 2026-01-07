{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/commandline/DefaultingCommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultingCommandLine",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.commandline.CommandLineImpl"
      ],
      "begin_line": 40,
      "end_line": 172,
      "comment": "\n * Manages a queue of default CommandLines. This CommandLine implementation is\n * backed by a queue of CommandLine instances which are queried in turn until a\n * suitable result is found.\n *\n * CommandLine instances can either be added to the back of the queue or can be\n * pushed in at a specific position.\n *\n * @see #appendCommandLine(CommandLine)\n * @see #insertCommandLine(int, CommandLine)\n "
    },
    {
      "type": "field",
      "varNames": [
        "commandLines"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The list of default CommandLine instances\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.appendCommandLine(org.apache.commons.cli2.CommandLine)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Adds a CommandLine instance to the back of the queue. The supplied\n     * CommandLine will be used as defaults when all other CommandLines produce\n     * no result\n     *\n     * @param commandLine\n     *            the default values to use if all CommandLines\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.insertCommandLine(int, org.apache.commons.cli2.CommandLine)",
      "begin_line": 65,
      "end_line": 69,
      "comment": "\n     * Adds a CommandLine instance to a specified position in the queue.\n     *\n     * @param index ths position at which to insert\n     * @param commandLine the CommandLine to insert\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.commandLines()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Builds an iterator over the build in CommandLines.\n     *\n     * @return an unmodifiable iterator\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getOption(java.lang.String)",
      "begin_line": 80,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getOptions()",
      "begin_line": 91,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 45)",
        "(line 94,col 9)-(line 94,col 42)",
        "(line 95,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getOptionTriggers()",
      "begin_line": 106,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 38)",
        "(line 108,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.hasOption(org.apache.commons.cli2.Option)",
      "begin_line": 116,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 122,col 9)",
        "(line 123,col 9)-(line 123,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 126,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 142,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getProperty(java.lang.String, java.lang.String)",
      "begin_line": 153,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getProperties()",
      "begin_line": 164,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 38)",
        "(line 166,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 170,col 48)"
      ]
    }
  ]
}