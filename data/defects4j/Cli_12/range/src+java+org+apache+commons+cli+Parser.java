{
  "filepath": "/tmp/Cli-12b/src/java/org/apache/commons/cli/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 34,
      "end_line": 432,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eParser\u003c/code\u003e creates {@link CommandLine}s.\u003c/p\u003e\n *\n * @author John Keyes (john at integralsource.com)\n * @see Parser\n * @version $Revision$\n "
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
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.getRequiredOptions()",
      "begin_line": 54,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.flatten(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 70,
      "end_line": 71,
      "comment": "\n     * \u003cp\u003eSubclasses must implement this method to reduce\n     * the \u003ccode\u003earguments\u003c/code\u003e that have been passed to the parse \n     * method.\u003c/p\u003e\n     *\n     * @param opts The Options to parse the arguments by.\n     * @param arguments The arguments that have to be flattened.\n     * @param stopAtNonOption specifies whether to stop \n     * flattening when a non option has been encountered\n     * @return a String array of the flattened arguments\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 83,
      "end_line": 87,
      "comment": "\n     * \u003cp\u003eParses the specified \u003ccode\u003earguments\u003c/code\u003e \n     * based on the specifed {@link Options}.\u003c/p\u003e\n     *\n     * @param options the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments the \u003ccode\u003earguments\u003c/code\u003e\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if an error occurs when parsing the\n     * arguments.\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 123,
      "end_line": 128,
      "comment": "\n     * \u003cp\u003eParses the specified \u003ccode\u003earguments\u003c/code\u003e \n     * based on the specifed {@link Options}.\u003c/p\u003e\n     *\n     * @param options the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments the \u003ccode\u003earguments\u003c/code\u003e\n     * @param stopAtNonOption specifies whether to stop \n     * interpreting the arguments when a non option has \n     * been encountered and to add them to the CommandLines\n     * args list.\n     *\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if an error occurs when parsing the\n     * arguments.\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 145,
      "end_line": 242,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @param stopAtNonOption stop parsing the arguments when the first\n     * non option is encountered.\n     *\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 153,col 9)",
        "(line 156,col 9)-(line 156,col 28)",
        "(line 158,col 9)-(line 158,col 32)",
        "(line 160,col 9)-(line 160,col 35)",
        "(line 162,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 169,col 65)",
        "(line 171,col 9)-(line 171,col 57)",
        "(line 174,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 238,col 38)",
        "(line 239,col 9)-(line 239,col 31)",
        "(line 241,col 9)-(line 241,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processProperties(java.util.Properties)",
      "begin_line": 250,
      "end_line": 295,
      "comment": "\n     * \u003cp\u003eSets the values of Options using the values in \n     * \u003ccode\u003eproperties\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param properties The value properties to be processed.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.checkRequiredOptions()",
      "begin_line": 304,
      "end_line": 326,
      "comment": "\n     * \u003cp\u003eThrows a {@link MissingOptionException} if all of the\n     * required options are no present.\u003c/p\u003e\n     *\n     * @throws MissingOptionException if any of the required Options\n     * are not present.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processArgs(org.apache.commons.cli.Option, java.util.ListIterator)",
      "begin_line": 340,
      "end_line": 372,
      "comment": "\n     * \u003cp\u003eProcess the argument values for the specified Option\n     * \u003ccode\u003eopt\u003c/code\u003e using the values retrieved from the \n     * specified iterator \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param opt The current Option\n     * @param iter The iterator over the flattened command line\n     * Options.\n     *\n     * @throws ParseException if an argument value is required\n     * and it is has not been found.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 371,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processOption(java.lang.String, java.util.ListIterator)",
      "begin_line": 386,
      "end_line": 431,
      "comment": "\n     * \u003cp\u003eProcess the Option specified by \u003ccode\u003earg\u003c/code\u003e\n     * using the values retrieved from the specfied iterator\n     * \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param arg The String value representing an Option\n     * @param iter The iterator over the flattened command \n     * line arguments.\n     *\n     * @throws ParseException if \u003ccode\u003earg\u003c/code\u003e does not\n     * represent an Option\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 56)",
        "(line 392,col 9)-(line 396,col 9)",
        "(line 399,col 9)-(line 399,col 55)",
        "(line 403,col 9)-(line 406,col 9)",
        "(line 410,col 9)-(line 420,col 9)",
        "(line 423,col 9)-(line 426,col 9)",
        "(line 430,col 9)-(line 430,col 27)"
      ]
    }
  ]
}