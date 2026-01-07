{
  "filepath": "/tmp/Cli-21b/src/java/org/apache/commons/cli2/builder/GroupBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GroupBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 132,
      "comment": "\n * Builds Group instances\n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minimum"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.GroupBuilder()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Creates a new GroupBuilder\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.create()",
      "begin_line": 49,
      "end_line": 56,
      "comment": "\n     * Creates a new Group instance\n     * @return the new Group instance\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 51,col 82)",
        "(line 53,col 9)-(line 53,col 16)",
        "(line 55,col 9)-(line 55,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.reset()",
      "begin_line": 61,
      "end_line": 69,
      "comment": "\n     * Resets the builder\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 20)",
        "(line 63,col 9)-(line 63,col 27)",
        "(line 64,col 9)-(line 64,col 34)",
        "(line 65,col 9)-(line 65,col 20)",
        "(line 66,col 9)-(line 66,col 36)",
        "(line 67,col 9)-(line 67,col 24)",
        "(line 68,col 9)-(line 68,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.withDescription(java.lang.String)",
      "begin_line": 76,
      "end_line": 79,
      "comment": "\n     * Use this option description\n     * @param newDescription the description to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 42)",
        "(line 78,col 9)-(line 78,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.withName(java.lang.String)",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * Use this option name\n     * @param newName the name to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 28)",
        "(line 88,col 9)-(line 88,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.withMinimum(int)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * A valid group requires at least this many options present\n     * @param newMinimum the minimum Options required\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 34)",
        "(line 98,col 9)-(line 98,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.withMaximum(int)",
      "begin_line": 106,
      "end_line": 109,
      "comment": "\n     * A valid group requires at most this many options present\n     * @param newMaximum the maximum Options allowed\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 34)",
        "(line 108,col 9)-(line 108,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.withOption(org.apache.commons.cli2.Option)",
      "begin_line": 116,
      "end_line": 119,
      "comment": "\n     * Add this option to the group\n     * @param option the Option to add\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 33)",
        "(line 118,col 9)-(line 118,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.withRequired(boolean)",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * Sets the required flag. This flag is evaluated for groups that are\n     * added to other groups as child groups. If set to \u003cb\u003etrue\u003c/b\u003e the\n     * minimum and maximum constraints of the child group are always evaluated.\n     * @param newRequired the required flag\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 36)",
        "(line 130,col 9)-(line 130,col 20)"
      ]
    }
  ]
}