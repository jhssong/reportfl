{
  "filepath": "/tmp/Cli-14b/src/java/org/apache/commons/cli2/commandline/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 176,
      "comment": "\n * A class that implements the \u003ccode\u003eParser\u003c/code\u003e interface can parse a\n * String array according to the {@link Group}specified and return a\n * {@link CommandLine}.\n *\n * @author John Keyes (john at integralsource.com)\n "
    },
    {
      "type": "field",
      "varNames": [
        "helpFormatter"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "helpOption"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "helpTrigger"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "group"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.Parser.parse(java.lang.String[])",
      "begin_line": 55,
      "end_line": 108,
      "comment": "\n     * Parse the arguments according to the specified options and properties.\n     *\n     * @param arguments\n     *            the command line arguments\n     *\n     * @return the list of atomic option and value tokens\n     * @throws OptionException\n     *             if there are any problems encountered while parsing the\n     *             command line tokens.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 51)",
        "(line 61,col 9)-(line 67,col 9)",
        "(line 70,col 9)-(line 70,col 99)",
        "(line 73,col 9)-(line 73,col 36)",
        "(line 76,col 9)-(line 76,col 66)",
        "(line 77,col 9)-(line 77,col 31)",
        "(line 79,col 9)-(line 94,col 9)",
        "(line 97,col 9)-(line 100,col 9)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 107,col 9)-(line 107,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.Parser.parseAndHelp(java.lang.String[])",
      "begin_line": 119,
      "end_line": 138,
      "comment": "\n     * Parse the arguments according to the specified options and properties and\n     * displays the usage screen if the CommandLine is not valid or the help\n     * option was specified.\n     *\n     * @param arguments the command line arguments\n     * @return a valid CommandLine or null if the parse was unsuccessful\n     * @throws IOException if an error occurs while formatting help\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 38)",
        "(line 122,col 9)-(line 132,col 9)",
        "(line 135,col 9)-(line 135,col 30)",
        "(line 137,col 9)-(line 137,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.Parser.setGroup(org.apache.commons.cli2.Group)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Sets the Group of options to parse against\n     * @param group the group of options to parse against\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.Parser.setHelpFormatter(org.apache.commons.cli2.util.HelpFormatter)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Sets the HelpFormatter to use with the simplified parsing.\n     * @see #parseAndHelp(String[])\n     * @param helpFormatter the HelpFormatter to use with the simplified parsing\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.Parser.setHelpOption(org.apache.commons.cli2.Option)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Sets the help option to use with the simplified parsing.  For example\n     * \u003ccode\u003e--help\u003c/code\u003e, \u003ccode\u003e-h\u003c/code\u003e and \u003ccode\u003e-?\u003c/code\u003e are often used.\n     * @see #parseAndHelp(String[])\n     * @param helpOption the help Option\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.Parser.setHelpTrigger(java.lang.String)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Sets the help option to use with the simplified parsing.  For example\n     * \u003ccode\u003e--help\u003c/code\u003e, \u003ccode\u003e-h\u003c/code\u003e and \u003ccode\u003e-?\u003c/code\u003e are often used.\n     * @see #parseAndHelp(String[])\n     * @param helpTrigger the trigger of the help Option\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 39)"
      ]
    }
  ]
}