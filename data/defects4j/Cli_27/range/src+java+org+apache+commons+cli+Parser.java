{
  "filepath": "/tmp/Cli-27b/src/java/org/apache/commons/cli/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 34,
      "end_line": 406,
      "comment": "\n * \u003ccode\u003eParser\u003c/code\u003e creates {@link CommandLine}s.\n *\n * @author John Keyes (john at integralsource.com)\n * @version $Revision$, $Date$\n "
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
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Subclasses must implement this method to reduce\n     * the \u003ccode\u003earguments\u003c/code\u003e that have been passed to the parse method.\n     *\n     * @param opts The Options to parse the arguments by.\n     * @param arguments The arguments that have to be flattened.\n     * @param stopAtNonOption specifies whether to stop\n     * flattening when a non option has been encountered\n     * @return a String array of the flattened arguments\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * Parses the specified \u003ccode\u003earguments\u003c/code\u003e based\n     * on the specifed {@link Options}.\n     *\n     * @param options the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments the \u003ccode\u003earguments\u003c/code\u003e\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if an error occurs when parsing the\n     * arguments.\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * Parse the arguments according to the specified options and properties.\n     *\n     * @param options    the specified Options\n     * @param arguments  the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     * @throws ParseException if there are any problems encountered\n     *                        while parsing the command line tokens.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * Parses the specified \u003ccode\u003earguments\u003c/code\u003e\n     * based on the specifed {@link Options}.\n     *\n     * @param options         the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments       the \u003ccode\u003earguments\u003c/code\u003e\n     * @param stopAtNonOption specifies whether to stop interpreting the\n     *                        arguments when a non option has been encountered\n     *                        and to add them to the CommandLines args list.\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if an error occurs when parsing the arguments.\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 139,
      "end_line": 241,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @param stopAtNonOption stop parsing the arguments when the first\n     * non option is encountered.\n     *\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 147,col 9)",
        "(line 150,col 9)-(line 154,col 9)",
        "(line 157,col 9)-(line 157,col 28)",
        "(line 159,col 9)-(line 159,col 32)",
        "(line 161,col 9)-(line 161,col 35)",
        "(line 163,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 90)",
        "(line 170,col 9)-(line 170,col 57)",
        "(line 173,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 38)",
        "(line 238,col 9)-(line 238,col 31)",
        "(line 240,col 9)-(line 240,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processProperties(java.util.Properties)",
      "begin_line": 248,
      "end_line": 292,
      "comment": "\n     * Sets the values of Options using the values in \u003ccode\u003eproperties\u003c/code\u003e.\n     *\n     * @param properties The value properties to be processed.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.checkRequiredOptions()",
      "begin_line": 301,
      "end_line": 308,
      "comment": "\n     * Throws a {@link MissingOptionException} if all of the required options\n     * are not present.\n     *\n     * @throws MissingOptionException if any of the required Options\n     * are not present.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processArgs(org.apache.commons.cli.Option, java.util.ListIterator)",
      "begin_line": 322,
      "end_line": 352,
      "comment": "\n     * \u003cp\u003eProcess the argument values for the specified Option\n     * \u003ccode\u003eopt\u003c/code\u003e using the values retrieved from the\n     * specified iterator \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param opt The current Option\n     * @param iter The iterator over the flattened command line\n     * Options.\n     *\n     * @throws ParseException if an argument value is required\n     * and it is has not been found.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processOption(java.lang.String, java.util.ListIterator)",
      "begin_line": 363,
      "end_line": 405,
      "comment": "\n     * Process the Option specified by \u003ccode\u003earg\u003c/code\u003e using the values\n     * retrieved from the specfied iterator \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param arg The String value representing an Option\n     * @param iter The iterator over the flattened command line arguments.\n     *\n     * @throws ParseException if \u003ccode\u003earg\u003c/code\u003e does not represent an Option\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 56)",
        "(line 368,col 9)-(line 371,col 9)",
        "(line 374,col 9)-(line 374,col 66)",
        "(line 378,col 9)-(line 381,col 9)",
        "(line 385,col 9)-(line 395,col 9)",
        "(line 398,col 9)-(line 401,col 9)",
        "(line 404,col 9)-(line 404,col 27)"
      ]
    }
  ]
}