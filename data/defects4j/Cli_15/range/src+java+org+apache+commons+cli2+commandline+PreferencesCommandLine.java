{
  "filepath": "/tmp/Cli-15b/src/java/org/apache/commons/cli2/commandline/PreferencesCommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PreferencesCommandLine",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.commandline.CommandLineImpl"
      ],
      "begin_line": 50,
      "end_line": 179,
      "comment": "\n * A CommandLine implementation using the Preferences API, useful when\n * constructing a complex DefaultingCommandLine\n *\n * This implementation uses the children of a single preference node to populate\n * the CommandLine.  Options are keyed from their preferred name and presence in\n * the Preferences object is taken as presence in the CommandLine.  Argument\n * values are taken from the Preference value and are optionally separated using\n * the separator char defined, at construction time.  Switch values can be\n * specified using a simple value of \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e;\n * obviously this means that Switches with Arguments are not supported by this\n * implementation.\n *\n * @see java.util.prefs.Preferences\n * @see org.apache.commons.cli2.commandline.DefaultingCommandLine\n * @see org.apache.commons.cli2.Option#getPreferredName()\n "
    },
    {
      "type": "field",
      "varNames": [
        "NUL"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preferences"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.PreferencesCommandLine(org.apache.commons.cli2.Option, java.util.prefs.Preferences)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * Creates a new PreferencesCommandLine using the specified root Option and\n     * Preferences node.  Argument values will be separated using the char 0.\n     *\n     * @param root the CommandLine\u0027s root Option\n     * @param preferences the Preferences node to get values from\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.PreferencesCommandLine(org.apache.commons.cli2.Option, java.util.prefs.Preferences, char)",
      "begin_line": 76,
      "end_line": 80,
      "comment": "\n     * Creates a new PreferencesCommandLine using the specified root Option,\n     * Preferences node and value separator.\n     *\n     * @param root the CommandLine\u0027s root Option\n     * @param preferences the Preferences node to get values from\n     * @param separator the character to split argument values\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 25)",
        "(line 78,col 9)-(line 78,col 39)",
        "(line 79,col 9)-(line 79,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.hasOption(org.apache.commons.cli2.Option)",
      "begin_line": 82,
      "end_line": 93,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 92,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getOption(java.lang.String)",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 99,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 77)",
        "(line 102,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 120,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 77)",
        "(line 122,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getProperty(java.lang.String)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)",
      "begin_line": 137,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getProperties(org.apache.commons.cli2.Option)",
      "begin_line": 141,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 142,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getProperties()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getOptions()",
      "begin_line": 153,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 154,col 9)-(line 167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PreferencesCommandLine.getOptionTriggers()",
      "begin_line": 170,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 43)",
        "(line 172,col 9)-(line 172,col 57)",
        "(line 173,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 53)"
      ]
    }
  ]
}