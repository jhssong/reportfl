{
  "filepath": "/tmp/Cli-13b/src/java/org/apache/commons/cli2/builder/DefaultOptionBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DefaultOptionBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 215,
      "comment": "\n * Builds DefaultOption instances.\n "
    },
    {
      "type": "field",
      "varNames": [
        "shortPrefix"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "longPrefix"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "burstEnabled"
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
        "burstAliases"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "argument"
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
        "id"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.builder.DefaultOptionBuilder.DefaultOptionBuilder()",
      "begin_line": 50,
      "end_line": 53,
      "comment": "\n     * Creates a new DefaultOptionBuilder using defaults\n     * @see DefaultOption#DEFAULT_SHORT_PREFIX\n     * @see DefaultOption#DEFAULT_LONG_PREFIX\n     * @see DefaultOption#DEFAULT_BURST_ENABLED\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 52,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.builder.DefaultOptionBuilder.DefaultOptionBuilder(java.lang.String, java.lang.String, boolean)",
      "begin_line": 63,
      "end_line": 79,
      "comment": "\n     * Creates a new DefaultOptionBuilder\n     * @param shortPrefix the prefix to use for short options\n     * @param longPrefix the prefix to use for long options\n     * @param burstEnabled whether to allow gnu style bursting\n     * @throws IllegalArgumentException if either prefix is less than on\n     *                                  character long\n     ",
      "child_ranges": [
        "(line 67,col 9)-(line 69,col 9)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 75,col 9)-(line 75,col 39)",
        "(line 76,col 9)-(line 76,col 37)",
        "(line 77,col 9)-(line 77,col 41)",
        "(line 78,col 9)-(line 78,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.DefaultOptionBuilder.create()",
      "begin_line": 86,
      "end_line": 99,
      "comment": "\n     * Creates a DefaultOption instance\n     * @return the new instance\n     * @throws IllegalStateException if no names have been supplied\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 94,col 87)",
        "(line 96,col 9)-(line 96,col 16)",
        "(line 98,col 9)-(line 98,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.DefaultOptionBuilder.reset()",
      "begin_line": 104,
      "end_line": 115,
      "comment": "\n     * Resets the builder\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 29)",
        "(line 106,col 9)-(line 106,col 27)",
        "(line 107,col 9)-(line 107,col 32)",
        "(line 108,col 9)-(line 108,col 37)",
        "(line 109,col 9)-(line 109,col 25)",
        "(line 110,col 9)-(line 110,col 24)",
        "(line 111,col 9)-(line 111,col 24)",
        "(line 112,col 9)-(line 112,col 15)",
        "(line 114,col 9)-(line 114,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.DefaultOptionBuilder.withShortName(java.lang.String)",
      "begin_line": 124,
      "end_line": 138,
      "comment": "\n     * Use this short option name. The first name is used as the preferred\n     * display name for the Command and then later names are used as aliases.\n     *\n     * @param shortName the name to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 52)",
        "(line 127,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.DefaultOptionBuilder.withLongName(java.lang.String)",
      "begin_line": 147,
      "end_line": 157,
      "comment": "\n     * Use this long option name.  The first name is used as the preferred\n     * display name for the Command and then later names are used as aliases.\n     *\n     * @param longName the name to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 50)",
        "(line 150,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.DefaultOptionBuilder.withDescription(java.lang.String)",
      "begin_line": 164,
      "end_line": 168,
      "comment": "\n     * Use this option description\n     * @param newDescription the description to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 42)",
        "(line 167,col 9)-(line 167,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.DefaultOptionBuilder.withRequired(boolean)",
      "begin_line": 175,
      "end_line": 179,
      "comment": "\n     * Use this optionality\n     * @param newRequired true iff the Option is required\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 36)",
        "(line 178,col 9)-(line 178,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.DefaultOptionBuilder.withChildren(org.apache.commons.cli2.Group)",
      "begin_line": 186,
      "end_line": 190,
      "comment": "\n     * Use this child Group\n     * @param newChildren the child Group to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 36)",
        "(line 189,col 9)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.DefaultOptionBuilder.withArgument(org.apache.commons.cli2.Argument)",
      "begin_line": 197,
      "end_line": 201,
      "comment": "\n     * Use this Argument\n     * @param newArgument the argument to use\n     * @return this builder\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 36)",
        "(line 200,col 9)-(line 200,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.DefaultOptionBuilder.withId(int)",
      "begin_line": 210,
      "end_line": 214,
      "comment": "\n     * Sets the id\n     *\n     * @param newId\n     *            the id of the DefaultOption\n     * @return this DefaultOptionBuilder\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 24)",
        "(line 213,col 9)-(line 213,col 20)"
      ]
    }
  ]
}