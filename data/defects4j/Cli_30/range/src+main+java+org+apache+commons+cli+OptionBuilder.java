{
  "filepath": "/tmp/Cli-30b/src/main/java/org/apache/commons/cli/OptionBuilder.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "OptionBuilder",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 372,
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
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * private constructor to prevent instances being created\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.reset()",
      "begin_line": 71,
      "end_line": 84,
      "comment": "\n     * Resets the member variables to their default values.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 27)",
        "(line 74,col 9)-(line 74,col 24)",
        "(line 75,col 9)-(line 75,col 23)",
        "(line 76,col 9)-(line 76,col 20)",
        "(line 77,col 9)-(line 77,col 25)",
        "(line 78,col 9)-(line 78,col 44)",
        "(line 82,col 9)-(line 82,col 28)",
        "(line 83,col 9)-(line 83,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withLongOpt(java.lang.String)",
      "begin_line": 92,
      "end_line": 97,
      "comment": "\n     * The next Option created will have the following long option value.\n     *\n     * @param newLongopt the long option value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 43)",
        "(line 96,col 9)-(line 96,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArg()",
      "begin_line": 104,
      "end_line": 109,
      "comment": "\n     * The next Option created will require an argument value.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 39)",
        "(line 108,col 9)-(line 108,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArg(boolean)",
      "begin_line": 118,
      "end_line": 123,
      "comment": "\n     * The next Option created will require an argument value if\n     * \u003ccode\u003ehasArg\u003c/code\u003e is true.\n     *\n     * @param hasArg if true then the Option has an argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 71)",
        "(line 122,col 9)-(line 122,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withArgName(java.lang.String)",
      "begin_line": 131,
      "end_line": 136,
      "comment": "\n     * The next Option created will have the specified argument value name.\n     *\n     * @param name the name for the argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 37)",
        "(line 135,col 9)-(line 135,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.isRequired()",
      "begin_line": 143,
      "end_line": 148,
      "comment": "\n     * The next Option created will be required.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 38)",
        "(line 147,col 9)-(line 147,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withValueSeparator(char)",
      "begin_line": 168,
      "end_line": 173,
      "comment": "\n     * The next Option created uses \u003ccode\u003esep\u003c/code\u003e as a means to\n     * separate argument values.\n     *\n     * \u003cb\u003eExample:\u003c/b\u003e\n     * \u003cpre\u003e\n     * Option opt \u003d OptionBuilder.withValueSeparator(\u0027:\u0027)\n     *                           .create(\u0027D\u0027);\n     *\n     * CommandLine line \u003d parser.parse(args);\n     * String propertyName \u003d opt.getValue(0);\n     * String propertyValue \u003d opt.getValue(1);\n     * \u003c/pre\u003e\n     *\n     * @param sep The value separator to be used for the argument values.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 37)",
        "(line 172,col 9)-(line 172,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withValueSeparator()",
      "begin_line": 191,
      "end_line": 196,
      "comment": "\n     * The next Option created uses \u0027\u003ccode\u003e\u003d\u003c/code\u003e\u0027 as a means to\n     * separate argument values.\n     *\n     * \u003cb\u003eExample:\u003c/b\u003e\n     * \u003cpre\u003e\n     * Option opt \u003d OptionBuilder.withValueSeparator()\n     *                           .create(\u0027D\u0027);\n     *\n     * CommandLine line \u003d parser.parse(args);\n     * String propertyName \u003d opt.getValue(0);\n     * String propertyValue \u003d opt.getValue(1);\n     * \u003c/pre\u003e\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 37)",
        "(line 195,col 9)-(line 195,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.isRequired(boolean)",
      "begin_line": 205,
      "end_line": 210,
      "comment": "\n     * The next Option created will be required if \u003ccode\u003erequired\u003c/code\u003e\n     * is true.\n     *\n     * @param newRequired if true then the Option is required\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 45)",
        "(line 209,col 9)-(line 209,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArgs()",
      "begin_line": 217,
      "end_line": 222,
      "comment": "\n     * The next Option created can have unlimited argument values.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 61)",
        "(line 221,col 9)-(line 221,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasArgs(int)",
      "begin_line": 230,
      "end_line": 235,
      "comment": "\n     * The next Option created can have \u003ccode\u003enum\u003c/code\u003e argument values.\n     *\n     * @param num the number of args that the option can have\n     * @return the OptionBuilder instance\n     ",
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
      "begin_line": 255,
      "end_line": 261,
      "comment": "\n     * The next Option can have an unlimited number of optional arguments.\n     *\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 61)",
        "(line 258,col 9)-(line 258,col 41)",
        "(line 260,col 9)-(line 260,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.hasOptionalArgs(int)",
      "begin_line": 270,
      "end_line": 276,
      "comment": "\n     * The next Option can have the specified number of optional arguments.\n     *\n     * @param numArgs - the maximum number of optional arguments\n     * the next Option created can have.\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 45)",
        "(line 273,col 9)-(line 273,col 41)",
        "(line 275,col 9)-(line 275,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withType(java.lang.Object)",
      "begin_line": 285,
      "end_line": 290,
      "comment": "\n     * The next Option created will have a value that will be an instance\n     * of \u003ccode\u003etype\u003c/code\u003e.\n     *\n     * @param newType the type of the Options argument value\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 37)",
        "(line 289,col 9)-(line 289,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.withDescription(java.lang.String)",
      "begin_line": 298,
      "end_line": 303,
      "comment": "\n     * The next Option created will have the specified description\n     *\n     * @param newDescription a description of the Option\u0027s purpose\n     * @return the OptionBuilder instance\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 51)",
        "(line 302,col 9)-(line 302,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create(char)",
      "begin_line": 314,
      "end_line": 317,
      "comment": "\n     * Create an Option using the current settings and with\n     * the specified Option \u003ccode\u003echar\u003c/code\u003e.\n     *\n     * @param opt the character representation of the Option\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003eopt\u003c/code\u003e is not\n     * a valid character.  See Option.\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create()",
      "begin_line": 325,
      "end_line": 334,
      "comment": "\n     * Create an Option using the current settings\n     *\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003elongOpt\u003c/code\u003e has not been set.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 333,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli.OptionBuilder.create(java.lang.String)",
      "begin_line": 346,
      "end_line": 371,
      "comment": "\n     * Create an Option using the current settings and with\n     * the specified Option \u003ccode\u003echar\u003c/code\u003e.\n     *\n     * @param opt the \u003ccode\u003ejava.lang.String\u003c/code\u003e representation\n     * of the Option\n     * @return the Option instance\n     * @throws IllegalArgumentException if \u003ccode\u003eopt\u003c/code\u003e is not\n     * a valid character.  See Option.\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 29)",
        "(line 349,col 9)-(line 367,col 9)",
        "(line 370,col 9)-(line 370,col 22)"
      ]
    }
  ]
}