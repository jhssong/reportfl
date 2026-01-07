{
  "filepath": "/tmp/Cli-34b/src/main/java/org/apache/commons/cli/CommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 386,
      "comment": "\n * Represents list of arguments parsed against a {@link Options} descriptor.\n *\n * \u003cp\u003eIt allows querying of a boolean {@link #hasOption(String opt)},\n * in addition to retrieving the {@link #getOptionValue(String opt)}\n * for options requiring arguments.\u003c/p\u003e\n *\n * \u003cp\u003eAdditionally, any left-over or unrecognized arguments,\n * are available for further processing.\u003c/p\u003e\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @author John Keyes (john at integralsource.com)\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " The serial version UID. "
    },
    {
      "type": "field",
      "varNames": [
        "args"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " the unrecognised options/arguments "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " the processed options "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.CommandLine.CommandLine()",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Creates a command line.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(java.lang.String)",
      "begin_line": 68,
      "end_line": 71,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt Short name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(char)",
      "begin_line": 79,
      "end_line": 82,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt character name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(java.lang.String)",
      "begin_line": 91,
      "end_line": 102,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of this \u003ccode\u003eOption\u003c/code\u003e\n     * @deprecated due to System.err message. Instead use getParsedOptionValue(String)\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 101,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getParsedOptionValue(java.lang.String)",
      "begin_line": 113,
      "end_line": 124,
      "comment": "\n     * Return a version of this \u003ccode\u003eOption\u003c/code\u003e converted to a particular type. \n     *\n     * @param opt the name of the option\n     * @return the value parsed into a particular object\n     * @throws ParseException if there are problems turning the option value into the desired type\n     * @see PatternOptionBuilder\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 41)",
        "(line 116,col 9)-(line 116,col 43)",
        "(line 118,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 123,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(char)",
      "begin_line": 132,
      "end_line": 135,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of opt\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String)",
      "begin_line": 144,
      "end_line": 149,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 47)",
        "(line 148,col 9)-(line 148,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char)",
      "begin_line": 158,
      "end_line": 161,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the character name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(java.lang.String)",
      "begin_line": 170,
      "end_line": 184,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt string name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 38)",
        "(line 174,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.resolveOption(java.lang.String)",
      "begin_line": 192,
      "end_line": 210,
      "comment": "\n     * Retrieves the option object given the long or short option as a String\n     * \n     * @param opt short or long name of the option\n     * @return Canonicalized option\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 44)",
        "(line 195,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(char)",
      "begin_line": 219,
      "end_line": 222,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String, java.lang.String)",
      "begin_line": 233,
      "end_line": 238,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 44)",
        "(line 237,col 9)-(line 237,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char, java.lang.String)",
      "begin_line": 249,
      "end_line": 252,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionProperties(java.lang.String)",
      "begin_line": 267,
      "end_line": 292,
      "comment": "\n     * Retrieve the map of values associated to the option. This is convenient\n     * for options specifying Java properties like \u003ctt\u003e-Dparam1\u003dvalue1\n     * -Dparam2\u003dvalue2\u003c/tt\u003e. The first argument of the option is the key, and\n     * the 2nd argument is the value. If the option has only one argument\n     * (\u003ctt\u003e-Dfoo\u003c/tt\u003e) it is considered as a boolean flag and the value is\n     * \u003ctt\u003e\"true\"\u003c/tt\u003e.\n     *\n     * @param opt name of the option\n     * @return The Properties mapped by the option, never \u003ctt\u003enull\u003c/tt\u003e\n     *         even if the option doesn\u0027t exists\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 44)",
        "(line 271,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 291,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgs()",
      "begin_line": 299,
      "end_line": 306,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as an array\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 50)",
        "(line 303,col 9)-(line 303,col 29)",
        "(line 305,col 9)-(line 305,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgList()",
      "begin_line": 313,
      "end_line": 316,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as a \u003ccode\u003eList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addArg(java.lang.String)",
      "begin_line": 345,
      "end_line": 348,
      "comment": "\n     * Add left-over unrecognized option/argument.\n     *\n     * @param arg the unrecognised option/argument.\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addOption(org.apache.commons.cli.Option)",
      "begin_line": 355,
      "end_line": 358,
      "comment": "\n     * Add an option to the command line.  The values of the option are stored.\n     *\n     * @param opt the processed option\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.iterator()",
      "begin_line": 366,
      "end_line": 369,
      "comment": "\n     * Returns an iterator over the Option members of CommandLine.\n     *\n     * @return an \u003ccode\u003eIterator\u003c/code\u003e over the processed {@link Option}\n     * members of this {@link CommandLine}\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptions()",
      "begin_line": 376,
      "end_line": 385,
      "comment": "\n     * Returns an array of the processed {@link Option}s.\n     *\n     * @return an array of the processed {@link Option}s.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 39)",
        "(line 381,col 9)-(line 381,col 61)",
        "(line 384,col 9)-(line 384,col 58)"
      ]
    }
  ]
}