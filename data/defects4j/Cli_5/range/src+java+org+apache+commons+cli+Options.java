{
  "filepath": "/tmp/Cli-5b/src/java/org/apache/commons/cli/Options.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Options",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 278,
      "comment": " \u003cp\u003eMain entry-point into the library.\u003c/p\u003e\n *\n * \u003cp\u003eOptions represents a collection of {@link Option} objects, which\n * describe the possible options for a command-line.\u003cp\u003e\n *\n * \u003cp\u003eIt may flexibly parse long and short options, with or without\n * values.  Additionally, it may parse only a portion of a commandline,\n * allowing for flexible multi-stage parsing.\u003cp\u003e\n *\n * @see org.apache.commons.cli.CommandLine\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "shortOpts"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " a map of the options with the character key "
    },
    {
      "type": "field",
      "varNames": [
        "longOpts"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " a map of the options with the long key "
    },
    {
      "type": "field",
      "varNames": [
        "requiredOpts"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " a map of the required options "
    },
    {
      "type": "field",
      "varNames": [
        "optionGroups"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " a map of the option groups "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Options.Options()",
      "begin_line": 59,
      "end_line": 62,
      "comment": " Construct a new Options descriptor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOptionGroup(org.apache.commons.cli.OptionGroup)",
      "begin_line": 70,
      "end_line": 94,
      "comment": "\n     * Add the specified option group.\n     *\n     * @param group the OptionGroup that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 57)",
        "(line 74,col 9)-(line 77,col 9)",
        "(line 79,col 9)-(line 91,col 9)",
        "(line 93,col 9)-(line 93,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroups()",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Lists the OptionGroups that are members of this Options instance.\n     * @return a Collection of OptionGroup instances.\n     ",
      "child_ranges": [
        "(line 101,col 6)-(line 101,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, boolean, java.lang.String)",
      "begin_line": 113,
      "end_line": 118,
      "comment": " \n     * Add an option that only contains a short-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 50)",
        "(line 117,col 9)-(line 117,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 130,
      "end_line": 136,
      "comment": " \n     * Add an option that contains a short-name and a long-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param longOpt Long multi-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 65)",
        "(line 135,col 9)-(line 135,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(org.apache.commons.cli.Option)",
      "begin_line": 144,
      "end_line": 166,
      "comment": "\n     * Adds an option instance\n     *\n     * @param opt the option that is to be added \n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 34)",
        "(line 149,col 9)-(line 152,col 9)",
        "(line 155,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 32)",
        "(line 165,col 9)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptions()",
      "begin_line": 173,
      "end_line": 176,
      "comment": " \n     * Retrieve a read-only list of options in this set\n     *\n     * @return read-only Collection of {@link Option} objects in this descriptor\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.helpOptions()",
      "begin_line": 183,
      "end_line": 202,
      "comment": "\n     * Returns the Options for use by the HelpFormatter.\n     *\n     * @return the List of Options\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 54)",
        "(line 189,col 9)-(line 189,col 53)",
        "(line 191,col 9)-(line 199,col 9)",
        "(line 201,col 9)-(line 201,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getRequiredOptions()",
      "begin_line": 210,
      "end_line": 213,
      "comment": " \n     * Returns the required options as a\n     * \u003ccode\u003ejava.util.Collection\u003c/code\u003e.\n     *\n     * @return Collection of required options\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOption(java.lang.String)",
      "begin_line": 221,
      "end_line": 231,
      "comment": " \n     * Retrieve the named {@link Option}\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return the option represented by opt\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 44)",
        "(line 225,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasOption(java.lang.String)",
      "begin_line": 241,
      "end_line": 246,
      "comment": " \n     * Returns whether the named {@link Option} is a member\n     * of this {@link Options}.\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return true if the named {@link Option} is a member\n     * of this {@link Options}\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 44)",
        "(line 245,col 9)-(line 245,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroup(org.apache.commons.cli.Option)",
      "begin_line": 256,
      "end_line": 259,
      "comment": " \n     * Returns the OptionGroup the \u003ccode\u003eopt\u003c/code\u003e\n     * belongs to.\n     * @param opt the option whose OptionGroup is being queried.\n     *\n     * @return the OptionGroup if \u003ccode\u003eopt\u003c/code\u003e is part\n     * of an OptionGroup, otherwise return null\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.toString()",
      "begin_line": 266,
      "end_line": 277,
      "comment": " \n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 46)",
        "(line 270,col 9)-(line 270,col 42)",
        "(line 271,col 9)-(line 271,col 41)",
        "(line 272,col 9)-(line 272,col 33)",
        "(line 273,col 9)-(line 273,col 29)",
        "(line 274,col 9)-(line 274,col 25)",
        "(line 276,col 9)-(line 276,col 30)"
      ]
    }
  ]
}