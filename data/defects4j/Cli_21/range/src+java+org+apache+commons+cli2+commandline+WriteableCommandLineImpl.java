{
  "filepath": "/tmp/Cli-21b/src/java/org/apache/commons/cli2/commandline/WriteableCommandLineImpl.java",
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
      "end_line": 298,
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
      "begin_line": 67,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 28)",
        "(line 69,col 9)-(line 69,col 60)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 76,col 9)-(line 76,col 43)",
        "(line 77,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addValue(org.apache.commons.cli2.Option, java.lang.Object)",
      "begin_line": 83,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 87,col 9)",
        "(line 89,col 9)-(line 89,col 51)",
        "(line 91,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addSwitch(org.apache.commons.cli2.Option, boolean)",
      "begin_line": 99,
      "end_line": 108,
      "comment": "",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 26)",
        "(line 103,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.hasOption(org.apache.commons.cli2.Option)",
      "begin_line": 110,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 57)",
        "(line 113,col 9)-(line 113,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOption(java.lang.String)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 120,
      "end_line": 148,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 51)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 131,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 147,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getUndefaultedValues(org.apache.commons.cli2.Option)",
      "begin_line": 150,
      "end_line": 160,
      "comment": "",
      "child_ranges": [
        "(line 152,col 7)-(line 152,col 49)",
        "(line 155,col 7)-(line 157,col 7)",
        "(line 159,col 7)-(line 159,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 162,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 54)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 177,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(java.lang.String)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)",
      "begin_line": 184,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 76)",
        "(line 188,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 192,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.addProperty(java.lang.String, java.lang.String)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperty(org.apache.commons.cli2.Option, java.lang.String, java.lang.String)",
      "begin_line": 199,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 76)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties(org.apache.commons.cli2.Option)",
      "begin_line": 209,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 76)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getProperties()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.looksLikeOption(java.lang.String)",
      "begin_line": 232,
      "end_line": 246,
      "comment": "\n     * Tests whether the passed in trigger looks like an option. This\n     * implementation first checks whether the passed in string starts with a\n     * prefix that indicates an option. If this is the case, it is also checked\n     * whether an option of this name is known for the current option. (This can\n     * lead to reentrant invocations of this method, so care has to be taken\n     * about this.)\n     *\n     * @param trigger the command line element to test\n     * @return a flag whether this element seems to be an option\n     ",
      "child_ranges": [
        "(line 236,col 13)-(line 244,col 13)",
        "(line 245,col 13)-(line 245,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.toString()",
      "begin_line": 248,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 55)",
        "(line 252,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 266,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptions()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getOptionTriggers()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultValues(org.apache.commons.cli2.Option, java.util.List)",
      "begin_line": 277,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 279,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.setDefaultSwitch(org.apache.commons.cli2.Option, java.lang.Boolean)",
      "begin_line": 286,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 292,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.commandline.WriteableCommandLineImpl.getNormalised()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 56)"
      ]
    }
  ]
}