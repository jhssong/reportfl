{
  "filepath": "/tmp/Cli-21b/src/java/org/apache/commons/cli2/builder/ArgumentBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArgumentBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 286,
      "comment": "\n * Builds Argument instances.\n "
    },
    {
      "type": "field",
      "varNames": [
        "resources"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " i18n "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " name of the argument. Used for display and lookups in CommandLine "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " description of the argument. Used in the automated online help "
    },
    {
      "type": "field",
      "varNames": [
        "minimum"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " minimum number of values required "
    },
    {
      "type": "field",
      "varNames": [
        "maximum"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " maximum number of values permitted "
    },
    {
      "type": "field",
      "varNames": [
        "initialSeparator"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " character used to separate the values from the option "
    },
    {
      "type": "field",
      "varNames": [
        "subsequentSeparator"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " character used to separate the values from each other "
    },
    {
      "type": "field",
      "varNames": [
        "validator"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " object that should be used to ensure the values are valid "
    },
    {
      "type": "field",
      "varNames": [
        "consumeRemaining"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " used to identify the consume remaining option, typically \"--\" "
    },
    {
      "type": "field",
      "varNames": [
        "defaultValues"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " default values for argument "
    },
    {
      "type": "field",
      "varNames": [
        "id"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " id of the argument "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.ArgumentBuilder()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * Creates a new ArgumentBuilder instance\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.create()",
      "begin_line": 80,
      "end_line": 97,
      "comment": "\n     * Creates a new Argument instance using the options specified in this\n     * ArgumentBuilder.\n     *\n     * @return A new Argument instance using the options specified in this\n     * ArgumentBuilder.\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 92,col 20)",
        "(line 94,col 9)-(line 94,col 16)",
        "(line 96,col 9)-(line 96,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.reset()",
      "begin_line": 103,
      "end_line": 115,
      "comment": "\n     * Resets the ArgumentBuilder to the defaults for a new Argument. The\n     * method is called automatically at the end of a create() call.\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 21)",
        "(line 105,col 9)-(line 105,col 27)",
        "(line 106,col 9)-(line 106,col 20)",
        "(line 107,col 9)-(line 107,col 36)",
        "(line 108,col 9)-(line 108,col 66)",
        "(line 109,col 9)-(line 109,col 72)",
        "(line 110,col 9)-(line 110,col 25)",
        "(line 111,col 9)-(line 111,col 32)",
        "(line 112,col 9)-(line 112,col 29)",
        "(line 113,col 9)-(line 113,col 15)",
        "(line 114,col 9)-(line 114,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.withName(java.lang.String)",
      "begin_line": 126,
      "end_line": 135,
      "comment": "\n     * Sets the name of the argument. The name is used when displaying usage\n     * information and to allow lookups in the CommandLine object.\n     *\n     * @see org.apache.commons.cli2.CommandLine#getValue(String)\n     *\n     * @param newName the name of the argument\n     * @return this ArgumentBuilder\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 133,col 28)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.withDescription(java.lang.String)",
      "begin_line": 145,
      "end_line": 148,
      "comment": "\n     * Sets the description of the argument.\n     *\n     * The description is used when displaying online help.\n     *\n     * @param newDescription a description of the argument\n     * @return this ArgumentBuilder\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 42)",
        "(line 147,col 9)-(line 147,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.withMinimum(int)",
      "begin_line": 156,
      "end_line": 162,
      "comment": "\n     * Sets the minimum number of values needed for the argument to be valid.\n     *\n     * @param newMinimum the number of values needed\n     * @return this ArgumentBuilder\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 34)",
        "(line 161,col 9)-(line 161,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.withMaximum(int)",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     * Sets the maximum number of values allowed for the argument to be valid.\n     *\n     * @param newMaximum the number of values allowed\n     * @return this ArgumentBuilder\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 34)",
        "(line 175,col 9)-(line 175,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.withInitialSeparator(char)",
      "begin_line": 187,
      "end_line": 192,
      "comment": "\n     * Sets the character used to separate the values from the option. When an\n     * argument is of the form -libs:dir1,dir2,dir3 the initialSeparator would\n     * be \u0027:\u0027.\n     *\n     * @param newInitialSeparator the character used to separate the values\n     * from the option\n     * @return this ArgumentBuilder\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 52)",
        "(line 191,col 9)-(line 191,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.withSubsequentSeparator(char)",
      "begin_line": 203,
      "end_line": 208,
      "comment": "\n     * Sets the character used to separate the values from each other. When an\n     * argument is of the form -libs:dir1,dir2,dir3 the subsequentSeparator\n     * would be \u0027,\u0027.\n     *\n     * @param newSubsequentSeparator the character used to separate the values\n     * from each other\n     * @return this ArgumentBuilder\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 58)",
        "(line 207,col 9)-(line 207,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.withValidator(org.apache.commons.cli2.validation.Validator)",
      "begin_line": 217,
      "end_line": 223,
      "comment": "\n     * Sets the validator instance used to perform validation on the Argument\n     * values.\n     *\n     * @param newValidator a Validator instance\n     * @return this ArgumentBuilder\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 38)",
        "(line 222,col 9)-(line 222,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.withConsumeRemaining(java.lang.String)",
      "begin_line": 233,
      "end_line": 242,
      "comment": "\n     * Sets the \"consume remaining\" option, defaults to \"--\". Use this if you\n     * want to allow values that might be confused with option strings.\n     *\n     * @param newConsumeRemaining the string to use for the consume\n     * remaining option\n     * @return this ArgumentBuilder\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 52)",
        "(line 241,col 9)-(line 241,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.withDefault(java.lang.Object)",
      "begin_line": 250,
      "end_line": 260,
      "comment": "\n     * Sets the default value.\n     *\n     * @param defaultValue the default value for the Argument\n     * @return this ArgumentBuilder\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 258,col 45)",
        "(line 259,col 9)-(line 259,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.withDefaults(java.util.List)",
      "begin_line": 268,
      "end_line": 274,
      "comment": "\n     * Sets the default values.\n     *\n     * @param newDefaultValues the default values for the Argument\n     * @return this ArgumentBuilder\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 46)",
        "(line 273,col 9)-(line 273,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.builder.ArgumentBuilder.withId(int)",
      "begin_line": 282,
      "end_line": 285,
      "comment": "\n     * Sets the id\n     *\n     * @param newId the id of the Argument\n     * @return this ArgumentBuilder\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 24)",
        "(line 284,col 9)-(line 284,col 20)"
      ]
    }
  ]
}