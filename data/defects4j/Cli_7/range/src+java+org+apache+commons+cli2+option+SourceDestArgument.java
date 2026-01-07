{
  "filepath": "/tmp/Cli-7b/src/java/org/apache/commons/cli2/option/SourceDestArgument.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SourceDestArgument",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.option.ArgumentImpl"
      ],
      "begin_line": 38,
      "end_line": 138,
      "comment": "\n * An Argument implementation that allows a variable size Argument to precede a\n * fixed size argument.  The canonical example of it\u0027s use is in the unix\n * \u003ccode\u003ecp\u003c/code\u003e command where a number of source can be specified with\n * exactly one destination specfied at the end.\n "
    },
    {
      "type": "field",
      "varNames": [
        "source"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dest"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.SourceDestArgument.SourceDestArgument(org.apache.commons.cli2.Argument, org.apache.commons.cli2.Argument)",
      "begin_line": 49,
      "end_line": 53,
      "comment": "\n     * Creates a SourceDestArgument using defaults where possible.\n     *\n     * @param source the variable size Argument\n     * @param dest the fixed size Argument\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 52,col 46)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.SourceDestArgument.SourceDestArgument(org.apache.commons.cli2.Argument, org.apache.commons.cli2.Argument, char, char, java.lang.String, java.util.List)",
      "begin_line": 65,
      "end_line": 81,
      "comment": "\n     * Creates a SourceDestArgument using the specified parameters.\n     *\n     * @param source the variable size Argument\n     * @param dest the fixed size Argument\n     * @param initialSeparator the inistial separator to use\n     * @param subsequentSeparator the subsequent separator to use\n     * @param consumeRemaining the token triggering consume remaining behaviour\n     * @param defaultValues the default values for the SourceDestArgument\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 56)",
        "(line 75,col 9)-(line 75,col 29)",
        "(line 76,col 9)-(line 76,col 25)",
        "(line 78,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.SourceDestArgument.sum(int, int)",
      "begin_line": 83,
      "end_line": 86,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.SourceDestArgument.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)",
      "begin_line": 88,
      "end_line": 100,
      "comment": "",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 43)",
        "(line 93,col 9)-(line 93,col 55)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 99,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.SourceDestArgument.helpLines(int, java.util.Set, java.util.Comparator)",
      "begin_line": 102,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 47)",
        "(line 106,col 9)-(line 106,col 70)",
        "(line 107,col 9)-(line 107,col 68)",
        "(line 109,col 9)-(line 109,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.SourceDestArgument.validate(org.apache.commons.cli2.WriteableCommandLine, org.apache.commons.cli2.Option)",
      "begin_line": 112,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 58)",
        "(line 117,col 9)-(line 117,col 60)",
        "(line 118,col 9)-(line 118,col 22)",
        "(line 120,col 9)-(line 120,col 45)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 128,col 9)",
        "(line 130,col 9)-(line 130,col 45)",
        "(line 131,col 9)-(line 131,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.SourceDestArgument.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)",
      "begin_line": 134,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 88)"
      ]
    }
  ]
}