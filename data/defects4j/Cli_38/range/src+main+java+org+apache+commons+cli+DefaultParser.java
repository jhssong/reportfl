{
  "filepath": "/tmp/Cli-38b/src/main/java/org/apache/commons/cli/DefaultParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 31,
      "end_line": 703,
      "comment": "\n * Default parser.\n * \n * @version $Id$\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "cmd"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The command-line instance. "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The current options. "
    },
    {
      "type": "field",
      "varNames": [
        "stopAtNonOption"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Flag indicating how unrecognized tokens are handled. \u003ctt\u003etrue\u003c/tt\u003e to stop\n     * the parsing and add the remaining tokens to the args list.\n     * \u003ctt\u003efalse\u003c/tt\u003e to throw an exception. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentToken"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The token currently processed. "
    },
    {
      "type": "field",
      "varNames": [
        "currentOption"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " The last option parsed. "
    },
    {
      "type": "field",
      "varNames": [
        "skipParsing"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " Flag indicating if tokens should no longer be analyzed and simply added as arguments of the command line. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedOpts"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " The required options and groups expected to be found when parsing the command line. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 58,
      "end_line": 61,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Parse the arguments according to the specified options and properties.\n     *\n     * @param options    the specified Options\n     * @param arguments  the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 79,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 99,
      "end_line": 133,
      "comment": "\n     * Parse the arguments according to the specified options and properties.\n     *\n     * @param options         the specified Options\n     * @param arguments       the command line arguments\n     * @param properties      command line option name-value pairs\n     * @param stopAtNonOption if \u003ctt\u003etrue\u003c/tt\u003e an unrecognized argument stops\n     *     the parsing and the remaining arguments are added to the \n     *     {@link CommandLine}s args list. If \u003ctt\u003efalse\u003c/tt\u003e an unrecognized\n     *     argument triggers a ParseException.\n     *\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 31)",
        "(line 103,col 9)-(line 103,col 47)",
        "(line 104,col 9)-(line 104,col 28)",
        "(line 105,col 9)-(line 105,col 29)",
        "(line 106,col 9)-(line 106,col 67)",
        "(line 109,col 9)-(line 112,col 9)",
        "(line 114,col 9)-(line 114,col 32)",
        "(line 116,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 28)",
        "(line 128,col 9)-(line 128,col 37)",
        "(line 130,col 9)-(line 130,col 31)",
        "(line 132,col 9)-(line 132,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleProperties(java.util.Properties)",
      "begin_line": 140,
      "end_line": 185,
      "comment": "\n     * Sets the values of Options using the values in \u003ccode\u003eproperties\u003c/code\u003e.\n     *\n     * @param properties The value properties to be processed.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 184,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredOptions()",
      "begin_line": 194,
      "end_line": 201,
      "comment": "\n     * Throws a {@link MissingOptionException} if all of the required options\n     * are not present.\n     *\n     * @throws MissingOptionException if any of the required Options\n     * are not present.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 200,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredArgs()",
      "begin_line": 207,
      "end_line": 213,
      "comment": "\n     * Throw a {@link MissingArgumentException} if the current option\n     * didn\u0027t receive the number of arguments expected.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 212,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleToken(java.lang.String)",
      "begin_line": 221,
      "end_line": 254,
      "comment": "\n     * Handle any command line token.\n     *\n     * @param token the command line token to handle\n     * @throws ParseException\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 29)",
        "(line 225,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isArgument(java.lang.String)",
      "begin_line": 261,
      "end_line": 264,
      "comment": "\n     * Returns true is the token is a valid argument.\n     *\n     * @param token\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isNegativeNumber(java.lang.String)",
      "begin_line": 271,
      "end_line": 282,
      "comment": "\n     * Check if the token is a negative number.\n     *\n     * @param token\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isOption(java.lang.String)",
      "begin_line": 289,
      "end_line": 292,
      "comment": "\n     * Tells if the token looks like an option.\n     *\n     * @param token\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isShortOption(java.lang.String)",
      "begin_line": 299,
      "end_line": 312,
      "comment": "\n     * Tells if the token looks like a short option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 305,col 9)",
        "(line 308,col 9)-(line 308,col 37)",
        "(line 309,col 9)-(line 309,col 82)",
        "(line 310,col 9)-(line 310,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isLongOption(java.lang.String)",
      "begin_line": 319,
      "end_line": 341,
      "comment": "\n     * Tells if the token looks like a long option.\n     *\n     * @param token\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 326,col 37)",
        "(line 327,col 9)-(line 327,col 63)",
        "(line 329,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 340,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleUnknownToken(java.lang.String)",
      "begin_line": 352,
      "end_line": 364,
      "comment": "\n     * Handles an unknown token. If the token starts with a dash an \n     * UnrecognizedOptionException is thrown. Otherwise the token is added \n     * to the arguments of the command line. If the stopAtNonOption flag \n     * is set, this stops the parsing and the remaining tokens are added \n     * as-is in the arguments of the command line.\n     *\n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 357,col 9)",
        "(line 359,col 9)-(line 359,col 26)",
        "(line 360,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOption(java.lang.String)",
      "begin_line": 376,
      "end_line": 386,
      "comment": "\n     * Handles the following tokens:\n     *\n     * --L\n     * --L\u003dV\n     * --L V\n     * --l\n     *\n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 385,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual(java.lang.String)",
      "begin_line": 398,
      "end_line": 413,
      "comment": "\n     * Handles the following tokens:\n     *\n     * --L\n     * -L\n     * --l\n     * -l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 70)",
        "(line 401,col 9)-(line 412,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual(java.lang.String)",
      "begin_line": 425,
      "end_line": 457,
      "comment": "\n     * Handles the following tokens:\n     *\n     * --L\u003dV\n     * -L\u003dV\n     * --l\u003dV\n     * -l\u003dV\n     *\n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 37)",
        "(line 429,col 9)-(line 429,col 48)",
        "(line 431,col 9)-(line 431,col 45)",
        "(line 433,col 9)-(line 433,col 68)",
        "(line 434,col 9)-(line 456,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleShortAndLongOption(java.lang.String)",
      "begin_line": 478,
      "end_line": 568,
      "comment": "\n     * Handles the following tokens:\n     *\n     * -S\n     * -SV\n     * -S V\n     * -S\u003dV\n     * -S1S2\n     * -S1S2 V\n     * -SV1\u003dV2\n     *\n     * -L\n     * -LV\n     * -L V\n     * -L\u003dV\n     * -l\n     *\n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 51)",
        "(line 482,col 9)-(line 482,col 33)",
        "(line 484,col 9)-(line 567,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.getLongPrefix(java.lang.String)",
      "begin_line": 575,
      "end_line": 592,
      "comment": "\n     * Search for a prefix that is the long name of an option (-Xmx512m)\n     *\n     * @param token\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 51)",
        "(line 579,col 9)-(line 579,col 14)",
        "(line 580,col 9)-(line 580,col 26)",
        "(line 581,col 9)-(line 589,col 9)",
        "(line 591,col 9)-(line 591,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isJavaProperty(java.lang.String)",
      "begin_line": 597,
      "end_line": 603,
      "comment": "\n     * Check if the specified token is a Java-like property (-Dkey\u003dvalue).\n     ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 43)",
        "(line 600,col 9)-(line 600,col 47)",
        "(line 602,col 9)-(line 602,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleOption(org.apache.commons.cli.Option)",
      "begin_line": 605,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 28)",
        "(line 610,col 9)-(line 610,col 41)",
        "(line 612,col 9)-(line 612,col 38)",
        "(line 614,col 9)-(line 614,col 30)",
        "(line 616,col 9)-(line 623,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.updateRequiredOptions(org.apache.commons.cli.Option)",
      "begin_line": 631,
      "end_line": 650,
      "comment": "\n     * Removes the option or its group from the list of expected elements.\n     *\n     * @param option\n     ",
      "child_ranges": [
        "(line 633,col 9)-(line 636,col 9)",
        "(line 639,col 9)-(line 649,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleConcatenatedOptions(java.lang.String)",
      "begin_line": 679,
      "end_line": 702,
      "comment": "\n     * Breaks \u003ccode\u003etoken\u003c/code\u003e into its constituent parts\n     * using the following algorithm.\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eignore the first character (\"\u003cb\u003e-\u003c/b\u003e\")\u003c/li\u003e\n     *  \u003cli\u003eforeach remaining character check if an {@link Option}\n     *  exists with that id.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does exist then add that character\n     *  prepended with \"\u003cb\u003e-\u003c/b\u003e\" to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif the {@link Option} can have an argument value and there\n     *  are remaining characters in the token then add the remaining\n     *  characters as a token to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS\u003c/b\u003e set then add the special token\n     *  \"\u003cb\u003e--\u003c/b\u003e\" followed by the remaining characters and also\n     *  the remaining tokens directly to the processed tokens list.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS NOT\u003c/b\u003e set then add that\n     *  character prepended with \"\u003cb\u003e-\u003c/b\u003e\".\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param token The current token to be \u003cb\u003eburst\u003c/b\u003e\n     * at the first non-Option encountered.\n     * @throws ParseException if there are any problems encountered\n     *                        while parsing the command line token.\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 701,col 9)"
      ]
    }
  ]
}