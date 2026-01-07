{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/DefaultParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 30,
      "end_line": 781,
      "comment": "\n * Default parser.\n *\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "cmd"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " The command-line instance. "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " The current options. "
    },
    {
      "type": "field",
      "varNames": [
        "stopAtNonOption"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Flag indicating how unrecognized tokens are handled. \u003ctt\u003etrue\u003c/tt\u003e to stop\n     * the parsing and add the remaining tokens to the args list.\n     * \u003ctt\u003efalse\u003c/tt\u003e to throw an exception. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentToken"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The token currently processed. "
    },
    {
      "type": "field",
      "varNames": [
        "currentOption"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The last option parsed. "
    },
    {
      "type": "field",
      "varNames": [
        "skipParsing"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Flag indicating if tokens should no longer be analyzed and simply added as arguments of the command line. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedOpts"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The required options and groups expected to be found when parsing the command line. "
    },
    {
      "type": "field",
      "varNames": [
        "allowPartialMatching"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Flag indicating if partial matching of long options is supported. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.DefaultParser.DefaultParser()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Creates a new DefaultParser instance with partial matching enabled.\n     *\n     * By \"partial matching\" we mean that given the following code:\n     * \u003cpre\u003e\n     *     {@code\n     *          final Options options \u003d new Options();\n     *      options.addOption(new Option(\"d\", \"debug\", false, \"Turn on debug.\"));\n     *      options.addOption(new Option(\"e\", \"extract\", false, \"Turn on extract.\"));\n     *      options.addOption(new Option(\"o\", \"option\", true, \"Turn on option with argument.\"));\n     *      }\n     * \u003c/pre\u003e\n     * with \"partial matching\" turned on, \u003ccode\u003e-de\u003c/code\u003e only matches the\n     * \u003ccode\u003e\"debug\"\u003c/code\u003e option. However, with \"partial matching\" disabled,\n     * \u003ccode\u003e-de\u003c/code\u003e would enable both \u003ccode\u003edebug\u003c/code\u003e as well as\n     * \u003ccode\u003eextract\u003c/code\u003e options.\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 41)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.DefaultParser.DefaultParser(boolean)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Create a new DefaultParser instance with the specified partial matching policy.\n     *\n     * By \"partial matching\" we mean that given the following code:\n     * \u003cpre\u003e\n     *     {@code\n     *          final Options options \u003d new Options();\n     *      options.addOption(new Option(\"d\", \"debug\", false, \"Turn on debug.\"));\n     *      options.addOption(new Option(\"e\", \"extract\", false, \"Turn on extract.\"));\n     *      options.addOption(new Option(\"o\", \"option\", true, \"Turn on option with argument.\"));\n     *      }\n     * \u003c/pre\u003e\n     * with \"partial matching\" turned on, \u003ccode\u003e-de\u003c/code\u003e only matches the\n     * \u003ccode\u003e\"debug\"\u003c/code\u003e option. However, with \"partial matching\" disabled,\n     * \u003ccode\u003e-de\u003c/code\u003e would enable both \u003ccode\u003edebug\u003c/code\u003e as well as\n     * \u003ccode\u003eextract\u003c/code\u003e options.\n     *\n     * @param allowPartialMatching if partial matching of long options shall be enabled\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 104,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * Parse the arguments according to the specified options and properties.\n     *\n     * @param options    the specified Options\n     * @param arguments  the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 125,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 145,
      "end_line": 179,
      "comment": "\n     * Parse the arguments according to the specified options and properties.\n     *\n     * @param options         the specified Options\n     * @param arguments       the command line arguments\n     * @param properties      command line option name-value pairs\n     * @param stopAtNonOption if \u003ctt\u003etrue\u003c/tt\u003e an unrecognized argument stops\n     *     the parsing and the remaining arguments are added to the \n     *     {@link CommandLine}s args list. If \u003ctt\u003efalse\u003c/tt\u003e an unrecognized\n     *     argument triggers a ParseException.\n     *\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 31)",
        "(line 149,col 9)-(line 149,col 47)",
        "(line 150,col 9)-(line 150,col 28)",
        "(line 151,col 9)-(line 151,col 29)",
        "(line 152,col 9)-(line 152,col 67)",
        "(line 155,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 160,col 32)",
        "(line 162,col 9)-(line 168,col 9)",
        "(line 171,col 9)-(line 171,col 28)",
        "(line 174,col 9)-(line 174,col 37)",
        "(line 176,col 9)-(line 176,col 31)",
        "(line 178,col 9)-(line 178,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleProperties(java.util.Properties)",
      "begin_line": 186,
      "end_line": 231,
      "comment": "\n     * Sets the values of Options using the values in \u003ccode\u003eproperties\u003c/code\u003e.\n     *\n     * @param properties The value properties to be processed.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredOptions()",
      "begin_line": 240,
      "end_line": 247,
      "comment": "\n     * Throws a {@link MissingOptionException} if all of the required options\n     * are not present.\n     *\n     * @throws MissingOptionException if any of the required Options\n     * are not present.\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredArgs()",
      "begin_line": 253,
      "end_line": 259,
      "comment": "\n     * Throw a {@link MissingArgumentException} if the current option\n     * didn\u0027t receive the number of arguments expected.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleToken(java.lang.String)",
      "begin_line": 267,
      "end_line": 300,
      "comment": "\n     * Handle any command line token.\n     *\n     * @param token the command line token to handle\n     * @throws ParseException\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 29)",
        "(line 271,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isArgument(java.lang.String)",
      "begin_line": 307,
      "end_line": 310,
      "comment": "\n     * Returns true is the token is a valid argument.\n     *\n     * @param token\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isNegativeNumber(java.lang.String)",
      "begin_line": 317,
      "end_line": 328,
      "comment": "\n     * Check if the token is a negative number.\n     *\n     * @param token\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 327,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isOption(java.lang.String)",
      "begin_line": 335,
      "end_line": 338,
      "comment": "\n     * Tells if the token looks like an option.\n     *\n     * @param token\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isShortOption(java.lang.String)",
      "begin_line": 345,
      "end_line": 362,
      "comment": "\n     * Tells if the token looks like a short option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 351,col 9)",
        "(line 354,col 9)-(line 354,col 43)",
        "(line 355,col 9)-(line 355,col 88)",
        "(line 356,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 361,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isLongOption(java.lang.String)",
      "begin_line": 369,
      "end_line": 391,
      "comment": "\n     * Tells if the token looks like a long option.\n     *\n     * @param token\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 376,col 43)",
        "(line 377,col 9)-(line 377,col 69)",
        "(line 379,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 390,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleUnknownToken(java.lang.String)",
      "begin_line": 402,
      "end_line": 414,
      "comment": "\n     * Handles an unknown token. If the token starts with a dash an \n     * UnrecognizedOptionException is thrown. Otherwise the token is added \n     * to the arguments of the command line. If the stopAtNonOption flag \n     * is set, this stops the parsing and the remaining tokens are added \n     * as-is in the arguments of the command line.\n     *\n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 409,col 26)",
        "(line 410,col 9)-(line 413,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOption(java.lang.String)",
      "begin_line": 426,
      "end_line": 436,
      "comment": "\n     * Handles the following tokens:\n     *\n     * --L\n     * --L\u003dV\n     * --L V\n     * --l\n     *\n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 435,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual(java.lang.String)",
      "begin_line": 448,
      "end_line": 464,
      "comment": "\n     * Handles the following tokens:\n     *\n     * --L\n     * -L\n     * --l\n     * -l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 72)",
        "(line 451,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual(java.lang.String)",
      "begin_line": 476,
      "end_line": 509,
      "comment": "\n     * Handles the following tokens:\n     *\n     * --L\u003dV\n     * -L\u003dV\n     * --l\u003dV\n     * -l\u003dV\n     *\n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 43)",
        "(line 480,col 9)-(line 480,col 54)",
        "(line 482,col 9)-(line 482,col 51)",
        "(line 484,col 9)-(line 484,col 70)",
        "(line 485,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleShortAndLongOption(java.lang.String)",
      "begin_line": 530,
      "end_line": 620,
      "comment": "\n     * Handles the following tokens:\n     *\n     * -S\n     * -SV\n     * -S V\n     * -S\u003dV\n     * -S1S2\n     * -S1S2 V\n     * -SV1\u003dV2\n     *\n     * -L\n     * -LV\n     * -L V\n     * -L\u003dV\n     * -l\n     *\n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 57)",
        "(line 534,col 9)-(line 534,col 39)",
        "(line 536,col 9)-(line 619,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.getLongPrefix(java.lang.String)",
      "begin_line": 627,
      "end_line": 644,
      "comment": "\n     * Search for a prefix that is the long name of an option (-Xmx512m)\n     *\n     * @param token\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 57)",
        "(line 631,col 9)-(line 631,col 14)",
        "(line 632,col 9)-(line 632,col 26)",
        "(line 633,col 9)-(line 641,col 9)",
        "(line 643,col 9)-(line 643,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isJavaProperty(java.lang.String)",
      "begin_line": 649,
      "end_line": 655,
      "comment": "\n     * Check if the specified token is a Java-like property (-Dkey\u003dvalue).\n     ",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 49)",
        "(line 652,col 9)-(line 652,col 53)",
        "(line 654,col 9)-(line 654,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleOption(org.apache.commons.cli.Option)",
      "begin_line": 657,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 28)",
        "(line 662,col 9)-(line 662,col 41)",
        "(line 664,col 9)-(line 664,col 38)",
        "(line 666,col 9)-(line 666,col 30)",
        "(line 668,col 9)-(line 675,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.updateRequiredOptions(org.apache.commons.cli.Option)",
      "begin_line": 683,
      "end_line": 702,
      "comment": "\n     * Removes the option or its group from the list of expected elements.\n     *\n     * @param option\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 688,col 9)",
        "(line 691,col 9)-(line 701,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.getMatchingLongOptions(java.lang.String)",
      "begin_line": 711,
      "end_line": 728,
      "comment": "\n     * Returns a list of matching option strings for the given token, depending\n     * on the selected partial matching policy.\n     *\n     * @param token the token (may contain leading dashes)\n     * @return the list of matching option strings or an empty list if no matching option could be found\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 727,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleConcatenatedOptions(java.lang.String)",
      "begin_line": 757,
      "end_line": 780,
      "comment": "\n     * Breaks \u003ccode\u003etoken\u003c/code\u003e into its constituent parts\n     * using the following algorithm.\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eignore the first character (\"\u003cb\u003e-\u003c/b\u003e\")\u003c/li\u003e\n     *  \u003cli\u003efor each remaining character check if an {@link Option}\n     *  exists with that id.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does exist then add that character\n     *  prepended with \"\u003cb\u003e-\u003c/b\u003e\" to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif the {@link Option} can have an argument value and there\n     *  are remaining characters in the token then add the remaining\n     *  characters as a token to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS\u003c/b\u003e set then add the special token\n     *  \"\u003cb\u003e--\u003c/b\u003e\" followed by the remaining characters and also\n     *  the remaining tokens directly to the processed tokens list.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS NOT\u003c/b\u003e set then add that\n     *  character prepended with \"\u003cb\u003e-\u003c/b\u003e\".\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param token The current token to be \u003cb\u003eburst\u003c/b\u003e\n     * at the first non-Option encountered.\n     * @throws ParseException if there are any problems encountered\n     *                        while parsing the command line token.\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 779,col 9)"
      ]
    }
  ]
}