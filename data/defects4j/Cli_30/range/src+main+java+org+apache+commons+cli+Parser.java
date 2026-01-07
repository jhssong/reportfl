{
  "filepath": "/tmp/Cli-30b/src/main/java/org/apache/commons/cli/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 35,
      "end_line": 424,
      "comment": "\n * \u003ccode\u003eParser\u003c/code\u003e creates {@link CommandLine}s.\n *\n * @author John Keyes (john at integralsource.com)\n * @version $Revision$, $Date$\n * @deprecated The two-pass parsing with the flatten method is not enough flexible to handle complex cases\n "
    },
    {
      "type": "field",
      "varNames": [
        "cmd"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " commandline instance "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " current Options "
    },
    {
      "type": "field",
      "varNames": [
        "requiredOptions"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " list of required options strings "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.setOptions(org.apache.commons.cli.Options)",
      "begin_line": 46,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 31)",
        "(line 49,col 9)-(line 49,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.getOptions()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.getRequiredOptions()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.flatten(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Subclasses must implement this method to reduce\n     * the \u003ccode\u003earguments\u003c/code\u003e that have been passed to the parse method.\n     *\n     * @param opts The Options to parse the arguments by.\n     * @param arguments The arguments that have to be flattened.\n     * @param stopAtNonOption specifies whether to stop\n     * flattening when a non option has been encountered\n     * @return a String array of the flattened arguments\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Parses the specified \u003ccode\u003earguments\u003c/code\u003e based\n     * on the specifed {@link Options}.\n     *\n     * @param options the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments the \u003ccode\u003earguments\u003c/code\u003e\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if an error occurs when parsing the\n     * arguments.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * Parse the arguments according to the specified options and properties.\n     *\n     * @param options    the specified Options\n     * @param arguments  the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     *                        while parsing the command line tokens.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n     * Parses the specified \u003ccode\u003earguments\u003c/code\u003e\n     * based on the specifed {@link Options}.\n     *\n     * @param options         the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments       the \u003ccode\u003earguments\u003c/code\u003e\n     * @param stopAtNonOption if \u003ctt\u003etrue\u003c/tt\u003e an unrecognized argument stops\n     *     the parsing and the remaining arguments are added to the \n     *     {@link CommandLine}s args list. If \u003ctt\u003efalse\u003c/tt\u003e an unrecognized\n     *     argument triggers a ParseException.\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if an error occurs when parsing the arguments.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 143,
      "end_line": 245,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @param stopAtNonOption if \u003ctt\u003etrue\u003c/tt\u003e an unrecognized argument stops\n     *     the parsing and the remaining arguments are added to the \n     *     {@link CommandLine}s args list. If \u003ctt\u003efalse\u003c/tt\u003e an unrecognized\n     *     argument triggers a ParseException.\n     *\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 151,col 9)",
        "(line 154,col 9)-(line 158,col 9)",
        "(line 161,col 9)-(line 161,col 28)",
        "(line 163,col 9)-(line 163,col 32)",
        "(line 165,col 9)-(line 165,col 35)",
        "(line 167,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 90)",
        "(line 174,col 9)-(line 174,col 57)",
        "(line 177,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 242,col 31)",
        "(line 244,col 9)-(line 244,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processProperties(java.util.Properties)",
      "begin_line": 252,
      "end_line": 299,
      "comment": "\n     * Sets the values of Options using the values in \u003ccode\u003eproperties\u003c/code\u003e.\n     *\n     * @param properties The value properties to be processed.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.checkRequiredOptions()",
      "begin_line": 308,
      "end_line": 315,
      "comment": "\n     * Throws a {@link MissingOptionException} if all of the required options\n     * are not present.\n     *\n     * @throws MissingOptionException if any of the required Options\n     * are not present.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 314,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processArgs(org.apache.commons.cli.Option, java.util.ListIterator)",
      "begin_line": 329,
      "end_line": 359,
      "comment": "\n     * \u003cp\u003eProcess the argument values for the specified Option\n     * \u003ccode\u003eopt\u003c/code\u003e using the values retrieved from the\n     * specified iterator \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param opt The current Option\n     * @param iter The iterator over the flattened command line\n     * Options.\n     *\n     * @throws ParseException if an argument value is required\n     * and it is has not been found.\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processOption(java.lang.String, java.util.ListIterator)",
      "begin_line": 370,
      "end_line": 394,
      "comment": "\n     * Process the Option specified by \u003ccode\u003earg\u003c/code\u003e using the values\n     * retrieved from the specfied iterator \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param arg The String value representing an Option\n     * @param iter The iterator over the flattened command line arguments.\n     *\n     * @throws ParseException if \u003ccode\u003earg\u003c/code\u003e does not represent an Option\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 56)",
        "(line 375,col 9)-(line 378,col 9)",
        "(line 381,col 9)-(line 381,col 66)",
        "(line 384,col 9)-(line 384,col 35)",
        "(line 387,col 9)-(line 390,col 9)",
        "(line 393,col 9)-(line 393,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.updateRequiredOptions(org.apache.commons.cli.Option)",
      "begin_line": 401,
      "end_line": 423,
      "comment": "\n     * Removes the option or its group from the list of expected elements.\n     * \n     * @param opt\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 408,col 9)",
        "(line 412,col 9)-(line 422,col 9)"
      ]
    }
  ]
}