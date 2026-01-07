{
  "filepath": "/tmp/Cli-14b/src/java/org/apache/commons/cli2/commandline/WriteableCommandLineImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WriteableCommandLineImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.commandline.CommandLineImpl",
        "org.apache.commons.cli2.WriteableCommandLine"
      ],
      "begin_line": 39,
      "end_line": 267,
      "comment": "\n * A WriteableCommandLine implementation allowing Options to write their\n * processed information to a CommandLine.\n "
    },
    {
      "type": "field",
      "varNames": [
        "optionToProperties"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "    private final Properties properties \u003d new Properties();"
    },
    {
      "type": "field",
      "varNames": [
        "nameToOption"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "switches"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultValues"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultSwitches"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normalised"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.WriteableCommandLineImpl(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 59,
      "end_line": 63,
      "comment": "\n     * Creates a new WriteableCommandLineImpl rooted on the specified Option, to\n     * hold the parsed arguments.\n     *\n     * @param rootOption the CommandLine\u0027s root Option\n     * @param arguments the arguments this CommandLine represents\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 49)",
        "(line 62,col 9)-(line 62,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(org.apache.commons.cli2.Option)",
      "begin_line": 65,
      "end_line": 72,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 28)",
        "(line 67,col 9)-(line 67,col 60)",
        "(line 69,col 9)-(line 71,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addValue(org.apache.commons.cli2.Option, java.lang.Object)",
      "begin_line": 74,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 51)",
        "(line 82,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addSwitch(org.apache.commons.cli2.Option, boolean)",
      "begin_line": 90,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 26)",
        "(line 94,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption(org.apache.commons.cli2.Option)",
      "begin_line": 101,
      "end_line": 105,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 57)",
        "(line 104,col 9)-(line 104,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption(java.lang.String)",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 111,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 51)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 131,col 9)-(line 131,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues(org.apache.commons.cli2.Option)",
      "begin_line": 134,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 136,col 7)-(line 136,col 49)",
        "(line 139,col 7)-(line 141,col 7)",
        "(line 143,col 7)-(line 143,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 146,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 54)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(java.lang.String)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)",
      "begin_line": 168,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 76)",
        "(line 172,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(java.lang.String, java.lang.String)",
      "begin_line": 179,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)",
      "begin_line": 183,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 76)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties(org.apache.commons.cli2.Option)",
      "begin_line": 193,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 76)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 198,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(java.lang.String)",
      "begin_line": 205,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString()",
      "begin_line": 217,
      "end_line": 236,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 55)",
        "(line 221,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 235,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptions()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptionTriggers()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 246,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 255,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getNormalised()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 56)"
      ]
    }
  ]
}