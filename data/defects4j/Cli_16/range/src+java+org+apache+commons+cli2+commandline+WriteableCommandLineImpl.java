{
  "filepath": "/tmp/Cli-16b/src/java/org/apache/commons/cli2/commandline/WriteableCommandLineImpl.java",
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
      "end_line": 276,
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
      "end_line": 74,
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
      "begin_line": 76,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 51)",
        "(line 84,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addSwitch(org.apache.commons.cli2.Option, boolean)",
      "begin_line": 92,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 26)",
        "(line 96,col 9)-(line 100,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption(org.apache.commons.cli2.Option)",
      "begin_line": 103,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 57)",
        "(line 106,col 9)-(line 106,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption(java.lang.String)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 113,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 51)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 124,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 140,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues(org.apache.commons.cli2.Option)",
      "begin_line": 143,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 145,col 7)-(line 145,col 49)",
        "(line 148,col 7)-(line 150,col 7)",
        "(line 152,col 7)-(line 152,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 155,
      "end_line": 171,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 54)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(java.lang.String)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)",
      "begin_line": 177,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 76)",
        "(line 181,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(java.lang.String, java.lang.String)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)",
      "begin_line": 192,
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 76)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties(org.apache.commons.cli2.Option)",
      "begin_line": 202,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 76)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties()",
      "begin_line": 210,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(java.lang.String)",
      "begin_line": 214,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString()",
      "begin_line": 226,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 55)",
        "(line 230,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptions()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptionTriggers()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 255,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 264,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getNormalised()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 56)"
      ]
    }
  ]
}