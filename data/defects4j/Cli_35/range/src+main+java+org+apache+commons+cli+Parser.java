{
  "filepath": "/tmp/Cli-35b/src/main/java/org/apache/commons/cli/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 33,
      "end_line": 430,
      "comment": "\n * \u003ccode\u003eParser\u003c/code\u003e creates {@link CommandLine}s.\n *\n * @version $Id$\n * @deprecated since 1.3, the two-pass parsing with the flatten method is not enough flexible to handle complex cases\n "
    },
    {
      "type": "field",
      "varNames": [
        "cmd"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " commandline instance "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " current Options "
    },
    {
      "type": "field",
      "varNames": [
        "requiredOptions"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " list of required options strings "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.setOptions(org.apache.commons.cli.Options)",
      "begin_line": 45,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 31)",
        "(line 48,col 9)-(line 48,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.getOptions()",
      "begin_line": 51,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.getRequiredOptions()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.flatten(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 73,
      "end_line": 74,
      "comment": "\n     * Subclasses must implement this method to reduce\n     * the \u003ccode\u003earguments\u003c/code\u003e that have been passed to the parse method.\n     *\n     * @param opts The Options to parse the arguments by.\n     * @param arguments The arguments that have to be flattened.\n     * @param stopAtNonOption specifies whether to stop\n     * flattening when a non option has been encountered\n     * @return a String array of the flattened arguments\n     * @throws ParseException if there are any problems encountered\n     *                        while parsing the command line tokens.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Parses the specified \u003ccode\u003earguments\u003c/code\u003e based\n     * on the specified {@link Options}.\n     *\n     * @param options the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments the \u003ccode\u003earguments\u003c/code\u003e\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if there are any problems encountered\n     *                        while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * Parse the arguments according to the specified options and properties.\n     *\n     * @param options    the specified Options\n     * @param arguments  the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     *                        while parsing the command line tokens.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 121,
      "end_line": 124,
      "comment": "\n     * Parses the specified \u003ccode\u003earguments\u003c/code\u003e\n     * based on the specified {@link Options}.\n     *\n     * @param options         the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments       the \u003ccode\u003earguments\u003c/code\u003e\n     * @param stopAtNonOption if \u003ctt\u003etrue\u003c/tt\u003e an unrecognized argument stops\n     *     the parsing and the remaining arguments are added to the \n     *     {@link CommandLine}s args list. If \u003ctt\u003efalse\u003c/tt\u003e an unrecognized\n     *     argument triggers a ParseException.\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if an error occurs when parsing the arguments.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 145,
      "end_line": 245,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @param stopAtNonOption if \u003ctt\u003etrue\u003c/tt\u003e an unrecognized argument stops\n     *     the parsing and the remaining arguments are added to the \n     *     {@link CommandLine}s args list. If \u003ctt\u003efalse\u003c/tt\u003e an unrecognized\n     *     argument triggers a ParseException.\n     *\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 152,col 9)",
        "(line 155,col 9)-(line 158,col 9)",
        "(line 161,col 9)-(line 161,col 28)",
        "(line 163,col 9)-(line 163,col 32)",
        "(line 165,col 9)-(line 165,col 35)",
        "(line 167,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 98)",
        "(line 174,col 9)-(line 174,col 65)",
        "(line 177,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 38)",
        "(line 242,col 9)-(line 242,col 31)",
        "(line 244,col 9)-(line 244,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processProperties(java.util.Properties)",
      "begin_line": 254,
      "end_line": 307,
      "comment": "\n     * Sets the values of Options using the values in \u003ccode\u003eproperties\u003c/code\u003e.\n     *\n     * @param properties The value properties to be processed.\n     * @throws ParseException if there are any problems encountered\n     *                        while processing the properties.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 259,col 9)",
        "(line 261,col 9)-(line 306,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.checkRequiredOptions()",
      "begin_line": 315,
      "end_line": 322,
      "comment": "\n     * Throws a {@link MissingOptionException} if all of the required options\n     * are not present.\n     *\n     * @throws MissingOptionException if any of the required Options are not present.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processArgs(org.apache.commons.cli.Option, java.util.ListIterator\u003cjava.lang.String\u003e)",
      "begin_line": 335,
      "end_line": 365,
      "comment": "\n     * Process the argument values for the specified Option\n     * \u003ccode\u003eopt\u003c/code\u003e using the values retrieved from the\n     * specified iterator \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param opt The current Option\n     * @param iter The iterator over the flattened command line Options.\n     *\n     * @throws ParseException if an argument value is required\n     * and it is has not been found.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 359,col 9)",
        "(line 361,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processOption(java.lang.String, java.util.ListIterator\u003cjava.lang.String\u003e)",
      "begin_line": 376,
      "end_line": 400,
      "comment": "\n     * Process the Option specified by \u003ccode\u003earg\u003c/code\u003e using the values\n     * retrieved from the specified iterator \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param arg The String value representing an Option\n     * @param iter The iterator over the flattened command line arguments.\n     *\n     * @throws ParseException if \u003ccode\u003earg\u003c/code\u003e does not represent an Option\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 56)",
        "(line 381,col 9)-(line 384,col 9)",
        "(line 387,col 9)-(line 387,col 66)",
        "(line 390,col 9)-(line 390,col 35)",
        "(line 393,col 9)-(line 396,col 9)",
        "(line 399,col 9)-(line 399,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.updateRequiredOptions(org.apache.commons.cli.Option)",
      "begin_line": 407,
      "end_line": 429,
      "comment": "\n     * Removes the option or its group from the list of expected elements.\n     * \n     * @param opt\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 414,col 9)",
        "(line 418,col 9)-(line 428,col 9)"
      ]
    }
  ]
}