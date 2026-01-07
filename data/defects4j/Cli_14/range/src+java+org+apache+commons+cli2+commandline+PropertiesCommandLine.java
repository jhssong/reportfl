{
  "filepath": "/tmp/Cli-14b/src/java/org/apache/commons/cli2/commandline/PropertiesCommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertiesCommandLine",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.commandline.CommandLineImpl"
      ],
      "begin_line": 46,
      "end_line": 164,
      "comment": "\n * A CommandLine implementation using a java Properties instance, useful for\n * constructing a complex DefaultingCommandLine\n *\n * Options are keyed from their property name and presence in the Properties\n * instance is taken as presence in the CommandLine.  Argument values are taken\n * from the property value and are optionally separated using the separator\n * char, defined at construction time.  Switch values can be specified using a\n * simple value of \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e; obviously this means\n * that Switches with Arguments are not supported by this implementation.\n *\n * @see java.util.Properties\n * @see org.apache.commons.cli2.commandline.DefaultingCommandLine\n * @see org.apache.commons.cli2.Option#getPreferredName()\n "
    },
    {
      "type": "field",
      "varNames": [
        "NUL"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "properties"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.PropertiesCommandLine(org.apache.commons.cli2.Option, java.util.Properties)",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * Creates a new PropertiesCommandLine using the specified root Option,\n     * Properties instance.  The character 0 is used as the value separator.\n     *\n     * @param root the CommandLine\u0027s root Option\n     * @param properties the Properties instance to get values from\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.PropertiesCommandLine(org.apache.commons.cli2.Option, java.util.Properties, char)",
      "begin_line": 72,
      "end_line": 76,
      "comment": "\n     * Creates a new PropertiesCommandLine using the specified root Option,\n     * Properties instance and value separator.\n     *\n     * @param root the CommandLine\u0027s root Option\n     * @param properties the Properties instance to get values from\n     * @param separator the character to split argument values\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 25)",
        "(line 74,col 9)-(line 74,col 37)",
        "(line 75,col 9)-(line 75,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.hasOption(org.apache.commons.cli2.Option)",
      "begin_line": 79,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 85,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getOption(java.lang.String)",
      "begin_line": 88,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 92,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 79)",
        "(line 95,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 113,
      "end_line": 124,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 79)",
        "(line 115,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getProperty(java.lang.String)",
      "begin_line": 126,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getProperties(org.apache.commons.cli2.Option)",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getProperties()",
      "begin_line": 138,
      "end_line": 140,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getOptions()",
      "begin_line": 142,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 45)",
        "(line 144,col 9)-(line 144,col 61)",
        "(line 145,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getOptionTriggers()",
      "begin_line": 155,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 43)",
        "(line 157,col 9)-(line 157,col 57)",
        "(line 158,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 162,col 53)"
      ]
    }
  ]
}