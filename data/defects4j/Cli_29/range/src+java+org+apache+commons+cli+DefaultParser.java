{
  "filepath": "/tmp/Cli-29b/src/java/org/apache/commons/cli/DefaultParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 33,
      "end_line": 680,
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
      "end_line": 175,
      "comment": "\n     * Sets the values of Options using the values in \u003ccode\u003eproperties\u003c/code\u003e.\n     *\n     * @param properties The value properties to be processed.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 174,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredOptions()",
      "begin_line": 184,
      "end_line": 191,
      "comment": "\n     * Throws a {@link MissingOptionException} if all of the required options\n     * are not present.\n     *\n     * @throws MissingOptionException if any of the required Options\n     * are not present.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 190,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredArgs()",
      "begin_line": 197,
      "end_line": 203,
      "comment": "\n     * Throw a {@link MissingArgumentException} if the current option\n     * didn\u0027t receive the number of arguments expected.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleToken(java.lang.String)",
      "begin_line": 211,
      "end_line": 244,
      "comment": "\n     * Handle any command line token.\n     * \n     * @param token the command line token to handle\n     * @throws ParseException\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 29)",
        "(line 215,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isArgument(java.lang.String)",
      "begin_line": 251,
      "end_line": 254,
      "comment": "\n     * Returns true is the token is a valid argument.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isNegativeNumber(java.lang.String)",
      "begin_line": 261,
      "end_line": 272,
      "comment": "\n     * Check if the token is a negative number.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isOption(java.lang.String)",
      "begin_line": 279,
      "end_line": 282,
      "comment": "\n     * Tells if the token looks like an option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isShortOption(java.lang.String)",
      "begin_line": 289,
      "end_line": 293,
      "comment": "\n     * Tells if the token looks like a short option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isLongOption(java.lang.String)",
      "begin_line": 300,
      "end_line": 322,
      "comment": "\n     * Tells if the token looks like a long option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 37)",
        "(line 308,col 9)-(line 308,col 63)",
        "(line 310,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleUnknownToken(java.lang.String)",
      "begin_line": 333,
      "end_line": 345,
      "comment": "\n     * Handles an unknown token. If the token starts with a dash an \n     * UnrecognizedOptionException is thrown. Otherwise the token is added \n     * to the arguments of the command line. If the stopAtNonOption flag \n     * is set, this stops the parsing and the remaining tokens are added \n     * as-is in the arguments of the command line.\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 340,col 26)",
        "(line 341,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOption(java.lang.String)",
      "begin_line": 357,
      "end_line": 367,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\n     * --L\u003dV\n     * --L V\n     * --l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual(java.lang.String)",
      "begin_line": 379,
      "end_line": 394,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\n     * -L\n     * --l\n     * -l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 62)",
        "(line 382,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual(java.lang.String)",
      "begin_line": 406,
      "end_line": 438,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\u003dV\n     * -L\u003dV\n     * --l\u003dV\n     * -l\u003dV\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 37)",
        "(line 410,col 9)-(line 410,col 48)",
        "(line 412,col 9)-(line 412,col 45)",
        "(line 414,col 9)-(line 414,col 60)",
        "(line 415,col 9)-(line 437,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleShortAndLongOption(java.lang.String)",
      "begin_line": 459,
      "end_line": 547,
      "comment": "\n     * Handles the following tokens:\n     * \n     * -S\n     * -SV\n     * -S V\n     * -S\u003dV\n     * -S1S2\n     * -S1S2 V\n     * -SV1\u003dV2\n     * \n     * -L\n     * -LV\n     * -L V\n     * -L\u003dV\n     * -l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 51)",
        "(line 463,col 9)-(line 463,col 33)",
        "(line 465,col 9)-(line 546,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.getLongPrefix(java.lang.String)",
      "begin_line": 554,
      "end_line": 571,
      "comment": "\n     * Search for a prefix that is the long name of an option (-Xmx512m)\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 51)",
        "(line 558,col 9)-(line 558,col 14)",
        "(line 559,col 9)-(line 559,col 26)",
        "(line 560,col 9)-(line 568,col 9)",
        "(line 570,col 9)-(line 570,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isJavaProperty(java.lang.String)",
      "begin_line": 576,
      "end_line": 582,
      "comment": "\n     * Check if the specified token is a Java-like property (-Dkey\u003dvalue).\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 43)",
        "(line 579,col 9)-(line 579,col 47)",
        "(line 581,col 9)-(line 581,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleOption(org.apache.commons.cli.Option)",
      "begin_line": 584,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 28)",
        "(line 589,col 9)-(line 589,col 41)",
        "(line 591,col 9)-(line 591,col 38)",
        "(line 593,col 9)-(line 593,col 30)",
        "(line 595,col 9)-(line 602,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.updateRequiredOptions(org.apache.commons.cli.Option)",
      "begin_line": 610,
      "end_line": 629,
      "comment": "\n     * Removes the option or its group from the list of expected elements.\n     * \n     * @param option\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 615,col 9)",
        "(line 618,col 9)-(line 628,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleConcatenatedOptions(java.lang.String)",
      "begin_line": 656,
      "end_line": 679,
      "comment": "\n     * Breaks \u003ccode\u003etoken\u003c/code\u003e into its constituent parts\n     * using the following algorithm.\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eignore the first character (\"\u003cb\u003e-\u003c/b\u003e\")\u003c/li\u003e\n     *  \u003cli\u003eforeach remaining character check if an {@link Option}\n     *  exists with that id.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does exist then add that character\n     *  prepended with \"\u003cb\u003e-\u003c/b\u003e\" to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif the {@link Option} can have an argument value and there\n     *  are remaining characters in the token then add the remaining\n     *  characters as a token to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS\u003c/b\u003e set then add the special token\n     *  \"\u003cb\u003e--\u003c/b\u003e\" followed by the remaining characters and also\n     *  the remaining tokens directly to the processed tokens list.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS NOT\u003c/b\u003e set then add that\n     *  character prepended with \"\u003cb\u003e-\u003c/b\u003e\".\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param token The current token to be \u003cb\u003eburst\u003c/b\u003e\n     * at the first non-Option encountered.\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 678,col 9)"
      ]
    }
  ]
}