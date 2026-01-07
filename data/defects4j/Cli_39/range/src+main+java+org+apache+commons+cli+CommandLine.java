{
  "filepath": "/tmp/Cli-39b/src/main/java/org/apache/commons/cli/CommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 548,
      "comment": "\n * Represents list of arguments parsed against a {@link Options} descriptor.\n * \u003cp\u003e\n * It allows querying of a boolean {@link #hasOption(String opt)},\n * in addition to retrieving the {@link #getOptionValue(String opt)}\n * for options requiring arguments.\n * \u003cp\u003e\n * Additionally, any left-over or unrecognized arguments,\n * are available for further processing.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The serial version UID. "
    },
    {
      "type": "field",
      "varNames": [
        "args"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " the unrecognized options/arguments "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " the processed options "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.CommandLine.CommandLine()",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Creates a command line.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(org.apache.commons.cli.Option)",
      "begin_line": 66,
      "end_line": 69,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt the option to check\n     * @return true if set, false if not\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(java.lang.String)",
      "begin_line": 77,
      "end_line": 80,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt Short name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(char)",
      "begin_line": 88,
      "end_line": 91,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt character name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(java.lang.String)",
      "begin_line": 100,
      "end_line": 112,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of this \u003ccode\u003eOption\u003c/code\u003e\n     * @deprecated due to System.err message. Instead use getParsedOptionValue(String)\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getParsedOptionValue(org.apache.commons.cli.Option)",
      "begin_line": 123,
      "end_line": 135,
      "comment": "\n     * Return a version of this \u003ccode\u003eOption\u003c/code\u003e converted to a particular type. \n     *\n     * @param option the name of the option\n     * @return the value parsed into a particular object\n     * @throws ParseException if there are problems turning the option value into the desired type\n     * @see PatternOptionBuilder\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 50)",
        "(line 130,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getParsedOptionValue(java.lang.String)",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * Return a version of this \u003ccode\u003eOption\u003c/code\u003e converted to a particular type. \n     *\n     * @param opt the name of the option\n     * @return the value parsed into a particular object\n     * @throws ParseException if there are problems turning the option value into the desired type\n     * @see PatternOptionBuilder\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getParsedOptionValue(char)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * Return a version of this \u003ccode\u003eOption\u003c/code\u003e converted to a particular type. \n     *\n     * @param opt the name of the option\n     * @return the value parsed into a particular object\n     * @throws ParseException if there are problems turning the option value into the desired type\n     * @see PatternOptionBuilder\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(char)",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @deprecated due to System.err message. Instead use getParsedOptionValue(char)\n     * @param opt the name of the option\n     * @return the type of opt\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(org.apache.commons.cli.Option)",
      "begin_line": 185,
      "end_line": 193,
      "comment": " \n     * Retrieve the first argument, if any, of this option.\n     *\n     * @param option the name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 56)",
        "(line 192,col 9)-(line 192,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String)",
      "begin_line": 202,
      "end_line": 205,
      "comment": " \n     * Retrieve the first argument, if any, of this option.\n     *\n     * @param opt the name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char)",
      "begin_line": 214,
      "end_line": 217,
      "comment": " \n     * Retrieve the first argument, if any, of this option.\n     *\n     * @param opt the character name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(org.apache.commons.cli.Option)",
      "begin_line": 227,
      "end_line": 240,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param option string name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 60)",
        "(line 231,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(java.lang.String)",
      "begin_line": 249,
      "end_line": 252,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt string name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.resolveOption(java.lang.String)",
      "begin_line": 260,
      "end_line": 277,
      "comment": "\n     * Retrieves the option object given the long or short option as a String\n     * \n     * @param opt short or long name of the option\n     * @return Canonicalized option\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 44)",
        "(line 263,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(char)",
      "begin_line": 286,
      "end_line": 289,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(org.apache.commons.cli.Option, java.lang.String)",
      "begin_line": 301,
      "end_line": 305,
      "comment": " \n     * Retrieve the first argument, if any, of an option.\n     *\n     * @param option name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 53)",
        "(line 304,col 9)-(line 304,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String, java.lang.String)",
      "begin_line": 316,
      "end_line": 319,
      "comment": " \n     * Retrieve the first argument, if any, of an option.\n     *\n     * @param opt name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char, java.lang.String)",
      "begin_line": 330,
      "end_line": 333,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionProperties(org.apache.commons.cli.Option)",
      "begin_line": 348,
      "end_line": 371,
      "comment": "\n     * Retrieve the map of values associated to the option. This is convenient\n     * for options specifying Java properties like \u003ctt\u003e-Dparam1\u003dvalue1\n     * -Dparam2\u003dvalue2\u003c/tt\u003e. The first argument of the option is the key, and\n     * the 2nd argument is the value. If the option has only one argument\n     * (\u003ctt\u003e-Dfoo\u003c/tt\u003e) it is considered as a boolean flag and the value is\n     * \u003ctt\u003e\"true\"\u003c/tt\u003e.\n     *\n     * @param option name of the option\n     * @return The Properties mapped by the option, never \u003ctt\u003enull\u003c/tt\u003e\n     *         even if the option doesn\u0027t exists\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 50)",
        "(line 352,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 370,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionProperties(java.lang.String)",
      "begin_line": 386,
      "end_line": 409,
      "comment": "\n     * Retrieve the map of values associated to the option. This is convenient\n     * for options specifying Java properties like \u003ctt\u003e-Dparam1\u003dvalue1\n     * -Dparam2\u003dvalue2\u003c/tt\u003e. The first argument of the option is the key, and\n     * the 2nd argument is the value. If the option has only one argument\n     * (\u003ctt\u003e-Dfoo\u003c/tt\u003e) it is considered as a boolean flag and the value is\n     * \u003ctt\u003e\"true\"\u003c/tt\u003e.\n     *\n     * @param opt name of the option\n     * @return The Properties mapped by the option, never \u003ctt\u003enull\u003c/tt\u003e\n     *         even if the option doesn\u0027t exists\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 50)",
        "(line 390,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 408,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgs()",
      "begin_line": 416,
      "end_line": 423,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as an array\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 56)",
        "(line 420,col 9)-(line 420,col 29)",
        "(line 422,col 9)-(line 422,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgList()",
      "begin_line": 430,
      "end_line": 433,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as a \u003ccode\u003eList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addArg(java.lang.String)",
      "begin_line": 462,
      "end_line": 465,
      "comment": "\n     * Add left-over unrecognized option/argument.\n     *\n     * @param arg the unrecognized option/argument.\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addOption(org.apache.commons.cli.Option)",
      "begin_line": 472,
      "end_line": 475,
      "comment": "\n     * Add an option to the command line.  The values of the option are stored.\n     *\n     * @param opt the processed option\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.iterator()",
      "begin_line": 483,
      "end_line": 486,
      "comment": "\n     * Returns an iterator over the Option members of CommandLine.\n     *\n     * @return an \u003ccode\u003eIterator\u003c/code\u003e over the processed {@link Option}\n     * members of this {@link CommandLine}\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptions()",
      "begin_line": 493,
      "end_line": 502,
      "comment": "\n     * Returns an array of the processed {@link Option}s.\n     *\n     * @return an array of the processed {@link Option}s.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 53)",
        "(line 498,col 9)-(line 498,col 67)",
        "(line 501,col 9)-(line 501,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 510,
      "end_line": 547,
      "comment": "\n     * A nested builder class to create \u003ccode\u003eCommandLine\u003c/code\u003e instance\n     * using descriptive methods.\n     * \n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "commandLine"
      ],
      "begin_line": 515,
      "end_line": 515,
      "comment": "\n         * CommandLine that is being build by this Builder.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.Builder.addOption(org.apache.commons.cli.Option)",
      "begin_line": 524,
      "end_line": 528,
      "comment": "\n         * Add an option to the command line. The values of the option are stored.\n         *\n         * @param opt the processed option\n         *\n         * @return this Builder instance for method chaining.\n         ",
      "child_ranges": [
        "(line 526,col 13)-(line 526,col 39)",
        "(line 527,col 13)-(line 527,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.Builder.addArg(java.lang.String)",
      "begin_line": 537,
      "end_line": 541,
      "comment": "\n         * Add left-over unrecognized option/argument.\n         *\n         * @param arg the unrecognized option/argument.\n         *\n         * @return this Builder instance for method chaining.\n         ",
      "child_ranges": [
        "(line 539,col 13)-(line 539,col 36)",
        "(line 540,col 13)-(line 540,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.Builder.build()",
      "begin_line": 543,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 545,col 13)-(line 545,col 31)"
      ]
    }
  ]
}