{
  "filepath": "/tmp/Cli-38b/src/main/java/org/apache/commons/cli/Options.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Options",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 43,
      "end_line": 367,
      "comment": "\n * Main entry-point into the library.\n * \u003cp\u003e\n * Options represents a collection of {@link Option} objects, which\n * describe the possible options for a command-line.\n * \u003cp\u003e\n * It may flexibly parse long and short options, with or without\n * values.  Additionally, it may parse only a portion of a commandline,\n * allowing for flexible multi-stage parsing.\n *\n * @see org.apache.commons.cli.CommandLine\n *\n * @version $Id$\n "
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
        "shortOpts"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " a map of the options with the character key "
    },
    {
      "type": "field",
      "varNames": [
        "longOpts"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " a map of the options with the long key "
    },
    {
      "type": "field",
      "varNames": [
        "requiredOpts"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " TODO this seems wrong"
    },
    {
      "type": "field",
      "varNames": [
        "optionGroups"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " a map of the option groups "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOptionGroup(org.apache.commons.cli.OptionGroup)",
      "begin_line": 68,
      "end_line": 87,
      "comment": "\n     * Add the specified option group.\n     *\n     * @param group the OptionGroup that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 84,col 9)",
        "(line 86,col 9)-(line 86,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroups()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * Lists the OptionGroups that are members of this Options instance.\n     *\n     * @return a Collection of OptionGroup instances.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, java.lang.String)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n     * Add an option that only contains a short name.\n     * \n     * \u003cp\u003e\n     * The option does not take an argument.\n     * \u003c/p\u003e\n     *\n     * @param opt Short single-character name of the option.\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 49)",
        "(line 114,col 9)-(line 114,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, boolean, java.lang.String)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "\n     * Add an option that only contains a short-name.\n     *\n     * \u003cp\u003e\n     * It may be specified as requiring an argument.\n     * \u003c/p\u003e\n     *\n     * @param opt Short single-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 50)",
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 148,
      "end_line": 152,
      "comment": "\n     * Add an option that contains a short-name and a long-name.\n     *\n     * \u003cp\u003e\n     * It may be specified as requiring an argument.\n     * \u003c/p\u003e\n     *\n     * @param opt Short single-character name of the option.\n     * @param longOpt Long multi-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 65)",
        "(line 151,col 9)-(line 151,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addRequiredOption(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 176,
      "end_line": 182,
      "comment": "\n     * Add an option that contains a short-name and a long-name.\n     * \n     * \u003cp\u003e\n     * The added option is set as required. It may be specified as requiring an argument. This method is a shortcut for:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * Options option \u003d new Option(opt, longOpt, hasArg, description);\n     * option.setRequired(true);\n     * options.add(option);\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @param opt Short single-character name of the option.\n     * @param longOpt Long multi-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 70)",
        "(line 179,col 9)-(line 179,col 33)",
        "(line 180,col 9)-(line 180,col 26)",
        "(line 181,col 9)-(line 181,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(org.apache.commons.cli.Option)",
      "begin_line": 190,
      "end_line": 213,
      "comment": "\n     * Adds an option instance\n     *\n     * @param opt the option that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 34)",
        "(line 195,col 9)-(line 198,col 9)",
        "(line 201,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 32)",
        "(line 212,col 9)-(line 212,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptions()",
      "begin_line": 220,
      "end_line": 223,
      "comment": "\n     * Retrieve a read-only list of options in this set\n     *\n     * @return read-only Collection of {@link Option} objects in this descriptor\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.helpOptions()",
      "begin_line": 230,
      "end_line": 233,
      "comment": "\n     * Returns the Options for use by the HelpFormatter.\n     *\n     * @return the List of Options\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getRequiredOptions()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * Returns the required options.\n     *\n     * @return read-only List of required options\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOption(java.lang.String)",
      "begin_line": 255,
      "end_line": 265,
      "comment": "\n     * Retrieve the {@link Option} matching the long or short name specified.\n     *\n     * \u003cp\u003e\n     * The leading hyphens in the name are ignored (up to 2).\n     * \u003c/p\u003e\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return the option represented by opt\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 44)",
        "(line 259,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 264,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getMatchingOptions(java.lang.String)",
      "begin_line": 274,
      "end_line": 295,
      "comment": "\n     * Returns the options with a long name starting with the name specified.\n     * \n     * @param opt the partial name of the option\n     * @return the options matching the partial name specified, or an empty list if none matches\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 44)",
        "(line 278,col 9)-(line 278,col 60)",
        "(line 281,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 294,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasOption(java.lang.String)",
      "begin_line": 303,
      "end_line": 308,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 44)",
        "(line 307,col 9)-(line 307,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasLongOption(java.lang.String)",
      "begin_line": 317,
      "end_line": 322,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt long name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 44)",
        "(line 321,col 9)-(line 321,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasShortOption(java.lang.String)",
      "begin_line": 331,
      "end_line": 336,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt short name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 44)",
        "(line 335,col 9)-(line 335,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroup(org.apache.commons.cli.Option)",
      "begin_line": 344,
      "end_line": 347,
      "comment": "\n     * Returns the OptionGroup the \u003ccode\u003eopt\u003c/code\u003e belongs to.\n     *\n     * @param opt the option whose OptionGroup is being queried.\n     * @return the OptionGroup if \u003ccode\u003eopt\u003c/code\u003e is part of an OptionGroup, otherwise return null\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.toString()",
      "begin_line": 354,
      "end_line": 366,
      "comment": "\n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 48)",
        "(line 359,col 9)-(line 359,col 42)",
        "(line 360,col 9)-(line 360,col 41)",
        "(line 361,col 9)-(line 361,col 33)",
        "(line 362,col 9)-(line 362,col 29)",
        "(line 363,col 9)-(line 363,col 25)",
        "(line 365,col 9)-(line 365,col 30)"
      ]
    }
  ]
}