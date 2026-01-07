{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/Options.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Options",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 41,
      "end_line": 365,
      "comment": "\n * Main entry-point into the library.\n * \u003cp\u003e\n * Options represents a collection of {@link Option} objects, which\n * describe the possible options for a command-line.\n * \u003cp\u003e\n * It may flexibly parse long and short options, with or without\n * values.  Additionally, it may parse only a portion of a commandline,\n * allowing for flexible multi-stage parsing.\n *\n * @see org.apache.commons.cli.CommandLine\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " The serial version UID. "
    },
    {
      "type": "field",
      "varNames": [
        "shortOpts"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " a map of the options with the character key "
    },
    {
      "type": "field",
      "varNames": [
        "longOpts"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " a map of the options with the long key "
    },
    {
      "type": "field",
      "varNames": [
        "requiredOpts"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " TODO this seems wrong"
    },
    {
      "type": "field",
      "varNames": [
        "optionGroups"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " a map of the option groups "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOptionGroup(org.apache.commons.cli.OptionGroup)",
      "begin_line": 66,
      "end_line": 85,
      "comment": "\n     * Add the specified option group.\n     *\n     * @param group the OptionGroup that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 71,col 9)",
        "(line 73,col 9)-(line 82,col 9)",
        "(line 84,col 9)-(line 84,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroups()",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Lists the OptionGroups that are members of this Options instance.\n     *\n     * @return a Collection of OptionGroup instances.\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, java.lang.String)",
      "begin_line": 109,
      "end_line": 113,
      "comment": "\n     * Add an option that only contains a short name.\n     * \n     * \u003cp\u003e\n     * The option does not take an argument.\n     * \u003c/p\u003e\n     *\n     * @param opt Short single-character name of the option.\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 49)",
        "(line 112,col 9)-(line 112,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, boolean, java.lang.String)",
      "begin_line": 127,
      "end_line": 131,
      "comment": "\n     * Add an option that only contains a short-name.\n     *\n     * \u003cp\u003e\n     * It may be specified as requiring an argument.\n     * \u003c/p\u003e\n     *\n     * @param opt Short single-character name of the option.\n     * @param hasArg flag signalling if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 50)",
        "(line 130,col 9)-(line 130,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 146,
      "end_line": 150,
      "comment": "\n     * Add an option that contains a short-name and a long-name.\n     *\n     * \u003cp\u003e\n     * It may be specified as requiring an argument.\n     * \u003c/p\u003e\n     *\n     * @param opt Short single-character name of the option.\n     * @param longOpt Long multi-character name of the option.\n     * @param hasArg flag signalling if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 65)",
        "(line 149,col 9)-(line 149,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addRequiredOption(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 174,
      "end_line": 180,
      "comment": "\n     * Add an option that contains a short-name and a long-name.\n     * \n     * \u003cp\u003e\n     * The added option is set as required. It may be specified as requiring an argument. This method is a shortcut for:\n     * \u003c/p\u003e\n     *\n     * \u003cpre\u003e\n     * \u003ccode\u003e\n     * Options option \u003d new Option(opt, longOpt, hasArg, description);\n     * option.setRequired(true);\n     * options.add(option);\n     * \u003c/code\u003e\n     * \u003c/pre\u003e\n     *\n     * @param opt Short single-character name of the option.\n     * @param longOpt Long multi-character name of the option.\n     * @param hasArg flag signalling if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 76)",
        "(line 177,col 9)-(line 177,col 33)",
        "(line 178,col 9)-(line 178,col 26)",
        "(line 179,col 9)-(line 179,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(org.apache.commons.cli.Option)",
      "begin_line": 188,
      "end_line": 211,
      "comment": "\n     * Adds an option instance\n     *\n     * @param opt the option that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 40)",
        "(line 193,col 9)-(line 196,col 9)",
        "(line 199,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 32)",
        "(line 210,col 9)-(line 210,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptions()",
      "begin_line": 218,
      "end_line": 221,
      "comment": "\n     * Retrieve a read-only list of options in this set\n     *\n     * @return read-only Collection of {@link Option} objects in this descriptor\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.helpOptions()",
      "begin_line": 228,
      "end_line": 231,
      "comment": "\n     * Returns the Options for use by the HelpFormatter.\n     *\n     * @return the List of Options\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getRequiredOptions()",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\n     * Returns the required options.\n     *\n     * @return read-only List of required options\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOption(java.lang.String)",
      "begin_line": 253,
      "end_line": 263,
      "comment": "\n     * Retrieve the {@link Option} matching the long or short name specified.\n     *\n     * \u003cp\u003e\n     * The leading hyphens in the name are ignored (up to 2).\n     * \u003c/p\u003e\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return the option represented by opt\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 44)",
        "(line 257,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getMatchingOptions(java.lang.String)",
      "begin_line": 272,
      "end_line": 293,
      "comment": "\n     * Returns the options with a long name starting with the name specified.\n     * \n     * @param opt the partial name of the option\n     * @return the options matching the partial name specified, or an empty list if none matches\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 44)",
        "(line 276,col 9)-(line 276,col 66)",
        "(line 279,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 292,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasOption(java.lang.String)",
      "begin_line": 301,
      "end_line": 306,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 44)",
        "(line 305,col 9)-(line 305,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasLongOption(java.lang.String)",
      "begin_line": 315,
      "end_line": 320,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt long name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 44)",
        "(line 319,col 9)-(line 319,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasShortOption(java.lang.String)",
      "begin_line": 329,
      "end_line": 334,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt short name of the {@link Option}\n     * @return true if the named {@link Option} is a member of this {@link Options}\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 44)",
        "(line 333,col 9)-(line 333,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroup(org.apache.commons.cli.Option)",
      "begin_line": 342,
      "end_line": 345,
      "comment": "\n     * Returns the OptionGroup the \u003ccode\u003eopt\u003c/code\u003e belongs to.\n     *\n     * @param opt the option whose OptionGroup is being queried.\n     * @return the OptionGroup if \u003ccode\u003eopt\u003c/code\u003e is part of an OptionGroup, otherwise return null\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.toString()",
      "begin_line": 352,
      "end_line": 364,
      "comment": "\n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 54)",
        "(line 357,col 9)-(line 357,col 42)",
        "(line 358,col 9)-(line 358,col 41)",
        "(line 359,col 9)-(line 359,col 33)",
        "(line 360,col 9)-(line 360,col 29)",
        "(line 361,col 9)-(line 361,col 25)",
        "(line 363,col 9)-(line 363,col 30)"
      ]
    }
  ]
}