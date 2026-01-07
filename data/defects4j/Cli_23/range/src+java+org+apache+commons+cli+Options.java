{
  "filepath": "/tmp/Cli-23b/src/java/org/apache/commons/cli/Options.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Options",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 46,
      "end_line": 259,
      "comment": "\n * \u003cp\u003eMain entry-point into the library.\u003c/p\u003e\n *\n * \u003cp\u003eOptions represents a collection of {@link Option} objects, which\n * describe the possible options for a command-line.\u003cp\u003e\n *\n * \u003cp\u003eIt may flexibly parse long and short options, with or without\n * values.  Additionally, it may parse only a portion of a commandline,\n * allowing for flexible multi-stage parsing.\u003cp\u003e\n *\n * @see org.apache.commons.cli.CommandLine\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @version $Revision$, $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortOpts"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " a map of the options with the character key "
    },
    {
      "type": "field",
      "varNames": [
        "longOpts"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " a map of the options with the long key "
    },
    {
      "type": "field",
      "varNames": [
        "requiredOpts"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": " a map of the required options "
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
      "end_line": 91,
      "comment": "\n     * Add the specified option group.\n     *\n     * @param group the OptionGroup that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 57)",
        "(line 72,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 88,col 9)",
        "(line 90,col 9)-(line 90,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroups()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "\n     * Lists the OptionGroups that are members of this Options instance.\n     *\n     * @return a Collection of OptionGroup instances.\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, boolean, java.lang.String)",
      "begin_line": 112,
      "end_line": 117,
      "comment": "\n     * Add an option that only contains a short-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 50)",
        "(line 116,col 9)-(line 116,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\n     * Add an option that contains a short-name and a long-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param longOpt Long multi-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 65)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(org.apache.commons.cli.Option)",
      "begin_line": 142,
      "end_line": 165,
      "comment": "\n     * Adds an option instance\n     *\n     * @param opt the option that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 34)",
        "(line 147,col 9)-(line 150,col 9)",
        "(line 153,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 162,col 32)",
        "(line 164,col 9)-(line 164,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptions()",
      "begin_line": 172,
      "end_line": 175,
      "comment": "\n     * Retrieve a read-only list of options in this set\n     *\n     * @return read-only Collection of {@link Option} objects in this descriptor\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.helpOptions()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * Returns the Options for use by the HelpFormatter.\n     *\n     * @return the List of Options\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getRequiredOptions()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * Returns the required options.\n     *\n     * @return List of required options\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOption(java.lang.String)",
      "begin_line": 204,
      "end_line": 214,
      "comment": "\n     * Retrieve the {@link Option} matching the long or short name specified.\n     * The leading hyphens in the name are ignored (up to 2).\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return the option represented by opt\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 44)",
        "(line 208,col 9)-(line 211,col 9)",
        "(line 213,col 9)-(line 213,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasOption(java.lang.String)",
      "begin_line": 223,
      "end_line": 228,
      "comment": "\n     * Returns whether the named {@link Option} is a member of this {@link Options}.\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return true if the named {@link Option} is a member\n     * of this {@link Options}\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 44)",
        "(line 227,col 9)-(line 227,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroup(org.apache.commons.cli.Option)",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * Returns the OptionGroup the \u003ccode\u003eopt\u003c/code\u003e belongs to.\n     * @param opt the option whose OptionGroup is being queried.\n     *\n     * @return the OptionGroup if \u003ccode\u003eopt\u003c/code\u003e is part\n     * of an OptionGroup, otherwise return null\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.toString()",
      "begin_line": 247,
      "end_line": 258,
      "comment": "\n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 46)",
        "(line 251,col 9)-(line 251,col 42)",
        "(line 252,col 9)-(line 252,col 41)",
        "(line 253,col 9)-(line 253,col 33)",
        "(line 254,col 9)-(line 254,col 29)",
        "(line 255,col 9)-(line 255,col 25)",
        "(line 257,col 9)-(line 257,col 30)"
      ]
    }
  ]
}