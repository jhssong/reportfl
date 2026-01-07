{
  "filepath": "/tmp/Cli-35b/src/main/java/org/apache/commons/cli/CommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 380,
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
      "comment": " the unrecognised options/arguments "
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
      "signature": "org.apache.commons.cli.CommandLine.hasOption(java.lang.String)",
      "begin_line": 65,
      "end_line": 68,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt Short name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(char)",
      "begin_line": 76,
      "end_line": 79,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt character name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(java.lang.String)",
      "begin_line": 88,
      "end_line": 100,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of this \u003ccode\u003eOption\u003c/code\u003e\n     * @deprecated due to System.err message. Instead use getParsedOptionValue(String)\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 99,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getParsedOptionValue(java.lang.String)",
      "begin_line": 111,
      "end_line": 122,
      "comment": "\n     * Return a version of this \u003ccode\u003eOption\u003c/code\u003e converted to a particular type. \n     *\n     * @param opt the name of the option\n     * @return the value parsed into a particular object\n     * @throws ParseException if there are problems turning the option value into the desired type\n     * @see PatternOptionBuilder\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 41)",
        "(line 114,col 9)-(line 114,col 43)",
        "(line 116,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 121,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(char)",
      "begin_line": 130,
      "end_line": 133,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of opt\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String)",
      "begin_line": 142,
      "end_line": 147,
      "comment": " \n     * Retrieve the first argument, if any, of this option.\n     *\n     * @param opt the name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 47)",
        "(line 146,col 9)-(line 146,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char)",
      "begin_line": 156,
      "end_line": 159,
      "comment": " \n     * Retrieve the first argument, if any, of this option.\n     *\n     * @param opt the character name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(java.lang.String)",
      "begin_line": 168,
      "end_line": 181,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt string name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 54)",
        "(line 172,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.resolveOption(java.lang.String)",
      "begin_line": 189,
      "end_line": 206,
      "comment": "\n     * Retrieves the option object given the long or short option as a String\n     * \n     * @param opt short or long name of the option\n     * @return Canonicalized option\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 44)",
        "(line 192,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(char)",
      "begin_line": 215,
      "end_line": 218,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String, java.lang.String)",
      "begin_line": 229,
      "end_line": 234,
      "comment": " \n     * Retrieve the first argument, if any, of an option.\n     *\n     * @param opt name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 44)",
        "(line 233,col 9)-(line 233,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char, java.lang.String)",
      "begin_line": 245,
      "end_line": 248,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionProperties(java.lang.String)",
      "begin_line": 263,
      "end_line": 286,
      "comment": "\n     * Retrieve the map of values associated to the option. This is convenient\n     * for options specifying Java properties like \u003ctt\u003e-Dparam1\u003dvalue1\n     * -Dparam2\u003dvalue2\u003c/tt\u003e. The first argument of the option is the key, and\n     * the 2nd argument is the value. If the option has only one argument\n     * (\u003ctt\u003e-Dfoo\u003c/tt\u003e) it is considered as a boolean flag and the value is\n     * \u003ctt\u003e\"true\"\u003c/tt\u003e.\n     *\n     * @param opt name of the option\n     * @return The Properties mapped by the option, never \u003ctt\u003enull\u003c/tt\u003e\n     *         even if the option doesn\u0027t exists\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 44)",
        "(line 267,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 285,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgs()",
      "begin_line": 293,
      "end_line": 300,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as an array\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 50)",
        "(line 297,col 9)-(line 297,col 29)",
        "(line 299,col 9)-(line 299,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgList()",
      "begin_line": 307,
      "end_line": 310,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as a \u003ccode\u003eList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addArg(java.lang.String)",
      "begin_line": 339,
      "end_line": 342,
      "comment": "\n     * Add left-over unrecognized option/argument.\n     *\n     * @param arg the unrecognised option/argument.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addOption(org.apache.commons.cli.Option)",
      "begin_line": 349,
      "end_line": 352,
      "comment": "\n     * Add an option to the command line.  The values of the option are stored.\n     *\n     * @param opt the processed option\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.iterator()",
      "begin_line": 360,
      "end_line": 363,
      "comment": "\n     * Returns an iterator over the Option members of CommandLine.\n     *\n     * @return an \u003ccode\u003eIterator\u003c/code\u003e over the processed {@link Option}\n     * members of this {@link CommandLine}\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptions()",
      "begin_line": 370,
      "end_line": 379,
      "comment": "\n     * Returns an array of the processed {@link Option}s.\n     *\n     * @return an array of the processed {@link Option}s.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 47)",
        "(line 375,col 9)-(line 375,col 61)",
        "(line 378,col 9)-(line 378,col 47)"
      ]
    }
  ]
}