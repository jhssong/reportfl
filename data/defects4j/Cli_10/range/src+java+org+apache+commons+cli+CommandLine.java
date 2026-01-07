{
  "filepath": "/tmp/Cli-10b/src/java/org/apache/commons/cli/CommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 42,
      "end_line": 321,
      "comment": " \n * \u003cp\u003eRepresents list of arguments parsed against\n * a {@link Options} descriptor.\u003cp\u003e\n *\n * \u003cp\u003eIt allows querying of a boolean {@link #hasOption(String opt)},\n * in addition to retrieving the {@link #getOptionValue(String opt)}\n * for options requiring arguments.\u003c/p\u003e\n *\n * \u003cp\u003eAdditionally, any left-over or unrecognized arguments,\n * are available for further processing.\u003c/p\u003e\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @author John Keyes (john at integralsource.com)\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "args"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " the unrecognised options/arguments "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " the processed options "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.CommandLine.CommandLine()",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Creates a command line.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(java.lang.String)",
      "begin_line": 69,
      "end_line": 72,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt Short name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(char)",
      "begin_line": 80,
      "end_line": 83,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt character name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(java.lang.String)",
      "begin_line": 91,
      "end_line": 104,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of this \u003ccode\u003eOption\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 41)",
        "(line 95,col 9)-(line 95,col 43)",
        "(line 96,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 101,col 39)",
        "(line 103,col 9)-(line 103,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(char)",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of opt\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String)",
      "begin_line": 124,
      "end_line": 129,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 47)",
        "(line 128,col 9)-(line 128,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char)",
      "begin_line": 138,
      "end_line": 141,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the character name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(java.lang.String)",
      "begin_line": 150,
      "end_line": 160,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt string name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 42)",
        "(line 154,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.resolveOption(java.lang.String)",
      "begin_line": 167,
      "end_line": 184,
      "comment": "\n     * \u003cp\u003eRetrieves the option object given the long or short option as a String\u003c/p\u003e\n     * @param opt short or long name of the option\n     * @return Canonicalized option\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 44)",
        "(line 170,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(char)",
      "begin_line": 193,
      "end_line": 196,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String, java.lang.String)",
      "begin_line": 207,
      "end_line": 212,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt name of the option\n     * @param defaultValue is the default value to be returned if the option \n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 44)",
        "(line 211,col 9)-(line 211,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char, java.lang.String)",
      "begin_line": 223,
      "end_line": 226,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @param defaultValue is the default value to be returned if the option \n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgs()",
      "begin_line": 233,
      "end_line": 240,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as an array\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 50)",
        "(line 237,col 9)-(line 237,col 29)",
        "(line 239,col 9)-(line 239,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgList()",
      "begin_line": 247,
      "end_line": 250,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as a \u003ccode\u003eList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addArg(java.lang.String)",
      "begin_line": 279,
      "end_line": 282,
      "comment": "\n     * Add left-over unrecognized option/argument.\n     *\n     * @param arg the unrecognised option/argument.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addOption(org.apache.commons.cli.Option)",
      "begin_line": 290,
      "end_line": 293,
      "comment": "\n     * Add an option to the command line.  The values of \n     * the option are stored.\n     *\n     * @param opt the processed option\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.iterator()",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\n     * Returns an iterator over the Option members of CommandLine.\n     *\n     * @return an \u003ccode\u003eIterator\u003c/code\u003e over the processed {@link Option} \n     * members of this {@link CommandLine}\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptions()",
      "begin_line": 311,
      "end_line": 320,
      "comment": "\n     * Returns an array of the processed {@link Option}s.\n     *\n     * @return an array of the processed {@link Option}s.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 39)",
        "(line 316,col 9)-(line 316,col 61)",
        "(line 319,col 9)-(line 319,col 58)"
      ]
    }
  ]
}