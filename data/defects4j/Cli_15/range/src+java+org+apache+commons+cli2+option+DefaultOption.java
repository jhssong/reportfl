{
  "filepath": "/tmp/Cli-15b/src/java/org/apache/commons/cli2/option/DefaultOption.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultOption",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.option.ParentImpl"
      ],
      "begin_line": 38,
      "end_line": 221,
      "comment": "\n * A Parent implementation representing normal options.\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_SHORT_PREFIX"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * The default token used to prefix a short option\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_LONG_PREFIX"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * The default token used to prefix a long option\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_BURST_ENABLED"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * The default value for the burstEnabled constructor parameter\n     "
    },
    {
      "type": "field",
      "varNames": [
        "preferredName"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliases"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "burstAliases"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "triggers"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "prefixes"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortPrefix"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "burstEnabled"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "burstLength"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.DefaultOption.DefaultOption(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.Set, java.util.Set, boolean, org.apache.commons.cli2.Argument, org.apache.commons.cli2.Group, int)",
      "begin_line": 80,
      "end_line": 119,
      "comment": "\n     * Creates a new DefaultOption\n     *\n     * @param shortPrefix the prefix used for short options\n     * @param longPrefix the prefix used for long options\n     * @param burstEnabled should option bursting be enabled\n     * @param preferredName the preferred name for this Option, this should begin with either shortPrefix or longPrefix\n     * @param description a description of this Option\n     * @param aliases the alternative names for this Option\n     * @param burstAliases the aliases that can be burst\n     * @param required whether the Option is strictly required\n     * @param argument the Argument belonging to this Parent, or null\n     * @param children the Group children belonging to this Parent, ot null\n     * @param id the unique identifier for this Option\n     * @throws IllegalArgumentException if the preferredName or an alias isn\u0027t\n     *     prefixed with shortPrefix or longPrefix\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 61)",
        "(line 93,col 9)-(line 93,col 39)",
        "(line 94,col 9)-(line 94,col 41)",
        "(line 96,col 9)-(line 96,col 52)",
        "(line 98,col 9)-(line 98,col 43)",
        "(line 99,col 9)-(line 101,col 82)",
        "(line 103,col 9)-(line 105,col 92)",
        "(line 107,col 9)-(line 107,col 46)",
        "(line 108,col 9)-(line 108,col 39)",
        "(line 109,col 9)-(line 109,col 41)",
        "(line 110,col 9)-(line 110,col 46)",
        "(line 111,col 9)-(line 111,col 65)",
        "(line 113,col 9)-(line 113,col 65)",
        "(line 114,col 9)-(line 114,col 37)",
        "(line 115,col 9)-(line 115,col 36)",
        "(line 116,col 9)-(line 116,col 65)",
        "(line 118,col 9)-(line 118,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.DefaultOption.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)",
      "begin_line": 121,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 126,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.DefaultOption.processParent(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 129,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 58)",
        "(line 134,col 9)-(line 158,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.DefaultOption.getTriggers()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.DefaultOption.getPrefixes()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.DefaultOption.validate(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 169,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 171,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.DefaultOption.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)",
      "begin_line": 179,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 184,col 84)",
        "(line 185,col 9)-(line 185,col 93)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 191,col 9)-(line 191,col 37)",
        "(line 193,col 9)-(line 209,col 9)",
        "(line 211,col 9)-(line 211,col 54)",
        "(line 213,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.DefaultOption.getPreferredName()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 29)"
      ]
    }
  ]
}