{
  "filepath": "/tmp/Cli-5b/src/java/org/apache/commons/cli/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 33,
      "end_line": 417,
      "comment": "\n * \u003cp\u003e\u003ccode\u003eParser\u003c/code\u003e creates {@link CommandLine}s.\u003c/p\u003e\n *\n * @author John Keyes (john at integralsource.com)\n * @see Parser\n * @version $Revision$\n "
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
      "signature": "org.apache.commons.cli.Parser.flatten(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 55,
      "end_line": 56,
      "comment": "\n     * \u003cp\u003eSubclasses must implement this method to reduce\n     * the \u003ccode\u003earguments\u003c/code\u003e that have been passed to the parse \n     * method.\u003c/p\u003e\n     *\n     * @param opts The Options to parse the arguments by.\n     * @param arguments The arguments that have to be flattened.\n     * @param stopAtNonOption specifies whether to stop \n     * flattening when a non option has been encountered\n     * @return a String array of the flattened arguments\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[])",
      "begin_line": 68,
      "end_line": 72,
      "comment": "\n     * \u003cp\u003eParses the specified \u003ccode\u003earguments\u003c/code\u003e \n     * based on the specifed {@link Options}.\u003c/p\u003e\n     *\n     * @param options the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments the \u003ccode\u003earguments\u003c/code\u003e\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if an error occurs when parsing the\n     * arguments.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties)",
      "begin_line": 86,
      "end_line": 91,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     * \u003cp\u003eParses the specified \u003ccode\u003earguments\u003c/code\u003e \n     * based on the specifed {@link Options}.\u003c/p\u003e\n     *\n     * @param options the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments the \u003ccode\u003earguments\u003c/code\u003e\n     * @param stopAtNonOption specifies whether to stop \n     * interpreting the arguments when a non option has \n     * been encountered and to add them to the CommandLines\n     * args list.\n     *\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if an error occurs when parsing the\n     * arguments.\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 130,
      "end_line": 228,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @param stopAtNonOption stop parsing the arguments when the first\n     * non option is encountered.\n     *\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 31)",
        "(line 138,col 9)-(line 141,col 9)",
        "(line 143,col 9)-(line 143,col 55)",
        "(line 144,col 9)-(line 144,col 32)",
        "(line 146,col 9)-(line 146,col 35)",
        "(line 148,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 155,col 65)",
        "(line 157,col 9)-(line 157,col 57)",
        "(line 160,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 38)",
        "(line 225,col 9)-(line 225,col 31)",
        "(line 227,col 9)-(line 227,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processProperties(java.util.Properties)",
      "begin_line": 236,
      "end_line": 281,
      "comment": "\n     * \u003cp\u003eSets the values of Options using the values in \n     * \u003ccode\u003eproperties\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param properties The value properties to be processed.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.checkRequiredOptions()",
      "begin_line": 290,
      "end_line": 311,
      "comment": "\n     * \u003cp\u003eThrows a {@link MissingOptionException} if all of the\n     * required options are no present.\u003c/p\u003e\n     *\n     * @throws MissingOptionException if any of the required Options\n     * are not present.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 310,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processArgs(org.apache.commons.cli.Option, java.util.ListIterator)",
      "begin_line": 325,
      "end_line": 357,
      "comment": "\n     * \u003cp\u003eProcess the argument values for the specified Option\n     * \u003ccode\u003eopt\u003c/code\u003e using the values retrieved from the \n     * specified iterator \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param opt The current Option\n     * @param iter The iterator over the flattened command line\n     * Options.\n     *\n     * @throws ParseException if an argument value is required\n     * and it is has not been found.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 350,col 9)",
        "(line 352,col 9)-(line 356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processOption(java.lang.String, java.util.ListIterator)",
      "begin_line": 371,
      "end_line": 416,
      "comment": "\n     * \u003cp\u003eProcess the Option specified by \u003ccode\u003earg\u003c/code\u003e\n     * using the values retrieved from the specfied iterator\n     * \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param arg The String value representing an Option\n     * @param iter The iterator over the flattened command \n     * line arguments.\n     *\n     * @throws ParseException if \u003ccode\u003earg\u003c/code\u003e does not\n     * represent an Option\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 51)",
        "(line 377,col 9)-(line 381,col 9)",
        "(line 384,col 9)-(line 384,col 50)",
        "(line 388,col 9)-(line 391,col 9)",
        "(line 395,col 9)-(line 405,col 9)",
        "(line 408,col 9)-(line 411,col 9)",
        "(line 415,col 9)-(line 415,col 27)"
      ]
    }
  ]
}