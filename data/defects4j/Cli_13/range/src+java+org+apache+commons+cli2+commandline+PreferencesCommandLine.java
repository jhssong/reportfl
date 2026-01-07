{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/commandline/PreferencesCommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PreferencesCommandLine",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.commandline.CommandLineImpl"
      ],
      "begin_line": 49,
      "end_line": 170,
      "comment": "\n * A CommandLine implementation using the Preferences API, useful when\n * constructing a complex DefaultingCommandLine\n *\n * This implementation uses the children of a single preference node to populate\n * the CommandLine.  Options are keyed from their preferred name and presence in\n * the Preferences object is taken as presence in the CommandLine.  Argument\n * values are taken from the Preference value and are optionally separated using\n * the separator char defined, at construction time.  Switch values can be\n * specified using a simple value of \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e;\n * obviously this means that Switches with Arguments are not supported by this\n * implementation.\n *\n * @see java.util.prefs.Preferences\n * @see org.apache.commons.cli2.commandline.DefaultingCommandLine\n * @see org.apache.commons.cli2.Option#getPreferredName()\n "
    },
    {
      "type": "field",
      "varNames": [
        "NUL"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preferences"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.PreferencesCommandLine(org.apache.commons.cli2.Option, java.util.prefs.Preferences)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * Creates a new PreferencesCommandLine using the specified root Option and\n     * Preferences node.  Argument values will be separated using the char 0.\n     *\n     * @param root the CommandLine\u0027s root Option\n     * @param preferences the Preferences node to get values from\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.PreferencesCommandLine(org.apache.commons.cli2.Option, java.util.prefs.Preferences, char)",
      "begin_line": 75,
      "end_line": 79,
      "comment": "\n     * Creates a new PreferencesCommandLine using the specified root Option,\n     * Preferences node and value separator.\n     *\n     * @param root the CommandLine\u0027s root Option\n     * @param preferences the Preferences node to get values from\n     * @param separator the character to split argument values\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 25)",
        "(line 77,col 9)-(line 77,col 39)",
        "(line 78,col 9)-(line 78,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.hasOption(org.apache.commons.cli2.Option)",
      "begin_line": 81,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 91,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getOption(java.lang.String)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 98,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 77)",
        "(line 101,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 119,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 77)",
        "(line 121,col 9)-(line 129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getProperty(java.lang.String, java.lang.String)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getProperties()",
      "begin_line": 136,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getOptions()",
      "begin_line": 144,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getOptionTriggers()",
      "begin_line": 161,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 43)",
        "(line 163,col 9)-(line 163,col 57)",
        "(line 164,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 53)"
      ]
    }
  ]
}