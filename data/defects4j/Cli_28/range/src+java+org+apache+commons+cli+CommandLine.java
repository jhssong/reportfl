{
  "filepath": "/tmp/Cli-28b/src/java/org/apache/commons/cli/CommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 385,
      "comment": "\n * Represents list of arguments parsed against a {@link Options} descriptor.\n *\n * \u003cp\u003eIt allows querying of a boolean {@link #hasOption(String opt)},\n * in addition to retrieving the {@link #getOptionValue(String opt)}\n * for options requiring arguments.\u003c/p\u003e\n *\n * \u003cp\u003eAdditionally, any left-over or unrecognized arguments,\n * are available for further processing.\u003c/p\u003e\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @author John Keyes (john at integralsource.com)\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "args"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " the unrecognised options/arguments "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " the processed options "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.CommandLine.CommandLine()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * Creates a command line.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(java.lang.String)",
      "begin_line": 67,
      "end_line": 70,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt Short name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(char)",
      "begin_line": 78,
      "end_line": 81,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt character name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(java.lang.String)",
      "begin_line": 90,
      "end_line": 99,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of this \u003ccode\u003eOption\u003c/code\u003e\n     * @deprecated due to System.err message. Instead use getParsedOptionValue(String)\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 98,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getParsedOptionValue(java.lang.String)",
      "begin_line": 110,
      "end_line": 123,
      "comment": "\n     * Return a version of this \u003ccode\u003eOption\u003c/code\u003e converted to a particular type. \n     *\n     * @param opt the name of the option\n     * @return the value parsed into a particular object\n     * @throws ParseException if there are problems turning the option value into the desired type\n     * @see PatternOptionBuilder\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 41)",
        "(line 114,col 9)-(line 114,col 43)",
        "(line 115,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 39)",
        "(line 122,col 9)-(line 122,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(char)",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of opt\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String)",
      "begin_line": 143,
      "end_line": 148,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 47)",
        "(line 147,col 9)-(line 147,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char)",
      "begin_line": 157,
      "end_line": 160,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the character name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(java.lang.String)",
      "begin_line": 169,
      "end_line": 183,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt string name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 38)",
        "(line 173,col 9)-(line 180,col 9)",
        "(line 182,col 9)-(line 182,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.resolveOption(java.lang.String)",
      "begin_line": 191,
      "end_line": 209,
      "comment": "\n     * Retrieves the option object given the long or short option as a String\n     * \n     * @param opt short or long name of the option\n     * @return Canonicalized option\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 44)",
        "(line 194,col 9)-(line 207,col 9)",
        "(line 208,col 9)-(line 208,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(char)",
      "begin_line": 218,
      "end_line": 221,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String, java.lang.String)",
      "begin_line": 232,
      "end_line": 237,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 44)",
        "(line 236,col 9)-(line 236,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char, java.lang.String)",
      "begin_line": 248,
      "end_line": 251,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionProperties(java.lang.String)",
      "begin_line": 266,
      "end_line": 291,
      "comment": "\n     * Retrieve the map of values associated to the option. This is convenient\n     * for options specifying Java properties like \u003ctt\u003e-Dparam1\u003dvalue1\n     * -Dparam2\u003dvalue2\u003c/tt\u003e. The first argument of the option is the key, and\n     * the 2nd argument is the value. If the option has only one argument\n     * (\u003ctt\u003e-Dfoo\u003c/tt\u003e) it is considered as a boolean flag and the value is\n     * \u003ctt\u003e\"true\"\u003c/tt\u003e.\n     *\n     * @param opt name of the option\n     * @return The Properties mapped by the option, never \u003ctt\u003enull\u003c/tt\u003e\n     *         even if the option doesn\u0027t exists\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 44)",
        "(line 270,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgs()",
      "begin_line": 298,
      "end_line": 305,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as an array\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 50)",
        "(line 302,col 9)-(line 302,col 29)",
        "(line 304,col 9)-(line 304,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgList()",
      "begin_line": 312,
      "end_line": 315,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as a \u003ccode\u003eList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addArg(java.lang.String)",
      "begin_line": 344,
      "end_line": 347,
      "comment": "\n     * Add left-over unrecognized option/argument.\n     *\n     * @param arg the unrecognised option/argument.\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addOption(org.apache.commons.cli.Option)",
      "begin_line": 354,
      "end_line": 357,
      "comment": "\n     * Add an option to the command line.  The values of the option are stored.\n     *\n     * @param opt the processed option\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.iterator()",
      "begin_line": 365,
      "end_line": 368,
      "comment": "\n     * Returns an iterator over the Option members of CommandLine.\n     *\n     * @return an \u003ccode\u003eIterator\u003c/code\u003e over the processed {@link Option}\n     * members of this {@link CommandLine}\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptions()",
      "begin_line": 375,
      "end_line": 384,
      "comment": "\n     * Returns an array of the processed {@link Option}s.\n     *\n     * @return an array of the processed {@link Option}s.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 39)",
        "(line 380,col 9)-(line 380,col 61)",
        "(line 383,col 9)-(line 383,col 58)"
      ]
    }
  ]
}