{
  "filepath": "/tmp/Cli-17b/src/java/org/apache/commons/cli/Options.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Options",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 45,
      "end_line": 268,
      "comment": " \u003cp\u003eMain entry-point into the library.\u003c/p\u003e\n *\n * \u003cp\u003eOptions represents a collection of {@link Option} objects, which\n * describe the possible options for a command-line.\u003cp\u003e\n *\n * \u003cp\u003eIt may flexibly parse long and short options, with or without\n * values.  Additionally, it may parse only a portion of a commandline,\n * allowing for flexible multi-stage parsing.\u003cp\u003e\n *\n * @see org.apache.commons.cli.CommandLine\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortOpts"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " a map of the options with the character key "
    },
    {
      "type": "field",
      "varNames": [
        "longOpts"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " a map of the options with the long key "
    },
    {
      "type": "field",
      "varNames": [
        "requiredOpts"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " a map of the required options "
    },
    {
      "type": "field",
      "varNames": [
        "optionGroups"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " a map of the option groups "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.Options.Options()",
      "begin_line": 63,
      "end_line": 66,
      "comment": " Construct a new Options descriptor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOptionGroup(org.apache.commons.cli.OptionGroup)",
      "begin_line": 74,
      "end_line": 98,
      "comment": "\n     * Add the specified option group.\n     *\n     * @param group the OptionGroup that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 57)",
        "(line 78,col 9)-(line 81,col 9)",
        "(line 83,col 9)-(line 95,col 9)",
        "(line 97,col 9)-(line 97,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroups()",
      "begin_line": 105,
      "end_line": 108,
      "comment": "\n     * Lists the OptionGroups that are members of this Options instance.\n     * \n     * @return a Collection of OptionGroup instances.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, boolean, java.lang.String)",
      "begin_line": 119,
      "end_line": 124,
      "comment": " \n     * Add an option that only contains a short-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 50)",
        "(line 123,col 9)-(line 123,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 136,
      "end_line": 142,
      "comment": " \n     * Add an option that contains a short-name and a long-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param longOpt Long multi-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 65)",
        "(line 141,col 9)-(line 141,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(org.apache.commons.cli.Option)",
      "begin_line": 150,
      "end_line": 172,
      "comment": "\n     * Adds an option instance\n     *\n     * @param opt the option that is to be added \n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 34)",
        "(line 155,col 9)-(line 158,col 9)",
        "(line 161,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 32)",
        "(line 171,col 9)-(line 171,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptions()",
      "begin_line": 179,
      "end_line": 182,
      "comment": " \n     * Retrieve a read-only list of options in this set\n     *\n     * @return read-only Collection of {@link Option} objects in this descriptor\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.helpOptions()",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * Returns the Options for use by the HelpFormatter.\n     *\n     * @return the List of Options\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getRequiredOptions()",
      "begin_line": 199,
      "end_line": 202,
      "comment": " \n     * Returns the required options.\n     *\n     * @return List of required options\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOption(java.lang.String)",
      "begin_line": 211,
      "end_line": 221,
      "comment": " \n     * Retrieve the {@link Option} matching the long or short name specified.\n     * The leading hyphens in the name are ignored (up to 2).\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return the option represented by opt\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 44)",
        "(line 215,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 220,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasOption(java.lang.String)",
      "begin_line": 231,
      "end_line": 236,
      "comment": " \n     * Returns whether the named {@link Option} is a member\n     * of this {@link Options}.\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return true if the named {@link Option} is a member\n     * of this {@link Options}\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 44)",
        "(line 235,col 9)-(line 235,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroup(org.apache.commons.cli.Option)",
      "begin_line": 246,
      "end_line": 249,
      "comment": " \n     * Returns the OptionGroup the \u003ccode\u003eopt\u003c/code\u003e\n     * belongs to.\n     * @param opt the option whose OptionGroup is being queried.\n     *\n     * @return the OptionGroup if \u003ccode\u003eopt\u003c/code\u003e is part\n     * of an OptionGroup, otherwise return null\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.toString()",
      "begin_line": 256,
      "end_line": 267,
      "comment": " \n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 46)",
        "(line 260,col 9)-(line 260,col 42)",
        "(line 261,col 9)-(line 261,col 41)",
        "(line 262,col 9)-(line 262,col 33)",
        "(line 263,col 9)-(line 263,col 29)",
        "(line 264,col 9)-(line 264,col 25)",
        "(line 266,col 9)-(line 266,col 30)"
      ]
    }
  ]
}