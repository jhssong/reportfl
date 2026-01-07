{
  "filepath": "/tmp/Cli-2b/src/java/org/apache/commons/cli/CommandLine.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandLine",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 317,
      "comment": " \n * \u003cp\u003eRepresents list of arguments parsed against\n * a {@link Options} descriptor.\u003cp\u003e\n *\n * \u003cp\u003eIt allows querying of a boolean {@link #hasOption(String opt)},\n * in addition to retrieving the {@link #getOptionValue(String opt)}\n * for options requiring arguments.\u003c/p\u003e\n *\n * \u003cp\u003eAdditionally, any left-over or unrecognized arguments,\n * are available for further processing.\u003c/p\u003e\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @author John Keyes (john at integralsource.com)\n "
    },
    {
      "type": "field",
      "varNames": [
        "args"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " the unrecognised options/arguments "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 46,
      "end_line": 46,
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
        "(line 67,col 9)-(line 67,col 53)"
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
      "begin_line": 87,
      "end_line": 100,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of this \u003ccode\u003eOption\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 41)",
        "(line 91,col 9)-(line 91,col 43)",
        "(line 92,col 9)-(line 95,col 9)",
        "(line 97,col 9)-(line 97,col 39)",
        "(line 99,col 9)-(line 99,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionObject(char)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Return the \u003ccode\u003eObject\u003c/code\u003e type of this \u003ccode\u003eOption\u003c/code\u003e.\n     *\n     * @param opt the name of the option\n     * @return the type of opt\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String)",
      "begin_line": 120,
      "end_line": 125,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 47)",
        "(line 124,col 9)-(line 124,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char)",
      "begin_line": 134,
      "end_line": 137,
      "comment": " \n     * Retrieve the argument, if any, of this option.\n     *\n     * @param opt the character name of the option\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(java.lang.String)",
      "begin_line": 146,
      "end_line": 156,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt string name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 42)",
        "(line 150,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.resolveOption(java.lang.String)",
      "begin_line": 163,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eRetrieves the option object given the long or short option as a String\u003c/p\u003e\n     * @param opt short or long name of the option\n     * @return Canonicalized option\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 44)",
        "(line 166,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValues(char)",
      "begin_line": 189,
      "end_line": 192,
      "comment": " \n     * Retrieves the array of values, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @return Values of the argument if option is set, and has an argument,\n     * otherwise null.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(java.lang.String, java.lang.String)",
      "begin_line": 203,
      "end_line": 208,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt name of the option\n     * @param defaultValue is the default value to be returned if the option \n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 44)",
        "(line 207,col 9)-(line 207,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptionValue(char, java.lang.String)",
      "begin_line": 219,
      "end_line": 222,
      "comment": " \n     * Retrieve the argument, if any, of an option.\n     *\n     * @param opt character name of the option\n     * @param defaultValue is the default value to be returned if the option \n     * is not specified\n     * @return Value of the argument if option is set, and has an argument,\n     * otherwise \u003ccode\u003edefaultValue\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgs()",
      "begin_line": 229,
      "end_line": 236,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as an array\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 50)",
        "(line 233,col 9)-(line 233,col 29)",
        "(line 235,col 9)-(line 235,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getArgList()",
      "begin_line": 243,
      "end_line": 246,
      "comment": " \n     * Retrieve any left-over non-recognized options and arguments\n     *\n     * @return remaining items passed in but not parsed as a \u003ccode\u003eList\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addArg(java.lang.String)",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * Add left-over unrecognized option/argument.\n     *\n     * @param arg the unrecognised option/argument.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.addOption(org.apache.commons.cli.Option)",
      "begin_line": 286,
      "end_line": 289,
      "comment": "\n     * Add an option to the command line.  The values of \n     * the option are stored.\n     *\n     * @param opt the processed option\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.iterator()",
      "begin_line": 297,
      "end_line": 300,
      "comment": "\n     * Returns an iterator over the Option members of CommandLine.\n     *\n     * @return an \u003ccode\u003eIterator\u003c/code\u003e over the processed {@link Option} \n     * members of this {@link CommandLine}\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.CommandLine.getOptions()",
      "begin_line": 307,
      "end_line": 316,
      "comment": "\n     * Returns an array of the processed {@link Option}s.\n     *\n     * @return an array of the processed {@link Option}s.\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 39)",
        "(line 312,col 9)-(line 312,col 61)",
        "(line 315,col 9)-(line 315,col 58)"
      ]
    }
  ]
}