{
  "filepath": "/tmp/Cli-40b/src/main/java/org/apache/commons/cli/OptionBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 395,
      "comment": "\n * OptionBuilder allows the user to create Options using descriptive methods.\n * \u003cp\u003e\n * Details on the Builder pattern can be found at\n * \u003ca href\u003d\"http://c2.com/cgi-bin/wiki?BuilderPattern\"\u003ehttp://c2.com/cgi-bin/wiki?BuilderPattern\u003c/a\u003e.\n * \u003cp\u003e\n * This class is NOT thread safe. See \u003ca href\u003d\"https://issues.apache.org/jira/browse/CLI-209\"\u003eCLI-209\u003c/a\u003e\n *\n * @since 1.0\n * @deprecated since 1.3, use {@link Option#builder(String)} instead\n "
    },
    {
      "type": "field",
      "varNames": [
        "longopt"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " long option "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " option description "
    },
    {
      "type": "field",
      "varNames": [
        "argName"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " argument name "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " is required? "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfArgs"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " the number of arguments "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " option type "
    },
    {
      "type": "field",
      "varNames": [
        "optionalArg"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " option can have an optional argument value "
    },
    {
      "type": "field",
      "varNames": [
        "valuesep"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " value separator for argument value "
    },
    {
      "type": "field",
      "varNames": [
        "INSTANCE"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " option builder instance "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.OptionBuilder.OptionBuilder()",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * private constructor to prevent instances being created\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.reset()",
      "begin_line": 78,
      "end_line": 88,
      "comment": "\n     * Resets the member variables to their default values.\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 27)",
        "(line 81,col 9)-(line 81,col 23)",
        "(line 82,col 9)-(line 82,col 23)",
        "(line 83,col 9)-(line 83,col 28)",
        "(line 84,col 9)-(line 84,col 25)",
        "(line 85,col 9)-(line 85,col 44)",
        "(line 86,col 9)-(line 86,col 28)",
        "(line 87,col 9)-(line 87,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withLongOpt(java.lang.String)",
      "begin_line": 96,
      "end_line": 101,
      "comment": "\n     * The next Option created will have the following long option value.\n     *\n     * @param newLongopt the long option value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 43)",
        "(line 100,col 9)-(line 100,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArg()",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     * The next Option created will require an argument value.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 39)",
        "(line 112,col 9)-(line 112,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArg(boolean)",
      "begin_line": 122,
      "end_line": 127,
      "comment": "\n     * The next Option created will require an argument value if\n     * \u003ccode\u003ehasArg\u003c/code\u003e is true.\n     *\n     * @param hasArg if true then the Option has an argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 71)",
        "(line 126,col 9)-(line 126,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withArgName(java.lang.String)",
      "begin_line": 135,
      "end_line": 140,
      "comment": "\n     * The next Option created will have the specified argument value name.\n     *\n     * @param name the name for the argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 37)",
        "(line 139,col 9)-(line 139,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.isRequired()",
      "begin_line": 147,
      "end_line": 152,
      "comment": "\n     * The next Option created will be required.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 38)",
        "(line 151,col 9)-(line 151,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withValueSeparator(char)",
      "begin_line": 173,
      "end_line": 178,
      "comment": "\n     * The next Option created uses \u003ccode\u003esep\u003c/code\u003e as a means to\n     * separate argument values.\n     * \u003cp\u003e\n     * \u003cb\u003eExample:\u003c/b\u003e\n     * \u003cpre\u003e\n     * Option opt \u003d OptionBuilder.withValueSeparator(\u0027\u003d\u0027)\n     *                           .create(\u0027D\u0027);\n     *\n     * String args \u003d \"-Dkey\u003dvalue\";\n     * CommandLine line \u003d parser.parse(args);\n     * String propertyName \u003d opt.getValue(0);  // will be \"key\"\n     * String propertyValue \u003d opt.getValue(1); // will be \"value\"\n     * \u003c/pre\u003e\n     *\n     * @param sep The value separator to be used for the argument values.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 37)",
        "(line 177,col 9)-(line 177,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withValueSeparator()",
      "begin_line": 196,
      "end_line": 201,
      "comment": "\n     * The next Option created uses \u0027\u003ccode\u003e\u003d\u003c/code\u003e\u0027 as a means to\n     * separate argument values.\n     *\n     * \u003cb\u003eExample:\u003c/b\u003e\n     * \u003cpre\u003e\n     * Option opt \u003d OptionBuilder.withValueSeparator()\n     *                           .create(\u0027D\u0027);\n     *\n     * CommandLine line \u003d parser.parse(args);\n     * String propertyName \u003d opt.getValue(0);\n     * String propertyValue \u003d opt.getValue(1);\n     * \u003c/pre\u003e\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 37)",
        "(line 200,col 9)-(line 200,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.isRequired(boolean)",
      "begin_line": 210,
      "end_line": 215,
      "comment": "\n     * The next Option created will be required if \u003ccode\u003erequired\u003c/code\u003e\n     * is true.\n     *\n     * @param newRequired if true then the Option is required\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 45)",
        "(line 214,col 9)-(line 214,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArgs()",
      "begin_line": 222,
      "end_line": 227,
      "comment": "\n     * The next Option created can have unlimited argument values.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 61)",
        "(line 226,col 9)-(line 226,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArgs(int)",
      "begin_line": 235,
      "end_line": 240,
      "comment": "\n     * The next Option created can have \u003ccode\u003enum\u003c/code\u003e argument values.\n     *\n     * @param num the number of args that the option can have\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 41)",
        "(line 239,col 9)-(line 239,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArg()",
      "begin_line": 247,
      "end_line": 253,
      "comment": "\n     * The next Option can have an optional argument.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 39)",
        "(line 250,col 9)-(line 250,col 41)",
        "(line 252,col 9)-(line 252,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArgs()",
      "begin_line": 260,
      "end_line": 266,
      "comment": "\n     * The next Option can have an unlimited number of optional arguments.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 61)",
        "(line 263,col 9)-(line 263,col 41)",
        "(line 265,col 9)-(line 265,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArgs(int)",
      "begin_line": 275,
      "end_line": 281,
      "comment": "\n     * The next Option can have the specified number of optional arguments.\n     *\n     * @param numArgs - the maximum number of optional arguments\n     * the next Option created can have.\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 45)",
        "(line 278,col 9)-(line 278,col 41)",
        "(line 280,col 9)-(line 280,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withType(java.lang.Object)",
      "begin_line": 294,
      "end_line": 298,
      "comment": "\n     * The next Option created will have a value that will be an instance\n     * of \u003ccode\u003etype\u003c/code\u003e.\n     * \u003cp\u003e\n     * \u003cb\u003eNote:\u003c/b\u003e this method is kept for binary compatibility and the\n     * input type is supposed to be a {@link Class} object. \n     *\n     * @param newType the type of the Options argument value\n     * @return the OptionBuilder instance\n     * @deprecated since 1.3, use {@link #withType(Class)} instead\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withType(java.lang.Class\u003c?\u003e)",
      "begin_line": 308,
      "end_line": 313,
      "comment": "\n     * The next Option created will have a value that will be an instance\n     * of \u003ccode\u003etype\u003c/code\u003e.\n     *\n     * @param newType the type of the Options argument value\n     * @return the OptionBuilder instance\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 37)",
        "(line 312,col 9)-(line 312,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)",
      "begin_line": 321,
      "end_line": 326,
      "comment": "\n     * The next Option created will have the specified description\n     *\n     * @param newDescription a description of the Option\u0027s purpose\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 51)",
        "(line 325,col 9)-(line 325,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create(char)",
      "begin_line": 337,
      "end_line": 340,
      "comment": "\n     * Create an Option using the current settings and with\n     * the specified Option \u003ccode\u003echar\u003c/code\u003e.\n     *\n     * @param opt the character representation of the Option\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003eopt\u003c/code\u003e is not\n     * a valid character.  See Option.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create()",
      "begin_line": 348,
      "end_line": 357,
      "comment": "\n     * Create an Option using the current settings\n     *\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003elongOpt\u003c/code\u003e has not been set.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create(java.lang.String)",
      "begin_line": 369,
      "end_line": 394,
      "comment": "\n     * Create an Option using the current settings and with\n     * the specified Option \u003ccode\u003echar\u003c/code\u003e.\n     *\n     * @param opt the \u003ccode\u003ejava.lang.String\u003c/code\u003e representation\n     * of the Option\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003eopt\u003c/code\u003e is not\n     * a valid character.  See Option.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 29)",
        "(line 372,col 9)-(line 390,col 9)",
        "(line 393,col 9)-(line 393,col 22)"
      ]
    }
  ]
}