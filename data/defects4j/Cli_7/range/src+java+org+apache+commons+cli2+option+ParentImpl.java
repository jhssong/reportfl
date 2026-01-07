{
  "filepath": "/tmp/Cli-7b/src/java/org/apache/commons/cli2/option/ParentImpl.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParentImpl",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.cli2.option.OptionImpl",
        "org.apache.commons.cli2.Parent"
      ],
      "begin_line": 38,
      "end_line": 257,
      "comment": "\n * A base implementation of Parent providing limited ground work for further\n * Parent implementations.\n "
    },
    {
      "type": "field",
      "varNames": [
        "NUL"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "children"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "argument"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.option.ParentImpl.ParentImpl(org.apache.commons.cli2.Argument, org.apache.commons.cli2.Group, java.lang.String, int, boolean)",
      "begin_line": 45,
      "end_line": 54,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 28)",
        "(line 51,col 9)-(line 51,col 33)",
        "(line 52,col 9)-(line 52,col 33)",
        "(line 53,col 9)-(line 53,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.process(org.apache.commons.cli2.WriteableCommandLine, java.util.ListIterator)",
      "begin_line": 62,
      "end_line": 78,
      "comment": "\n     * (non-Javadoc)\n     *\n     * @see org.apache.commons.cli2.Option#process(org.apache.commons.cli2.CommandLine,\n     *      java.util.ListIterator)\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 67,col 9)",
        "(line 69,col 9)-(line 69,col 46)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 77,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.canProcess(org.apache.commons.cli2.WriteableCommandLine, java.lang.String)",
      "begin_line": 85,
      "end_line": 104,
      "comment": "\n     * (non-Javadoc)\n     *\n     * @see org.apache.commons.cli2.Option#canProcess(java.lang.String)\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 43)",
        "(line 89,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.getPrefixes()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * (non-Javadoc)\n     *\n     * @see org.apache.commons.cli2.Option#prefixes()\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.validate(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 120,
      "end_line": 131,
      "comment": "\n     * (non-Javadoc)\n     *\n     * @see org.apache.commons.cli2.Option#validate(org.apache.commons.cli2.CommandLine)\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.appendUsage(java.lang.StringBuffer, java.util.Set, java.util.Comparator)",
      "begin_line": 139,
      "end_line": 158,
      "comment": "\n     * (non-Javadoc)\n     *\n     * @see org.apache.commons.cli2.Option#appendUsage(java.lang.StringBuffer,\n     *      java.util.Set, java.util.Comparator)\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 144,col 74)",
        "(line 145,col 9)-(line 147,col 74)",
        "(line 149,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.getDescription()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * @return a description of this parent option\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.helpLines(int, java.util.Set, java.util.Comparator)",
      "begin_line": 173,
      "end_line": 188,
      "comment": "\n     * (non-Javadoc)\n     *\n     * @see org.apache.commons.cli2.Option#helpLines(int, java.util.Set,\n     *      java.util.Comparator)\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 47)",
        "(line 177,col 9)-(line 177,col 53)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.getArgument()",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * @return Returns the argument.\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.getChildren()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * @return Returns the children.\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.handleInitialSeparator(java.util.ListIterator, char)",
      "begin_line": 209,
      "end_line": 231,
      "comment": "\n     * Split the token using the specified separator character.\n     * @param arguments the current position in the arguments iterator\n     * @param separator the separator char to split on\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 61)",
        "(line 215,col 9)-(line 215,col 64)",
        "(line 217,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.findOption(java.lang.String)",
      "begin_line": 236,
      "end_line": 244,
      "comment": "\n     * @see org.apache.commons.cli2.Option#findOption(java.lang.String)\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 55)",
        "(line 239,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.option.ParentImpl.defaults(org.apache.commons.cli2.WriteableCommandLine)",
      "begin_line": 246,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 36)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 255,col 9)"
      ]
    }
  ]
}