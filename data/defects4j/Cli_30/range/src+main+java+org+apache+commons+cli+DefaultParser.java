{
  "filepath": "/tmp/Cli-30b/src/main/java/org/apache/commons/cli/DefaultParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 33,
      "end_line": 683,
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
      "end_line": 178,
      "comment": "\n     * Sets the values of Options using the values in \u003ccode\u003eproperties\u003c/code\u003e.\n     *\n     * @param properties The value properties to be processed.\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredOptions()",
      "begin_line": 187,
      "end_line": 194,
      "comment": "\n     * Throws a {@link MissingOptionException} if all of the required options\n     * are not present.\n     *\n     * @throws MissingOptionException if any of the required Options\n     * are not present.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 193,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredArgs()",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\n     * Throw a {@link MissingArgumentException} if the current option\n     * didn\u0027t receive the number of arguments expected.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleToken(java.lang.String)",
      "begin_line": 214,
      "end_line": 247,
      "comment": "\n     * Handle any command line token.\n     * \n     * @param token the command line token to handle\n     * @throws ParseException\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 29)",
        "(line 218,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 246,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isArgument(java.lang.String)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * Returns true is the token is a valid argument.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isNegativeNumber(java.lang.String)",
      "begin_line": 264,
      "end_line": 275,
      "comment": "\n     * Check if the token is a negative number.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isOption(java.lang.String)",
      "begin_line": 282,
      "end_line": 285,
      "comment": "\n     * Tells if the token looks like an option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isShortOption(java.lang.String)",
      "begin_line": 292,
      "end_line": 296,
      "comment": "\n     * Tells if the token looks like a short option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isLongOption(java.lang.String)",
      "begin_line": 303,
      "end_line": 325,
      "comment": "\n     * Tells if the token looks like a long option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 310,col 37)",
        "(line 311,col 9)-(line 311,col 63)",
        "(line 313,col 9)-(line 322,col 9)",
        "(line 324,col 9)-(line 324,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleUnknownToken(java.lang.String)",
      "begin_line": 336,
      "end_line": 348,
      "comment": "\n     * Handles an unknown token. If the token starts with a dash an \n     * UnrecognizedOptionException is thrown. Otherwise the token is added \n     * to the arguments of the command line. If the stopAtNonOption flag \n     * is set, this stops the parsing and the remaining tokens are added \n     * as-is in the arguments of the command line.\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 341,col 9)",
        "(line 343,col 9)-(line 343,col 26)",
        "(line 344,col 9)-(line 347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOption(java.lang.String)",
      "begin_line": 360,
      "end_line": 370,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\n     * --L\u003dV\n     * --L V\n     * --l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual(java.lang.String)",
      "begin_line": 382,
      "end_line": 397,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\n     * -L\n     * --l\n     * -l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 62)",
        "(line 385,col 9)-(line 396,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual(java.lang.String)",
      "begin_line": 409,
      "end_line": 441,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\u003dV\n     * -L\u003dV\n     * --l\u003dV\n     * -l\u003dV\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 37)",
        "(line 413,col 9)-(line 413,col 48)",
        "(line 415,col 9)-(line 415,col 45)",
        "(line 417,col 9)-(line 417,col 60)",
        "(line 418,col 9)-(line 440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleShortAndLongOption(java.lang.String)",
      "begin_line": 462,
      "end_line": 550,
      "comment": "\n     * Handles the following tokens:\n     * \n     * -S\n     * -SV\n     * -S V\n     * -S\u003dV\n     * -S1S2\n     * -S1S2 V\n     * -SV1\u003dV2\n     * \n     * -L\n     * -LV\n     * -L V\n     * -L\u003dV\n     * -l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 51)",
        "(line 466,col 9)-(line 466,col 33)",
        "(line 468,col 9)-(line 549,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.getLongPrefix(java.lang.String)",
      "begin_line": 557,
      "end_line": 574,
      "comment": "\n     * Search for a prefix that is the long name of an option (-Xmx512m)\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 51)",
        "(line 561,col 9)-(line 561,col 14)",
        "(line 562,col 9)-(line 562,col 26)",
        "(line 563,col 9)-(line 571,col 9)",
        "(line 573,col 9)-(line 573,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isJavaProperty(java.lang.String)",
      "begin_line": 579,
      "end_line": 585,
      "comment": "\n     * Check if the specified token is a Java-like property (-Dkey\u003dvalue).\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 43)",
        "(line 582,col 9)-(line 582,col 47)",
        "(line 584,col 9)-(line 584,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleOption(org.apache.commons.cli.Option)",
      "begin_line": 587,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 28)",
        "(line 592,col 9)-(line 592,col 41)",
        "(line 594,col 9)-(line 594,col 38)",
        "(line 596,col 9)-(line 596,col 30)",
        "(line 598,col 9)-(line 605,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.updateRequiredOptions(org.apache.commons.cli.Option)",
      "begin_line": 613,
      "end_line": 632,
      "comment": "\n     * Removes the option or its group from the list of expected elements.\n     * \n     * @param option\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 618,col 9)",
        "(line 621,col 9)-(line 631,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleConcatenatedOptions(java.lang.String)",
      "begin_line": 659,
      "end_line": 682,
      "comment": "\n     * Breaks \u003ccode\u003etoken\u003c/code\u003e into its constituent parts\n     * using the following algorithm.\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eignore the first character (\"\u003cb\u003e-\u003c/b\u003e\")\u003c/li\u003e\n     *  \u003cli\u003eforeach remaining character check if an {@link Option}\n     *  exists with that id.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does exist then add that character\n     *  prepended with \"\u003cb\u003e-\u003c/b\u003e\" to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif the {@link Option} can have an argument value and there\n     *  are remaining characters in the token then add the remaining\n     *  characters as a token to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS\u003c/b\u003e set then add the special token\n     *  \"\u003cb\u003e--\u003c/b\u003e\" followed by the remaining characters and also\n     *  the remaining tokens directly to the processed tokens list.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS NOT\u003c/b\u003e set then add that\n     *  character prepended with \"\u003cb\u003e-\u003c/b\u003e\".\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param token The current token to be \u003cb\u003eburst\u003c/b\u003e\n     * at the first non-Option encountered.\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 681,col 9)"
      ]
    }
  ]
}