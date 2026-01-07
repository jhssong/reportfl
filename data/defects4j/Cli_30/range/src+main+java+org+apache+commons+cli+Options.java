{
  "filepath": "/tmp/Cli-30b/src/main/java/org/apache/commons/cli/Options.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Options",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 46,
      "end_line": 313,
      "comment": "\n * \u003cp\u003eMain entry-point into the library.\u003c/p\u003e\n *\n * \u003cp\u003eOptions represents a collection of {@link Option} objects, which\n * describe the possible options for a command-line.\u003cp\u003e\n *\n * \u003cp\u003eIt may flexibly parse long and short options, with or without\n * values.  Additionally, it may parse only a portion of a commandline,\n * allowing for flexible multi-stage parsing.\u003cp\u003e\n *\n * @see org.apache.commons.cli.CommandLine\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " The serial version UID. "
    },
    {
      "type": "field",
      "varNames": [
        "shortOpts"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " a map of the options with the character key "
    },
    {
      "type": "field",
      "varNames": [
        "longOpts"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " a map of the options with the long key "
    },
    {
      "type": "field",
      "varNames": [
        "requiredOpts"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " a map of the required options "
    },
    {
      "type": "field",
      "varNames": [
        "optionGroups"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " a map of the option groups "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOptionGroup(org.apache.commons.cli.OptionGroup)",
      "begin_line": 69,
      "end_line": 92,
      "comment": "\n     * Add the specified option group.\n     *\n     * @param group the OptionGroup that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 57)",
        "(line 73,col 9)-(line 76,col 9)",
        "(line 78,col 9)-(line 89,col 9)",
        "(line 91,col 9)-(line 91,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroups()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Lists the OptionGroups that are members of this Options instance.\n     *\n     * @return a Collection of OptionGroup instances.\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, boolean, java.lang.String)",
      "begin_line": 113,
      "end_line": 118,
      "comment": "\n     * Add an option that only contains a short-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 50)",
        "(line 117,col 9)-(line 117,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * Add an option that contains a short-name and a long-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param longOpt Long multi-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 65)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(org.apache.commons.cli.Option)",
      "begin_line": 143,
      "end_line": 166,
      "comment": "\n     * Adds an option instance\n     *\n     * @param opt the option that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 34)",
        "(line 148,col 9)-(line 151,col 9)",
        "(line 154,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 32)",
        "(line 165,col 9)-(line 165,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptions()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * Retrieve a read-only list of options in this set\n     *\n     * @return read-only Collection of {@link Option} objects in this descriptor\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.helpOptions()",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * Returns the Options for use by the HelpFormatter.\n     *\n     * @return the List of Options\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getRequiredOptions()",
      "begin_line": 193,
      "end_line": 196,
      "comment": "\n     * Returns the required options.\n     *\n     * @return List of required options\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOption(java.lang.String)",
      "begin_line": 205,
      "end_line": 215,
      "comment": "\n     * Retrieve the {@link Option} matching the long or short name specified.\n     * The leading hyphens in the name are ignored (up to 2).\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return the option represented by opt\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 44)",
        "(line 209,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getMatchingOptions(java.lang.String)",
      "begin_line": 224,
      "end_line": 241,
      "comment": "\n     * Returns the options with a long name starting with the name specified.\n     * \n     * @param opt the partial name of the option\n     * @return the options matching the partial name specified, or an empty list if none matches\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 44)",
        "(line 228,col 9)-(line 228,col 44)",
        "(line 230,col 9)-(line 230,col 51)",
        "(line 231,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasOption(java.lang.String)",
      "begin_line": 249,
      "end_line": 254,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 44)",
        "(line 253,col 9)-(line 253,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasLongOption(java.lang.String)",
      "begin_line": 263,
      "end_line": 268,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt long name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 44)",
        "(line 267,col 9)-(line 267,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasShortOption(java.lang.String)",
      "begin_line": 277,
      "end_line": 282,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt short name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 44)",
        "(line 281,col 9)-(line 281,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroup(org.apache.commons.cli.Option)",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n     * Returns the OptionGroup the \u003ccode\u003eopt\u003c/code\u003e belongs to.\n     * @param opt the option whose OptionGroup is being queried.\n     *\n     * @return the OptionGroup if \u003ccode\u003eopt\u003c/code\u003e is part\n     * of an OptionGroup, otherwise return null\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.toString()",
      "begin_line": 301,
      "end_line": 312,
      "comment": "\n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 46)",
        "(line 305,col 9)-(line 305,col 42)",
        "(line 306,col 9)-(line 306,col 41)",
        "(line 307,col 9)-(line 307,col 33)",
        "(line 308,col 9)-(line 308,col 29)",
        "(line 309,col 9)-(line 309,col 25)",
        "(line 311,col 9)-(line 311,col 30)"
      ]
    }
  ]
}