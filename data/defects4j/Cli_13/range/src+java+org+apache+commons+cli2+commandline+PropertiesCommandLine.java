{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/commandline/PropertiesCommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "PropertiesCommandLine",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.commandline.CommandLineImpl"
      ],
      "begin_line": 45,
      "end_line": 155,
      "comment": "\n * A CommandLine implementation using a java Properties instance, useful for\n * constructing a complex DefaultingCommandLine\n *\n * Options are keyed from their property name and presence in the Properties\n * instance is taken as presence in the CommandLine.  Argument values are taken\n * from the property value and are optionally separated using the separator\n * char, defined at construction time.  Switch values can be specified using a\n * simple value of \u003ccode\u003etrue\u003c/code\u003e or \u003ccode\u003efalse\u003c/code\u003e; obviously this means\n * that Switches with Arguments are not supported by this implementation.\n *\n * @see java.util.Properties\n * @see org.apache.commons.cli2.commandline.DefaultingCommandLine\n * @see org.apache.commons.cli2.Option#getPreferredName()\n "
    },
    {
      "type": "field",
      "varNames": [
        "NUL"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "properties"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "root"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "separator"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.PropertiesCommandLine(org.apache.commons.cli2.Option, java.util.Properties)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Creates a new PropertiesCommandLine using the specified root Option,\n     * Properties instance.  The character 0 is used as the value separator.\n     *\n     * @param root the CommandLine\u0027s root Option\n     * @param properties the Properties instance to get values from\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.PropertiesCommandLine(org.apache.commons.cli2.Option, java.util.Properties, char)",
      "begin_line": 71,
      "end_line": 75,
      "comment": "\n     * Creates a new PropertiesCommandLine using the specified root Option,\n     * Properties instance and value separator.\n     *\n     * @param root the CommandLine\u0027s root Option\n     * @param properties the Properties instance to get values from\n     * @param separator the character to split argument values\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 25)",
        "(line 73,col 9)-(line 73,col 37)",
        "(line 74,col 9)-(line 74,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.hasOption(org.apache.commons.cli2.Option)",
      "begin_line": 78,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 84,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getOption(java.lang.String)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 91,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 79)",
        "(line 94,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 112,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 79)",
        "(line 114,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getProperty(java.lang.String, java.lang.String)",
      "begin_line": 125,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getProperties()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getOptions()",
      "begin_line": 133,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 45)",
        "(line 135,col 9)-(line 135,col 61)",
        "(line 136,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.PropertiesCommandLine.getOptionTriggers()",
      "begin_line": 146,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 43)",
        "(line 148,col 9)-(line 148,col 57)",
        "(line 149,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 53)"
      ]
    }
  ]
}