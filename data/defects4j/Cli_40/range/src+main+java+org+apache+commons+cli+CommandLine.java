{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/CommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 38,
      "end_line": 546,
      "comment": "\n * Represents list of arguments parsed against a {@link Options} descriptor.\n * \u003cp\u003e\n * It allows querying of a boolean {@link #hasOption(String opt)},\n * in addition to retrieving the {@link #getOptionValue(String opt)}\n * for options requiring arguments.\n * \u003cp\u003e\n * Additionally, any left-over or unrecognized arguments,\n * are available for further processing.\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " The serial version UID. "
    },
    {
      "type": "field",
      "varNames": [
        "args"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " the unrecognized options/arguments "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " the processed options "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.CommandLine.CommandLine()",
      "begin_line": 52,
      "end_line": 55,
      "comment": "\n     * Creates a command line.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(org.apache.commons.cli.Option)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * Query to see if an option has been set.\n     *\n     * @param opt the option to check.\n     * @return true if set, false if not.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(java.lang.String)",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Query to see if an option has been set.\n     *\n     * @param opt Short name of the option.\n     * @return true if set, false if not.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(char)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Query to see if an option has been set.\n     *\n     * @param opt character name of the option.\n     * @return true if set, false if not.\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(java.lang.String)",
      "begin_line": 98,
      "end_line": 110,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option.\n     * @return the type of this \u003ccode\u003eOption\u003c/code\u003e.\n     * @deprecated due to System.err message. Instead use getParsedOptionValue(String)\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getParsedOptionValue(org.apache.commons.cli.Option)",
      "begin_line": 121,
      "end_line": 133,
      "comment": "\n     * Return a version of this \u003ccode\u003eOption\u003c/code\u003e converted to a particular type.\n     *\n     * @param option the name of the option.\n     * @return the value parsed into a particular object.\n     * @throws ParseException if there are problems turning the option value into the desired type\n     * @see PatternOptionBuilder\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 50)",
        "(line 128,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getParsedOptionValue(java.lang.String)",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n     * Return a version of this \u003ccode\u003eOption\u003c/code\u003e converted to a particular type.\n     *\n     * @param opt the name of the option.\n     * @return the value parsed into a particular object.\n     * @throws ParseException if there are problems turning the option value into the desired type\n     * @see PatternOptionBuilder\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getParsedOptionValue(char)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\n     * Return a version of this \u003ccode\u003eOption\u003c/code\u003e converted to a particular type.\n     *\n     * @param opt the name of the option.\n     * @return the value parsed into a particular object.\n     * @throws ParseException if there are problems turning the option value into the desired type\n     * @see PatternOptionBuilder\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(char)",
      "begin_line": 170,
      "end_line": 173,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @deprecated due to System.err message. Instead use getParsedOptionValue(char)\n     * @param opt the name of the option.\n     * @return the type of opt.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(org.apache.commons.cli.Option)",
      "begin_line": 183,
      "end_line": 191,
      "comment": "\n     * Retrieve the first argument, if any, of this option.\n     *\n     * @param option the name of the option.\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 56)",
        "(line 190,col 9)-(line 190,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * Retrieve the first argument, if any, of this option.\n     *\n     * @param opt the name of the option.\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char)",
      "begin_line": 212,
      "end_line": 215,
      "comment": "\n     * Retrieve the first argument, if any, of this option.\n     *\n     * @param opt the character name of the option.\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 214,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(org.apache.commons.cli.Option)",
      "begin_line": 225,
      "end_line": 238,
      "comment": "\n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param option string name of the option.\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 60)",
        "(line 229,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(java.lang.String)",
      "begin_line": 247,
      "end_line": 250,
      "comment": "\n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt string name of the option.\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.resolveOption(java.lang.String)",
      "begin_line": 258,
      "end_line": 275,
      "comment": "\n     * Retrieves the option object given the long or short option as a String\n     *\n     * @param opt short or long name of the option.\n     * @return Canonicalized option.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 44)",
        "(line 261,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(char)",
      "begin_line": 284,
      "end_line": 287,
      "comment": "\n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt character name of the option.\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(org.apache.commons.cli.Option, java.lang.String)",
      "begin_line": 299,
      "end_line": 303,
      "comment": "\n     * Retrieve the first argument, if any, of an option.\n     *\n     * @param option name of the option.\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified.\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 53)",
        "(line 302,col 9)-(line 302,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String, java.lang.String)",
      "begin_line": 314,
      "end_line": 317,
      "comment": "\n     * Retrieve the first argument, if any, of an option.\n     *\n     * @param opt name of the option.\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified.\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char, java.lang.String)",
      "begin_line": 328,
      "end_line": 331,
      "comment": "\n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified.\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionProperties(org.apache.commons.cli.Option)",
      "begin_line": 346,
      "end_line": 369,
      "comment": "\n     * Retrieve the map of values associated to the option. This is convenient\n     * for options specifying Java properties like \u003ctt\u003e-Dparam1\u003dvalue1\n     * -Dparam2\u003dvalue2\u003c/tt\u003e. The first argument of the option is the key, and\n     * the 2nd argument is the value. If the option has only one argument\n     * (\u003ctt\u003e-Dfoo\u003c/tt\u003e) it is considered as a boolean flag and the value is\n     * \u003ctt\u003e\"true\"\u003c/tt\u003e.\n     *\n     * @param option name of the option.\n     * @return The Properties mapped by the option, never \u003ctt\u003enull\u003c/tt\u003e\n     *         even if the option doesn\u0027t exists.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 50)",
        "(line 350,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 368,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionProperties(java.lang.String)",
      "begin_line": 384,
      "end_line": 407,
      "comment": "\n     * Retrieve the map of values associated to the option. This is convenient\n     * for options specifying Java properties like \u003ctt\u003e-Dparam1\u003dvalue1\n     * -Dparam2\u003dvalue2\u003c/tt\u003e. The first argument of the option is the key, and\n     * the 2nd argument is the value. If the option has only one argument\n     * (\u003ctt\u003e-Dfoo\u003c/tt\u003e) it is considered as a boolean flag and the value is\n     * \u003ctt\u003e\"true\"\u003c/tt\u003e.\n     *\n     * @param opt name of the option.\n     * @return The Properties mapped by the option, never \u003ctt\u003enull\u003c/tt\u003e\n     *         even if the option doesn\u0027t exists.\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 50)",
        "(line 388,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 406,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgs()",
      "begin_line": 414,
      "end_line": 421,
      "comment": "\n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as an array.\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 56)",
        "(line 418,col 9)-(line 418,col 29)",
        "(line 420,col 9)-(line 420,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgList()",
      "begin_line": 428,
      "end_line": 431,
      "comment": "\n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as a \u003ccode\u003eList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addArg(java.lang.String)",
      "begin_line": 460,
      "end_line": 463,
      "comment": "\n     * Add left-over unrecognized option/argument.\n     *\n     * @param arg the unrecognized option/argument.\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addOption(org.apache.commons.cli.Option)",
      "begin_line": 470,
      "end_line": 473,
      "comment": "\n     * Add an option to the command line.  The values of the option are stored.\n     *\n     * @param opt the processed option.\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.iterator()",
      "begin_line": 481,
      "end_line": 484,
      "comment": "\n     * Returns an iterator over the Option members of CommandLine.\n     *\n     * @return an \u003ccode\u003eIterator\u003c/code\u003e over the processed {@link Option}\n     * members of this {@link CommandLine}.\n     ",
      "child_ranges": [
        "(line 483,col 9)-(line 483,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptions()",
      "begin_line": 491,
      "end_line": 500,
      "comment": "\n     * Returns an array of the processed {@link Option}s.\n     *\n     * @return an array of the processed {@link Option}s.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 53)",
        "(line 496,col 9)-(line 496,col 67)",
        "(line 499,col 9)-(line 499,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Builder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 508,
      "end_line": 545,
      "comment": "\n     * A nested builder class to create \u003ccode\u003eCommandLine\u003c/code\u003e instance\n     * using descriptive methods.\n     *\n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "commandLine"
      ],
      "begin_line": 513,
      "end_line": 513,
      "comment": "\n         * CommandLine that is being build by this Builder.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.Builder.addOption(org.apache.commons.cli.Option)",
      "begin_line": 522,
      "end_line": 526,
      "comment": "\n         * Add an option to the command line. The values of the option are stored.\n         *\n         * @param opt the processed option.\n         *\n         * @return this Builder instance for method chaining.\n         ",
      "child_ranges": [
        "(line 524,col 13)-(line 524,col 39)",
        "(line 525,col 13)-(line 525,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.Builder.addArg(java.lang.String)",
      "begin_line": 535,
      "end_line": 539,
      "comment": "\n         * Add left-over unrecognized option/argument.\n         *\n         * @param arg the unrecognized option/argument.\n         *\n         * @return this Builder instance for method chaining.\n         ",
      "child_ranges": [
        "(line 537,col 13)-(line 537,col 36)",
        "(line 538,col 13)-(line 538,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.Builder.build()",
      "begin_line": 541,
      "end_line": 544,
      "comment": "",
      "child_ranges": [
        "(line 543,col 13)-(line 543,col 31)"
      ]
    }
  ]
}