{
  "filepath": "/tmp/Cli-14b/src/java/org/apache/commons/cli2/builder/CommandBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CommandBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 187,
      "comment": "\n * Builds Command instances\n "
    },
    {
      "type": "field",
      "varNames": [
        "preferredName"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " the preferred name of the command "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": " the description of the command "
    },
    {
      "type": "field",
      "varNames": [
        "aliases"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " the aliases of the command "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " whether the command is required or not "
    },
    {
      "type": "field",
      "varNames": [
        "argument"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " the argument of the command "
    },
    {
      "type": "field",
      "varNames": [
        "children"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " the children of the command "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": " the id of the command "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.builder.CommandBuilder.CommandBuilder()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Creates a new \u003ccode\u003eCommandBuilder\u003c/code\u003e instance.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.CommandBuilder.create()",
      "begin_line": 66,
      "end_line": 80,
      "comment": "\n     * Creates a new \u003ccode\u003eCommand\u003c/code\u003e instance using the properties of the\n     * \u003ccode\u003eCommandBuilder\u003c/code\u003e.\n     *\n     * @return the new Command instance\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 70,col 9)",
        "(line 73,col 9)-(line 74,col 95)",
        "(line 77,col 9)-(line 77,col 16)",
        "(line 79,col 9)-(line 79,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.CommandBuilder.reset()",
      "begin_line": 88,
      "end_line": 98,
      "comment": "\n     * Resets the CommandBuilder to the defaults for a new Command.\n     *\n     * This method is called automatically at the end of the\n     * {@link #create() create} method.\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 29)",
        "(line 90,col 9)-(line 90,col 27)",
        "(line 91,col 9)-(line 91,col 32)",
        "(line 92,col 9)-(line 92,col 25)",
        "(line 93,col 9)-(line 93,col 24)",
        "(line 94,col 9)-(line 94,col 24)",
        "(line 95,col 9)-(line 95,col 15)",
        "(line 97,col 9)-(line 97,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.CommandBuilder.withName(java.lang.String)",
      "begin_line": 110,
      "end_line": 118,
      "comment": "\n     * Specifies the name for the next \u003ccode\u003eCommand\u003c/code\u003e\n     * that is created.  The first name is used as the preferred\n     * display name for the \u003ccode\u003eCommand\u003c/code\u003e and then\n     * later names are used as aliases.\n     *\n     * @param name the name for the next \u003ccode\u003eCommand\u003c/code\u003e\n     * that is created.\n     * @return this \u003ccode\u003eCommandBuilder\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.CommandBuilder.withDescription(java.lang.String)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "\n     * Specifies the description for the next \u003ccode\u003eCommand\u003c/code\u003e\n     * that is created.  This description is used to produce\n     * help documentation for the \u003ccode\u003eCommand\u003c/code\u003e.\n     *\n     * @param newDescription the description for the next\n     * \u003ccode\u003eCommand\u003c/code\u003e that is created.\n     * @return this \u003ccode\u003eCommandBuilder\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 42)",
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.CommandBuilder.withRequired(boolean)",
      "begin_line": 142,
      "end_line": 146,
      "comment": "\n     * Specifies whether the next \u003ccode\u003eCommand\u003c/code\u003e created is\n     * required or not.\n     * @param newRequired whether the next \u003ccode\u003eCommand\u003c/code\u003e created is\n     * required or not.\n     * @return this \u003ccode\u003eCommandBuilder\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 36)",
        "(line 145,col 9)-(line 145,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.CommandBuilder.withChildren(org.apache.commons.cli2.Group)",
      "begin_line": 156,
      "end_line": 160,
      "comment": "\n     * Specifies the children for the next \u003ccode\u003eCommand\u003c/code\u003e\n     * that is created.\n     *\n     * @param newChildren the child options for the next \u003ccode\u003eCommand\u003c/code\u003e\n     * that is created.\n     * @return this \u003ccode\u003eCommandBuilder\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 36)",
        "(line 159,col 9)-(line 159,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.CommandBuilder.withArgument(org.apache.commons.cli2.Argument)",
      "begin_line": 170,
      "end_line": 174,
      "comment": "\n     * Specifies the argument for the next \u003ccode\u003eCommand\u003c/code\u003e\n     * that is created.\n     *\n     * @param newArgument the argument for the next \u003ccode\u003eCommand\u003c/code\u003e\n     * that is created.\n     * @return this \u003ccode\u003eCommandBuilder\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 36)",
        "(line 173,col 9)-(line 173,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.CommandBuilder.withId(int)",
      "begin_line": 182,
      "end_line": 186,
      "comment": "\n     * Specifies the id for the next \u003ccode\u003eCommand\u003c/code\u003e that is created.\n     *\n     * @param newId the id for the next \u003ccode\u003eCommand\u003c/code\u003e that is created.\n     * @return this \u003ccode\u003eCommandBuilder\u003c/code\u003e.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 24)",
        "(line 185,col 9)-(line 185,col 20)"
      ]
    }
  ]
}