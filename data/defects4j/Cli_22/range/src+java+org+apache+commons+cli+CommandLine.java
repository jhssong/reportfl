{
  "filepath": "/tmp/Cli-22b/src/java/org/apache/commons/cli/CommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 364,
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
      "begin_line": 89,
      "end_line": 102,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of this \u003ccode\u003eOption\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 41)",
        "(line 93,col 9)-(line 93,col 43)",
        "(line 94,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 39)",
        "(line 101,col 9)-(line 101,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(char)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of opt\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String)",
      "begin_line": 122,
      "end_line": 127,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 47)",
        "(line 126,col 9)-(line 126,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char)",
      "begin_line": 136,
      "end_line": 139,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the character name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(java.lang.String)",
      "begin_line": 148,
      "end_line": 162,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt string name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 38)",
        "(line 152,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.resolveOption(java.lang.String)",
      "begin_line": 170,
      "end_line": 188,
      "comment": "\n     * Retrieves the option object given the long or short option as a String\n     * \n     * @param opt short or long name of the option\n     * @return Canonicalized option\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 44)",
        "(line 173,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(char)",
      "begin_line": 197,
      "end_line": 200,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String, java.lang.String)",
      "begin_line": 211,
      "end_line": 216,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 44)",
        "(line 215,col 9)-(line 215,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char, java.lang.String)",
      "begin_line": 227,
      "end_line": 230,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @param defaultValue is the default value to be returned if the option\n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionProperties(java.lang.String)",
      "begin_line": 245,
      "end_line": 270,
      "comment": "\n     * Retrieve the map of values associated to the option. This is convenient\n     * for options specifying Java properties like \u003ctt\u003e-Dparam1\u003dvalue1\n     * -Dparam2\u003dvalue2\u003c/tt\u003e. The first argument of the option is the key, and\n     * the 2nd argument is the value. If the option has only one argument\n     * (\u003ctt\u003e-Dfoo\u003c/tt\u003e) it is considered as a boolean flag and the value is\n     * \u003ctt\u003e\"true\"\u003c/tt\u003e.\n     *\n     * @param opt name of the option\n     * @return The Properties mapped by the option, never \u003ctt\u003enull\u003c/tt\u003e\n     *         even if the option doesn\u0027t exists\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 44)",
        "(line 249,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 269,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgs()",
      "begin_line": 277,
      "end_line": 284,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as an array\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 50)",
        "(line 281,col 9)-(line 281,col 29)",
        "(line 283,col 9)-(line 283,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgList()",
      "begin_line": 291,
      "end_line": 294,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as a \u003ccode\u003eList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addArg(java.lang.String)",
      "begin_line": 323,
      "end_line": 326,
      "comment": "\n     * Add left-over unrecognized option/argument.\n     *\n     * @param arg the unrecognised option/argument.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addOption(org.apache.commons.cli.Option)",
      "begin_line": 333,
      "end_line": 336,
      "comment": "\n     * Add an option to the command line.  The values of the option are stored.\n     *\n     * @param opt the processed option\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.iterator()",
      "begin_line": 344,
      "end_line": 347,
      "comment": "\n     * Returns an iterator over the Option members of CommandLine.\n     *\n     * @return an \u003ccode\u003eIterator\u003c/code\u003e over the processed {@link Option}\n     * members of this {@link CommandLine}\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptions()",
      "begin_line": 354,
      "end_line": 363,
      "comment": "\n     * Returns an array of the processed {@link Option}s.\n     *\n     * @return an array of the processed {@link Option}s.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 39)",
        "(line 359,col 9)-(line 359,col 61)",
        "(line 362,col 9)-(line 362,col 58)"
      ]
    }
  ]
}