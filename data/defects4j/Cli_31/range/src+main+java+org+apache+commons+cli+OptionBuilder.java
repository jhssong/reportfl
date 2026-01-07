{
  "filepath": "/tmp/Cli-31b/src/main/java/org/apache/commons/cli/OptionBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 375,
      "comment": "\n * OptionBuilder allows the user to create Options using descriptive methods.\n *\n * \u003cp\u003eDetails on the Builder pattern can be found at\n * \u003ca href\u003d\"http://c2.com/cgi-bin/wiki?BuilderPattern\"\u003e\n * http://c2.com/cgi-bin/wiki?BuilderPattern\u003c/a\u003e.\u003c/p\u003e\n *\n * @author John Keyes (john at integralsource.com)\n * @version $Revision$, $Date$\n * @since 1.0\n "
    },
    {
      "type": "field",
      "varNames": [
        "longopt"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " long option "
    },
    {
      "type": "field",
      "varNames": [
        "description"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " option description "
    },
    {
      "type": "field",
      "varNames": [
        "argName"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " argument name "
    },
    {
      "type": "field",
      "varNames": [
        "required"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " is required? "
    },
    {
      "type": "field",
      "varNames": [
        "numberOfArgs"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " the number of arguments "
    },
    {
      "type": "field",
      "varNames": [
        "type"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": " option type "
    },
    {
      "type": "field",
      "varNames": [
        "optionalArg"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " option can have an optional argument value "
    },
    {
      "type": "field",
      "varNames": [
        "valuesep"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " value separator for argument value "
    },
    {
      "type": "field",
      "varNames": [
        "instance"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " option builder instance "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli.OptionBuilder.OptionBuilder()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * private constructor to prevent instances being created\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.reset()",
      "begin_line": 77,
      "end_line": 87,
      "comment": "\n     * Resets the member variables to their default values.\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 27)",
        "(line 80,col 9)-(line 80,col 24)",
        "(line 81,col 9)-(line 81,col 23)",
        "(line 82,col 9)-(line 82,col 20)",
        "(line 83,col 9)-(line 83,col 25)",
        "(line 84,col 9)-(line 84,col 44)",
        "(line 85,col 9)-(line 85,col 28)",
        "(line 86,col 9)-(line 86,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withLongOpt(java.lang.String)",
      "begin_line": 95,
      "end_line": 100,
      "comment": "\n     * The next Option created will have the following long option value.\n     *\n     * @param newLongopt the long option value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 43)",
        "(line 99,col 9)-(line 99,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArg()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\n     * The next Option created will require an argument value.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 39)",
        "(line 111,col 9)-(line 111,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArg(boolean)",
      "begin_line": 121,
      "end_line": 126,
      "comment": "\n     * The next Option created will require an argument value if\n     * \u003ccode\u003ehasArg\u003c/code\u003e is true.\n     *\n     * @param hasArg if true then the Option has an argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 71)",
        "(line 125,col 9)-(line 125,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withArgName(java.lang.String)",
      "begin_line": 134,
      "end_line": 139,
      "comment": "\n     * The next Option created will have the specified argument value name.\n     *\n     * @param name the name for the argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 37)",
        "(line 138,col 9)-(line 138,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.isRequired()",
      "begin_line": 146,
      "end_line": 151,
      "comment": "\n     * The next Option created will be required.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 38)",
        "(line 150,col 9)-(line 150,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withValueSeparator(char)",
      "begin_line": 171,
      "end_line": 176,
      "comment": "\n     * The next Option created uses \u003ccode\u003esep\u003c/code\u003e as a means to\n     * separate argument values.\n     *\n     * \u003cb\u003eExample:\u003c/b\u003e\n     * \u003cpre\u003e\n     * Option opt \u003d OptionBuilder.withValueSeparator(\u0027:\u0027)\n     *                           .create(\u0027D\u0027);\n     *\n     * CommandLine line \u003d parser.parse(args);\n     * String propertyName \u003d opt.getValue(0);\n     * String propertyValue \u003d opt.getValue(1);\n     * \u003c/pre\u003e\n     *\n     * @param sep The value separator to be used for the argument values.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 37)",
        "(line 175,col 9)-(line 175,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withValueSeparator()",
      "begin_line": 194,
      "end_line": 199,
      "comment": "\n     * The next Option created uses \u0027\u003ccode\u003e\u003d\u003c/code\u003e\u0027 as a means to\n     * separate argument values.\n     *\n     * \u003cb\u003eExample:\u003c/b\u003e\n     * \u003cpre\u003e\n     * Option opt \u003d OptionBuilder.withValueSeparator()\n     *                           .create(\u0027D\u0027);\n     *\n     * CommandLine line \u003d parser.parse(args);\n     * String propertyName \u003d opt.getValue(0);\n     * String propertyValue \u003d opt.getValue(1);\n     * \u003c/pre\u003e\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 37)",
        "(line 198,col 9)-(line 198,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.isRequired(boolean)",
      "begin_line": 208,
      "end_line": 213,
      "comment": "\n     * The next Option created will be required if \u003ccode\u003erequired\u003c/code\u003e\n     * is true.\n     *\n     * @param newRequired if true then the Option is required\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 45)",
        "(line 212,col 9)-(line 212,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArgs()",
      "begin_line": 220,
      "end_line": 225,
      "comment": "\n     * The next Option created can have unlimited argument values.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 61)",
        "(line 224,col 9)-(line 224,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArgs(int)",
      "begin_line": 233,
      "end_line": 238,
      "comment": "\n     * The next Option created can have \u003ccode\u003enum\u003c/code\u003e argument values.\n     *\n     * @param num the number of args that the option can have\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 41)",
        "(line 237,col 9)-(line 237,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArg()",
      "begin_line": 245,
      "end_line": 251,
      "comment": "\n     * The next Option can have an optional argument.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 39)",
        "(line 248,col 9)-(line 248,col 41)",
        "(line 250,col 9)-(line 250,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArgs()",
      "begin_line": 258,
      "end_line": 264,
      "comment": "\n     * The next Option can have an unlimited number of optional arguments.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 61)",
        "(line 261,col 9)-(line 261,col 41)",
        "(line 263,col 9)-(line 263,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArgs(int)",
      "begin_line": 273,
      "end_line": 279,
      "comment": "\n     * The next Option can have the specified number of optional arguments.\n     *\n     * @param numArgs - the maximum number of optional arguments\n     * the next Option created can have.\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 45)",
        "(line 276,col 9)-(line 276,col 41)",
        "(line 278,col 9)-(line 278,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withType(java.lang.Object)",
      "begin_line": 288,
      "end_line": 293,
      "comment": "\n     * The next Option created will have a value that will be an instance\n     * of \u003ccode\u003etype\u003c/code\u003e.\n     *\n     * @param newType the type of the Options argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 37)",
        "(line 292,col 9)-(line 292,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)",
      "begin_line": 301,
      "end_line": 306,
      "comment": "\n     * The next Option created will have the specified description\n     *\n     * @param newDescription a description of the Option\u0027s purpose\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 51)",
        "(line 305,col 9)-(line 305,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create(char)",
      "begin_line": 317,
      "end_line": 320,
      "comment": "\n     * Create an Option using the current settings and with\n     * the specified Option \u003ccode\u003echar\u003c/code\u003e.\n     *\n     * @param opt the character representation of the Option\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003eopt\u003c/code\u003e is not\n     * a valid character.  See Option.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create()",
      "begin_line": 328,
      "end_line": 337,
      "comment": "\n     * Create an Option using the current settings\n     *\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003elongOpt\u003c/code\u003e has not been set.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 336,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create(java.lang.String)",
      "begin_line": 349,
      "end_line": 374,
      "comment": "\n     * Create an Option using the current settings and with\n     * the specified Option \u003ccode\u003echar\u003c/code\u003e.\n     *\n     * @param opt the \u003ccode\u003ejava.lang.String\u003c/code\u003e representation\n     * of the Option\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003eopt\u003c/code\u003e is not\n     * a valid character.  See Option.\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 29)",
        "(line 352,col 9)-(line 370,col 9)",
        "(line 373,col 9)-(line 373,col 22)"
      ]
    }
  ]
}