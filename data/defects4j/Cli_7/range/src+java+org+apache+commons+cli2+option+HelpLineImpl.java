{
  "filepath": "/tmp/Cli-7b/src/java/org/apache/commons/cli2/option/HelpLineImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "HelpLineImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.HelpLine"
      ],
      "begin_line": 28,
      "end_line": 110,
      "comment": "\n * Represents a line in the help screen.\n "
    },
    {
      "type": "field",
      "varNames": [
        "option"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " The option that this HelpLineImpl describes "
    },
    {
      "type": "field",
      "varNames": [
        "indent"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The level of indenting for this item "
    },
    {
      "type": "field",
      "varNames": [
        "cachedHelpSettings"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " The help settings used to obtain the previous usage "
    },
    {
      "type": "field",
      "varNames": [
        "cachedComparator"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " The comparator used to obtain the previous usage "
    },
    {
      "type": "field",
      "varNames": [
        "cachedUsage"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " The previously obtained usage "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.HelpLineImpl.HelpLineImpl(org.apache.commons.cli2.Option, int)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * Creates a new HelpLineImpl to represent a particular Option in the online\n     * help.\n     * \n     * @param option\n     *            Option that the HelpLineImpl describes\n     * @param indent\n     *            Level of indentation for this line\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 29)",
        "(line 56,col 9)-(line 56,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.HelpLineImpl.getDescription()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * @return The description of the option\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.HelpLineImpl.getIndent()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * @return The level of indentation for this line\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.HelpLineImpl.getOption()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * @return The Option that the help line relates to\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.HelpLineImpl.usage(java.util.Set, java.util.Comparator)",
      "begin_line": 89,
      "end_line": 109,
      "comment": "\n     * Builds a usage string for the option using the specified settings and \n     * comparator.\n     * \n     *  \n     * @param helpSettings the settings to apply\n     * @param comparator a comparator to sort options when applicable\n     * @return the usage string\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 27)"
      ]
    }
  ]
}