{
  "filepath": "/tmp/Cli-5b/src/java/org/apache/commons/cli/OptionBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 373,
      "comment": "\n * \u003cp\u003eOptionBuilder allows the user to create Options using descriptive\n * methods.\u003c/p\u003e\n * \u003cp\u003eDetails on the Builder pattern can be found at \n * \u003ca href\u003d\"http://c2.com/cgi-bin/wiki?BuilderPattern\"\u003e\n * http://c2.com/cgi-bin/wiki?BuilderPattern\u003c/a\u003e.\u003c/p\u003e\n *\n * @author John Keyes (john at integralsource.com)\n * @since 1.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "longopt"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " long option "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " option description "
    },
    {
      "type": "field",
      "varNames": [
        "argName"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " argument name "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " is required? "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfArgs"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " the number of arguments "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " option type "
    },
    {
      "type": "field",
      "varNames": [
        "optionalArg"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " option can have an optional argument value "
    },
    {
      "type": "field",
      "varNames": [
        "valuesep"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": " value separator for argument value "
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " option builder instance "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.OptionBuilder.OptionBuilder()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * private constructor to prevent instances being created\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.reset()",
      "begin_line": 69,
      "end_line": 82,
      "comment": "\n     * Resets the member variables to their default values.\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 27)",
        "(line 72,col 9)-(line 72,col 24)",
        "(line 73,col 9)-(line 73,col 23)",
        "(line 74,col 9)-(line 74,col 20)",
        "(line 75,col 9)-(line 75,col 25)",
        "(line 76,col 9)-(line 76,col 44)",
        "(line 80,col 9)-(line 80,col 28)",
        "(line 81,col 9)-(line 81,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withLongOpt(java.lang.String)",
      "begin_line": 90,
      "end_line": 95,
      "comment": "\n     * The next Option created will have the following long option value.\n     *\n     * @param newLongopt the long option value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 43)",
        "(line 94,col 9)-(line 94,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArg()",
      "begin_line": 102,
      "end_line": 107,
      "comment": "\n     * The next Option created will require an argument value.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 39)",
        "(line 106,col 9)-(line 106,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArg(boolean)",
      "begin_line": 116,
      "end_line": 121,
      "comment": "\n     * The next Option created will require an argument value if\n     * \u003ccode\u003ehasArg\u003c/code\u003e is true.\n     *\n     * @param hasArg if true then the Option has an argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 81)",
        "(line 120,col 9)-(line 120,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withArgName(java.lang.String)",
      "begin_line": 130,
      "end_line": 135,
      "comment": "\n     * The next Option created will have the specified argument value \n     * name.\n     *\n     * @param name the name for the argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 37)",
        "(line 134,col 9)-(line 134,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.isRequired()",
      "begin_line": 142,
      "end_line": 147,
      "comment": "\n     * The next Option created will be required.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 38)",
        "(line 146,col 9)-(line 146,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withValueSeparator(char)",
      "begin_line": 167,
      "end_line": 172,
      "comment": "\n     * The next Option created uses \u003ccode\u003esep\u003c/code\u003e as a means to\n     * separate argument values.\n     *\n     * \u003cb\u003eExample:\u003c/b\u003e\n     * \u003cpre\u003e\n     * Option opt \u003d OptionBuilder.withValueSeparator(\u0027:\u0027)\n     *                           .create(\u0027D\u0027);\n     *\n     * CommandLine line \u003d parser.parse(args);\n     * String propertyName \u003d opt.getValue(0);\n     * String propertyValue \u003d opt.getValue(1);\n     * \u003c/pre\u003e\n     *\n     * @param sep The value separator to be used for the argument values.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 37)",
        "(line 171,col 9)-(line 171,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withValueSeparator()",
      "begin_line": 190,
      "end_line": 195,
      "comment": "\n     * The next Option created uses \u0027\u003ccode\u003e\u003d\u003c/code\u003e\u0027 as a means to\n     * separate argument values.\n     *\n     * \u003cb\u003eExample:\u003c/b\u003e\n     * \u003cpre\u003e\n     * Option opt \u003d OptionBuilder.withValueSeparator()\n     *                           .create(\u0027D\u0027);\n     *\n     * CommandLine line \u003d parser.parse(args);\n     * String propertyName \u003d opt.getValue(0);\n     * String propertyValue \u003d opt.getValue(1);\n     * \u003c/pre\u003e\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 37)",
        "(line 194,col 9)-(line 194,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.isRequired(boolean)",
      "begin_line": 204,
      "end_line": 209,
      "comment": "\n     * The next Option created will be required if \u003ccode\u003erequired\u003c/code\u003e\n     * is true.\n     *\n     * @param newRequired if true then the Option is required\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 45)",
        "(line 208,col 9)-(line 208,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArgs()",
      "begin_line": 216,
      "end_line": 221,
      "comment": "\n     * The next Option created can have unlimited argument values.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 61)",
        "(line 220,col 9)-(line 220,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArgs(int)",
      "begin_line": 230,
      "end_line": 235,
      "comment": "\n     * The next Option created can have \u003ccode\u003enum\u003c/code\u003e \n     * argument values.\n     *\n     * @param num the number of args that the option can have\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 41)",
        "(line 234,col 9)-(line 234,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArg()",
      "begin_line": 242,
      "end_line": 248,
      "comment": "\n     * The next Option can have an optional argument.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 39)",
        "(line 245,col 9)-(line 245,col 41)",
        "(line 247,col 9)-(line 247,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArgs()",
      "begin_line": 256,
      "end_line": 262,
      "comment": "\n     * The next Option can have an unlimited number of\n     * optional arguments.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 61)",
        "(line 259,col 9)-(line 259,col 41)",
        "(line 261,col 9)-(line 261,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArgs(int)",
      "begin_line": 272,
      "end_line": 278,
      "comment": "\n     * The next Option can have the specified number of \n     * optional arguments.\n     *\n     * @param numArgs - the maximum number of optional arguments\n     * the next Option created can have.\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 45)",
        "(line 275,col 9)-(line 275,col 41)",
        "(line 277,col 9)-(line 277,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withType(java.lang.Object)",
      "begin_line": 287,
      "end_line": 292,
      "comment": "\n     * The next Option created will have a value that will be an instance \n     * of \u003ccode\u003etype\u003c/code\u003e.\n     *\n     * @param newType the type of the Options argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 37)",
        "(line 291,col 9)-(line 291,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)",
      "begin_line": 300,
      "end_line": 305,
      "comment": "\n     * The next Option created will have the specified description\n     *\n     * @param newDescription a description of the Option\u0027s purpose\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 51)",
        "(line 304,col 9)-(line 304,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create(char)",
      "begin_line": 316,
      "end_line": 320,
      "comment": "\n     * Create an Option using the current settings and with \n     * the specified Option \u003ccode\u003echar\u003c/code\u003e.\n     *\n     * @param opt the character representation of the Option\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003eopt\u003c/code\u003e is not\n     * a valid character.  See Option.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create()",
      "begin_line": 329,
      "end_line": 338,
      "comment": "\n     * Create an Option using the current settings\n     *\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003elongOpt\u003c/code\u003e has\n     * not been set.  \n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 337,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create(java.lang.String)",
      "begin_line": 350,
      "end_line": 372,
      "comment": "\n     * Create an Option using the current settings and with \n     * the specified Option \u003ccode\u003echar\u003c/code\u003e.\n     *\n     * @param opt the \u003ccode\u003ejava.lang.String\u003c/code\u003e representation \n     * of the Option\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003eopt\u003c/code\u003e is not\n     * a valid character.  See Option.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 53)",
        "(line 358,col 9)-(line 358,col 35)",
        "(line 359,col 9)-(line 359,col 37)",
        "(line 360,col 9)-(line 360,col 43)",
        "(line 361,col 9)-(line 361,col 37)",
        "(line 362,col 9)-(line 362,col 29)",
        "(line 363,col 9)-(line 363,col 43)",
        "(line 364,col 9)-(line 364,col 35)",
        "(line 368,col 9)-(line 368,col 30)",
        "(line 371,col 9)-(line 371,col 22)"
      ]
    }
  ]
}