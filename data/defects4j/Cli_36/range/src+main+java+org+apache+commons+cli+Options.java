{
  "filepath": "/tmp/Cli-36b/src/main/java/org/apache/commons/cli/Options.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Options",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 44,
      "end_line": 327,
      "comment": "\n * Main entry-point into the library.\n * \u003cp\u003e\n * Options represents a collection of {@link Option} objects, which\n * describe the possible options for a command-line.\n * \u003cp\u003e\n * It may flexibly parse long and short options, with or without\n * values.  Additionally, it may parse only a portion of a commandline,\n * allowing for flexible multi-stage parsing.\n *\n * @see org.apache.commons.cli.CommandLine\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " The serial version UID. "
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
      "begin_line": 58,
      "end_line": 58,
      "comment": " TODO this seems wrong"
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
      "end_line": 88,
      "comment": "\n     * Add the specified option group.\n     *\n     * @param group the OptionGroup that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 74,col 9)",
        "(line 76,col 9)-(line 85,col 9)",
        "(line 87,col 9)-(line 87,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroups()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * Lists the OptionGroups that are members of this Options instance.\n     *\n     * @return a Collection of OptionGroup instances.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, java.lang.String)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * Add an option that only contains a short name.\n     * The option does not take an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 49)",
        "(line 112,col 9)-(line 112,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, boolean, java.lang.String)",
      "begin_line": 124,
      "end_line": 128,
      "comment": "\n     * Add an option that only contains a short-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 50)",
        "(line 127,col 9)-(line 127,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "\n     * Add an option that contains a short-name and a long-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param longOpt Long multi-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 65)",
        "(line 143,col 9)-(line 143,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(org.apache.commons.cli.Option)",
      "begin_line": 152,
      "end_line": 175,
      "comment": "\n     * Adds an option instance\n     *\n     * @param opt the option that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 34)",
        "(line 157,col 9)-(line 160,col 9)",
        "(line 163,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 32)",
        "(line 174,col 9)-(line 174,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptions()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Retrieve a read-only list of options in this set\n     *\n     * @return read-only Collection of {@link Option} objects in this descriptor\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.helpOptions()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Returns the Options for use by the HelpFormatter.\n     *\n     * @return the List of Options\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getRequiredOptions()",
      "begin_line": 202,
      "end_line": 205,
      "comment": "\n     * Returns the required options.\n     *\n     * @return read-only List of required options\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOption(java.lang.String)",
      "begin_line": 214,
      "end_line": 224,
      "comment": "\n     * Retrieve the {@link Option} matching the long or short name specified.\n     * The leading hyphens in the name are ignored (up to 2).\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return the option represented by opt\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 44)",
        "(line 218,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getMatchingOptions(java.lang.String)",
      "begin_line": 233,
      "end_line": 254,
      "comment": "\n     * Returns the options with a long name starting with the name specified.\n     * \n     * @param opt the partial name of the option\n     * @return the options matching the partial name specified, or an empty list if none matches\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 44)",
        "(line 237,col 9)-(line 237,col 60)",
        "(line 240,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasOption(java.lang.String)",
      "begin_line": 262,
      "end_line": 267,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 44)",
        "(line 266,col 9)-(line 266,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasLongOption(java.lang.String)",
      "begin_line": 276,
      "end_line": 281,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt long name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 44)",
        "(line 280,col 9)-(line 280,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasShortOption(java.lang.String)",
      "begin_line": 290,
      "end_line": 295,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt short name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 44)",
        "(line 294,col 9)-(line 294,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroup(org.apache.commons.cli.Option)",
      "begin_line": 304,
      "end_line": 307,
      "comment": "\n     * Returns the OptionGroup the \u003ccode\u003eopt\u003c/code\u003e belongs to.\n     * @param opt the option whose OptionGroup is being queried.\n     *\n     * @return the OptionGroup if \u003ccode\u003eopt\u003c/code\u003e is part\n     * of an OptionGroup, otherwise return null\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.toString()",
      "begin_line": 314,
      "end_line": 326,
      "comment": "\n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 48)",
        "(line 319,col 9)-(line 319,col 42)",
        "(line 320,col 9)-(line 320,col 41)",
        "(line 321,col 9)-(line 321,col 33)",
        "(line 322,col 9)-(line 322,col 29)",
        "(line 323,col 9)-(line 323,col 25)",
        "(line 325,col 9)-(line 325,col 30)"
      ]
    }
  ]
}