{
  "filepath": "/tmp/Cli-32b/src/main/java/org/apache/commons/cli/DefaultParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 33,
      "end_line": 689,
      "comment": "\n * Default parser.\n * \n * @author Emmanuel Bourg\n * @version $Revision$, $Date$\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "cmd"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stopAtNonOption"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " \n     * Flag indicating how unrecognized tokens are handled. \u003ctt\u003etrue\u003c/tt\u003e to stop\n     * the parsing and add the remaining tokens to the args list.\n     * \u003ctt\u003efalse\u003c/tt\u003e to throw an exception. \n     "
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
      "comment": " Flag indicating if tokens should no longer be analysed and simply added as arguments of the command line. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedOpts"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " The required options expected to be found when parsing the command line. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 73,
      "end_line": 76,
      "comment": "\n     * Parse the arguments according to the specified options and properties.\n     *\n     * @param options    the specified Options\n     * @param arguments  the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 78,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 98,
      "end_line": 132,
      "comment": "\n     * Parse the arguments according to the specified options and properties.\n     *\n     * @param options         the specified Options\n     * @param arguments       the command line arguments\n     * @param properties      command line option name-value pairs\n     * @param stopAtNonOption if \u003ctt\u003etrue\u003c/tt\u003e an unrecognized argument stops\n     *     the parsing and the remaining arguments are added to the \n     *     {@link CommandLine}s args list. If \u003ctt\u003efalse\u003c/tt\u003e an unrecognized\n     *     argument triggers a ParseException.\n     *\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 31)",
        "(line 101,col 9)-(line 101,col 47)",
        "(line 102,col 9)-(line 102,col 28)",
        "(line 103,col 9)-(line 103,col 29)",
        "(line 104,col 9)-(line 104,col 67)",
        "(line 107,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 113,col 32)",
        "(line 115,col 9)-(line 121,col 9)",
        "(line 124,col 9)-(line 124,col 28)",
        "(line 127,col 9)-(line 127,col 37)",
        "(line 129,col 9)-(line 129,col 31)",
        "(line 131,col 9)-(line 131,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleProperties(java.util.Properties)",
      "begin_line": 139,
      "end_line": 184,
      "comment": "\n     * Sets the values of Options using the values in \u003ccode\u003eproperties\u003c/code\u003e.\n     *\n     * @param properties The value properties to be processed.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 183,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredOptions()",
      "begin_line": 193,
      "end_line": 200,
      "comment": "\n     * Throws a {@link MissingOptionException} if all of the required options\n     * are not present.\n     *\n     * @throws MissingOptionException if any of the required Options\n     * are not present.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 199,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredArgs()",
      "begin_line": 206,
      "end_line": 212,
      "comment": "\n     * Throw a {@link MissingArgumentException} if the current option\n     * didn\u0027t receive the number of arguments expected.\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 211,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleToken(java.lang.String)",
      "begin_line": 220,
      "end_line": 253,
      "comment": "\n     * Handle any command line token.\n     * \n     * @param token the command line token to handle\n     * @throws ParseException\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 29)",
        "(line 224,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isArgument(java.lang.String)",
      "begin_line": 260,
      "end_line": 263,
      "comment": "\n     * Returns true is the token is a valid argument.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isNegativeNumber(java.lang.String)",
      "begin_line": 270,
      "end_line": 281,
      "comment": "\n     * Check if the token is a negative number.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isOption(java.lang.String)",
      "begin_line": 288,
      "end_line": 291,
      "comment": "\n     * Tells if the token looks like an option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isShortOption(java.lang.String)",
      "begin_line": 298,
      "end_line": 302,
      "comment": "\n     * Tells if the token looks like a short option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isLongOption(java.lang.String)",
      "begin_line": 309,
      "end_line": 331,
      "comment": "\n     * Tells if the token looks like a long option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 316,col 37)",
        "(line 317,col 9)-(line 317,col 63)",
        "(line 319,col 9)-(line 328,col 9)",
        "(line 330,col 9)-(line 330,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleUnknownToken(java.lang.String)",
      "begin_line": 342,
      "end_line": 354,
      "comment": "\n     * Handles an unknown token. If the token starts with a dash an \n     * UnrecognizedOptionException is thrown. Otherwise the token is added \n     * to the arguments of the command line. If the stopAtNonOption flag \n     * is set, this stops the parsing and the remaining tokens are added \n     * as-is in the arguments of the command line.\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 349,col 26)",
        "(line 350,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOption(java.lang.String)",
      "begin_line": 366,
      "end_line": 376,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\n     * --L\u003dV\n     * --L V\n     * --l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual(java.lang.String)",
      "begin_line": 388,
      "end_line": 403,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\n     * -L\n     * --l\n     * -l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 62)",
        "(line 391,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual(java.lang.String)",
      "begin_line": 415,
      "end_line": 447,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\u003dV\n     * -L\u003dV\n     * --l\u003dV\n     * -l\u003dV\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 37)",
        "(line 419,col 9)-(line 419,col 48)",
        "(line 421,col 9)-(line 421,col 45)",
        "(line 423,col 9)-(line 423,col 60)",
        "(line 424,col 9)-(line 446,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleShortAndLongOption(java.lang.String)",
      "begin_line": 468,
      "end_line": 556,
      "comment": "\n     * Handles the following tokens:\n     * \n     * -S\n     * -SV\n     * -S V\n     * -S\u003dV\n     * -S1S2\n     * -S1S2 V\n     * -SV1\u003dV2\n     * \n     * -L\n     * -LV\n     * -L V\n     * -L\u003dV\n     * -l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 51)",
        "(line 472,col 9)-(line 472,col 33)",
        "(line 474,col 9)-(line 555,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.getLongPrefix(java.lang.String)",
      "begin_line": 563,
      "end_line": 580,
      "comment": "\n     * Search for a prefix that is the long name of an option (-Xmx512m)\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 51)",
        "(line 567,col 9)-(line 567,col 14)",
        "(line 568,col 9)-(line 568,col 26)",
        "(line 569,col 9)-(line 577,col 9)",
        "(line 579,col 9)-(line 579,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isJavaProperty(java.lang.String)",
      "begin_line": 585,
      "end_line": 591,
      "comment": "\n     * Check if the specified token is a Java-like property (-Dkey\u003dvalue).\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 43)",
        "(line 588,col 9)-(line 588,col 47)",
        "(line 590,col 9)-(line 590,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleOption(org.apache.commons.cli.Option)",
      "begin_line": 593,
      "end_line": 612,
      "comment": "",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 28)",
        "(line 598,col 9)-(line 598,col 41)",
        "(line 600,col 9)-(line 600,col 38)",
        "(line 602,col 9)-(line 602,col 30)",
        "(line 604,col 9)-(line 611,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.updateRequiredOptions(org.apache.commons.cli.Option)",
      "begin_line": 619,
      "end_line": 638,
      "comment": "\n     * Removes the option or its group from the list of expected elements.\n     * \n     * @param option\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 624,col 9)",
        "(line 627,col 9)-(line 637,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleConcatenatedOptions(java.lang.String)",
      "begin_line": 665,
      "end_line": 688,
      "comment": "\n     * Breaks \u003ccode\u003etoken\u003c/code\u003e into its constituent parts\n     * using the following algorithm.\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eignore the first character (\"\u003cb\u003e-\u003c/b\u003e\")\u003c/li\u003e\n     *  \u003cli\u003eforeach remaining character check if an {@link Option}\n     *  exists with that id.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does exist then add that character\n     *  prepended with \"\u003cb\u003e-\u003c/b\u003e\" to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif the {@link Option} can have an argument value and there\n     *  are remaining characters in the token then add the remaining\n     *  characters as a token to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS\u003c/b\u003e set then add the special token\n     *  \"\u003cb\u003e--\u003c/b\u003e\" followed by the remaining characters and also\n     *  the remaining tokens directly to the processed tokens list.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS NOT\u003c/b\u003e set then add that\n     *  character prepended with \"\u003cb\u003e-\u003c/b\u003e\".\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param token The current token to be \u003cb\u003eburst\u003c/b\u003e\n     * at the first non-Option encountered.\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 687,col 9)"
      ]
    }
  ]
}