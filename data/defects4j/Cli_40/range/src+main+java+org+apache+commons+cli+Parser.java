{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 32,
      "end_line": 429,
      "comment": "\n * \u003ccode\u003eParser\u003c/code\u003e creates {@link CommandLine}s.\n *\n * @deprecated since 1.3, the two-pass parsing with the flatten method is not enough flexible to handle complex cases\n "
    },
    {
      "type": "field",
      "varNames": [
        "cmd"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " commandline instance "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " current Options "
    },
    {
      "type": "field",
      "varNames": [
        "requiredOptions"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " list of required options strings "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.setOptions(org.apache.commons.cli.Options)",
      "begin_line": 44,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 31)",
        "(line 47,col 9)-(line 47,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.getOptions()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.getRequiredOptions()",
      "begin_line": 55,
      "end_line": 58,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.flatten(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 72,
      "end_line": 73,
      "comment": "\n     * Subclasses must implement this method to reduce\n     * the \u003ccode\u003earguments\u003c/code\u003e that have been passed to the parse method.\n     *\n     * @param opts The Options to parse the arguments by.\n     * @param arguments The arguments that have to be flattened.\n     * @param stopAtNonOption specifies whether to stop\n     * flattening when a non option has been encountered\n     * @return a String array of the flattened arguments\n     * @throws ParseException if there are any problems encountered\n     *                        while parsing the command line tokens.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * Parses the specified \u003ccode\u003earguments\u003c/code\u003e based\n     * on the specified {@link Options}.\n     *\n     * @param options the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments the \u003ccode\u003earguments\u003c/code\u003e\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if there are any problems encountered\n     *                        while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * Parse the arguments according to the specified options and properties.\n     *\n     * @param options    the specified Options\n     * @param arguments  the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     *                        while parsing the command line tokens.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * Parses the specified \u003ccode\u003earguments\u003c/code\u003e\n     * based on the specified {@link Options}.\n     *\n     * @param options         the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments       the \u003ccode\u003earguments\u003c/code\u003e\n     * @param stopAtNonOption if \u003ctt\u003etrue\u003c/tt\u003e an unrecognized argument stops\n     *     the parsing and the remaining arguments are added to the \n     *     {@link CommandLine}s args list. If \u003ctt\u003efalse\u003c/tt\u003e an unrecognized\n     *     argument triggers a ParseException.\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if an error occurs when parsing the arguments.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 144,
      "end_line": 244,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @param stopAtNonOption if \u003ctt\u003etrue\u003c/tt\u003e an unrecognized argument stops\n     *     the parsing and the remaining arguments are added to the \n     *     {@link CommandLine}s args list. If \u003ctt\u003efalse\u003c/tt\u003e an unrecognized\n     *     argument triggers a ParseException.\n     *\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 151,col 9)",
        "(line 154,col 9)-(line 157,col 9)",
        "(line 160,col 9)-(line 160,col 28)",
        "(line 162,col 9)-(line 162,col 32)",
        "(line 164,col 9)-(line 164,col 35)",
        "(line 166,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 104)",
        "(line 173,col 9)-(line 173,col 71)",
        "(line 176,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 38)",
        "(line 241,col 9)-(line 241,col 31)",
        "(line 243,col 9)-(line 243,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processProperties(java.util.Properties)",
      "begin_line": 253,
      "end_line": 306,
      "comment": "\n     * Sets the values of Options using the values in \u003ccode\u003eproperties\u003c/code\u003e.\n     *\n     * @param properties The value properties to be processed.\n     * @throws ParseException if there are any problems encountered\n     *                        while processing the properties.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 305,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.checkRequiredOptions()",
      "begin_line": 314,
      "end_line": 321,
      "comment": "\n     * Throws a {@link MissingOptionException} if all of the required options\n     * are not present.\n     *\n     * @throws MissingOptionException if any of the required Options are not present.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processArgs(org.apache.commons.cli.Option, java.util.ListIterator\u003cjava.lang.String\u003e)",
      "begin_line": 334,
      "end_line": 364,
      "comment": "\n     * Process the argument values for the specified Option\n     * \u003ccode\u003eopt\u003c/code\u003e using the values retrieved from the\n     * specified iterator \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param opt The current Option\n     * @param iter The iterator over the flattened command line Options.\n     *\n     * @throws ParseException if an argument value is required\n     * and it is has not been found.\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 358,col 9)",
        "(line 360,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processOption(java.lang.String, java.util.ListIterator\u003cjava.lang.String\u003e)",
      "begin_line": 375,
      "end_line": 399,
      "comment": "\n     * Process the Option specified by \u003ccode\u003earg\u003c/code\u003e using the values\n     * retrieved from the specified iterator \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param arg The String value representing an Option\n     * @param iter The iterator over the flattened command line arguments.\n     *\n     * @throws ParseException if \u003ccode\u003earg\u003c/code\u003e does not represent an Option\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 62)",
        "(line 380,col 9)-(line 383,col 9)",
        "(line 386,col 9)-(line 386,col 72)",
        "(line 389,col 9)-(line 389,col 35)",
        "(line 392,col 9)-(line 395,col 9)",
        "(line 398,col 9)-(line 398,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.updateRequiredOptions(org.apache.commons.cli.Option)",
      "begin_line": 406,
      "end_line": 428,
      "comment": "\n     * Removes the option or its group from the list of expected elements.\n     * \n     * @param opt\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 413,col 9)",
        "(line 417,col 9)-(line 427,col 9)"
      ]
    }
  ]
}