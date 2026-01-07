{
  "filepath": "/tmp/Cli-8b/src/java/org/apache/commons/cli/Options.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Options",
      "is_interface": false,
      "parent_types": [
        "java.io.Serializable"
      ],
      "begin_line": 44,
      "end_line": 281,
      "comment": " \u003cp\u003eMain entry-point into the library.\u003c/p\u003e\n *\n * \u003cp\u003eOptions represents a collection of {@link Option} objects, which\n * describe the possible options for a command-line.\u003cp\u003e\n *\n * \u003cp\u003eIt may flexibly parse long and short options, with or without\n * values.  Additionally, it may parse only a portion of a commandline,\n * allowing for flexible multi-stage parsing.\u003cp\u003e\n *\n * @see org.apache.commons.cli.CommandLine\n *\n * @author bob mcwhirter (bob @ werken.com)\n * @author \u003ca href\u003d\"mailto:jstrachan@apache.org\"\u003eJames Strachan\u003c/a\u003e\n * @version $Revision$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
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
      "begin_line": 55,
      "end_line": 55,
      "comment": " a map of the required options "
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
      "type": "constructor",
      "signature": "org.apache.commons.cli.Options.Options()",
      "begin_line": 62,
      "end_line": 65,
      "comment": " Construct a new Options descriptor\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOptionGroup(org.apache.commons.cli.OptionGroup)",
      "begin_line": 73,
      "end_line": 97,
      "comment": "\n     * Add the specified option group.\n     *\n     * @param group the OptionGroup that is to be added\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 57)",
        "(line 77,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroups()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * Lists the OptionGroups that are members of this Options instance.\n     * @return a Collection of OptionGroup instances.\n     ",
      "child_ranges": [
        "(line 104,col 6)-(line 104,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, boolean, java.lang.String)",
      "begin_line": 116,
      "end_line": 121,
      "comment": " \n     * Add an option that only contains a short-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 50)",
        "(line 120,col 9)-(line 120,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(java.lang.String, java.lang.String, boolean, java.lang.String)",
      "begin_line": 133,
      "end_line": 139,
      "comment": " \n     * Add an option that contains a short-name and a long-name.\n     * It may be specified as requiring an argument.\n     *\n     * @param opt Short single-character name of the option.\n     * @param longOpt Long multi-character name of the option.\n     * @param hasArg flag signally if an argument is required after this option\n     * @param description Self-documenting description\n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 65)",
        "(line 138,col 9)-(line 138,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.addOption(org.apache.commons.cli.Option)",
      "begin_line": 147,
      "end_line": 169,
      "comment": "\n     * Adds an option instance\n     *\n     * @param opt the option that is to be added \n     * @return the resulting Options instance\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 34)",
        "(line 152,col 9)-(line 155,col 9)",
        "(line 158,col 9)-(line 164,col 9)",
        "(line 166,col 9)-(line 166,col 32)",
        "(line 168,col 9)-(line 168,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptions()",
      "begin_line": 176,
      "end_line": 179,
      "comment": " \n     * Retrieve a read-only list of options in this set\n     *\n     * @return read-only Collection of {@link Option} objects in this descriptor\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.helpOptions()",
      "begin_line": 186,
      "end_line": 205,
      "comment": "\n     * Returns the Options for use by the HelpFormatter.\n     *\n     * @return the List of Options\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 54)",
        "(line 192,col 9)-(line 192,col 53)",
        "(line 194,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getRequiredOptions()",
      "begin_line": 213,
      "end_line": 216,
      "comment": " \n     * Returns the required options as a\n     * \u003ccode\u003ejava.util.Collection\u003c/code\u003e.\n     *\n     * @return Collection of required options\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOption(java.lang.String)",
      "begin_line": 224,
      "end_line": 234,
      "comment": " \n     * Retrieve the named {@link Option}\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return the option represented by opt\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 44)",
        "(line 228,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 233,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.hasOption(java.lang.String)",
      "begin_line": 244,
      "end_line": 249,
      "comment": " \n     * Returns whether the named {@link Option} is a member\n     * of this {@link Options}.\n     *\n     * @param opt short or long name of the {@link Option}\n     * @return true if the named {@link Option} is a member\n     * of this {@link Options}\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 44)",
        "(line 248,col 9)-(line 248,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.getOptionGroup(org.apache.commons.cli.Option)",
      "begin_line": 259,
      "end_line": 262,
      "comment": " \n     * Returns the OptionGroup the \u003ccode\u003eopt\u003c/code\u003e\n     * belongs to.\n     * @param opt the option whose OptionGroup is being queried.\n     *\n     * @return the OptionGroup if \u003ccode\u003eopt\u003c/code\u003e is part\n     * of an OptionGroup, otherwise return null\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.Options.toString()",
      "begin_line": 269,
      "end_line": 280,
      "comment": " \n     * Dump state, suitable for debugging.\n     *\n     * @return Stringified form of this object\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 46)",
        "(line 273,col 9)-(line 273,col 42)",
        "(line 274,col 9)-(line 274,col 41)",
        "(line 275,col 9)-(line 275,col 33)",
        "(line 276,col 9)-(line 276,col 29)",
        "(line 277,col 9)-(line 277,col 25)",
        "(line 279,col 9)-(line 279,col 30)"
      ]
    }
  ]
}