{
  "filepath": "/tmp/Cli-5b/src/java/org/apache/commons/cli/CommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 318,
      "comment": " \n * \u003cp\u003eRepresents list of arguments parsed against\n * a {@link Options} descriptor.\u003cp\u003e\n *\n * \u003cp\u003eIt allows querying of a boolean {@link #hasOption(String opt)},\n * in addition to retrieving the {@link #getOptionValue(String opt)}\n * for options requiring arguments.\u003c/p\u003e\n *\n * \u003cp\u003eAdditionally, any left-over or unrecognized arguments,\n * are available for further processing.\u003c/p\u003e\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @author John Keyes (john at integralsource.com)\n "
    },
    {
      "type": "field",
      "varNames": [
        "args"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " the unrecognised options/arguments "
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
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * Creates a command line.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(java.lang.String)",
      "begin_line": 66,
      "end_line": 69,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt Short name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.hasOption(char)",
      "begin_line": 77,
      "end_line": 80,
      "comment": " \n     * Query to see if an option has been set.\n     *\n     * @param opt character name of the option\n     * @return true if set, false if not\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(java.lang.String)",
      "begin_line": 88,
      "end_line": 101,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of this \u003ccode\u003eOption\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 41)",
        "(line 92,col 9)-(line 92,col 43)",
        "(line 93,col 9)-(line 96,col 9)",
        "(line 98,col 9)-(line 98,col 39)",
        "(line 100,col 9)-(line 100,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(char)",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of opt\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String)",
      "begin_line": 121,
      "end_line": 126,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 47)",
        "(line 125,col 9)-(line 125,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char)",
      "begin_line": 135,
      "end_line": 138,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the character name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(java.lang.String)",
      "begin_line": 147,
      "end_line": 157,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt string name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 42)",
        "(line 151,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.resolveOption(java.lang.String)",
      "begin_line": 164,
      "end_line": 181,
      "comment": "\n     * \u003cp\u003eRetrieves the option object given the long or short option as a String\u003c/p\u003e\n     * @param opt short or long name of the option\n     * @return Canonicalized option\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 44)",
        "(line 167,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(char)",
      "begin_line": 190,
      "end_line": 193,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String, java.lang.String)",
      "begin_line": 204,
      "end_line": 209,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt name of the option\n     * @param defaultValue is the default value to be returned if the option \n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 44)",
        "(line 208,col 9)-(line 208,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char, java.lang.String)",
      "begin_line": 220,
      "end_line": 223,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @param defaultValue is the default value to be returned if the option \n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgs()",
      "begin_line": 230,
      "end_line": 237,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as an array\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 50)",
        "(line 234,col 9)-(line 234,col 29)",
        "(line 236,col 9)-(line 236,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgList()",
      "begin_line": 244,
      "end_line": 247,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as a \u003ccode\u003eList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addArg(java.lang.String)",
      "begin_line": 276,
      "end_line": 279,
      "comment": "\n     * Add left-over unrecognized option/argument.\n     *\n     * @param arg the unrecognised option/argument.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addOption(org.apache.commons.cli.Option)",
      "begin_line": 287,
      "end_line": 290,
      "comment": "\n     * Add an option to the command line.  The values of \n     * the option are stored.\n     *\n     * @param opt the processed option\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.iterator()",
      "begin_line": 298,
      "end_line": 301,
      "comment": "\n     * Returns an iterator over the Option members of CommandLine.\n     *\n     * @return an \u003ccode\u003eIterator\u003c/code\u003e over the processed {@link Option} \n     * members of this {@link CommandLine}\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptions()",
      "begin_line": 308,
      "end_line": 317,
      "comment": "\n     * Returns an array of the processed {@link Option}s.\n     *\n     * @return an array of the processed {@link Option}s.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 39)",
        "(line 313,col 9)-(line 313,col 61)",
        "(line 316,col 9)-(line 316,col 58)"
      ]
    }
  ]
}