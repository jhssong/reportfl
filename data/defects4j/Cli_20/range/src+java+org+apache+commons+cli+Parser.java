{
  "filepath": "/tmp/Cli-20b/src/java/org/apache/commons/cli/Parser.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Parser",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli.CommandLineParser"
      ],
      "begin_line": 34,
      "end_line": 419,
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
      "begin_line": 103,
      "end_line": 108,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], boolean)",
      "begin_line": 125,
      "end_line": 130,
      "comment": "\n     * \u003cp\u003eParses the specified \u003ccode\u003earguments\u003c/code\u003e \n     * based on the specifed {@link Options}.\u003c/p\u003e\n     *\n     * @param options the \u003ccode\u003eOptions\u003c/code\u003e\n     * @param arguments the \u003ccode\u003earguments\u003c/code\u003e\n     * @param stopAtNonOption specifies whether to stop \n     * interpreting the arguments when a non option has \n     * been encountered and to add them to the CommandLines\n     * args list.\n     *\n     * @return the \u003ccode\u003eCommandLine\u003c/code\u003e\n     * @throws ParseException if an error occurs when parsing the\n     * arguments.\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.parse(org.apache.commons.cli.Options, java.lang.String[], java.util.Properties, boolean)",
      "begin_line": 149,
      "end_line": 246,
      "comment": "\n     * Parse the arguments according to the specified options and\n     * properties.\n     *\n     * @param options the specified Options\n     * @param arguments the command line arguments\n     * @param properties command line option name-value pairs\n     * @param stopAtNonOption stop parsing the arguments when the first\n     * non option is encountered.\n     *\n     * @return the list of atomic option and value tokens\n     *\n     * @throws ParseException if there are any problems encountered\n     * while parsing the command line tokens.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 157,col 9)",
        "(line 160,col 9)-(line 160,col 28)",
        "(line 162,col 9)-(line 162,col 32)",
        "(line 164,col 9)-(line 164,col 35)",
        "(line 166,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 173,col 65)",
        "(line 175,col 9)-(line 175,col 57)",
        "(line 178,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 38)",
        "(line 243,col 9)-(line 243,col 31)",
        "(line 245,col 9)-(line 245,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processProperties(java.util.Properties)",
      "begin_line": 254,
      "end_line": 299,
      "comment": "\n     * \u003cp\u003eSets the values of Options using the values in \n     * \u003ccode\u003eproperties\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param properties The value properties to be processed.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 259,col 9)",
        "(line 261,col 9)-(line 298,col 9)"
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
      "end_line": 360,
      "comment": "\n     * \u003cp\u003eProcess the argument values for the specified Option\n     * \u003ccode\u003eopt\u003c/code\u003e using the values retrieved from the \n     * specified iterator \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param opt The current Option\n     * @param iter The iterator over the flattened command line\n     * Options.\n     *\n     * @throws ParseException if an argument value is required\n     * and it is has not been found.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Parser.processOption(java.lang.String, java.util.ListIterator)",
      "begin_line": 374,
      "end_line": 418,
      "comment": "\n     * \u003cp\u003eProcess the Option specified by \u003ccode\u003earg\u003c/code\u003e\n     * using the values retrieved from the specfied iterator\n     * \u003ccode\u003eiter\u003c/code\u003e.\n     *\n     * @param arg The String value representing an Option\n     * @param iter The iterator over the flattened command \n     * line arguments.\n     *\n     * @throws ParseException if \u003ccode\u003earg\u003c/code\u003e does not\n     * represent an Option\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 56)",
        "(line 380,col 9)-(line 383,col 9)",
        "(line 386,col 9)-(line 386,col 66)",
        "(line 390,col 9)-(line 393,col 9)",
        "(line 397,col 9)-(line 407,col 9)",
        "(line 410,col 9)-(line 413,col 9)",
        "(line 417,col 9)-(line 417,col 27)"
      ]
    }
  ]
}