{
  "filepath": "/tmp/Cli-28b/src/java/org/apache/commons/cli/DefaultParser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultParser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 31,
      "end_line": 596,
      "comment": "\n * Default parser.\n * \n * @author Emmanuel Bourg\n * @version $Revision$, $Date$\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "cmd"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "stopAtNonOption"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " \n     * Flag indicating how unrecognized tokens are handled. \u003ctt\u003etrue\u003c/tt\u003e to stop\n     * the parsing and add the remaining tokens to the args list.\n     * \u003ctt\u003efalse\u003c/tt\u003e to throw an exception. \n     "
    },
    {
      "type": "field",
      "varNames": [
        "currentToken"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The token currently processed. "
    },
    {
      "type": "field",
      "varNames": [
        "currentOption"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The last option parsed. "
    },
    {
      "type": "field",
      "varNames": [
        "skipParsing"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Flag indicating if tokens should no longer be analysed and simply added as arguments of the command line. "
    },
    {
      "type": "field",
      "varNames": [
        "expectedOpts"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " The required options expected to be found when parsing the command line. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 60,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 31)",
        "(line 63,col 9)-(line 63,col 47)",
        "(line 64,col 9)-(line 64,col 28)",
        "(line 65,col 9)-(line 65,col 29)",
        "(line 66,col 9)-(line 66,col 67)",
        "(line 69,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 75,col 32)",
        "(line 77,col 9)-(line 83,col 9)",
        "(line 86,col 9)-(line 86,col 28)",
        "(line 88,col 9)-(line 88,col 31)",
        "(line 90,col 9)-(line 90,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredOptions()",
      "begin_line": 100,
      "end_line": 107,
      "comment": "\n     * Throws a {@link MissingOptionException} if all of the required options\n     * are not present.\n     *\n     * @throws MissingOptionException if any of the required Options\n     * are not present.\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.checkRequiredArgs()",
      "begin_line": 113,
      "end_line": 119,
      "comment": "\n     * Throw a {@link MissingArgumentException} if the current option\n     * didn\u0027t receive the number of arguments expected.\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleToken(java.lang.String)",
      "begin_line": 127,
      "end_line": 160,
      "comment": "\n     * Handle any command line token.\n     * \n     * @param token the command line token to handle\n     * @throws ParseException\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 29)",
        "(line 131,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 159,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isArgument(java.lang.String)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * Returns true is the token is a valid argument.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isNegativeNumber(java.lang.String)",
      "begin_line": 177,
      "end_line": 188,
      "comment": "\n     * Check if the token is a negative number.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isOption(java.lang.String)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\n     * Tells if the token looks like an option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isShortOption(java.lang.String)",
      "begin_line": 205,
      "end_line": 209,
      "comment": "\n     * Tells if the token looks like a short option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 109)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isLongOption(java.lang.String)",
      "begin_line": 216,
      "end_line": 238,
      "comment": "\n     * Tells if the token looks like a long option.\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 37)",
        "(line 224,col 9)-(line 224,col 63)",
        "(line 226,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleUnknownToken(java.lang.String)",
      "begin_line": 249,
      "end_line": 261,
      "comment": "\n     * Handles an unknown token. If the token starts with a dash an \n     * UnrecognizedOptionException is thrown. Otherwise the token is added \n     * to the arguments of the command line. If the stopAtNonOption flag \n     * is set, this stops the parsing and the remaining tokens are added \n     * as-is in the arguments of the command line.\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 26)",
        "(line 257,col 9)-(line 260,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOption(java.lang.String)",
      "begin_line": 273,
      "end_line": 283,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\n     * --L\u003dV\n     * --L V\n     * --l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithoutEqual(java.lang.String)",
      "begin_line": 295,
      "end_line": 310,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\n     * -L\n     * --l\n     * -l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 62)",
        "(line 298,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleLongOptionWithEqual(java.lang.String)",
      "begin_line": 322,
      "end_line": 354,
      "comment": "\n     * Handles the following tokens:\n     * \n     * --L\u003dV\n     * -L\u003dV\n     * --l\u003dV\n     * -l\u003dV\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 37)",
        "(line 326,col 9)-(line 326,col 48)",
        "(line 328,col 9)-(line 328,col 45)",
        "(line 330,col 9)-(line 330,col 60)",
        "(line 331,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleShortAndLongOption(java.lang.String)",
      "begin_line": 375,
      "end_line": 463,
      "comment": "\n     * Handles the following tokens:\n     * \n     * -S\n     * -SV\n     * -S V\n     * -S\u003dV\n     * -S1S2\n     * -S1S2 V\n     * -SV1\u003dV2\n     * \n     * -L\n     * -LV\n     * -L V\n     * -L\u003dV\n     * -l\n     * \n     * @param token the command line token to handle\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 51)",
        "(line 379,col 9)-(line 379,col 33)",
        "(line 381,col 9)-(line 462,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.getLongPrefix(java.lang.String)",
      "begin_line": 470,
      "end_line": 487,
      "comment": "\n     * Search for a prefix that is the long name of an option (-Xmx512m)\n     * \n     * @param token\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 51)",
        "(line 474,col 9)-(line 474,col 14)",
        "(line 475,col 9)-(line 475,col 26)",
        "(line 476,col 9)-(line 484,col 9)",
        "(line 486,col 9)-(line 486,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.isJavaProperty(java.lang.String)",
      "begin_line": 492,
      "end_line": 498,
      "comment": "\n     * Check if the specified token is a Java-like property (-Dkey\u003dvalue).\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 43)",
        "(line 495,col 9)-(line 495,col 47)",
        "(line 497,col 9)-(line 497,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleOption(org.apache.commons.cli.Option)",
      "begin_line": 500,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 28)",
        "(line 505,col 9)-(line 505,col 41)",
        "(line 507,col 9)-(line 507,col 38)",
        "(line 509,col 9)-(line 509,col 30)",
        "(line 511,col 9)-(line 518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.updateRequiredOptions(org.apache.commons.cli.Option)",
      "begin_line": 526,
      "end_line": 545,
      "comment": "\n     * Removes the option or its group from the list of expected elements.\n     * \n     * @param option\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 531,col 9)",
        "(line 534,col 9)-(line 544,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.DefaultParser.handleConcatenatedOptions(java.lang.String)",
      "begin_line": 572,
      "end_line": 595,
      "comment": "\n     * Breaks \u003ccode\u003etoken\u003c/code\u003e into its constituent parts\n     * using the following algorithm.\n     *\n     * \u003cul\u003e\n     *  \u003cli\u003eignore the first character (\"\u003cb\u003e-\u003c/b\u003e\")\u003c/li\u003e\n     *  \u003cli\u003eforeach remaining character check if an {@link Option}\n     *  exists with that id.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does exist then add that character\n     *  prepended with \"\u003cb\u003e-\u003c/b\u003e\" to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif the {@link Option} can have an argument value and there\n     *  are remaining characters in the token then add the remaining\n     *  characters as a token to the list of processed tokens.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS\u003c/b\u003e set then add the special token\n     *  \"\u003cb\u003e--\u003c/b\u003e\" followed by the remaining characters and also\n     *  the remaining tokens directly to the processed tokens list.\u003c/li\u003e\n     *  \u003cli\u003eif an {@link Option} does \u003cb\u003eNOT\u003c/b\u003e exist \u003cb\u003eAND\u003c/b\u003e\n     *  \u003ccode\u003estopAtNonOption\u003c/code\u003e \u003cb\u003eIS NOT\u003c/b\u003e set then add that\n     *  character prepended with \"\u003cb\u003e-\u003c/b\u003e\".\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * @param token The current token to be \u003cb\u003eburst\u003c/b\u003e\n     * at the first non-Option encountered.\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 594,col 9)"
      ]
    }
  ]
}