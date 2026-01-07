{
  "filepath": "/tmp/Cli-7b/src/java/org/apache/commons/cli2/commandline/WriteableCommandLineImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "WriteableCommandLineImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.commandline.CommandLineImpl",
        "org.apache.commons.cli2.WriteableCommandLine"
      ],
      "begin_line": 38,
      "end_line": 226,
      "comment": "\n * A WriteableCommandLine implementation allowing Options to write their\n * processed information to a CommandLine.\n "
    },
    {
      "type": "field",
      "varNames": [
        "properties"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nameToOption"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "values"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "switches"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultValues"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "defaultSwitches"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "normalised"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.WriteableCommandLineImpl(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 57,
      "end_line": 61,
      "comment": "\n     * Creates a new WriteableCommandLineImpl rooted on the specified Option, to\n     * hold the parsed arguments.\n     *\n     * @param rootOption the CommandLine\u0027s root Option\n     * @param arguments the arguments this CommandLine represents\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 49)",
        "(line 60,col 9)-(line 60,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addOption(org.apache.commons.cli2.Option)",
      "begin_line": 63,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 28)",
        "(line 65,col 9)-(line 65,col 60)",
        "(line 67,col 9)-(line 69,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addValue(org.apache.commons.cli2.Option, java.lang.Object)",
      "begin_line": 72,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 78,col 51)",
        "(line 80,col 9)-(line 83,col 9)",
        "(line 85,col 9)-(line 85,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addSwitch(org.apache.commons.cli2.Option, boolean)",
      "begin_line": 88,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 26)",
        "(line 92,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption(org.apache.commons.cli2.Option)",
      "begin_line": 99,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 57)",
        "(line 102,col 9)-(line 102,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption(java.lang.String)",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 109,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 51)",
        "(line 115,col 9)-(line 117,col 9)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 132,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 54)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(java.lang.String, java.lang.String)",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(java.lang.String, java.lang.String)",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(java.lang.String)",
      "begin_line": 164,
      "end_line": 174,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString()",
      "begin_line": 176,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 55)",
        "(line 180,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptions()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptionTriggers()",
      "begin_line": 201,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 205,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 214,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 216,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getNormalised()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 56)"
      ]
    }
  ]
}