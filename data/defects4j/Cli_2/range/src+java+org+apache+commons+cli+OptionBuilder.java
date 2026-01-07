{
  "filepath": "/tmp/Cli-2b/src/java/org/apache/commons/cli/OptionBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 372,
      "comment": "\n * \u003cp\u003eOptionBuilder allows the user to create Options using descriptive\n * methods.\u003c/p\u003e\n * \u003cp\u003eDetails on the Builder pattern can be found at \n * \u003ca href\u003d\"http://c2.com/cgi-bin/wiki?BuilderPattern\"\u003e\n * http://c2.com/cgi-bin/wiki?BuilderPattern\u003c/a\u003e.\u003c/p\u003e\n *\n * @author John Keyes (john at integralsource.com)\n * @since 1.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "longopt"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " long option "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " option description "
    },
    {
      "type": "field",
      "varNames": [
        "argName"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " argument name "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " is required? "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfArgs"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " the number of arguments "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " option type "
    },
    {
      "type": "field",
      "varNames": [
        "optionalArg"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " option can have an optional argument value "
    },
    {
      "type": "field",
      "varNames": [
        "valuesep"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " value separator for argument value "
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " option builder instance "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.OptionBuilder.OptionBuilder()",
      "begin_line": 60,
      "end_line": 63,
      "comment": "\n     * private constructor to prevent instances being created\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.reset()",
      "begin_line": 68,
      "end_line": 81,
      "comment": "\n     * Resets the member variables to their default values.\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 27)",
        "(line 71,col 9)-(line 71,col 24)",
        "(line 72,col 9)-(line 72,col 23)",
        "(line 73,col 9)-(line 73,col 20)",
        "(line 74,col 9)-(line 74,col 25)",
        "(line 75,col 9)-(line 75,col 44)",
        "(line 79,col 9)-(line 79,col 28)",
        "(line 80,col 9)-(line 80,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withLongOpt(java.lang.String)",
      "begin_line": 89,
      "end_line": 94,
      "comment": "\n     * The next Option created will have the following long option value.\n     *\n     * @param newLongopt the long option value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 43)",
        "(line 93,col 9)-(line 93,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArg()",
      "begin_line": 101,
      "end_line": 106,
      "comment": "\n     * The next Option created will require an argument value.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 39)",
        "(line 105,col 9)-(line 105,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArg(boolean)",
      "begin_line": 115,
      "end_line": 120,
      "comment": "\n     * The next Option created will require an argument value if\n     * \u003ccode\u003ehasArg\u003c/code\u003e is true.\n     *\n     * @param hasArg if true then the Option has an argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 81)",
        "(line 119,col 9)-(line 119,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withArgName(java.lang.String)",
      "begin_line": 129,
      "end_line": 134,
      "comment": "\n     * The next Option created will have the specified argument value \n     * name.\n     *\n     * @param name the name for the argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 37)",
        "(line 133,col 9)-(line 133,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.isRequired()",
      "begin_line": 141,
      "end_line": 146,
      "comment": "\n     * The next Option created will be required.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 38)",
        "(line 145,col 9)-(line 145,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withValueSeparator(char)",
      "begin_line": 166,
      "end_line": 171,
      "comment": "\n     * The next Option created uses \u003ccode\u003esep\u003c/code\u003e as a means to\n     * separate argument values.\n     *\n     * \u003cb\u003eExample:\u003c/b\u003e\n     * \u003cpre\u003e\n     * Option opt \u003d OptionBuilder.withValueSeparator(\u0027:\u0027)\n     *                           .create(\u0027D\u0027);\n     *\n     * CommandLine line \u003d parser.parse(args);\n     * String propertyName \u003d opt.getValue(0);\n     * String propertyValue \u003d opt.getValue(1);\n     * \u003c/pre\u003e\n     *\n     * @param sep The value separator to be used for the argument values.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 37)",
        "(line 170,col 9)-(line 170,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withValueSeparator()",
      "begin_line": 189,
      "end_line": 194,
      "comment": "\n     * The next Option created uses \u0027\u003ccode\u003e\u003d\u003c/code\u003e\u0027 as a means to\n     * separate argument values.\n     *\n     * \u003cb\u003eExample:\u003c/b\u003e\n     * \u003cpre\u003e\n     * Option opt \u003d OptionBuilder.withValueSeparator()\n     *                           .create(\u0027D\u0027);\n     *\n     * CommandLine line \u003d parser.parse(args);\n     * String propertyName \u003d opt.getValue(0);\n     * String propertyValue \u003d opt.getValue(1);\n     * \u003c/pre\u003e\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 37)",
        "(line 193,col 9)-(line 193,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.isRequired(boolean)",
      "begin_line": 203,
      "end_line": 208,
      "comment": "\n     * The next Option created will be required if \u003ccode\u003erequired\u003c/code\u003e\n     * is true.\n     *\n     * @param newRequired if true then the Option is required\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 45)",
        "(line 207,col 9)-(line 207,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArgs()",
      "begin_line": 215,
      "end_line": 220,
      "comment": "\n     * The next Option created can have unlimited argument values.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 61)",
        "(line 219,col 9)-(line 219,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArgs(int)",
      "begin_line": 229,
      "end_line": 234,
      "comment": "\n     * The next Option created can have \u003ccode\u003enum\u003c/code\u003e \n     * argument values.\n     *\n     * @param num the number of args that the option can have\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 41)",
        "(line 233,col 9)-(line 233,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArg()",
      "begin_line": 241,
      "end_line": 247,
      "comment": "\n     * The next Option can have an optional argument.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 39)",
        "(line 244,col 9)-(line 244,col 41)",
        "(line 246,col 9)-(line 246,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArgs()",
      "begin_line": 255,
      "end_line": 261,
      "comment": "\n     * The next Option can have an unlimited number of\n     * optional arguments.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 61)",
        "(line 258,col 9)-(line 258,col 41)",
        "(line 260,col 9)-(line 260,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArgs(int)",
      "begin_line": 271,
      "end_line": 277,
      "comment": "\n     * The next Option can have the specified number of \n     * optional arguments.\n     *\n     * @param numArgs - the maximum number of optional arguments\n     * the next Option created can have.\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 45)",
        "(line 274,col 9)-(line 274,col 41)",
        "(line 276,col 9)-(line 276,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withType(java.lang.Object)",
      "begin_line": 286,
      "end_line": 291,
      "comment": "\n     * The next Option created will have a value that will be an instance \n     * of \u003ccode\u003etype\u003c/code\u003e.\n     *\n     * @param newType the type of the Options argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 37)",
        "(line 290,col 9)-(line 290,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)",
      "begin_line": 299,
      "end_line": 304,
      "comment": "\n     * The next Option created will have the specified description\n     *\n     * @param newDescription a description of the Option\u0027s purpose\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 51)",
        "(line 303,col 9)-(line 303,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create(char)",
      "begin_line": 315,
      "end_line": 319,
      "comment": "\n     * Create an Option using the current settings and with \n     * the specified Option \u003ccode\u003echar\u003c/code\u003e.\n     *\n     * @param opt the character representation of the Option\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003eopt\u003c/code\u003e is not\n     * a valid character.  See Option.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create()",
      "begin_line": 328,
      "end_line": 337,
      "comment": "\n     * Create an Option using the current settings\n     *\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003elongOpt\u003c/code\u003e has\n     * not been set.  \n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 336,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create(java.lang.String)",
      "begin_line": 349,
      "end_line": 371,
      "comment": "\n     * Create an Option using the current settings and with \n     * the specified Option \u003ccode\u003echar\u003c/code\u003e.\n     *\n     * @param opt the \u003ccode\u003ejava.lang.String\u003c/code\u003e representation \n     * of the Option\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003eopt\u003c/code\u003e is not\n     * a valid character.  See Option.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 53)",
        "(line 357,col 9)-(line 357,col 35)",
        "(line 358,col 9)-(line 358,col 37)",
        "(line 359,col 9)-(line 359,col 43)",
        "(line 360,col 9)-(line 360,col 37)",
        "(line 361,col 9)-(line 361,col 29)",
        "(line 362,col 9)-(line 362,col 43)",
        "(line 363,col 9)-(line 363,col 35)",
        "(line 367,col 9)-(line 367,col 30)",
        "(line 370,col 9)-(line 370,col 22)"
      ]
    }
  ]
}