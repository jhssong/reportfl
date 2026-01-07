{
  "filepath": "/tmp/Cli-14b/src/java/org/apache/commons/cli2/builder/GroupBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GroupBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 118,
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
      "type": "constructor",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.GroupBuilder()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Creates a new GroupBuilder\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.create()",
      "begin_line": 48,
      "end_line": 55,
      "comment": "\n     * Creates a new Group instance\n     * @return the new Group instance\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 50,col 72)",
        "(line 52,col 9)-(line 52,col 16)",
        "(line 54,col 9)-(line 54,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.reset()",
      "begin_line": 60,
      "end_line": 67,
      "comment": "\n     * Resets the builder\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 20)",
        "(line 62,col 9)-(line 62,col 27)",
        "(line 63,col 9)-(line 63,col 34)",
        "(line 64,col 9)-(line 64,col 20)",
        "(line 65,col 9)-(line 65,col 36)",
        "(line 66,col 9)-(line 66,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.withDescription(java.lang.String)",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Use this option description\n     * @param newDescription the description to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 42)",
        "(line 76,col 9)-(line 76,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.withName(java.lang.String)",
      "begin_line": 84,
      "end_line": 87,
      "comment": "\n     * Use this option name\n     * @param newName the name to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 28)",
        "(line 86,col 9)-(line 86,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.withMinimum(int)",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * A valid group requires at least this many options present\n     * @param newMinimum the minimum Options required\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 34)",
        "(line 96,col 9)-(line 96,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.withMaximum(int)",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * A valid group requires at most this many options present\n     * @param newMaximum the maximum Options allowed\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 34)",
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.GroupBuilder.withOption(org.apache.commons.cli2.Option)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Add this option to the group\n     * @param option the Option to add\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 33)",
        "(line 116,col 9)-(line 116,col 20)"
      ]
    }
  ]
}