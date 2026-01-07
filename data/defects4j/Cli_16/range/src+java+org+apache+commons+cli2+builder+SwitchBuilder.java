{
  "filepath": "/tmp/Cli-16b/src/java/org/apache/commons/cli2/builder/SwitchBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SwitchBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 194,
      "comment": "\n * Builds Switch instance.\n "
    },
    {
      "type": "field",
      "varNames": [
        "enabledPrefix"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "disabledPrefix"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "preferredName"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "aliases"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "argument"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "children"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "switchDefault"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.builder.SwitchBuilder.SwitchBuilder()",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Creates a new SwitchBuilder using defaults.\n     * @see Switch#DEFAULT_ENABLED_PREFIX\n     * @see Switch#DEFAULT_DISABLED_PREFIX\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.builder.SwitchBuilder.SwitchBuilder(java.lang.String, java.lang.String)",
      "begin_line": 59,
      "end_line": 77,
      "comment": "\n     * Creates a new SwitchBuilder\n     * @param enabledPrefix the prefix to use for enabling the option\n     * @param disabledPrefix the prefix to use for disabling the option\n     * @throws IllegalArgumentException if either prefix is less than 1\n     *                                  character long or the prefixes match\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 64,col 9)",
        "(line 66,col 9)-(line 68,col 9)",
        "(line 70,col 9)-(line 72,col 9)",
        "(line 74,col 9)-(line 74,col 43)",
        "(line 75,col 9)-(line 75,col 45)",
        "(line 76,col 9)-(line 76,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.SwitchBuilder.create()",
      "begin_line": 83,
      "end_line": 91,
      "comment": "\n     * Creates a new Switch instance\n     * @return a new Switch instance\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 86,col 72)",
        "(line 88,col 9)-(line 88,col 16)",
        "(line 90,col 9)-(line 90,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.SwitchBuilder.reset()",
      "begin_line": 96,
      "end_line": 107,
      "comment": "\n     * Resets the builder\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 27)",
        "(line 98,col 9)-(line 98,col 29)",
        "(line 99,col 9)-(line 99,col 25)",
        "(line 100,col 9)-(line 100,col 32)",
        "(line 101,col 9)-(line 101,col 24)",
        "(line 102,col 9)-(line 102,col 24)",
        "(line 103,col 9)-(line 103,col 15)",
        "(line 104,col 9)-(line 104,col 29)",
        "(line 106,col 9)-(line 106,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.SwitchBuilder.withDescription(java.lang.String)",
      "begin_line": 114,
      "end_line": 118,
      "comment": "\n     * Use this option description\n     * @param newDescription the description to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 42)",
        "(line 117,col 9)-(line 117,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.SwitchBuilder.withName(java.lang.String)",
      "begin_line": 127,
      "end_line": 135,
      "comment": "\n     * Use this option name. The first name is used as the preferred\n     * display name for the Command and then later names are used as aliases.\n     *\n     * @param name the name to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 132,col 9)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.SwitchBuilder.withRequired(boolean)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n     * Use this optionality\n     * @param newRequired true iff the Option is required\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 36)",
        "(line 145,col 9)-(line 145,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.SwitchBuilder.withArgument(org.apache.commons.cli2.Argument)",
      "begin_line": 153,
      "end_line": 157,
      "comment": "\n     * Use this Argument\n     * @param newArgument the argument to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 36)",
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.SwitchBuilder.withChildren(org.apache.commons.cli2.Group)",
      "begin_line": 164,
      "end_line": 168,
      "comment": "\n     * Use this child Group\n     * @param newChildren the child Group to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 36)",
        "(line 167,col 9)-(line 167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.SwitchBuilder.withId(int)",
      "begin_line": 177,
      "end_line": 181,
      "comment": "\n     * Sets the id\n     *\n     * @param newId\n     *            the id of the Switch\n     * @return this SwitchBuilder\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 24)",
        "(line 180,col 9)-(line 180,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.SwitchBuilder.withSwitchDefault(java.lang.Boolean)",
      "begin_line": 189,
      "end_line": 193,
      "comment": "\n     * Sets the default state for this switch\n     *\n     * @param newSwitchDefault the default state\n     * @return this SwitchBuilder\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 46)",
        "(line 192,col 9)-(line 192,col 20)"
      ]
    }
  ]
}