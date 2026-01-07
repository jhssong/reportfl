{
  "filepath": "/tmp/Cli-14b/src/java/org/apache/commons/cli2/commandline/DefaultingCommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultingCommandLine",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.commandline.CommandLineImpl"
      ],
      "begin_line": 41,
      "end_line": 181,
      "comment": "\n * Manages a queue of default CommandLines. This CommandLine implementation is\n * backed by a queue of CommandLine instances which are queried in turn until a\n * suitable result is found.\n *\n * CommandLine instances can either be added to the back of the queue or can be\n * pushed in at a specific position.\n *\n * @see #appendCommandLine(CommandLine)\n * @see #insertCommandLine(int, CommandLine)\n "
    },
    {
      "type": "field",
      "varNames": [
        "commandLines"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n     * The list of default CommandLine instances\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.appendCommandLine(org.apache.commons.cli2.CommandLine)",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Adds a CommandLine instance to the back of the queue. The supplied\n     * CommandLine will be used as defaults when all other CommandLines produce\n     * no result\n     *\n     * @param commandLine\n     *            the default values to use if all CommandLines\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.insertCommandLine(int, org.apache.commons.cli2.CommandLine)",
      "begin_line": 66,
      "end_line": 70,
      "comment": "\n     * Adds a CommandLine instance to a specified position in the queue.\n     *\n     * @param index ths position at which to insert\n     * @param commandLine the CommandLine to insert\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.commandLines()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Builds an iterator over the build in CommandLines.\n     *\n     * @return an unmodifiable iterator\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getOption(java.lang.String)",
      "begin_line": 81,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getOptions()",
      "begin_line": 92,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 45)",
        "(line 95,col 9)-(line 95,col 42)",
        "(line 96,col 9)-(line 102,col 9)",
        "(line 104,col 9)-(line 104,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getOptionTriggers()",
      "begin_line": 107,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 38)",
        "(line 109,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.hasOption(org.apache.commons.cli2.Option)",
      "begin_line": 117,
      "end_line": 125,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 124,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 127,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 128,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 140,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 143,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 144,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getProperty(java.lang.String)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)",
      "begin_line": 158,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getProperties(org.apache.commons.cli2.Option)",
      "begin_line": 169,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 38)",
        "(line 171,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.DefaultingCommandLine.getProperties()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 51)"
      ]
    }
  ]
}